Feature: card management actions as a guest customer

	Background:
    Given i open the automationPractice website
  @ShoppingAsGuest
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
    
    
    
    