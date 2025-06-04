Feature: [US_017] As a registered user, I would like to have a page on the site where I can manage my address information

  Background: user log in and select item
    Given User logs in with email "seyyidefe.user@querycart.com" and password "Query.151224"
    Then click the "Profile" link

  Scenario: TC_01 Address menu is visible in dashboard sidebar

    And test the visibility of the "Address" link


  Scenario: TC_02 Verify that clicking the "Address" menu redirects the user to the Address page.

    And click the "Address" link
    Then test the visibility of the "Address" link


  Scenario: TC_03 Confirm that previously saved addresses are listed on the Address page.

    And click the "Address" link
    Then test the visbility of the created adress

  Scenario: TC_04 Ensure that the user can update an existing address.
    And click the "Address" link
    Then test the visibility of the edit button

  Scenario: TC_05  Ensure that the user can delete a registered address.
    And click the "Address" link
    Then click the delete button
    And click the "Delete" link

  Scenario:  TC_06 Ensure that the "Add New Address" button is present and visible on the Address page.
    And click the "Address" link
    Then test the visibility of the "Add New Address" link

  Scenario: TC_07 Confirm that the "Add New Address" button is active and functional.
    And click the "Address" link
    Then click the "Add New Address" link
    And test the visibility of the "Add New Address" link

  Scenario: TC_08  Verify that users can input and save a new address, and it appears in the address list.
    And click the "Address" link
    Then click the "Add New Address" link
    And crete a new adress
