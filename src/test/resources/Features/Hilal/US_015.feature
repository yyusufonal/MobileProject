Feature: Us_015 will start

  Background:
    Given User opens the application
    Given User logs in with email "hilaldikman.user@querycart.com" and password "Query.151224"

  Scenario: Women category window and subcategories should be displayed in the body section of the home page.
    And wait 3 seconds
    And "CategoryButton" is click
    And "CategorySideButton" is click
    And "SideWomanText" is visible

  Scenario: The products on the Women category page should be able to perform add to cart actions
    And "CategoryButton" is click
    And "WomenCategoryItem" is click
