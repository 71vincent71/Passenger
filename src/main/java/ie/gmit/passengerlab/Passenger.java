package ie.gmit.passengerlab;

public class Passenger
{
    private String Title;
    private String Name;
    private String ID;
    private long Phone;
    private int Age;

    public Passenger(String Title, String Name, String ID, String Phone, int Age)
    {
        setTitle(Title);
        setName(Name);
        setID(ID);
    }

    private void setTitle(String Title)
    {
        if(Title == "Mr" || Title == "Mrs" || Title == "Ms")
        {
           this.Title = Title;
        }
        else
        {
            throw new IllegalArgumentException("Inavlid Title");
        }
    }
    public String getTitle()
    {
        return Title;
    }

    private void setName(String Name)
    {
        if(Name.length() > 2)
        {
            this.Name = Name;
        }
        else
        {
            throw new IllegalArgumentException("Inavlid Name");
        }
    }
    public String getName()
    {
        return Name;
    }

    private void setID(String ID)
    {
        if(ID.length() > 9)
        {
            this.ID = ID;
        }
        else
        {
            throw new IllegalArgumentException("Inavlid ID");
        }
    }

    public String getID()
    {
        return ID;
    }
}
