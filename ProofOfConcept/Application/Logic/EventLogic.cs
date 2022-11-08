using Application.DaoInterfaces;
using Application.LogicInterfaces;
using Domain.DTOs;
using Domain.Models;

namespace Application.Logic;

public class EventLogic : IEventLogic
{
    private readonly IEventDao iEventDao;
    private readonly IUserDao userDao;

    public EventLogic(IEventDao iEventDao, IUserDao userDao)
    {
        this.iEventDao = iEventDao;
        this.userDao = userDao;
    }

    public async Task<Event> CreateAsync(EventCreationDto dto)
    {
        User? user = await userDao.GetByIdAsync(dto.OwnerId);
        if (user == null)
        {
            throw new Exception($"User with id {dto.OwnerId} was not found.");
        }

        Event eEvent = new Event(user, dto.Title);

        ValidateEvent(eEvent);

        Event created = await iEventDao.CreateAsync(eEvent);
        return created;
    }

    public Task<IEnumerable<Event>> GetAsync(SearchEventDetailsDto searchParameters)
    {
        return iEventDao.GetAsync(searchParameters);
    }

    public async Task UpdateAsync(EventUpdateDto dto)
    {
        Event? existing = await iEventDao.GetByIdAsync(dto.Id);

        if (existing == null)
        {
            throw new Exception($"Event with ID {dto.Id} not found!");
        }

        User? user = null;
        if (dto.OwnerId != null)
        {
            user = await userDao.GetByIdAsync((int)dto.OwnerId);
            if (user == null)
            {
                throw new Exception($"User with id {dto.OwnerId} was not found.");
            }
        }

        if (dto.IsCompleted != null && existing.IsCompleted && !(bool)dto.IsCompleted)
        {
            throw new Exception("Cannot redo a completed Event");
        }

        User userToUse = user ?? existing.User;
        string titleToUse = dto.Title ?? existing.Title;
        bool completedToUse = dto.IsCompleted ?? existing.IsCompleted;
        
        Event updated = new (userToUse, titleToUse)
        {
            IsCompleted = completedToUse,
            Id = existing.Id,
        };

        ValidateEvent(updated);

        await iEventDao.UpdateAsync(updated);
    }

    public async Task DeleteAsync(int id)
    {
        Event? todo = await iEventDao.GetByIdAsync(id);
        if (todo == null)
        {
            throw new Exception($"Event with ID {id} was not found!");
        }

        if (!todo.IsCompleted)
        {
            throw new Exception("Cannot delete incomplete Event!");
        }

        await iEventDao.DeleteAsync(id);
    }

    private void ValidateEvent(Event dto)
    {
        if (string.IsNullOrEmpty(dto.Title)) throw new Exception("Title cannot be empty.");
    }
}