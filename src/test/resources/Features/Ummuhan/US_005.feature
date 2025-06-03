Feature: The "Popular Brands" title and the brands listed under it should be visible on the home page.

  @US_005/TC_001
  Scenario: Popular brands should be visible on the home page
    Given The application is opened
    And The user navigates to the home page
    And The "Popular Brands" title should be visible
    And The list of popular brands should be visible
