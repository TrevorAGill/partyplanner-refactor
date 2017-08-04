import org.junit.Test;

import static org.junit.Assert.*;

public class EventTest {
    @Test
    public void newEvent_InstantiatesNewEvent_true() throws Exception {
        Event newEvent = new Event(50,"sfd","dsf", "sdf");
        assertEquals(true, newEvent instanceof Event);
    }

    @Test
    public void newEvent_SetPropertiesOfNewEvent_() throws Exception {
        Event newEvent = new Event(50, "soup and salad", "wine and beer", "Beyonce");
        assertEquals(50, newEvent.numOfGuests);
        assertEquals("soup and salad", newEvent.foodSelection);
    }
}