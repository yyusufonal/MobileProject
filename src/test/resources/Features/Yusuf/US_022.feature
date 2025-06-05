Feature: US_022 As a registered user, I want to be able to log out of the system securely

  Background: user log in

    Given User signs in with email "yusuf.email" and password "yusuf.password"

  Scenario: TC001  Verify that the profile icon is visible on the homepage

    And verify that "Profile" option is visible

  Scenario: TC002 Verify that the Logout link is visible and active in the dashboard sidebar after clicking the profile icon

    Given click "profileButton"
    And verify that "Logout" option is visible
  @TC003
  Scenario: TC003 Verify that clicking the Logout link logs the user out successfully

    Given click "profileButton"
    Then click logout button
    And verify that logout successfully


