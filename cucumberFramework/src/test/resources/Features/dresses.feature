Feature: Shopping card management

Background:
Given i open the automationPractice website
  And i sign in

  @AddToCard
  Scenario: validate add to card from the product pic
    And i click on Dresses
    And i hover the first product
    And i click on add to card
    And i continue to Check out
    Then i should be able to see my item in the shooping card


  @CheckOut
  Scenario Outline: validate checkout with blank transfer
    And i add a product to the card
    And i  proceed to check out
    And i confirm the address
    And i confirm the shipping information
    And i checkout by bank wire
    And i confirm my order
    Then i should be able to place an order and confirm the "<message>"

    Examples:
   | message|
    |Your order on My Store is complete.|

  @CheckOut @CheckoutWithOrderRef
  Scenario: validate checkout with blank transfer is available in the placed orders
    And i add a product to the card
    And i  proceed to check out
    And i confirm the address
    And i confirm the shipping information
    And i checkout by bank wire
    And i confirm my order
    Then i should be able to see my order in the order history



  @CheckOut
  Scenario Outline: validate checkout with bank Check
    And i add a product to the card
    And i  proceed to check out
    And i confirm the address
    And i confirm the shipping information
    And i checkout by check
    And i confirm my order
    Then i should be able to place an order and confirm the "<message>"

    Examples:
      | message|
      |Your order on My Store is complete.|


  @CheckOut @CheckoutWithOrderRef
  Scenario: validate checkout with bank Check
    And i add a product to the card
    And i  proceed to check out
    And i confirm the address
    And i confirm the shipping information
    And i checkout by check
    And i confirm my order
    Then i should be able to see my order in the order history


  @AmendCard
  Scenario: validate amend card actions
    And i add products to the card
    And i go to the card
    And i amend product quanity on the card
    And i delete a product from the card
    And i make zero the product quantity on the card
    Then i should be able to verify the changes

  @AddToCard2
  Scenario: validate add to card through the product page
    And i click on Dresses
    And i hover the first product
    And i click on More
    And i click on add to card from the product page
    And i continue to Check out
    Then i should be able to see my item in the shooping card









