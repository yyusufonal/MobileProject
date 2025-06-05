Feature: Registered user login

  Background:
    Given The application is opened
    And The user clicks the profile icon on the home page
    And The login options screen is displayed
    And The user clicks the "Sign In" option
    And The user clicks the "Use email instead" option

  #US_008/TC_001
  Scenario: The user should be able to log in with valid credentials
    Given The user logs in with email "ummuhankacmaz.user@querycart.com" and password "Query.151224"
    And The user clicks the "Remember Me" checkbox
    And The user clicks the "Sign In" button login
    And I should see the "Successfully logged in" message login


  #US_008/TC_002
  Scenario: The user cannot log in with an invalid password
    Given The user logs in with email "ummuhankacmaz.user@querycart.com" and password "WrongPass123"
    And The user clicks the "Sign In" button login
    And I should see the "Incorrect password" error message

  #US_008/TC_003
  Scenario: The user cannot log in with empty email field
    Given The user logs in with email "" and password "Query.151224"
    And The user clicks the "Sign In" button login
    And I should see the "Email is required" warning message

  #US_008/TC_004
  Scenario: The user cannot log in with an invalid email format
    Given The user logs in with email "abc@" and password "Query.151224"
    And The user clicks the "Sign In" button login
    And I should see the "Please enter a valid email address" warning message