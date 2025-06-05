Feature: A registered user should be able to access a
  dashboard page where they can manage their settings in the application.

  Background:
    Given The application is opened
    And The user logs in successfully and navigates to the homepage

  #US_016/TC_001
  Scenario: The profile icon must be visible and active on the homepage
    And The profile icon should be visible and clickable

  #US_016/TC_002
  Scenario: Clicking the profile icon should navigate to the dashboard page
    And The user clicks the profile icon
    And The dashboard page should open

  #US_016/TC_003
  Scenario: The user navigates to the "My Account" tab and views summary information
    And The user clicks the profile icon
    And The user clicks the my account tab
    And Total Orders, Total Completed, Total Returned, and Wallet Balance should be visible

  #US_016/TC_004
  Scenario: The user should be able to view order history
    And The user clicks the profile icon
    And The user clicks the my account tab
    And The user sees the "Order History" section under "My Account"
    And The order history list should be displayed
