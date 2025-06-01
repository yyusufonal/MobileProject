Feature: As a user, I would like to have easy links in the bottom bar of the home page so that I can easily perform internal site operations.
  Background:
    Given User opens the application


    Scenario: TC_01 Verify that the "Home" link is displayed in the bottom navigation bar.
      Then test the visibility of the "Home" link


    Scenario: TC_03 Verify that the "Wishlist" link is displayed in the bottom navigation bar.
      Then test the visibility of the "Wishlist" link


    Scenario: TC_04 Verify that the "Category" link is displayed in the bottom navigation bar.
      Then test the visibility of the "Category" link


    Scenario: TC_05  Verify that the "Profile" link is displayed in the bottom navigation bar.
      Then test the visibility of the "Profile" link


    Scenario: TC_06 Verify that tapping the "Home" link navigates the user to the home screen.
      Then click the "Home" link
      And test the visibility of the "Categories" text


    Scenario: TC_07 Verify that tapping the "Category" link navigates to the category section.
      Then click the "Category" link
      And test the visibility of the "Men" text


    Scenario: TC_08 Verify that tapping the "Wishlist" link opens the wishlist page.
      Then click the "Wishlist" link
      And test the visibility of the "continue shopping" text

    Scenario: TC_09 Verify that tapping the "Cart" link opens the cart page.
      Then click the "Cart" link
      And test the visibility of the "Shopping Cart" text

    Scenario: TC_10 Verify that tapping the "Profile" link opens the user's profile page.
      Then click the "Profile" link
      And test the visibility of the "Sing In To See Your Info" text


    Scenario: TC_11 Verify that a search input field is visible on the screen.
      Then test the visibility of the "searchButton" on the screen


    Scenario: TC_12  Verify that entering a valid search term returns relevant search results.
      Then type Women Snow Boots to the search button and click
       And  test the visibility of the "womanSnowBoots" on the screen


    Scenario: TC_13 Verify that entering an invalid keyword shows a "no results" message.
      Then type iki tane bounty to the search button and click
      And test the visibility of the "(0 Products Found)" text
