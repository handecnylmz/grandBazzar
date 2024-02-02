package com.grandbazzar.stepDefinitions;

import com.grandbazzar.pages.ChangePasswordPage;
import com.grandbazzar.pages.LoginPage;
import com.grandbazzar.utilities.ReusableMethods;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ChangePasswordSteps {

    LoginPage loginPage = new LoginPage();
    ChangePasswordPage changePasswordPage = new ChangePasswordPage();

    @When("user clicks join button and enters email {string}")
    public void user_clicks_join_button_and_enters_email(String email) {

        loginPage.joinBtn.click();
        loginPage.emailBox.sendKeys(email);
    }
    @When("enters password {string} then login")
    public void enters_password_then_login(String password) {

        loginPage.passwordBox.sendKeys(password);
        loginPage.loginBtn.click();
        ReusableMethods.wait(3);
    }
    @When("clicks profile image")
    public void clicks_profile_image() {

        loginPage.profileImg.click();
    }
    @When("selects Profile")
    public void selects_profile() {

        loginPage.profileLink.click();
        ReusableMethods.wait(3);
    }
    @When("clicks Change Password on the left")
    public void clicks_change_password_on_the_left() {

        changePasswordPage.changePasswordLink.click();
        ReusableMethods.wait(3);
    }
    @When("user enters {string} as an old password")
    public void user_enters_as_an_old_password(String oldPassword) {

        changePasswordPage.oldPasswordBox.sendKeys(oldPassword);
    }
    @When("user enters {string} as a new password and confirms that password")
    public void user_enters_as_a_new_password_and_confirms_that_password(String newPassword) {

        changePasswordPage.newPasswordBox.sendKeys(newPassword);
        changePasswordPage.confirmPasswordBox.sendKeys(newPassword);
    }
    @When("clicks Submit button")
    public void clicks_submit_button() {

        changePasswordPage.submitButton.click();
        ReusableMethods.wait(3);
    }
    @Then("password should be changed successfully")
    public void password_should_be_changed_successfully() {

        Assert.assertTrue(changePasswordPage.changeSuccessfullyMsg.isDisplayed());
        Assert.assertEquals("Password changed successfully!",changePasswordPage.changeSuccessfullyMsg.getText());

        System.out.println("Successful message = " + changePasswordPage.changeSuccessfullyMsg.getText());
    }

    @When("user enters {string} as a new password but doesn't confirm that password")
    public void user_enters_as_a_new_password_but_doesn_t_confirm_that_password(String newPassw) {

        changePasswordPage.newPasswordBox.sendKeys(newPassw);
    }
    @Then("warning message should be appeared")
    public void warning_message_should_be_appeared() {

        Assert.assertTrue(changePasswordPage.confirmPassWarningMsg.isDisplayed());
    }
}
