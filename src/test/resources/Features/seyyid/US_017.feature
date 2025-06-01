Feature: As a registered user, I would like to have a page on the site where I can manage my address information



  Scenario: TC_01 Address menu is visible in dashboard sidebar

    Then click the profile link
    And test the visiblity of the adress menue


  Scenario: TC_02 Verify that clicking the "Address" menu redirects the user to the Address page.

    Then click the Profile link
    And click the adress menue
    Then test the visbility of the Adress string


  Scenario: TC_03 Confirm that previously saved addresses are listed on the Address page.

    Then click the Profile link
    And click the adress menue
    Then test the visbility of the previously created SSS adress

  Scenario: TC_04 Ensure that the user can update an existing address.
    Then click the Profile link
    And click the adress menue
    Then click the eddit button

  Scenario: TC_05  Ensure that the user can delete a registered address.
    Then click the Profile link
    And click the adress menue
    Then click the delete button
    And check the visibility of the confirmation string

  Scenario:  TC_06 Ensure that the "Add New Address" button is present and visible on the Address page.
    Then Then click the Profile link
    And click the adress menue
    Then check the visibility of the new adress page

  Scenario: TC_07 Confirm that the "Add New Address" button is active and functional.
    Then Then click the Profile link
    And click the adress menue
    Then click the Add new adrees menue
    And test the visibility of the Add New Adress string

  Scenario: TC_08  Verify that users can input and save a new address, and it appears in the address list.
    Then Then click the Profile link
    And click the adress menue
    Then click the Add new adrees menue
    And crete a new
