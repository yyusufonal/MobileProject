Feature: US_027As a registered user, I want to have a cart on the site and I want to be able to manage these cart operations

  Background: user login account with email and password

    Given User signs in with email "yusuf.email" and password "yusuf.password"


  Scenario:TC001 Verify that the cart icon is visible and active on the homepage

    Given verify that cart button displayed and active

  Scenario: TC002 Verify that products added to the cart are displayed on the Shopping Cart page and can be deleted

    Given click Men category choose random product,choose color or size and click "Add To Cart" button
    Then click cart button and verify that added product is displayed in cart
    And click "Remove" button on added product and verify that that removed from cart

  Scenario: TC003 Verify that the subtotal amount is visible on the Shopping Cart page

    Given click Men category choose random product,choose color or size and click "Add To Cart" button
    Then click cart button
    And verify that subtotal value is displayed


  Scenario: TC004 Verify that the Proceed to Checkout button is visible, active, and redirects to the Checkout page

    Given click Men category choose random product,choose color or size and click "Add To Cart" button
    Then click cart button
    And  verify that "Proceed to Checkout" option is visible
    Then click "proceedToCheckoutButton"
    And verify that the page navigated to is the "Shipping Information" title in the page

  Scenario: TC005 Verify that the Go to Shopping button is visible and active when the cart is empty

    Given click Men category choose random product,choose color or size and click "Add To Cart" button
    Then click cart button
    And click "Remove" button on added product and verify that that removed from cart
    And verify that "Go to Shopping" option is visible
    Then click "goToShoppingButton"
    And verify that the page navigated to is the "Most Popular" title in the page


