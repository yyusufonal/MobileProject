Feature: View shopping history in Dashboard

  Scenario: Order History menu item is visible and active in Dashboard sidebar
    Given The user is logged in
    And The dashboard page is loaded
    Then The Order History menu item should be visible and active in the sidebar

  Scenario: Shopping history viewing icon is active on Order History page
    Given The user is on the Order History page
    Then The viewing icon should be visible and active

  Scenario: Order invoice is accessible from Order History list
    Given The user is on the Order History page
    When The user clicks on an order invoice
    Then The order invoice should be displayed

  Scenario: Orders can be canceled from Order History list
    Given The user is on the Order History page
    And There is at least one active order
    When The user clicks cancel on an order
    Then The order should be canceled and removed from the list
