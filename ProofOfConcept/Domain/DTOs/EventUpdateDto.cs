namespace Domain.DTOs;

public class EventUpdateDto
{
    public int Id { get; }
    public int? OwnerId { get; set; }
    public string? Title { get; set; }
    public bool? IsCompleted { get; set; }

    public EventUpdateDto(int id)
    {
        Id = id;
    }
}