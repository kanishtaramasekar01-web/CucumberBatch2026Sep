Feature: Login

Scenario: Login with valid user
    Given user is on login page
    When user enters login details
      | username | password |
      | admin    | admin123 |
    And user clicks login button
    Then user should see home page