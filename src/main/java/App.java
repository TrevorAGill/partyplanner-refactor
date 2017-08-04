
import models.Event;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Welcome to Trevor's party cost estimator. Would you like to 'Get an estimate' or 'Exit'?");
        try {
            String introPrompt = bufferedReader.readLine();
            if(introPrompt.equals("Get an estimate")) {
                Event newEvent = new Event(4, "5", "6", "7");
                System.out.println("Select a meal option: 'compost leftovers', 'hors d'oeuvres only', 'soup and salad', '4 course meal'");
                newEvent.setFoodSelection(bufferedReader.readLine());
                int foodPrice = newEvent.getFoodPricePerGuest(newEvent.getFoodSelection());
                System.out.println("Select a beverage option: 'soda and water', 'domestic beers', 'wine and import beers'");
                newEvent.setBeverageSelection(bufferedReader.readLine());
                int beveragePrice = newEvent.getBeveragePricePerGuest(newEvent.getBeverageSelection());
                int fbPerGuest = newEvent.getFBPricePerGuest(foodPrice,beveragePrice);
                System.out.println(String.format("Based on your F+B selections, your price/guest is $%d", fbPerGuest));
                System.out.println("Enter the number of guests you expect:");
                newEvent.setNumOfGuests(Integer.parseInt(bufferedReader.readLine()));
                int totalFB = newEvent.getTotalGuestPriceExcludingEntertainment(fbPerGuest, newEvent.getNumOfGuests());
                System.out.println(String.format("Based on your guest count, your total F+B cost is $%d", totalFB));
                System.out.println("Select an entertainment option: 'flea circus', 'chin balancer', 'mariachi band', 'beyonce', 'none'");
                newEvent.setEntertainmentSelection(bufferedReader.readLine());
                int entertainmentPrice = newEvent.getEntertainmentPrice(newEvent.getEntertainmentSelection());
                int totalPricePrediscount = newEvent.getTotalEventPriceBeforeDiscounts(totalFB,entertainmentPrice);
                System.out.println(String.format("Your total price is $%d.\nFood Selection: %s\nBeverage Selection: %s\nGuest Count: %d\nEntertainment Selection: %s\n" , totalPricePrediscount, newEvent.getFoodSelection(), newEvent.getBeverageSelection(), newEvent.getNumOfGuests(), newEvent.getEntertainmentSelection()));
                System.out.println("Would you like to apply one of the following discount codes?:\n--20% off your total cost('20%OFF')\n--Free flea circus entertainment with at least $1,000 spent on F+B ('FREEFLEAS')");
                String discountCode = bufferedReader.readLine();
                if(discountCode.equals("20%OFF")) {
                    int discountedPrice = newEvent.get20PercentOffTotal(totalPricePrediscount);
                    int amountSaved = totalPricePrediscount - discountedPrice;
                    System.out.println(String.format("Nice, You saved $%d! Your new total comes to $%d",amountSaved,discountedPrice));
                } else if (discountCode.equals("FREEFLEAS")) {
                    String outputMessage = newEvent.getFreeFleas(totalFB);
                    System.out.println(outputMessage);
                }
            } else if (introPrompt.equals("Exit")){

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
