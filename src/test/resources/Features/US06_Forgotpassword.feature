Feature: US_06 Forgot password

Background: User opens the app
* User makes driver adjustments

@06
Scenario: Forgot Password Test
*  User clicks the button with description "Profile"
* User clicks the button with description "Sign In"
* User clicks the button with description "Forgot Password"
* Verifies username "Forgot Password" in dashboard
* Verifies username "Back to sign in" in dashboard
* User clicks phone number textbox and "9988776655" phone number
* User clicks the button with description "Get OTP"
   # * Verifies username "The User verify is successfully." in dashboard
* User clicks NewPasswordTextBox and confirmPasswordTextBox "Wise123*"
*  User clicks the button with description "Submit"
* User clicks the button with description "Profile"
* Verifies username "elif" in dashboard
* Driver turns off

