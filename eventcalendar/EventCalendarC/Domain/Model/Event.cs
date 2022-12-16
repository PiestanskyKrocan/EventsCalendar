namespace Domain.Model;

public class Event
{
    public int Id { get; set; }
    public User Owner { get; set; }
    public string Title { get; }
    public string BodyText { get; set; }
    public string StartTime { get; set; }
    public string EndTime { get; set; }
    public string Address { get; set; }
    public bool IsCompleted { get; set; }

    public Event(User owner, string title, string bodyText, string startTime, string endTime, string address)
    {
        Owner = owner;
        Title = title;
        BodyText = bodyText;
        StartTime = startTime;
        EndTime = endTime;
        Address = address;
    }
}