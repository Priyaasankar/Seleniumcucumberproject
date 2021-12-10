
Feature: Test the login functionality of phptravel webpage


  Scenario: The user should be able to login with correct username and password
    Given user is on the login page
    When enters correct username and password
    Then user gets confirmation