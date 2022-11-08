namespace Domain.DTOs;

public class SearchUserDetailsDto
{
    public string? UsernameContains { get;  }

    public SearchUserDetailsDto(string? usernameContains)
    {
        UsernameContains = usernameContains;
    }
}