Feature: Login Feature
  This feature deals with the login functionality.
  It contains all possible login scenarios.

  Scenario: Login with valid credentials
    Given The user will navigate to the application.
    When User enters a valid "demo@demo.com" and valid "password".
    And Clicks on the login button.
    Then user should be authenticated and should be navigated to the home page of application.
