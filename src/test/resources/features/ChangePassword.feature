Feature: Change password scenario


  Background: User on the Change Password page
    Given user goes to "userUrl"
    When user clicks join button and enters email "test2@gmail.com"
    And enters password "123123**" then login
    And clicks profile image
    And selects Profile
    And clicks Change Password on the left


  Scenario: User should be able to change account password
    When user enters "123123**" as an old password
    And user enters "abcd1234" as a new password and confirms that password
    And clicks Submit button
    Then password should be changed successfully

    @passw
    Scenario: User shouldn't be able to change password without confirming new password
      When user enters "123123**" as an old password
      And user enters "abcd1234" as a new password but doesn't confirm that password
      And clicks Submit button
      Then warning message should be appeared