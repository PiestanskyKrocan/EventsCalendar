using Application.LogicInterfaces;
using Domain.DTOs;
using Domain.Model;
using Microsoft.AspNetCore.Mvc;

namespace WebAPI.Controllers;

[ApiController]
[Route("[controller]")]
public class EventsController : ControllerBase
{
    private readonly IEventLogic _eventLogic;

    public EventsController(IEventLogic eventLogic)
    {
        this._eventLogic = eventLogic;
    }
    
    [HttpPost]
    public async Task<ActionResult<Event>> CreateAsync([FromBody]EventCreationDto eventCreationDto)
    {
        try
        {
            Event created = await _eventLogic.CreateAsync(eventCreationDto);
            return Created($"/events/{created.Id}", created);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }
    
    [HttpGet]
    public async Task<ActionResult<IEnumerable<Event>>> GetAsync([FromQuery] string? userName, [FromQuery] int? userId,
        [FromQuery] bool? completedStatus, [FromQuery] string? titleContains, [FromQuery] string? bodyTextContains, 
        [FromQuery] string? startTimeIs, [FromQuery] string? endTimeIs, [FromQuery] string? addressContains)
    {
        try
        {
            SearchEventsWithParametersDto searchEventsWithParameters = new(userName, userId, completedStatus, titleContains, 
                bodyTextContains, startTimeIs, endTimeIs, addressContains);
            var events = await _eventLogic.GetAsync(searchEventsWithParameters);
            return Ok(events);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }
    
    [HttpGet("{id:int}")]
    public async Task<ActionResult<Event>> GetByIdAsync([FromRoute] int id)
    {
        try
        {
            var @event = await _eventLogic.GetByIdAsync(id);
            return Ok(@event);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }
    
    [HttpPatch]
    public async Task<ActionResult> UpdateAsync([FromBody] EventUpdateDto eventUpdate)
    {
        try
        {
            await _eventLogic.UpdateAsync(eventUpdate);
            return Ok();
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }
    
    [HttpDelete("{id:int}")]
    public async Task<ActionResult> DeleteAsync([FromRoute] int id)
    {
        try
        {
            await _eventLogic.DeleteAsync(id);
            return Ok();
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }
}