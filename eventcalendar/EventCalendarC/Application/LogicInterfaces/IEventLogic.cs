using Domain.DTOs;
using Domain.Model;

namespace Application.LogicInterfaces;

public interface IEventLogic
{
    Task<Event> CreateAsync(EventCreationDto eventToCreate);
    Task<Event> GetByIdAsync(int id);
    Task<IEnumerable<Event>> GetAsync(SearchEventsWithParametersDto searchEventsWithParameters);
    Task UpdateAsync(EventUpdateDto eventUpdate);
    Task DeleteAsync(int id);
}