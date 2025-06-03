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

  Scenario: [TC_003 -> US_014] Juniors Category Filtering Icons Visibility and Functionality Test
    Given Select "Men" category.
    Then filtering icons such as "Sort By", "Brands", "color" and "size" should be visible
    Then the "Sort By" filter options such as "Newest", "Price Low To High", "Price High To Low", and "Top Rated" should be visible and enabled
    Then the "Brands" filter image options should be visible and enabled
    Then the "size" filter options should be visible and enabled
    Then the "color" filterr options should be visible and enabled

    #Then the product list should update based on the selected filter