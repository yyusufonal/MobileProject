Feature: US_009 will start

  Scenario: As a user, I want to be able to see all the categories on the site under the Categories heading.
    Given User opens the application
    And "CategoryButton" is visible
    And "CategoryButton" is click