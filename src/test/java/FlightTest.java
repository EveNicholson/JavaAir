import org.example.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

public class FlightTest {

    private Flight flight;
    private Pilot pilot;
    private List<CabinCrewMember> cabinCrewMembers;
    private Passenger passenger1;
    private Passenger passenger2;

    @Before
    public void setUp() {
        pilot = new Pilot("Captain Smith", Rank.CAPTAIN, "P12345");

        cabinCrewMembers = new ArrayList<>();
        cabinCrewMembers.add(new CabinCrewMember("Jane Doe", Rank.FLIGHT_ATTENDANT));

        PlaneType planeType = PlaneType.AIRBUS320;

        flight = new Flight(pilot, cabinCrewMembers, planeType, "FR756", "GLA", "EDI", "10:00 AM");

        passenger1 = new Passenger("Alice", 1);
        passenger2 = new Passenger("Bob", 2);
    }

    @Test
    public void testGetAvailableSeats() {

        PlaneType planeType = PlaneType.AIRBUS320;
        assertEquals(planeType.getCapacity(), flight.getAvailableSeats());

        flight.bookPassenger(passenger1);

        assertEquals(planeType.getCapacity() - 1, flight.getAvailableSeats());
    }

    @Test
    public void testBookPassenger() {

        assertTrue(flight.bookPassenger(passenger1));

    }
}
