package ie.gmit.passengerlab;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PassengerTest
{
    private Passenger myPass;

    @Test
    void testConstructorTitle()
    {
        myPass = new Passenger("Mr", "Conor", "1234567890", "09876543", 25);
        assertEquals("Mr", myPass.getTitle());
    }

    @Test
    void testConstructorInvalidTitle()
    {
        final String invalid = "Invalid Title";
        Exception exceptionThrown = assertThrows(IllegalArgumentException.class, ()-> new Passenger("Miss", "Conor", "1234567890", "09876543", 25));
        assertEquals(invalid, exceptionThrown.getMessage());
    }

    @Test
    void testConstructorName()
    {
        myPass = new Passenger("Mr", "Conor", "1234567890", "09876543", 25);
        assertEquals("Conor", myPass.getName());
    }

    @Test
    void testConstructorInvalidName()
    {
        final String invalid = "Invalid Name";
        Exception exceptionThrown = assertThrows(IllegalArgumentException.class, ()-> new Passenger("Mr", "Ty", "1234567890", "09876543", 25));
        assertEquals(invalid, exceptionThrown.getMessage());
    }

    @Test
    void testConstructorID()
    {
        myPass = new Passenger("Mr", "Conor", "1234567890", "09876543", 25);
        assertEquals("1234567890", myPass.getID());
    }

    @Test
    void testConstructorInvalidID()
    {
        final String invalid = "Invalid ID";
        Exception exceptionThrown = assertThrows(IllegalArgumentException.class, ()-> new Passenger("Mr", "Conor", "123", "09876543", 25));
        assertEquals(invalid, exceptionThrown.getMessage());
    }

    @Test
    void testConstructorPhone()
    {
        myPass = new Passenger("Mr", "Conor", "1234567890", "09876543", 25);
        assertEquals("09876543", myPass.getPhone());
    }

    @Test
    void testConstructorInvalidPhone()
    {
        final String invalid = "Invalid Phone";
        Exception exceptionThrown = assertThrows(IllegalArgumentException.class, ()-> new Passenger("Mr", "Conor", "1234567890", "098", 25));
        assertEquals(invalid, exceptionThrown.getMessage());
    }
}
