Feature: US_024 As a registered user, I want to have a payment page where I can pay for my orders that I control.

  Background: user log in and select item
    Given User signs in with email "yusuf.email" and password "yusuf.password"
    Then choose Canvas Backpack for Men Zipper Rucksacks in men category
    When choose color,add to cart and click cart button
    Then click "proceedToCheckoutButton"
    Then select address and click "saveAndPayButton"

  Scenario: user add address
    Given add new address

  Scenario: TC001 Verify that the Stripe option is visible and selectable under the "Select Payment Method" menu

    And verify that "Stripe" option is visible

  Scenario: TC002 Verify that the "Confirm Order" button is visible and active on the Payment Information page

    And verify that "Confirm Order" option is visible


  Scenario:TC003 Verify that when the user lands on the Stripe payment page, the card detail fields (card number, expiration date, CVC) are visible.

    Given user select "Stripe" option and click "Confirm Order"
    Then fill card information with card number "4242424242424242"
    And verify that card number, expiration date, CVC and zip are visible




  Scenario:TC004 Verify that after entering valid card details and successfully completing the order, an order completion message is displayed.

    Given user select "Stripe" option and click "Confirm Order"
    Then fill card information with card number "4242424242424242",month and year "10/25",CVC "215",zip "34500" and click "confirmButton"
    And verify that order confirmed message is visible
  @TC002
  Scenario: TC005 Verify that order details and invoice are viewable after order completion

    Given user select "Stripe" option and click "Confirm Order"
    Then fill card information with card number "4242424242424242",month and year "10/25",CVC "215",zip "34500" and click "confirmButton"
    When  user click "Go to order details" button
    Then user click last order's order details button
    And verify that "Order Details" option is visible
    And click "Download Receipt" button and verify that the "Print Invoice" button is visible on the page

  Scenario: TC006 Verify that the user can resume shopping after completing an order

    Given user select "Stripe" option and click "Confirm Order"
    Then fill card information with card number "4242424242424242",month and year "10/25",CVC "215",zip "34500" and click "confirmButton"
    When user click "Go to shopping" button
    And verify that "Categories" option is visible
