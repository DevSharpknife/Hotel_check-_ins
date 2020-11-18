import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConfRoomTest {

    private ConferenceRoom confRoom1;
    private ConferenceRoom confRoom2;
    private ConferenceRoom confRoom3;
    private Guest guest1;

    @Before
    public void setUp() throws Exception {
        confRoom1 = new ConferenceRoom(2, "Mike Ritchie Suite");
        confRoom2 = new ConferenceRoom(0, "CLOSED");
        confRoom3 = new ConferenceRoom(10, "Open");
    }

    @Test
    public void canGetName(){
        assertEquals("Mike Ritchie Suite", confRoom1.getName());
    }

    @Test
    public void canSetName(){
        confRoom3.setName("ALSO CLOSED");
        assertEquals("ALSO CLOSED", confRoom3.getName());
    }

    @Test
    public void canGetCapacity(){
        assertEquals(0, confRoom2.getCapacity());
    }

    @Test
    public void canSetCapacity(){
        confRoom3.setCapacity(0);
        assertEquals(0, confRoom3.getCapacity());
    }

    @Test
    public void canCheckRemainingCapacity(){
        guest1 = new Guest("Reggie Reginald");
        confRoom1.addGuest(guest1);
        assertTrue(confRoom1.hasCapacity());
    }

}
