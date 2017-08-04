package models;

public class Event {

    private int numOfGuests;
    private String foodSelection;
    private String beverageSelection;
    private String entertainmentSelection;

    public Event(int numOfGuests, String foodSelection, String beverageSelection, String entertainmentSelection) {
        this.setNumOfGuests(numOfGuests);
        this.setFoodSelection(foodSelection);
        this.setBeverageSelection(beverageSelection);
        this.setEntertainmentSelection(entertainmentSelection);
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

    public int getTotalGuestPriceExcludingEntertainment(int fbPerGuest, int guestCount) {
        int totalGuestPrice = fbPerGuest * guestCount;
        return totalGuestPrice;
    }

    public int getEntertainmentPrice(String entertainmentSelection) {
        int entertainmentPrice = 0;
        switch (entertainmentSelection) {
            case "flea circus":
                entertainmentPrice = 100;
                break;
            case "chin balancer":
                entertainmentPrice = 500;
                break;
            case "mariachi band":
                entertainmentPrice = 2000;
                break;
            case "beyonce":
                entertainmentPrice = 20000;
                break;
            case "none":
                entertainmentPrice = 0;
                break;
        }
        return entertainmentPrice;
    }

    public int getTotalEventPriceBeforeDiscounts(int totalGuestPrice, int entertainmentPrice) {
        int totalEventPricePrediscount = totalGuestPrice + entertainmentPrice;
        return totalEventPricePrediscount;
    }

    public int get20PercentOffTotal(int totalEventPricePrediscount) {
        int eventPrice20Off = (int)(totalEventPricePrediscount*(1-(20.0f/100.0f)));
        return eventPrice20Off;
    }

    public String getFreeFleas(int totalFB) {
        String outputMessage = "";
        if(totalFB < 1000) {
            outputMessage = "Sorry, but your order doesn't qualify for this discount code.";
        } else if (totalFB >= 1000) {
            outputMessage = "We have added the flea circus to your entertainment selection.";
        }
        return outputMessage;
    }


    public int getNumOfGuests() {
        return numOfGuests;
    }

    public void setNumOfGuests(int numOfGuests) {
        this.numOfGuests = numOfGuests;
    }

    public String getFoodSelection() {
        return foodSelection;
    }

    public void setFoodSelection(String foodSelection) {
        this.foodSelection = foodSelection;
    }

    public String getBeverageSelection() {
        return beverageSelection;
    }

    public void setBeverageSelection(String beverageSelection) {
        this.beverageSelection = beverageSelection;
    }

    public String getEntertainmentSelection() {
        return entertainmentSelection;
    }

    public void setEntertainmentSelection(String entertainmentSelection) {
        this.entertainmentSelection = entertainmentSelection;
    }
}
