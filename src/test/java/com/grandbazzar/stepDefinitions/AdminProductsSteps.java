package com.grandbazzar.stepDefinitions;

import com.grandbazzar.pages.AdminProductPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class AdminProductsSteps {

    AdminProductPage admin = new AdminProductPage();
    @Given("Click Products button")
    public void click_products_button() {
     admin.productButton.click();
    }
    @Then("Verify that Products Page")
    public void verify_that_products_page() {

    }

}
