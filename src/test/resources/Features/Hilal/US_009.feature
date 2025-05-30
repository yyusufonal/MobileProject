Feature: US_009
  Background:
    Given User opens the application


  Scenario: Category icon should be visible and active in the home page navbar.
    And "CategoryButton" is visible
    And "CategoryButton" is enabled
    And "CategoryButton" is click

  Scenario: Men headings should be visible and active
    And "CategoryButton" is click
    And "MenCategoryItem" is visible
    And "MenCategoryItem" is enabled
    And "MenCategoryItem" is click

  Scenario: Women headings should be visible and active
    And "CategoryButton" is click
    And "WomenCategoryItem" is visible
    And "WomenCategoryItem" is enabled
    And "WomenCategoryItem" is click

  Scenario: Junior headings should be visible and active
    And "CategoryButton" is click
    And "JuniorsCategoryItem" is visible
    And "JuniorsCategoryItem" is enabled
    And "JuniorsCategoryItem" is click

  Scenario: Men Filter icons must be active.
    And "CategoryButton" is click
    And "MenCategoryItem" is click
    And "CategoryFilterButton" is visible
    And "CategoryFilterButton" is enabled
    And "CategoryFilterButton" is click

  Scenario: Women Filter icons must be active.
    And "CategoryButton" is click
    And "WomenCategoryItem" is click
    And "CategoryFilterButton" is visible
    And "CategoryFilterButton" is enabled
    And "CategoryFilterButton" is click

  Scenario: Junior Filter icons must be active.
    And "CategoryButton" is click
    And "JuniorsCategoryItem" is click
    And "CategoryFilterButton" is visible
    And "CategoryFilterButton" is enabled
    And "CategoryFilterButton" is click