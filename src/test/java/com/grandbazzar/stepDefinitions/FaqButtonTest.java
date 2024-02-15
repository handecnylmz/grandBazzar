package com.grandbazzar.stepDefinitions;

import com.grandbazzar.pages.FagButtonPage;
import com.grandbazzar.utilities.ConfigurationReader;
import com.grandbazzar.utilities.Driver;
import com.grandbazzar.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class FaqButtonTest {

    FagButtonPage faqButtonPage=new FagButtonPage();

    @Given("User goes {string}")
    public void userGoesTo(String userUrl) {

        Driver.get().get(ConfigurationReader.getProperty("userUrl"));
        Driver.get().manage().window().maximize();
        ReusableMethods.wait(2);
    }

    @When("User click on the FAQ button on the home page")
    public void userClickOnTheFaqButtonOnTheHomePage() {
    faqButtonPage.FAQButtons.click();
    ReusableMethods.wait(10);

    }
    @And("Confirms that you have seen FAQ")
    public void confirmsThatYouHaveSeenFAQ() {
        ReusableMethods.wait(10);
        Assert.assertTrue(faqButtonPage.FAQbackground.isDisplayed());
    }

}
