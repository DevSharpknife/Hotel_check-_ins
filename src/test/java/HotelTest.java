import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    
    private ConferenceRoom confRoom1;
    private Bedroom bedroom1;
    private Guest guest1;
    private Hotel hotel;

    @Before
    public void setUp(){
        hotel = new Hotel();
    }

//    @Test
//    public void canCheckIn__confRoom() {
//        guest1 = new Guest("Quaid");
//        confRoom1 = new ConferenceRoom(2, "This Room");
//        hotel.checkIn(guest1);
//        assertEquals(1, confRoom1.guestCount());
//    }
    
    @Test
    public void canCheckIn__bedroom(){
        guest1 = new Guest("Quato");
        bedroom1 = new Bedroom(2, 101, "double");
        hotel.checkIn(guest1, bedroom1);
        assertEquals(1, bedroom1.guestCount());
    }
    
    
}
