Feature: Hotel Booking Website
Scenario: user enter the valid username and password
    Given Url to open the adactin website 
    When  user can enter the username in username field
    And   user can enter the password in password field
    Then  login button direct to the hotel booking page
Scenario: Hotel searching 
    When user can  select the location
    And  user can select the hotel 
    And  user can select the room type in the hotel
    And  user can select the number of room for booking
    And  user can enter the check in date 
    And  user can enter the check out date
    And  user can select the number of adults per room
    And  user can select the number of children per room
    Then seach button will lead to the select hotel page
Scenario: select the hotel recommended below
    When user can select the hotel recommended
    Then continue button will lead to the payment page
Scenario: payment details
    When user can enter the firstname in the field
    And  user can enter the lastname in the field
    And  user can enter thier address in the field
    And  user can enter the 16 digit card number in the field
    And  user can select the type of thier of card in the field
    And  user can select the expiry of month and year of the card
    And  user can enter the CVV number of the card
    Then Book now button will lead to the booking confirmation page
Scenario: Booking confirmation
    When user can confirm the details of they entered 
    Then Logout button will lead back to the login page