using Application.DaoInterfaces;
using Application.LogicInterfaces;
using Domain.DTOs;
using Domain.Model;

namespace Application.Logic;

public class EventLogic : IEventLogic
{
    private readonly IEventDao _eventDao;
    private readonly IUserDao _userDao;

    public EventLogic(IEventDao eventDao, IUserDao userDao)
    {
        this._eventDao = eventDao;
        this._userDao = userDao;
    }

    public async Task<Event> CreateAsync(EventCreationDto eventCreationDto)
    {
        User? user = await _userDao.GetByIdAsync(eventCreationDto.OwnerId);
        if (user == null)
        {
            throw new Exception($"User with id {eventCreationDto.OwnerId} was not found.");
        }
        
        ValidateEvent(eventCreationDto);
        Event @event = new Event(user, eventCreationDto.Title);
        Event createdEvent = await _eventDao.CreateAsync(@event);
        return createdEvent;
    }
    
    public Task<IEnumerable<Event>> GetAsync(SearchEventsWithParametersDto searchEventsWithParameters)
    {
        return _eventDao.GetAsync(searchEventsWithParameters);
    }

    public async Task<Event> GetByIdAsync(int id)
    {
        Event? existing = await _eventDao.GetByIdAsync(id);

        if (existing == null)
        {
            throw new Exception($"Event with ID {id} not found!");
        }
        
        Event createdEvent = await _eventDao.GetByIdAsync(id);
        return createdEvent;
    }
    
    public async Task UpdateAsync(EventUpdateDto eventUpdate)
    {
        Event? existing = await _eventDao.GetByIdAsync(eventUpdate.Id);

        if (existing == null)
        {
            throw new Exception($"Event with ID {eventUpdate.Id} not found!");
        }

        User? user = null;
        if (eventUpdate.OwnerId != null)
        {
            user = await _userDao.GetByIdAsync((int)eventUpdate.OwnerId);
            if (user == null)
            {
                throw new Exception($"User with id {eventUpdate.OwnerId} was not found.");
            }
        }

        if (eventUpdate.IsCompleted != null && existing.IsCompleted && !(bool)eventUpdate.IsCompleted)
        {
            throw new Exception("Cannot un-complete a completed Todo");
        }

        User userToUse = user ?? existing.Owner;
        string titleToUse = eventUpdate.Title ?? existing.Title;
        bool completedToUse = eventUpdate.IsCompleted ?? existing.IsCompleted;
    
        Event updated = new (userToUse, titleToUse)
        {
            IsCompleted = completedToUse,
            Id = existing.Id,
        };

        ValidateEvent(updated);

        await _eventDao.UpdateAsync(updated);
    }
    
    public async Task DeleteAsync(int id)
    {
        Event? @event = await _eventDao.GetByIdAsync(id);
        if (@event == null)
        {
            throw new Exception($"Event with ID {id} was not found!");
        }

        await _eventDao.DeleteAsync(id);
    }
    
    //Validate methods
    private void ValidateEvent(Event @event)
    {
        if (string.IsNullOrEmpty(@event.Title)) throw new Exception("Title cannot be empty.");
        // other validation stuff
    }
    
    private void ValidateEvent(EventCreationDto eventCreationDto)
    {
        if (string.IsNullOrEmpty(eventCreationDto.Title)) throw new Exception("Title cannot be empty.");
        // used for other validation
    }
}