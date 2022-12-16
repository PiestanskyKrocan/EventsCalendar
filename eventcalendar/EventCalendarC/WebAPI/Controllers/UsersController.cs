using Application.LogicInterfaces;
using Domain.DTOs;
using Domain.Model;
using Microsoft.AspNetCore.Mvc;

namespace WebAPI.Controllers;

[ApiController]
[Route("[controller]")]
public class UsersController : ControllerBase
{
    private readonly IUserLogic _usersLogic;

    public UsersController(IUserLogic userLogic)
    {
        this._usersLogic = userLogic;
    }
    
    [HttpPost]
    public async Task<ActionResult<User>> CreateAsync(UserCreationDto userToCreate)
    {
        try
        {
            User user = await _usersLogic.CreateAsync(userToCreate);
            return Created($"/users/{user.Id}", user);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }
    
    [HttpGet]
    public async Task<ActionResult<IEnumerable<User>>> GetAsync([FromQuery] string? username, [FromQuery] string? gender, [FromQuery] string? dateOfBirth, [FromQuery] string? address)
    {
        try
        {
            SearchUserWithParametersDto parameters = new(username, gender, dateOfBirth, address);
            var users = await _usersLogic.GetAsync(parameters);
            return Ok(users);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }
}