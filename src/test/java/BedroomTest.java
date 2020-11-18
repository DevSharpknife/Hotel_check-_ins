import org.junit.Before;
import org.junit.Test;

import java.awt.print.Book;

import static org.junit.Assert.*;

public class BedroomTest {

    private Bedroom bedroom1;
    private Bedroom bedroom2;
    private Bedroom bedroom3;
    private Guest guest1;


    @Before
    public void setUp() throws Exception {
        bedroom1 = new Bedroom(1, 101, "single");
        bedroom2 = new Bedroom(2, 102, "double");
        bedroom3 = new Bedroom(6, 103, "family");
    }
    @Test
    public void canGetCapacity(){
        assertEquals(1, bedroom1.getCapacity());
    }

    @Test
    public void canSetCapacity(){
        bedroom2.setCapacity(1);
        assertEquals(1, bedroom2.getCapacity());
    }

    @Test
    public void canCheckRemainingCapacity(){
        guest1 = new Guest("Reggie");
        bedroom1.addGuest(guest1);
        assertFalse(bedroom1.hasCapacity());
    }

    @Test
    public void canGetRoomNumber(){
        assertEquals(103, bedroom3.getRoomNumber());
    }


}
