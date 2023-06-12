Feature: LoginFeature
  This feature deals with the login functionality of the applications

  Scenario: Login with correct username and password
    Given I click Login in the Home page
    And I enter the following for Login
      | username | password      |
      | admin    | adminpassword |
    And I click login button
    Then I should see the userform page

  Scenario: Login with correct username and password to fail
    Given I click Login in the Home page
    And I enter the following for Login
      | username | password      |
      | admin    | adminpassword |
    And I click login button
    Then I should see the userform page wrongly