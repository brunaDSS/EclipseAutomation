Feature: card management actions as a guest customer

	Background:
    Given i open the automationPractice website
    
  @LeaveCardAsGuest
  Scenario: validate shopping card when the guest leaves the site and returns
  
    And i click on Dresses
    And i hover the first product
    And i click on add to card
    And i click on continue shopping
    And i get the card quantity
    And i copy the cookies
    And i close the browser
    And i open the browser
    And i restore the cookies
    And i get the card quantity
    Then i should be able to see my products in the card
    
   @CheckOutAsAGuest 
  Scenario: validate checkout as a guest
  
    And i click on Dresses
    And i hover the first product
    And i click on add to card
    And i click on continue shopping
    And i go to the card
    And i  proceed to check out
    And i sign in
    And i confirm the address
    And i confirm the shipping information
    And i checkout by bank wire
    And i confirm my order
    Then i should be able to see my order in the order history
    
    
   @ContinueShoppingLinks
 Scenario: validate continue shopping buttons in each of the check out pages