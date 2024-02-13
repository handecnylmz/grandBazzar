Feature: Test SearchBox


  Background:
    Given   user goes to "userUrl"
    When user clicks join button should be able to see login box
    And user enters email and password then clicks login button



@safak
  Scenario: The users in home page
    When the user types the word they want to search for"tahini"
    And  clicks on the search lens
    Then verify that the product the user is looking for is listed