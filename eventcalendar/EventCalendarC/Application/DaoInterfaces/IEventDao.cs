using Domain.DTOs;
using Domain.Model;

namespace Application.DaoInterfaces;

public interface IEventDao
{
    Task<Event> CreateAsync(Event @event);
    Task<Event> GetByIdAsync(int id);
    Task<IEnumerable<Event>> GetAsync(SearchEventsWithParametersDto searchEventsWithParameters);
    Task UpdateAsync(Event @event);
    Task DeleteAsync(int id);
}