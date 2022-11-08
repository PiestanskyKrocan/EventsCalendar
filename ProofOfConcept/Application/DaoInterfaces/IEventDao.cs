using Domain.DTOs;
using Domain.Models;

namespace Application.DaoInterfaces;

public interface IEventDao
{
    Task<Event> CreateAsync(Event eEvent);
    Task<IEnumerable<Event>> GetAsync(SearchEventDetailsDto searchParameters);
    Task UpdateAsync(Event eEvent);
    Task<Event?> GetByIdAsync(int eventId);
    
    Task DeleteAsync(int id);
}