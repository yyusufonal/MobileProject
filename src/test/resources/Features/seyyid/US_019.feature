Feature: As a registered user, I would like to have a page on the site where I can select and manage my address information before completing the payment.

  Background: user log in and select item
  Given User logs in with email "seyyidefe.user@querycart.com" and password "Query.151224"
  Then clicks the flower Print Tshirt
  And click the "S" links
  And click the "S" links
  Then scrols down the page
  Then click the "Add To Cart" link
  And click the right bottom chart button
  Then click the "Proceed to Checkout" link



  Scenario:TC_01 Ensure that the Delivery button is displayed on the Shipping Information page.
    Then test the visibility of the "Delivery" link


  Scenario: TC_02 Verify that clicking the Delivery button enables address management.
    Then click the "Pick Up" link
    And click the "Delivery" link
    Then test the visibility of the "Shipping Address" text

  Scenario: TC_03 Ensure that the Pick Up button is displayed.
    Then click the "Pick Up" link
    And test the visibility of the "Pick Up" text

  Scenario: TC_04 Confirm that the Pick Up option can be selected.
    Then click the "Pick Up" link
    And test the visibility of the "Save & Pay" text

  Scenario: TC_05  Ensure that the saved address appears when Delivery is selected.
    Then click the "Pick Up" link
    And click the "Delivery" link
    Then test the visbility of the created adress

    #-- Failed
  Scenario: TC_07 Confirm that the user can add a new shipping address when Delivery is selected.
    Then click the "Pick Up" link
    And click the "Delivery" link
    Then click the "Add" link
    And crete a new adress
    Then wait 3 seconds
    Then test the visibility of the "Success Address Added Successfully!" text


    #-- Failed

  Scenario: TC_06 Verify that the user can modify a displayed shipping address.
    Then click the "Pick Up" link
    And click the "Delivery" link
    Then click the "Edit" link
    And click the eddit button
    Then click the "Update Address" link
    Then wait 5 seconds
    And test the visibility of the "Success Address Updated Successfully!" text
    Then wait 5 seconds

  Scenario: TC_08 Ensure that an Order Summary section is displayed under the shipping area.
    Then click the "Pick Up" link
    And click the "Delivery" link
    Then test the visibility of the "Order Summary" text


  Scenario: TC_09 Verify that item names, prices, totals, and quantity are correctly shown.
    Then click the "Pick Up" link
    And click the "Delivery" link
    Then scroll down the page
    And test the visibility of the "Subtotal" text
    Then test the visibility of the "$65.00" text
    And test the visibility of the "Tax" text
    Then test the visibility of the "$0.00" text
    And test the visibility of the "Shipping Charge" text
    Then test the visibility of the "$0.00" text
    And test the visibility of the "Discount" text
    Then test the visibility of the "$0.00" text
    Then test the visibility of the "Total" text
    Then test the visibility of the "$76.30" text



  Scenario: TC_10 Ensure that the Save & Pay button is present on the page.
    Then click the "Pick Up" link
    And click the "Delivery" link
    Then scroll down the page
    And test the visibility of the "Save & Pay" text

  Scenario: TC_11 Verify that the Save & Pay button is functional and navigates to payment.
    Then click the "Pick Up" link
    And click the "Delivery" link
    Then click the adress name
    And scroll down the page
    Then click the "Save & Pay" link
    And test the visibility of the "Select Payment Method" text

