Feature: See categories and products of the Menu menu on the home page
  Background: User login
    * User logs in with email "emreyilmaz.user@querycart.com" and password "Query.151224"


  Scenario: Men category and subcategories are visible and active
    * User confirms to be on the homepage
    * click the "Category" link
    * User click Men side
    * test the visibility of the "Men" text

  Scenario: Perform operations on men category products

    * User confirms to be on the homepage
    * click the "Category" link
    * choose men category
    * User click adidas21 wishlist
    * User choose adidas corap
    * Guest choose black color
    * "AddToCartButton" is click


  Scenario: Filtering icons are visible and active
    * click the "Category" link
    * choose men category
    * click men filter


