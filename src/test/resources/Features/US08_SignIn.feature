Feature: Profile
  Background: User opens the app
    * User makes driver adjustments
  @1
  Scenario: It should be possible to log in to the system when valid information is entered in the login form and the signIn button is clicked.
    * User confirms to be on the homepage
    * User clicks the button with description "Profile"
    * User clicks the button with description "Sign In"
    * User clicks the button "phoneTextBox" and sendKeys "9988776655"
    * User clicks the button "signInLoginButton"
    * User clicks the button with description "Profile"
    * Verifies username "elif" in dashboard
    * Driver turns off




