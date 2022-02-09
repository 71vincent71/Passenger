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
}
