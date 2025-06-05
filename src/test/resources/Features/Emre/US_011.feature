Feature: Create a favorites list
  Background: User login
    * User logs in with email "emreyilmaz.user@querycart.com" and password "Query.151224"
  

  Scenario: Wishlist button is visible and active on the homepage navbar
    * verify that the Wishlist button is visible, enabled, and navigates to the correct page when clicked.
   

  Scenario: Add products to the wishlist
    * choose Adidas 3-Stripes Cushioned Crew Socks in men category
    * User click fav buton
