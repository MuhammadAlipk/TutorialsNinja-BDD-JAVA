Feature: Register new user new user to application.
  This feature will contains all the scenarios that
  we need to verify in while registering a new user in the application.
  Scenario: Register a user by providing all the mandatory fields
    Given The user will navigate to the Registration page.
    When user Enters First Name "Muhammad".
    And User Enters LastName "Ali".
    And User Enters an email Address "test@test.com".
    And User Enters a phone number "+92308524614".
    And User Enters a password "password".
    And User Enters a Confirm password "password".
    And User clicks on Terms and condition check box "true".
    And User clicks on Continue button.
    Then The new user should be register successfully.

    Scenario: Register user by providing all the fields.
      Given The user will navigate to the Registration page.
      When user Enters First Name "Muhammad".
      And User Enters LastName "Ali".
      And User Enters an email Address "test@test.com".
      And User Enters a phone number "+92308524614".
      And User Enters a password "password".
      And User Enters a Confirm password "password".
      And User clicks on Terms and condition check box "true".
      And User subscribe newsletter "true".
      And User clicks on Continue button.
      Then The new user should be register successfully.


