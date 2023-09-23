import org.example.Pilot;
import org.example.Rank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    private Pilot pilot;

    @Before
    public void setUp() {
        pilot = new Pilot("Captain Smith", Rank.CAPTAIN, "P12345");
    }

    @Test
    public void testGetName() {
        assertEquals("Captain Smith", pilot.getName());
    }

    @Test
    public void testGetRank() {
        assertEquals(Rank.CAPTAIN, pilot.getRank());
    }

    @Test
    public void testGetPilotLicenseNumber() {
        assertEquals("P12345", pilot.getPilotLicenseNumber());
    }

    @Test
    public void testFlyPlane() {
        String expectedMessage = "Pilot Captain Smith is flying the plane.";
        assertEquals(expectedMessage, pilot.flyPlane());
    }
}
