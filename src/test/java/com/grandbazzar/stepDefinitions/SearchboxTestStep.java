package com.grandbazzar.stepDefinitions;

import com.grandbazzar.pages.SearchBoxPage;
import com.grandbazzar.utilities.ConfigurationReader;
import com.grandbazzar.utilities.Driver;
import com.grandbazzar.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SearchboxTestStep {

    SearchBoxPage searchBoxPage = new SearchBoxPage();

    @Given("User goes to userUrl")
    public void userGoesToUserUrl() {
        Driver.get().get(ConfigurationReader.getProperty("userUrl"));
        Driver.get().manage().window().maximize();
        ReusableMethods.wait(2);
    }
    @When("User click on the searchbox button on the page")
    public void userClickOnTheSearcboxButtonOnThePage() {
        ReusableMethods.wait(2);
        searchBoxPage.searchbox.click();
    }
    @Then("User searches for the Patos product.\"")
    public void userSearchesForThePatosProduct() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // throw new cucumber.api.PendingException();}
        ReusableMethods.wait(1);
        searchBoxPage.searchbox.sendKeys("Patos");
    }

    @And("In the step, confirm that the Patos product is displayed on the screen")
    public void ınTheStepConfirmThatThePatosProductIsDisplayedOnTheScreen() {
        ReusableMethods.wait(3);
        Assert.assertTrue(searchBoxPage.productSearch.isDisplayed());
    }
}