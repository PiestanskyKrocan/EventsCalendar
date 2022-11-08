namespace Domain.Models;

public class Event
{
    public int Id { get; set; }
    public User User { get; }
    public string Title { get; }
    public bool IsCompleted { get; set; }

    public Event(User user, string title)
    {
        User = user;
        Title = title;
    }
}