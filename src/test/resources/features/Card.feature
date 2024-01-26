Feature: As a user, I should be able to add products to card

  Background: For the scenarios in the feature file, user is expected to be on login page
    Given user goes to "userUrl"
    When user clicks join button should be able to see login box
    And user enters email and password then clicks login button
    When user clicks on the search button

  Scenario: User should be able to add and remove products to the card.
    And user selects some products from list
    Then verify the selected products seen on the card
    And user cancels the selected item
    Then verify the cancelled item is not seen on the card

  Scenario: User should not be able to add more products than stock
    When user adds one product to the card
    And verify user cannot increase the number of items more than the stock


