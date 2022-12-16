namespace Domain.DTOs;

public class UserCreationDto
{
    public string UserName { get;}
    public string Password { get;}
    public string Gender { get;}
    public string DateOfBirth { get;}
    public string Address { get;}

    public UserCreationDto(string userName, string password, string gender, string dateOfBirth, string address)
    {
        UserName = userName;
        Password = password;
        Gender = gender;
        DateOfBirth = dateOfBirth;
        Address = address;
    }
}