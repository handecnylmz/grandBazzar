Feature: Change Paaword Img Scenario
  @ChangePasswordImage
  Scenario: Verification whether the password is hidden or visible
    Given User click on the Join Button
    When  User enter email "syhn@gmail.com"
    Then  User enter password "98765432"
    Then  User click on the Login Button
    Then  The user clicks on the profile picture
    Then  Clicks on the Profile Button
    And   Clicks on the Change Password Button
    Then  Verifies that it is on theChange Password page
    Then  Enter Old Password
    Then  Verifies that Old Password is Visible or Invisible
    Then  Enter New Password
    Then  Verifies that New Password is Visible or Invisible
    Then  Enter Confirm Password
    Then  Verifies that Confirm Password is Visible or Invisible

