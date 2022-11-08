using Application.DaoInterfaces;
using Domain.DTOs;
using Domain.Models;

namespace FileData.DAOs;

public class EventFileDao : IEventDao
{
    private readonly FileContext context;

    public EventFileDao(FileContext context)
    {
        this.context = context;
    }

    public Task<Event> CreateAsync(Event eEvent)
    {
        int id = 1;
        if (context.Events.Any())
        {
            id = context.Events.Max(t => t.Id);
            id++;
        }

        eEvent.Id = id;

        context.Events.Add(eEvent);
        context.SaveChanges();

        return Task.FromResult(eEvent);
    }

    public Task<IEnumerable<Event>> GetAsync(SearchEventDetailsDto searchParams)
    {
        IEnumerable<Event> result = context.Events.AsEnumerable();

        if (!string.IsNullOrEmpty(searchParams.Username))
        {
            result = context.Events.Where(eEvent =>
                eEvent.User.UserName.Equals(searchParams.Username, StringComparison.OrdinalIgnoreCase));
        }

        if (searchParams.UserId != null)
        {
            result = result.Where(t => t.User.Id == searchParams.UserId);
        }

        if (searchParams.CompletedStatus != null)
        {
            result = result.Where(t => t.IsCompleted == searchParams.CompletedStatus);
        }

        if (!string.IsNullOrEmpty(searchParams.TitleContains))
        {
            result = result.Where(t =>
                t.Title.Contains(searchParams.TitleContains, StringComparison.OrdinalIgnoreCase));
        }

        return Task.FromResult(result);
    }

    public Task<Event?> GetByIdAsync(int eventId)
    {
        Event? existing = context.Events.FirstOrDefault(t => t.Id == eventId);
        return Task.FromResult(existing);
    }

    public Task DeleteAsync(int id)
    {
        Event? existing = context.Events.FirstOrDefault(eEvent => eEvent.Id == id);
        if (existing == null)
        {
            throw new Exception($"Event with id {id} does not exist!");
        }

        context.Events.Remove(existing); 
        context.SaveChanges();

        return Task.CompletedTask;
    }

    public Task UpdateAsync(Event toUpdate)
    {
        Event? existing = context.Events.FirstOrDefault(eEvent => eEvent.Id == toUpdate.Id);
        if (existing == null)
        {
            throw new Exception($"Event with id {toUpdate.Id} does not exist!");
        }

        context.Events.Remove(existing);
        context.Events.Add(toUpdate);
        
        context.SaveChanges();
        
        return Task.CompletedTask;
    }
}