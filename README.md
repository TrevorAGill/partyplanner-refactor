# _Party Cost Estimator_

#### _A command line application for estimating the price of party planning services, July 2017_

#### By _**Trevor Gill**_

## Description

_This is a command line application that requests certain information from the user about the party that they want to throw, such as number of guests, what food and beverages will be served, and entertainment options and then returns to them an estimated cost of our services for organizing and catering their party. The application is built with the assumption that total food and beverage cost will be based on the number of guests, whereas entertainment will charge the same flat rate regardless of the number of guests. The application also includes support for discount codes that the user can enter to reduce their total price._

## Link

[Party Cost Estimator](http://wedaft.github.io/party)

## Specs ##

* _It should be able to create an event instance_
  * _Input: new Event_
  * _Output: event = {}_
* _An event instance should hold several properties_
  * _Input: new Event_
  * _Output: event = {# of people, food served, beverages served, entertainment}_
* _It should be able to calculate a "F+B price per guest" based on the food and beverage selection_
  * _Input: foodSelection = "soup and salad", beverageSelection = "wine and beer"_
  * _Output: "Your price per guest for F+B will be $50."_
* _It should be able to calculate a total event price by multiplying "price per guest" by guest count_
  * _Input: pricePerGuest = $500, guestCount = 100_
  * _Output: "Your event will cost an estimated $50,000"_
* _The event cost should be reduced with the use of a discount code_
  * _Input: discount code = "1/2 price Beyonce"_
  * _Output: "Your discounted event price is $30,000"_

## Known Bugs

* __

## Support and contact details

_Please reach out to Trevor Gill at trevor.a.gill@gmail.com with any questions or comments._

## Technologies Used

_Java_

### License

*Licensed under MIT.*

Copyright (c) 2017 **_Trevor Gill_**
