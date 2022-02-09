package ie.gmit.passengerlab;

public class Passenger
{
    private String Title;
    private String Name;
    private String ID;
    private String Phone;
    private int Age;

    public Passenger(String Title, String Name, String ID, String Phone, int Age)
    {
        setTitle(Title);
        setName(Name);
        setID(ID);
        setPhone(Phone);
        setAge(Age);
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

    private void setPhone(String Phone)
    {
        if(Phone.length() > 6)
        {
            this.Phone = Phone;
        }
        else
        {
            throw new IllegalArgumentException("Inavlid Phone");
        }
    }

    public String getPhone()
    {
        return Phone;
    }

    private void setAge(int Age)
    {
        if(Age > 16)
        {
            this.Age = Age;
        }
        else
        {
            throw new IllegalArgumentException("Inavlid Age");
        }
    }

    public int getAge()
    {
        return Age;
    }
}
