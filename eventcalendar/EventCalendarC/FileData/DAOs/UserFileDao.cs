using Application.DaoInterfaces;
using Domain.DTOs;
using Domain.Model;

namespace FileData.DAOs;

public class UserFileDao : IUserDao
{
    private readonly FileContext _context;

    public UserFileDao(FileContext context)
    {
        this._context = context;
    }

    public Task<User> CreateAsync(User user)
    {
        int userId = 1;
        if (_context.Users.Any())
        {
            userId = _context.Users.Max(u => u.Id);
            userId++;
        }

        user.Id = userId;

        _context.Users.Add(user);
        _context.SaveChanges();

        return Task.FromResult(user);
    }

    public Task<User?> GetByUsernameAsync(string userName)
    {
        User? existing = _context.Users.FirstOrDefault(u =>
            u.UserName.Equals(userName, StringComparison.Ordinal)
        );
        return Task.FromResult(existing);
    }

    public Task<User?> GetByIdAsync(int id)
    {
        User? existing = _context.Users.FirstOrDefault(u =>
            u.Id.Equals(id));
        return Task.FromResult(existing);
    }

    public Task<IEnumerable<User>> GetAsync(SearchUserWithParametersDto searchWithParameters)
    {
        IEnumerable<User> users = _context.Users.AsEnumerable();
        if (!string.IsNullOrEmpty(searchWithParameters.UsernameContains))
        {
            users = _context.Users.Where(u =>
                u.UserName.Contains(searchWithParameters.UsernameContains, StringComparison.Ordinal));
        }

        if (!string.IsNullOrEmpty(searchWithParameters.AddressContains))
        {
            users = users.Where(user =>
            user.Address.Contains(searchWithParameters.AddressContains, StringComparison.Ordinal));
        }

        if (!string.IsNullOrEmpty(searchWithParameters.GenderValue))
        {
            users = _context.Users.Where(u =>
                u.Gender.Contains(searchWithParameters.GenderValue, StringComparison.Ordinal));
        }
        if (!string.IsNullOrEmpty(searchWithParameters.DateOfBirthValue))
        {
            users = _context.Users.Where(u =>
                u.DateOfBirth.Contains(searchWithParameters.DateOfBirthValue, StringComparison.Ordinal));
        }

        return Task.FromResult(users);
    }
}