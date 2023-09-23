import org.example.Passenger;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    private Passenger passenger;

    @Before
    public void setUp() {
        passenger = new Passenger("Alice", 2);
    }

    @Test
    public void testGetName() {
        assertEquals("Alice", passenger.getName());
    }

    @Test
    public void testGetNumberOfBags() {
        assertEquals(2, passenger.getNumberOfBags());
    }
}
