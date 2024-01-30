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

