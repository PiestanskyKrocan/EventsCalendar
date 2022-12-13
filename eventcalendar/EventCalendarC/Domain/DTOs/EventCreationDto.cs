namespace Domain.DTOs;

public class EventCreationDto
{
    public int OwnerId { get; }
    public string Title { get; }

    public EventCreationDto(int ownerId, string title)
    {
        OwnerId = ownerId;
        Title = title;
    }
}