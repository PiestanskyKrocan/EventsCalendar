using Domain.DTOs;
using Domain.Models;

namespace Application.LogicInterfaces;

public interface IEventLogic
{
    Task<Event> CreateAsync(EventCreationDto dto);
    Task<IEnumerable<Event>> GetAsync(SearchEventDetailsDto searchParameters);
    Task UpdateAsync(EventUpdateDto dto);
    
    Task DeleteAsync(int id);
}