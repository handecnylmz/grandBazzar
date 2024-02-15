package com.grandbazzar.stepDefinitions;

import com.grandbazzar.pages.HomeButtonPage;
import com.grandbazzar.utilities.ConfigurationReader;
import com.grandbazzar.utilities.Driver;
import com.grandbazzar.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeButton {

    HomeButtonPage homeButtonPage=new HomeButtonPage();

    @Given("Userr goes to {string}")
    public void userrGoesTo(String userUrl) {

        Driver.get().get(ConfigurationReader.getProperty("userUrl"));
        Driver.get().manage().window().maximize();
        ReusableMethods.wait(3);
    }
    @When("User click on the Home button on the home page")
    public void userClickOnTheHomeButtonOnTheHomePage() {
        ReusableMethods.wait(3);
        homeButtonPage.HomeButton.click();
    }
    @And("Confirms that you have seen Home")
    public void confirmsThatYouHaveSeenHome(){
        ReusableMethods.wait(3);
        homeButtonPage.HomeBackground.isDisplayed();

    }

    @Then("User close to page")
    public void userCloseToPage() {
        Driver.get().close();
    }
}
