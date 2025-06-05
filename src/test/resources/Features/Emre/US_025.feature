Feature: US_025 As a registered user, I want to have a page where I can manage the return process for my delivered orders.

  Background: user log in and has delivered order
    Given User signs in with email "yusuf.email" and password "yusuf.password"
    

  Scenario: TC001 Verify that the "Request Return" button is visible and enabled for delivered orders
    * click "Profile" on homepage
    * click the "Order History" link
    * User taps the first delivered order icon
    * User scrolls and taps on "Return Request"

  Scenario: TC002 Verify that the product to be returned can be selected on the Request Return page
    * click "Profile" on homepage
    * click the "Order History" link
    * User taps the first delivered order icon
    * click the back button

    #When user clicks "Return" button
    #Then verify that product selection is possible on "Request Return" page

  Scenario: TC003 Verify that reason, note, and attachment can be added on the Request Return page
    When user clicks "Return" button
    And user selects a product
    Then user adds a return reason
    And user adds a note
    And user adds an attachment
    And verify that reason, note, and attachment are added

  Scenario: TC004 Verify that the "Request Return" button is visible and enabled on the Request Return page
    * click "Profile" on homepage
    * click the "Order History" link
    * User taps the first delivered order icon
    * User scrolls and taps on "Return Request"
    * Text "Return Request" should be visible and enabled on screen


  Scenario: TC005 Verify that initiated return process is displayed in the "Return Orders" page
    * click "Profile" on homepage
    * click the "Return Orders" link
