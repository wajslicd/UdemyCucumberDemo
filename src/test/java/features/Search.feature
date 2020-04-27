Feature: Search and place order for vegetables
  @SmokeTest
  Scenario: Search for items and validate results
    Given User is on GREENKART landing page
    When User searches for Cucumber vegetable
    Then "Cucumber" results are displayed

	@RegressionTest
  Scenario Outline: Search for items and then move to checkout page
    Given User is on GREENKART landing page
    When User searches for <name> vegetable
    And added items to cart
    And user proceeded to checkout page for purchase
    Then verify selected <name> items are displayed in checkout page
    
    Examples: 
      | name |
      | Brinjal	|
      | Beetroot|

      
      