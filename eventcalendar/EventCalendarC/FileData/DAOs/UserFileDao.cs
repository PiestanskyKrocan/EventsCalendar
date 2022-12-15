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
        if (searchWithParameters.UsernameContains != null)
        {
            users = _context.Users.Where(u => u.UserName.Contains(searchWithParameters.UsernameContains, StringComparison.Ordinal));
        }

        return Task.FromResult(users);
    }
}