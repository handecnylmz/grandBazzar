Feature: Related Products

  Background:
    Given user goes to "userUrl"

  @US-58
  Scenario:
    When user on the home page, scrolls down and selects one product
    And scrolls down to related products and selects one of them
    Then both product's category must be same
