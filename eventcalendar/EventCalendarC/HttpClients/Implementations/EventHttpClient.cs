using System.Net.Http.Json;
using System.Text;
using System.Text.Json;
using Domain.DTOs;
using Domain.Model;
using HttpClients.ClientInterfaces;

namespace HttpClients.Implementations;

public class EventHttpClient : IEventService
{
    private readonly HttpClient _client;

    public EventHttpClient(HttpClient client)
    {
        this._client = client;
    }

    public async Task<Event> CreateAsync(EventCreationDto eventCreation)
    {
        HttpResponseMessage response = await _client.PostAsJsonAsync("/events", eventCreation);
        string result = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(result);
        }

        Event eEvent = JsonSerializer.Deserialize<Event>(result, new JsonSerializerOptions
        {
            PropertyNameCaseInsensitive = false
        })!;
        return eEvent;
    }
    
    public async Task<ICollection<Event>> GetAsync(string? userName, int? userId, bool? completedStatus, string? titleContains)
    {
        string query = ConstructQuery(userName, userId, completedStatus, titleContains);
        
        HttpResponseMessage response = await _client.GetAsync("/events"+query);
        string content = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(content);
        }

        ICollection<Event> events = JsonSerializer.Deserialize<ICollection<Event>>(content, new JsonSerializerOptions
        {
            PropertyNameCaseInsensitive = true
        })!;
        return events;
    }
    
    public async Task UpdateAsync(EventUpdateDto eventUpdate)
    {
        string dtoAsJson = JsonSerializer.Serialize(eventUpdate);
        StringContent body = new StringContent(dtoAsJson, Encoding.UTF8, "application/json");

        HttpResponseMessage response = await _client.PatchAsync("/events", body);
        if (!response.IsSuccessStatusCode)
        {
            string content = await response.Content.ReadAsStringAsync();
            throw new Exception(content);
        }
    }
    
    private static string ConstructQuery(string? userName, int? userId, bool? completedStatus, string? titleContains)
    {
        string query = "";
        if (!string.IsNullOrEmpty(userName))
        {
            query += $"?username={userName}";
        }

        if (userId != null)
        {
            query += string.IsNullOrEmpty(query) ? "?" : "&";
            query += $"userid={userId}";
        }

        if (completedStatus != null)
        {
            query += string.IsNullOrEmpty(query) ? "?" : "&";
            query += $"completedstatus={completedStatus}";
        }

        if (!string.IsNullOrEmpty(titleContains))
        {
            query += string.IsNullOrEmpty(query) ? "?" : "&";
            query += $"titlecontains={titleContains}";
        }

        return query;
    }
    
    public async Task<Event> GetByIdAsync(int id)
    {
        HttpResponseMessage response = await _client.GetAsync($"/events/{id}");
        string content = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(content);
        }

        Event eEvent = JsonSerializer.Deserialize<Event>(content, 
            new JsonSerializerOptions
            {
                PropertyNameCaseInsensitive = true
            }
        )!;
        return eEvent;
    }
    
    public async Task DeleteAsync(int id)
    {
        HttpResponseMessage response = await _client.DeleteAsync($"Events/{id}");
        if (!response.IsSuccessStatusCode)
        {
            string content = await response.Content.ReadAsStringAsync();
            throw new Exception(content);
        }
    }
}