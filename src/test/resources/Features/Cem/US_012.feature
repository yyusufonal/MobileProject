Feature: Product Detail Page Navigation and Content Display
  As a user,
  I want to be able to access detailed information about the product I have selected on the page

  Background: User opens the app
    Given User opens the application

  @product @detail @navigation
  Scenario: [TC_001 -> US_012] Product Detail Page Navigation Test
    When the user clicks on the product named Flower Print Foil T-shirt
    Then the user should be navigated to the product detail page

  Scenario: [TC_002 -> US_012] Product Detail Page Section Headings Visibility Test
    When the user clicks on the product named Flower Print Foil T-shirt
    Then the user should be navigated to the product detail page
    Then the user should see "Details", "Videos", "Review", and "Shipping&Return" sections

  Scenario: [TC_003 -> US_012] Product Detail Section Content Display Test
    When the user clicks on the product named Flower Print Foil T-shirt
    When you click on the Details button, the Product Details title and product information should be displayed.

    Scenario: [TC_004 -> US_012] Product Detail Section Content Display Test
      When the user clicks on the product named Flower Print Foil T-shirt
      When clicking the Videos button, the Product Videos title and product videos should be displayed

  Scenario: [TC_005 -> US_012] Product Detail Section Content Display Test
    When the user clicks on the product named Flower Print Foil T-shirt
    When the Review button is clicked, the Review title and reviews of the product should be displayed

  Scenario: [TC_006 -> US_012] Product Detail Section Content Display Test
    When the user clicks on the product named Flower Print Foil T-shirt
    When the Shipping&Return button is clicked, the Shipping&Return heading and the shipping and return conditions of the product should be displayed