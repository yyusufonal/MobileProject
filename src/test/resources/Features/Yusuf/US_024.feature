Feature: US_024 As a registered user, I want to have a payment page where I can pay for my orders that I control.
  Background: user log in and select item
    Given Given User logs in with email "yusufonal.user@querycart.com" and password "Query.151224"



  Scenario: Verify that the Stripe option is visible and selectable under the "Select Payment Method" menu
    Then choose Canvas Backpack for Men Zipper Rucksacks in men category
    When choose color,add to cart and click cart button
