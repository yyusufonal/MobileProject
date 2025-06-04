Feature: Us_015

  Background:
    Given User opens the application
    Given User signs in with email "hilal.email" and password "hilal.password"

  Scenario: Women category window and subcategories should be displayed in the body section of the home page.
    And wait 3 seconds
    And "CategoryItemButton" is click
    And "CategorySideButton" is click
    And "SideWomanText" is visible

  Scenario: The products on the Women category page should be able to perform add to cart actions
    And "CategoryItemButton" is click
    And "WomenCategoryItem" is click
    And "FirstProduct" is click
    And wait 3 seconds
    And "Msize" is click
    And wait 3 seconds
    And Scroll the page
    And "AddToCartButton" is click

  Scenario: The products on the Women category page should be able to perform add to liked list actions
    And "CategoryItemButton" is click
    And "WomenCategoryItem" is click
    And "LikeProduct" is visible
    And "LikeProduct" is click

  Scenario: Filtering icons should be visible and active
    And "CategoryItemButton" is click
    And "WomenCategoryItem" is click
    And "FilterProduct" is visible
    And "FilterProduct" is click
