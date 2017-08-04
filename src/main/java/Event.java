public class Event {

    int numOfGuests;
    String foodSelection;
    String beverageSelection;
    String entertainmentSelection;

    Event(int numOfGuests, String foodSelection, String beverageSelection, String entertainmentSelection) {
        this.numOfGuests = numOfGuests;
        this.foodSelection = foodSelection;
        this.beverageSelection = beverageSelection;
        this.entertainmentSelection = entertainmentSelection;
    }

    public int getFoodPricePerGuest(String foodSelection) {
        int foodPrice = 0;
        if (foodSelection.equals("compost leftovers")) {
            foodPrice = 2;
        } else if (foodSelection.equals("hors d'oeuvres only")) {
            foodPrice = 10;
        } else if (foodSelection.equals("soup and salad")) {
            foodPrice = 15;
        } else if (foodSelection.equals("4 course meal")) {
            foodPrice = 35;
        }
         return foodPrice;
    }

}
