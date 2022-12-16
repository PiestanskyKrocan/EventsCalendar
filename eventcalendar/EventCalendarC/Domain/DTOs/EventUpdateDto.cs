namespace Domain.DTOs;

public class EventUpdateDto
{
    public int Id { get; }
    public int? OwnerId { get; set; }
    public string? Title { get; set; }
    public string? BodyText { get; set; }
    public string? StartTime { get; set; }
    public string? EndTime { get; set; }
    public string? Address { get; set;}
    public bool? IsCompleted { get; set; }

    public EventUpdateDto(int id)
    {
        Id = id;
    }
}