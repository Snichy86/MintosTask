Feature: Testing 1a.lv page
  Scenario: shopping
    Given homepage
    When choose category
    And put random product in the shopping basket
    And proceed to checkout page
    Then check if the price and name of product match with chosen
