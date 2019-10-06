Feature: Testing online shop page

  Scenario: shopping
    Given homepage
    When choose category
    And add random product to the cart
    And proceed to checkout page
    Then check if the price and name of product match with chosen
