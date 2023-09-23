import org.example.CabinCrewMember;
import org.example.Rank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

    private CabinCrewMember cabinCrewMember;

    @Before
    public void setUp() {
        cabinCrewMember = new CabinCrewMember("John Smith", Rank.FLIGHT_ATTENDANT);
    }

    @Test
    public void testGetName() {
        assertEquals("John Smith", cabinCrewMember.getName());
    }

    @Test
    public void testGetRank() {
        assertEquals(Rank.FLIGHT_ATTENDANT, cabinCrewMember.getRank());
    }

    @Test
    public void testRelayMessage() {
        String message = "Please fasten your seatbelts.";
        String expectedMessage = "Cabin crew member John Smith says: Please fasten your seatbelts.";
        assertEquals(expectedMessage, cabinCrewMember.relayMessage(message));
    }
}
