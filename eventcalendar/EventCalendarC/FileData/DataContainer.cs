using Domain;
using Domain.Model;

namespace FileData;

public class DataContainer
{
    public ICollection<User>? Users { get; set; }
    public ICollection<Event>? Events { get; set; }
}