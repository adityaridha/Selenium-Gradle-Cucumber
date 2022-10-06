Feature: Login

  Scenario: Login using valid email
    Given user is on login page
    When user click login button
    Then user will be on homepage