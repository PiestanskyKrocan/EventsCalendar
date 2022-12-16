namespace Domain.Model;

public class User
{
    public int Id { get; set; }
    public string? UserName { get; set; }
    public string? Password { get; set; }
    public string? Gender { get; set; }
    public string? DateOfBirth { get; set; }
    public string? Address { get; set; }
}