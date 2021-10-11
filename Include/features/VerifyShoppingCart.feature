
@VerifyShoppingCart
Feature: Verify

  Scenario: Verify Shopping cart
    Given I login success
    Then I verify element present on Home page
    When I click to Woment Item
    Then I verify Top and Dresses categories
    When I click to the Top item
    Then I verify TShirts and Blouses categories
    When I click to the product
    Then I verify product detail display
    When I click add to cart
    Then I verify Cart displayed
    When I click to Processed 
    Then I verify the screen Shopping Cart Summary display
    When I click SignOut 
    Then I verify message displayed
    
