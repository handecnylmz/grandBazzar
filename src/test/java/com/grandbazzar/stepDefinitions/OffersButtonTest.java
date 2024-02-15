package com.grandbazzar.stepDefinitions;

import com.grandbazzar.pages.OfferButtonPage;
import com.grandbazzar.utilities.ConfigurationReader;
import com.grandbazzar.utilities.Driver;
import com.grandbazzar.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.NoSuchElementException;

public class OffersButtonTest {

    OfferButtonPage offerButtonPage=new OfferButtonPage();

    @Given("User goes to {string}")
    public void userGoesTo(String userUrl) {
        Driver.get().get(ConfigurationReader.getProperty("userUrl"));
        Driver.get().manage().window().maximize();
        ReusableMethods.wait(2);
    }
    @When("User click on the offers button on the home page")
    public void userClickOnTheOffersButtonOnTheHomePage() {
        ReusableMethods.wait(5);
        offerButtonPage.offerButton.click();
    }
    @And("Confirms that you have seen offers")
    public void confirmsThatYouHaveSeenOffers() {
        ReusableMethods.wait(5);
        Assert.assertTrue(offerButtonPage.backGround.isDisplayed());
}
    @Then("User closes the page")
    public void userClosesThePage() {
        Driver.get().close();
    }


}

