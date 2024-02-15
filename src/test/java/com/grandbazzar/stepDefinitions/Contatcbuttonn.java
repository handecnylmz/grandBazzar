package com.grandbazzar.stepDefinitions;

import com.grandbazzar.pages.ContactButtonPage;
import com.grandbazzar.utilities.ConfigurationReader;
import com.grandbazzar.utilities.Driver;
import com.grandbazzar.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Contatcbuttonn {

    ContactButtonPage contactButtonPage=new ContactButtonPage();

    @Given("User accesses the home page")
    public void userAccessesTheHomePage() {

        Driver.get().get(ConfigurationReader.getProperty("userUrl"));
        Driver.get().manage().window().maximize();
        ReusableMethods.wait(3);
        }
    @When("User click on the contact button on the home page")
    public void userClickOnTheContactButtonOnTheHomePage() {
        ReusableMethods.wait(3);
        contactButtonPage.contactButton.click();
    }

    @And("Confirms that you have seen contact")
    public void confirmsThatYouHaveSeenContact() {
        ReusableMethods.wait(3);
        Assert.assertTrue(contactButtonPage.contactBackgtound.isDisplayed());

    }

}


