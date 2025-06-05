Feature: Add products to cart without registration
  Background:
    Given User opens the application


  Scenario: Products and their features are visible on the homepage
   * User confirms to be on the homepage

  Scenario: User can select size, color, and quantity for a product
    Given User confirms to be on the homepage
    Then choose Adidas 3-Stripes Cushioned Crew Socks in men category
    And User selects a color option


  Scenario: "Add to Cart" button is visible and active

    * choose Adidas 3-Stripes Cushioned Crew Socks in men category
    * "AddToCartButton" is click
    * "AddToCartButton" is visible
    * "AddToCartButton" is enabled

  Scenario: Product can be added to cart without registration

    * choose Adidas 3-Stripes Cushioned Crew Socks in men category
    * Guest choose black color
    * "AddToCartButton" is click
    * Guest click cart buton

