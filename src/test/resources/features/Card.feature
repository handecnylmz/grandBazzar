Feature: As a user, I should be able to add products to card

  Background: For the scenarios in the feature file, user is expected to be on login page
    Given user goes to "userUrl"
    When user clicks join button should be able to see login box
    And user enters email and password then clicks login button

  Scenario: User should be able to add products by using search button.
    When user clicks on the search button
    And user select some products from list
    Then verify the selected products seen on the card
