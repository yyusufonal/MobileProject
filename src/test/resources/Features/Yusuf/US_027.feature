Feature: US_027As a registered user, I want to have a cart on the site and I want to be able to manage these cart operations

  Background: user login account with email and password

    Given User signs in with email "yusuf.email" and password "yusuf.password"

  @TC003
  Scenario:TC001 Verify that the cart icon is visible and active on the homepage

    Given verify that cart button displayed and active
  @TC003
  Scenario: TC002 Verify that products added to the cart are displayed on the Shopping Cart page and can be deleted

    Then click Men category choose random  ,choose color or size and click "Add To Cart" button
    And click cart button and verify that added product is displayed in cart
    And click "Remove" button on added product and verify that that removed from cart
