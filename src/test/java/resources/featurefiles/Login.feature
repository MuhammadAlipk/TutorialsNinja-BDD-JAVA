Feature: Login Feature
  This feature deals with the login functionality.
  It contains all possible login scenarios.

  Scenario: Login with valid credentials
    Given The user will navigate to the application.
    When User enters a valid User Name and valid Password.
    And Clicks on the login button.
    Then user should be authenticated and should be navigated to the home page of application.

  Scenario: Login with valid password but invalid username.
    Given The user will navigate to the application.
    When User enters a invalid UserName and valid Password.
    And Clicks on the login button.
    Then user should not be authenticated and there should be an error message.

  Scenario: Login with Invalid password but valid username.
    Given The user will navigate to the application.
    When User enters a valid UserName and invalid password.
    And Clicks on the login button.
    Then user should not be authenticated and there should be an error message.

  Scenario: Login without password.
    Given The user will navigate to the application.
    When User enters a valid UserName and empty password.
    And Clicks on the login button.
    Then user should not be authenticated and there should be an error message.

  Scenario: Login without UserName.
    Given The user will navigate to the application.
    When User enters a Empty UserName and Valid password.
    And Clicks on the login button.
    Then user should not be authenticated and there should be an error message.

  Scenario: Login without UserName and password.
    Given The user will navigate to the application.
    When User enters a Empty UserName and Empty password.
    And Clicks on the login button.
    Then user should not be authenticated and there should be an error message.