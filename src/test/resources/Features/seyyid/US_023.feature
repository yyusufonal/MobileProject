Feature: [US_023] As a user, I want to create a favorite list with the products I like without registering.
  Background:
    Given User opens the application
    Then clicks the flower Print Tshirt
    Then scrols down the page

    Scenario: Ensure that a favorite (heart) icon is shown on each product card/list.
      Then test the visibility of the "Favorite" text

    Scenario: Verify that an unregistered user can click the icon, initiating action.
        Then click the "Favorite" link
        And test the visibility of the "Sign in to continue shopping" text

    Scenario: Confirm that clicking the favorite icon takes unregistered users to Sign In.
      Then click the "Favorite" link
      And test the visibility of the "Sign in to continue shopping" text

    Scenario: Ensure that users are able to access the Sign Up page from the Sign In page.
      Then click the "Favorite" link
      And click the "Sign Up" link
      Then test the visibility of the "Let's create your account" text

    Scenario: Verify that no favorite action is saved without registration/login.
      Then click the "Favorite" link
      And click the back button
      Then click the back button
      And click the "Wishlist" link
      Then test the visibility of the "Sign in to continue shopping" text
