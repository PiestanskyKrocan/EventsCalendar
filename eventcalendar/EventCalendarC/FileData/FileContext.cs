using System.Text.Json;
using Domain;
using Domain.Model;

namespace FileData;

public class FileContext
{
    private const string FilePath = "data.json";
    private DataContainer? _dataContainer;

    public ICollection<User> Users
    {
        get
        {
            LoadData();
            return _dataContainer!.Users!;
        }
    }
    
    public ICollection<Event> Events
    {
        get
        {
            LoadData();
            return _dataContainer!.Events!;
        }
    }
    
    private void LoadData()
    {
        if (_dataContainer != null) return;
    
        if (!File.Exists(FilePath))
        {
            _dataContainer = new ()
            {
                Users = new List<User>(),
                Events = new List<Event>()
            };
            return;
        }
        string content = File.ReadAllText(FilePath);
        _dataContainer = JsonSerializer.Deserialize<DataContainer>(content);
    }
    
    public void SaveChanges()
    {
        string serializedContent = JsonSerializer.Serialize(_dataContainer, new JsonSerializerOptions
            {
                WriteIndented = true
            }
        );
        File.WriteAllText(FilePath, serializedContent);
        _dataContainer = null;
    }
}