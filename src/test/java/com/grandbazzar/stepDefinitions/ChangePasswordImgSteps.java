package com.grandbazzar.stepDefinitions;

import com.grandbazzar.pages.ChangePasswordImagePage;
import com.grandbazzar.pages.LoginPage;
import com.grandbazzar.utilities.ConfigurationReader;
import com.grandbazzar.utilities.Driver;
import com.grandbazzar.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ChangePasswordImgSteps {
    LoginPage loginPage = new LoginPage();
    ChangePasswordImagePage changePasswordImagePage=new ChangePasswordImagePage();
    @Given("User click on the Join Button")
    public void userClickOnTheJoinButton() {
        Driver.get().get(ConfigurationReader.getProperty("userUrl"));
        Driver.get().manage().window().maximize();
        ReusableMethods.wait(2);
       ReusableMethods.clickWithJS(loginPage.joinBtn);

    }

    @When("User enter email {string}")
    public void userEnterEmail(String syhnEmail) {
        ReusableMethods.wait(2);
        loginPage.emailBox.sendKeys(syhnEmail);

    }

    @Then("User enter password {string}")
    public void userEnterPassword(String syhnPassword) {
        loginPage.passwordBox.sendKeys(syhnPassword);

    }
    @Then("User click on the Login Button")
    public void userClickOnTheLoginButton() {
        loginPage.loginBtn.click();
        ReusableMethods.wait(2);
    }

    @Then("Clicks on the Profile Button")
    public void clicksOnTheProfileButton() {
        ReusableMethods.wait(4);
        changePasswordImagePage.profileButtonClick();
    }
    @And("Clicks on the Change Password Button")
    public void clicksOnTheChangePasswordButton() {
        ReusableMethods.wait(4);
        changePasswordImagePage.changePasswordButtonClick();
    }
    @Then("Verifies that it is on theChange Password page")
    public void verifiesThatItIsOnTheChangePasswordPage() {
        ReusableMethods.wait(4);
        changePasswordImagePage.changePasswordPageGetTittle();
    }

    @Then("Enter Old Password")
    public void enterOldPassword() { ReusableMethods.wait(2);
        changePasswordImagePage.EnterOldPassword();

    }

    @Then("Verifies that Old Password is Visible or Invisible")
    public void verifiesThatOldPasswordIsVisibleOrInvisible() {
        ReusableMethods.wait(4);
        changePasswordImagePage.oldPasswordIsVisibleOrHidden();
    }
    @Then("Enter New Password")
    public void enterNewPassword() {
        ReusableMethods.wait(4);
        changePasswordImagePage.EnterNewPassword();

    }

    @Then("Verifies that New Password is Visible or Invisible")
    public void verifiesThatNewPasswordIsVisibleOrInvisible() {
        ReusableMethods.wait(4);
        changePasswordImagePage.newPasswordIsVisibleOrHidden();
    }

    @Then("Enter Confirm Password")
    public void enterConfirmPassword() {
        ReusableMethods.wait(4);
        changePasswordImagePage.EnterConfirmPassword();
    }

    @Then("Verifies that Confirm Password is Visible or Invisible")
    public void verifiesThatConfirmPasswordIsVisibleOrInvisible() {
        ReusableMethods.wait(4);
        changePasswordImagePage.confirmPasswordIsVisibleOrHidden();
    }



}
