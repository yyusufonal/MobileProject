Feature: Juniors Category Visibility on Homepage
  As a registered user,
  I would like to be able to see the categories and products of the Juniors menu on the home page.

  Background: user log in and select item
    Given User logs in with email "cemizci.user@querycart.com" and password "Query.151224"

  Scenario: [TC_001 -> US_014] Juniors Category Visibility Test
    Then Verify all the categories are visible under the Categories heading.


  Scenario: [TC_002 -> US_014] Juniors Product Actions Functionality Test
     Given Select "Juniors" category.
     Then Select "45cm Anime POKEMON Pikachu Large Stuffed Dolls Soft Plush Animal Toy Gift" from the category.
     Then Verify that the product details page for the selected product is displayed.
     And User adds product to cart and confirms that product can be added
     And User adds the product to favorites and confirms that the product has been added to favorites
