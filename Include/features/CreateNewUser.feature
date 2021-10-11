@CreateUser
Feature: Create

  Scenario: Create new user
    Given I navigate to Automation Website
    Then I verify the Sign in button
    When I click to Sign in button
    Then I verify the email field and create an account section
    When I input email and click create an account
    Then I verify the your personal information display
    When I input all information of required and click Register button
    Then I verify create an account successful
