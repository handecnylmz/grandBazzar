package com.grandbazzar.stepDefinitions;

import com.grandbazzar.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import java.security.Key;

public class SearchBoxSteps {


   HomePage hp=new HomePage();



    @Given("users goes  to SearchBox")
    public void SearchBox() {
    hp.SearchBox.click();


    }


    @And("clicks on the search lens")
    public void clicksOnTheSearchLens() {

    }

    @Then("verify that the product the user is looking for is listed")
    public void verifyThatTheProductTheUserIsLookingForIsListed() {
    hp.checkproduct("Tahini");

    }

 @When("the user types the word they want to search for{string}")
 public void theUserTypesTheWordTheyWantToSearchFor(String arg0) {
     hp.SearchPage(arg0+ Keys.ENTER);
 }
}
