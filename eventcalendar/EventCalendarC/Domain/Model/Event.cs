namespace Domain.Model;

public class Event
{
    public int Id { get; set; }
    public User Owner { get; set; }
    public string Title { get; }
    public bool IsCompleted { get; set; }

    public Event(User owner, string title)
    {
        Owner = owner;
        Title = title;
    }
}