Feature: Login Scenario

  @login
  Scenario: Login as a user
    Given user goes to "userUrl"
    When user clicks join button should be able to see login box
    And user enters email and password then clicks login button
    Then user should see profile image

  @admin
  Scenario: Login as an admin
    Given admin user go to "AdminUrl"
    When admin enters username and password then clicks Submit button
    Then admin should see the dashboard

  @wip
  Scenario: Negative user login scenario with invalid username and password
    Given user goes to "userUrl"
    When user clicks join button should be able to see login box
    And user enters invalid email such as "abcd"
    And enters password less than eight characters
    Then user clicks login button and warning messages should be displayed


  Scenario Outline: Negative user login scenario with valid+invalid entries
    Given user goes to "userUrl"
    When user clicks join button should be able to see login box
    And user enters "<email>"
    And enters "<password>"
    Then user clicks login button
    And should close the pop up in order to login again

    Examples:
      | email          | password   |
      | test@test.com  | 12345678   |
      | test@gmail.com | 1234*1234* |
