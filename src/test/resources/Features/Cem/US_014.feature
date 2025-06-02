Feature: Juniors Category Visibility on Homepage
  As a registered user,
  I would like to be able to see the categories and products of the Juniors menu on the home page.

  Background: user log in and select item
    Given Given User logs in with email "cemizci.user@querycart.com" and password "Query.151224"

  Scenario: [TC_001 -> US_014] Juniors Category Visibility Test
    Then Verify all the categories are visible under the Categories heading.