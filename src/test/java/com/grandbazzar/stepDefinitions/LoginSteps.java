package com.grandbazzar.stepDefinitions;
import com.grandbazzar.pages.LoginPage;
import com.grandbazzar.utilities.ConfigurationReader;
import com.grandbazzar.utilities.Driver;
import com.grandbazzar.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;

public class LoginSteps {

    LoginPage loginPage = new LoginPage();

    // ----------- USER -----------------
    @Given("user goes to {string}")
    public void user_goes_to(String user_url) {

        Driver.get().get(ConfigurationReader.getProperty(user_url));
        Driver.get().manage().window().maximize();
    }

    @When("user clicks join button should be able to see login box")
    public void user_clicks_join_button_should_be_able_to_see_login_box() {

        loginPage.joinBtn.click();
        Assert.assertTrue(loginPage.loginBox.isDisplayed());
    }

    @When("user enters email and password then clicks login button")
    public void user_enters_email_and_password_then_clicks_login_button() {

        loginPage.loginAsUser();
        ReusableMethods.wait(3);
    }
    @Then("user should see profile image")
    public void user_should_see_profile_image() {

        Assert.assertTrue(loginPage.profileImg.isDisplayed());
    }

    // ---------- ADMIN ------------
    @Given("admin user go to {string}")
    public void admin_user_go_to(String admin_url) {

        Driver.get().get(ConfigurationReader.getProperty(admin_url));
        Driver.get().manage().window().maximize();
        ReusableMethods.wait(2);
    }
    @When("admin enters username and password then clicks Submit button")
    public void admin_enters_username_and_password_then_clicks_Submit_button() {

        loginPage.loginAsAdmin();
        ReusableMethods.wait(3);
    }

    @Then("admin should see the dashboard")
    public void admin_should_see_the_dashboard() {

        Assert.assertTrue(loginPage.adminDashboardLink.isDisplayed());
    }

    // ---------- NEGATIVE -------------

    @When("user enters invalid email such as {string}")
    public void user_enters_invalid_email_such_as(String invalidEmail) {

        loginPage.emailBox.sendKeys(invalidEmail);
    }
    @When("enters password less than eight characters")
    public void enters_password_less_than_eight_characters() {

        loginPage.passwordBox.sendKeys("12345");
    }
    @Then("user clicks login button and warning messages should be displayed")
    public void user_clicks_login_button_and_warning_messages_should_be_displayed() {

        loginPage.loginBtn.click();
        Assert.assertTrue(loginPage.invalidEmailMsg.isDisplayed());
        Assert.assertTrue(loginPage.invalidPasswordMsg.isDisplayed());

    }

    @When("user enters {string}")
    public void user_enters(String email) {

        loginPage.emailBox.sendKeys(email);
    }
    @When("enters {string}")
    public void enters(String passw) {

        loginPage.passwordBox.sendKeys(passw);
    }
    @Then("user clicks login button")
    public void user_clicks_login_button() {

        loginPage.loginBtn.click();
        ReusableMethods.wait(5);
    }
    @Then("should close the pop up in order to login again")
    public void should_close_the_pop_up_in_order_to_login_again() {

       Alert alert = Driver.get().switchTo().alert();
       alert.accept();
    }
}