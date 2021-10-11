@Lazada
Feature: Lazada

	Background: 
	When I navigate to Lazada Website
	Then I verify Home page
	
	@ProductBand
  Scenario: Verify Product Band
    When I input search box
    And I click to the search button 
    Then I verify result displayed
    When I click to First News-Trí Việt band
    Then I verify the result displayed
    When I click to first product
    Then I verify the product screen display and product band
    
   @LazMall
    Scenario: Verify Product
    When I input 'Co hai con meo ngoi ben cua so' to search box
    Then I verify search box
    When I click to search button
    Then I verify result displayed and product
    
  @LazMall2
  Scenario: Verify Product2
    When I input 'Co hai con meo ngoi ben cua so' to search box
    Then I verify search box
    When I click to search button
    Then I verify product result displayed
    When I click LazMall in Dich Vu 
    And  I click to product with lowest price
    Then I verify product screen displayed
    And I verify product title
    
    