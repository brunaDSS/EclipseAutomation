Feature: card management actions as a guest customer

	Background:
    Given i open the automationPractice website
    And i click on Dresses
    And i hover the first product
    
  @LeaveCardAsGuest
  Scenario: validate shopping card when the guest leaves the site and returns
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
    
    
   @Compare
 Scenario: validate compare items functionality
   And i hover the first product
   And i click on Add to compare
   And i hover over the second product
   And i click on Add to compare
   And i click on compare
   Then i should see both items in the compare card
   
   
   @AmendCompare
 Scenario: validate compare items functionality
   And i hover the first product
   And i click on Add to compare
   And i hover over the second product
   And i click on Add to compare
   And i click on compare
   And i delete the first product from the compare card
   And i delete the second product from the card
   Then i should see the compare card empty
   
   @SortProducts
 Scenario Outline: validate the sort functionality by price on the dresses page
 	 And i get the "<info>" of all dresses
 	 And i sort the "<info>" by "<condition>"
 	 And i sort the dresses page by "<condition>"
 	 Then i shouldn see the products sorted in the right order
 
    Examples:
    | info | condition |
    | prices2 | lower2 |
    