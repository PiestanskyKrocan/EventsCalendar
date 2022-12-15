using Domain.DTOs;
using Domain.Model;

namespace HttpClients.ClientInterfaces;

public interface IEventService
{
    Task<Event> CreateAsync(EventCreationDto eventCreation);
    Task<ICollection<Event>> GetAsync(string? userName, int? userId, bool? completedStatus, string? titleContains);
    Task UpdateAsync(EventUpdateDto eventUpdate);
    Task<Event> GetByIdAsync(int id);
    Task DeleteAsync(int id);
}