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
        switch (foodSelection) {
            case "compost leftovers": foodPrice = 2;
            break;
            case "hors d'oeuvres only": foodPrice = 10;
            break;
            case "soup and salad": foodPrice = 15;
            break;
            case "4 course meal": foodPrice = 35;
            break;
        }
        return foodPrice;
    }

    public int getBeveragePricePerGuest(String beverageSelection) {
        int beveragePrice = 0;
        switch (beverageSelection) {
            case "soda and water":
                beveragePrice = 5;
                break;
            case "domestic beers":
                beveragePrice = 15;
                break;
            case "wine and import beers":
                beveragePrice = 30;
                break;
        }
        return beveragePrice;
    }

    public int getFBPricePerGuest(int foodPrice, int beveragePrice) {
        int fbPerGuest = foodPrice + beveragePrice;
        return fbPerGuest;
    }

    public int getTotalGuestCostExcludingEntertainment(int fbPerGuest, int guestCount) {
        int totalGuestCost = fbPerGuest * guestCount;
        return totalGuestCost;
    }


}
