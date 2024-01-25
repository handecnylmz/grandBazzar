package com.grandbazzar.stepDefinitions;

import com.grandbazzar.pages.CardPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CardSteps {

    CardPage cardPage = new CardPage();

    @When("user clicks on the search button")
    public void user_clicks_on_the_search_button() {
        cardPage.SearchButton.click();
    }


    @When("user select some products from list")
    public void user_select_some_products_from_list() {

    }

    @Then("verify the selected products seen on the card")
    public void verify_the_selected_products_seen_on_the_card() {

    }

}
