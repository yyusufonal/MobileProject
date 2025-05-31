Feature: Product Detail Page Navigation and Content Display
  As a user,
  I want to be able to access detailed information about the product I have selected on the page

  Background: User opens the app
    Given User opens the application

  @product @detail @navigation
  Scenario: [TC_001 -> US_012] Product Detail Page Navigation Test
    When the user clicks on the product named Flower Print Foil T-shirt
    Then the user should be navigated to the product detail page