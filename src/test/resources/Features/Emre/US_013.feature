Feature: See categories and products of the Menu menu on the home page

  Scenario: Men category and subcategories are visible and active
    Given The user is logged in
    And The homepage is loaded
    Then The men category and its subcategories should be visible and active

  Scenario: Perform operations on men category products
    Given The user is on the men category page
    When The user tries to add a product to cart, favorites, or view details
    Then The operation should be successful

  Scenario: Filtering icons are visible and active
    Given The user is on the men category page
    Then Filtering icons should be visible and active
