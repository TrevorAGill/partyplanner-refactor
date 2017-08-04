import org.junit.Test;

import static org.junit.Assert.*;

public class EventTest {
    @Test
    public void newEvent_InstantiatesNewEvent() throws Exception {
        Event newEvent = new Event();
        assertEquals(true, newEvent instanceof Event);
    }
}