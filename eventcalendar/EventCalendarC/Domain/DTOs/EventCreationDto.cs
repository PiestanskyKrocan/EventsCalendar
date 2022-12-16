namespace Domain.DTOs;

public class EventCreationDto
{
    public int OwnerId { get; }
    public string Title { get; }
    public string BodyText { get; }
    public string StartTime { get; }
    public string EndTime { get; }
    public string Address { get;}
    
    public EventCreationDto(int ownerId, string title, string bodyText, string startTime, string endTime, string address)
    {
        OwnerId = ownerId;
        Title = title;
        BodyText = bodyText;
        StartTime = startTime;
        EndTime = endTime;
        Address = address;
    }
}