Feature: Access to the home page

  #US_001/TC_001
  Scenario: The user should see the home page when the application is opened
    Given The application is opened
    And The user navigates to the home page
    And The home page should be visible
