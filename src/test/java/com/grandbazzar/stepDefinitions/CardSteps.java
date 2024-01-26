//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.grandbazzar.stepDefinitions;

import com.grandbazzar.pages.CardPage;
import com.grandbazzar.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.time.Duration;
import org.junit.Assert;

public class CardSteps {
    CardPage cardPage = new CardPage();

    public CardSteps() {
    }

    @When("user clicks on the search button")
    public void user_clicks_on_the_search_button() {
        this.cardPage.SearchButton.click();
    }

    @When("user selects some products from list")
    public void user_selects_some_products_from_list() {
        ReusableMethods.wait(1);
        this.cardPage.AddMelkekrem.click();
    }

    @Then("verify the selected products seen on the card")
    public void verify_the_selected_products_seen_on_the_card() {
        this.cardPage.ShowCard.click();
        Assert.assertTrue(this.cardPage.CardItem.isDisplayed());
    }

    @And("user cancels the selected item")
    public void userCancelsTheSelectedItem() {
        this.cardPage.CancelItem.click();
    }

    @Then("verify the cancelled item is not seen on the card")
    public void verifyTheCancelledItemIsNotSeenOnTheCard() {
        Assert.assertTrue(this.cardPage.NoProductsFound.isDisplayed());
    }

    @When("user adds one product to the card")
    public void userAddsOneProductToTheCard() {
        ReusableMethods.waitForVisibility(this.cardPage.AddTodayDonut, Duration.ofSeconds(3L));
        this.cardPage.AddTodayDonut.click();
    }

    @And("verify user cannot increase the number of items more than the stock")
    public void verifyUserCannotIncreaseTheNumberOfItemsMoreThanTheStock() {
        this.cardPage.TodayDonut.click();
        ReusableMethods.waitForVisibility(this.cardPage.IncreaseButtonTodayDonut, Duration.ofSeconds(10L));
        this.cardPage.IncreaseButtonTodayDonut.click();
        Assert.assertEquals("1", this.cardPage.NumberOfTodayDonut.getText());
    }
}

