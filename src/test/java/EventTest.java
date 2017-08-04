import org.junit.Test;

import static org.junit.Assert.*;

public class EventTest {
    @Test
    public void newEvent_InstantiatesNewEvent_true() throws Exception {
        Event newEvent = new Event(50,"sfd","dsf", "sdf");
        assertEquals(true, newEvent instanceof Event);
    }

    @Test
    public void newEvent_SetPropertiesOfNewEvent() throws Exception {
        Event newEvent = new Event(50, "soup and salad", "wine and beer", "Beyonce");
        assertEquals(50, newEvent.numOfGuests);
        assertEquals("soup and salad", newEvent.foodSelection);
    }

    @Test
    public void newEvent_GetPriceOfFoodSelection_15() throws Exception {
        Event newEvent = new Event(50, "soup and salad", "wine and beer", "Beyonce");
        assertEquals(15, newEvent.getFoodPricePerGuest(newEvent.foodSelection));
    }

    @Test
    public void newEvent_GetPriceOfBeverageSelection_5() throws Exception {
        Event newEvent = new Event(50, "soup and salad", "soda and water", "Beyonce");
        assertEquals(5, newEvent.getBeveragePricePerGuest(newEvent.beverageSelection));
    }

    @Test
    public void newEvent_GetPerGuestFBPrice_20() throws Exception {
        Event newEvent = new Event(50, "soup and salad", "soda and water", "Beyonce");
        int foodPrice = 15;
        int beveragePrice = 5;
        assertEquals(5, newEvent.getFBPricePerGuest(foodPrice,beveragePrice));
    }
}