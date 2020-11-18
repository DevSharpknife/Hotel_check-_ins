import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    private Guest guest1;

    @Before
    public void setUp() {
        guest1 = new Guest("Graham Grahamson");
    }

    @Test
    public void canGetName() {
        assertEquals("Graham Grahamson", guest1.getName());
    }
    
    @Test
    public void canSetName() {
        guest1.setName("Donald MacDonald");
        assertEquals("Donald MacDonald", guest1.getName());
    }
}
