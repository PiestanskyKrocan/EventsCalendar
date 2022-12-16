namespace Domain.DTOs;

public class SearchEventsWithParametersDto
{
    public string? Username { get;}
    public int? UserId { get;}
    public bool? CompletedStatus { get;}
    public string? TitleContains { get;}
    public string? BodyTextContains { get; set; }
    public string? StartTimeIs { get; set; }
    public string? EndTimeIs { get; set; }
    public string? AddressContains { get; set;}

    public SearchEventsWithParametersDto(string? username, int? userId, bool? completedStatus, string? titleContains, string? bodyTextContains,
        string? startTimeIs, string? endTimeIs, string? addressContains)
    {
        Username = username;
        UserId = userId;
        CompletedStatus = completedStatus;
        TitleContains = titleContains;
        BodyTextContains = bodyTextContains;
        StartTimeIs = startTimeIs;
        EndTimeIs = endTimeIs;
        AddressContains = addressContains;
    }
}