package com.grandbazzar.stepDefinitions;

import com.grandbazzar.pages.LanguagePage;
import com.grandbazzar.utilities.ConfigurationReader;
import com.grandbazzar.utilities.Driver;
import com.grandbazzar.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LanguageStep {

    LanguagePage languagePage=new LanguagePage();

    @Given("Usr accesses the home page")
    public void usrAccessesTheHomePage() {
        Driver.get().get(ConfigurationReader.getProperty("userUrl"));
        Driver.get().manage().window().maximize();
        ReusableMethods.wait(3);
    }

    @When("User click on the language button on the home page")
    public void userClickOnTheLanguageButtonOnTheHomePage() {
        ReusableMethods.wait(3);
        languagePage.LanguageButton.click();
    }

    @And("Confirms that you have seen language")
    public void confirmsThatYouHaveSeenLanguage() {
        ReusableMethods.wait(3);
        Assert.assertTrue(languagePage.LanguageControl.isDisplayed());
    }
    @Then("User selects German")
    public void userSelectsGerman() {
        ReusableMethods.wait(3);
        languagePage.almancaOption.click();

    }
    @When("Confirms that you have translated the site into German")
    public void confirmsThatYouHaveTranslatedTheSiteIntoGerman() {
        ReusableMethods.wait(3);
        Assert.assertTrue(languagePage.almancaText.isDisplayed());
    }
}
