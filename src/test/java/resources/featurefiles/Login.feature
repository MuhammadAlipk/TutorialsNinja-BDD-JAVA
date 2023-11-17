Feature: Login Feature
  This feature deals with the login functionality.
  It contains all possible login scenarios.

  Scenario: Login with valid credentials
    Given The user will navigate to the application.
    When User enters a valid "demo@demo.com" and valid "password".
    And Clicks on the login button.
    Then user should be authenticated and should be navigated to the home page of application.

  Scenario: Login with invalid password but valid username.
    Given The user will navigate to the application.
    When User enters a valid "demo@demo.com" and valid "pass".
    And Clicks on the login button.
    Then user should not be authenticated and there should be an error message.

  Scenario: Login with valid password but invalid username.
    Given The user will navigate to the application.
    When User enters a valid "demo@demo.abc" and valid "pass".
    And Clicks on the login button.
    Then user should not be authenticated and there should be an error message.

  Scenario: Login without password.
    Given The user will navigate to the application.
    When User enters a valid "demo@demo.abc" and valid "".
    And Clicks on the login button.
    Then user should not be authenticated and there should be an error message.

  Scenario: Login without UserName.
    Given The user will navigate to the application.
    When User enters a valid "" and valid "password".
    And Clicks on the login button.
    Then user should not be authenticated and there should be an error message.

  Scenario: Login without UserName and password.
    Given The user will navigate to the application.
    When User enters a valid "" and valid "".
    And Clicks on the login button.
    Then user should not be authenticated and there should be an error message.