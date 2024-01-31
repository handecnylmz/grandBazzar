Feature: Admin Products Page

  @admin
  Scenario: Login as an admin
    Given admin user go to "AdminUrl"
    When admin enters username and password then clicks Submit button
    Then admin should see the dashboard

  Scenario: Products Page
    Given Click Products button
    Then Verify that Products Page