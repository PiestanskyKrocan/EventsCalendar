using Application.DaoInterfaces;
using Domain.DTOs;
using Domain.Model;

namespace FileData.DAOs;

public class EventFileDao : IEventDao
{
    private readonly FileContext _context;

    public EventFileDao(FileContext context)
    {
        this._context = context;
    }

    public Task<Event> CreateAsync(Event @event)
    {
        int id = 1;
        if (_context.Events.Any())
        {
            id = _context.Events.Max(t => t.Id);
            id++;
        }

        @event.Id = id;
        
        _context.Events.Add(@event);
        _context.SaveChanges();

        return Task.FromResult(@event);
    }
    
    public Task<Event?> GetByIdAsync(int eventId)
    {
        Event? existing = _context.Events.FirstOrDefault(t => t.Id == eventId);
        return Task.FromResult(existing);
    }
    
    public Task<IEnumerable<Event>> GetAsync(SearchEventsWithParametersDto searchEventsWithParameters)
    {
        IEnumerable<Event> result = _context.Events.AsEnumerable();

        if (!string.IsNullOrEmpty(searchEventsWithParameters.Username))
        {
            // username is always unique, so we always fetch that first
            result = _context.Events.Where(eEvent =>
                eEvent.Owner.UserName.Equals(searchEventsWithParameters.Username, StringComparison.Ordinal));
        }

        if (searchEventsWithParameters.UserId != null)
        {
            result = result.Where(t => t.Owner.Id == searchEventsWithParameters.UserId);
        }

        if (searchEventsWithParameters.CompletedStatus != null)
        {
            result = result.Where(t => t.IsCompleted == searchEventsWithParameters.CompletedStatus);
        }

        if (!string.IsNullOrEmpty(searchEventsWithParameters.TitleContains))
        {
            result = result.Where(t =>
                t.Title.Contains(searchEventsWithParameters.TitleContains, StringComparison.Ordinal));
        }

        return Task.FromResult(result);
    }
    
    public Task UpdateAsync(Event toUpdate)
    {
        Event? existing = _context.Events.FirstOrDefault(@event => @event.Id == toUpdate.Id);
        if (existing == null)
        {
            throw new Exception($"Event with id {toUpdate.Id} does not exist!");
        }

        _context.Events.Remove(existing);
        _context.Events.Add(toUpdate);
    
        _context.SaveChanges();
    
        return Task.CompletedTask;
    }
    
    public Task DeleteAsync(int eventId)
    {
        Event? existing = _context.Events.FirstOrDefault(@event => @event.Id == eventId);
        if (existing == null)
        {
            throw new Exception($"Event with id {eventId} does not exist!");
        }

        _context.Events.Remove(existing); 
        _context.SaveChanges();
    
        return Task.CompletedTask;
    }
}