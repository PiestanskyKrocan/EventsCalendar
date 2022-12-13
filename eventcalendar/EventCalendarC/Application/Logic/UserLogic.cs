using Application.DaoInterfaces;
using Application.LogicInterfaces;
using Domain.DTOs;
using Domain.Model;

namespace Application.Logic;

public class UserLogic : IUserLogic
{
    private readonly IUserDao _userDao;

    public UserLogic(IUserDao userDao)
    {
        this._userDao = userDao;
    }

    public async Task<User> CreateAsync(UserCreationDto userToCreate)
    {
        User? existing = await _userDao.GetByUsernameAsync(userToCreate.UserName);
        if (existing != null)
            throw new Exception("Username already taken!");

        ValidateData(userToCreate);
        User toCreate = new User()
        {
            UserName = userToCreate.UserName
        };

        User created = await _userDao.CreateAsync(toCreate);
        return created;
    }

    private static void ValidateData(UserCreationDto userToCreate)
    {
        string userName = userToCreate.UserName;
        if (userName.Length < 3)
            throw new Exception("Username must be at least 3 characters!");
        if (userName.Length > 20)
            throw new Exception("Username must be less than 21 characters!");
        //requirements we might have for user's username and password
    }
    
    public Task<IEnumerable<User>> GetAsync(SearchUserWithParametersDto searchWithParameters)
    {
        return _userDao.GetAsync(searchWithParameters);
    }
}