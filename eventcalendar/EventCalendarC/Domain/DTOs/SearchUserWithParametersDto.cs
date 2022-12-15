namespace Domain.DTOs;

public class SearchUserWithParametersDto
{
    public string? UsernameContains { get;  }

    public SearchUserWithParametersDto(string? usernameContains)
    {
        UsernameContains = usernameContains;
    }
}