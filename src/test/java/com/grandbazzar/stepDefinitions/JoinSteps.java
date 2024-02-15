package com.grandbazzar.stepDefinitions;

import com.grandbazzar.pages.JoinPage;
import com.grandbazzar.utilities.ConfigurationReader;
import com.grandbazzar.utilities.Driver;
import com.grandbazzar.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class JoinSteps {
    JoinPage joinPage=new JoinPage();

    @Given("User goes to home page")
    public void userGoesToHomePage() {
        Driver.get().get(ConfigurationReader.getProperty("userUrl"));
        Driver.get().manage().window().maximize();
        ReusableMethods.wait(3);
    }

    @Then("Clicks on the Join button")
    public void clicksOnTheJoinButton() {
        ReusableMethods.wait(3);
        joinPage.joinButton.click();
    }

    @When("Sees the Join window")
    public void seesTheJoinWindow() {
        ReusableMethods.wait(3);
        Assert.assertTrue(joinPage.joinControl.isDisplayed());
    }

    @And("Closes the tab")
    public void closesTheTab() {
        ReusableMethods.wait(1);
        Driver.get().quit();
    }
}

