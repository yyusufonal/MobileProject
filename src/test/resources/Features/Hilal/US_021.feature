Feature: Us_021

  Background:
    Given User opens the application
    Given User signs in with email "hilal.email" and password "hilal.password"

  Scenario: Edit Profile link should be visible and active on Dashboard page
    And "ProfileItemButton" is click
    And "EditProfileItem" is visible
    And "EditProfileItem" is enabled
    And "EditProfileItem" is click

  Scenario: Full Name, Email information should be able to be edited on the Edit Profile page when clicked
    And "ProfileItemButton" is click
    And "EditProfileItem" is click
    And send "changaName" to "EditProfileFullName"
    And send "changeMail" to "EditProfileFullMail"

  Scenario: Save Changes button should be visible and active
    And "ProfileItemButton" is click
    And "EditProfileItem" is click
    And "EditProfileSaveButton" is visible
    And "EditProfileSaveButton" is enabled

  Scenario: Changes must be successfully recorded
    And "ProfileItemButton" is click
    And "EditProfileItem" is click
    And send "changeName" to "EditProfileFullName"
    And "EditProfileSaveButton" is click
    And wait 5 seconds
    And "EditProfileItem" is click
    And send "hilaldikman" to "EditProfileFullName"
    And "EditProfileSaveButton" is click