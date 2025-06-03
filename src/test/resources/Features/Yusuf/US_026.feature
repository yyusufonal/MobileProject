Feature: US_026 As a registered user, I want to have a favorite products page on the site and I want to be able to manage this page.

    Background: user login with email and password

        Given User logs in with email "yusufonal.user@querycart.com" and password "Query.151224"


    Scenario:TC001 Verify that the favorite icon is visible and active on products and that a product can be added to the favorites list

        Given scroll to Men's Analog Watch in homepage
        And verify that favorite button is visible on product and click it
        And verify that product be added to the favorite list

    Scenario: TC002 Verify that the wishlist (favorite) icon is visible and active on the homepage

        Given verify that the Wishlist button is visible, enabled, and navigates to the correct page when clicked.

    Scenario: TC003 Verify that products added to the wishlist are displayed on the Wishlist page.

        Given scroll to Men's Analog Watch in homepage
        Then click favorite button on selected product and click "Wishlist" button
        And verify that added product display on the Wishlist page

    @TC003
    Scenario: TC004 Verify that a product can be removed from the Wishlist page

        Given click "Wishlist" on homepage
        Then click favorite button on first product in Wishlist
        And verify that product removed on Wishlist successfully













