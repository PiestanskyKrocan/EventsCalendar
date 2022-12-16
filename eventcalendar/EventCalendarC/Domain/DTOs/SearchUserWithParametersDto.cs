namespace Domain.DTOs;

public class SearchUserWithParametersDto
{
    public string? UsernameContains { get;  }
    public string? GenderValue { get;  }
    public string? DateOfBirthValue { get;  }
    public string? AddressContains { get;  }

    public SearchUserWithParametersDto(string? usernameContains, string? genderValue, string? dateOfBirth, string? addressContains)
    {
        UsernameContains = usernameContains;
        GenderValue = genderValue;
        DateOfBirthValue = dateOfBirth;
        AddressContains = addressContains;
    }
}