Feature: Registered user login

    Background:
      Given The application is opened
      And The user clicks the profile icon on the home page
      And The login page is displayed

    @US_008/TC_001

    Scenario: The user should be able to log in with valid credentials
      When The user enters a valid email or phone number
      And The user enters a valid password
      And The user selects the "Remember Me" checkbox (if any)
      And The user clicks the "Sign In" button
      And The user should be successfully logged in

    @US_008/TC_002

    Scenario: The user cannot log in with an invalid password
      When The user enters a valid email
      And The user enters an invalid password
      And The user clicks the "Sign In" button
      And An error message for incorrect login should be displayed

    @US_008/TC_003

    Scenario: The user cannot log in with empty fields
      When The email field is left blank
      And The user enters a valid password
      And The user clicks the "Sign In" button
      And A warning message for empty fields should be displayed

    @US_008/TC_004

    Scenario: The user cannot log in with an invalid email format
      When The user enters an invalid email format (e.g. abc@)
      And The user enters a valid password
      And The user clicks the "Sign In" button
      And A warning message for invalid email format should be displayed
