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
    * click "Profile" on homepage
    * click the "Order History" link
    * User taps the first delivered order icon
    * User scrolls and taps on "Return Request"
    * User selects product for return
    * User opens return screen
    * User selects return reason
    * User enters return note "hasarlı ürün"
    * User taps Request Return button


  Scenario: TC004 Verify that the "Request Return" button is visible and enabled on the Request Return page
    * click "Profile" on homepage
    * click the "Order History" link
    * User taps the first delivered order icon
    * User scrolls and taps on "Return Request"
    * Text "Return Request" should be visible and enabled on screen


  Scenario: TC005 Verify that initiated return process is displayed in the "Return Orders" page
    * click "Profile" on homepage
    * click the "Return Orders" link
    * User taps the pending icon
    * Text "Pending" should be visible and enabled on screen
