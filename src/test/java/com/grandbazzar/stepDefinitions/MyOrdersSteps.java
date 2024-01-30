package com.grandbazzar.stepDefinitions;

import com.grandbazzar.pages.LoginPage;
import com.grandbazzar.pages.MyOrdersPage;
import com.grandbazzar.utilities.ConfigurationReader;
import com.grandbazzar.utilities.Driver;
import com.grandbazzar.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class MyOrdersSteps {

    LoginPage loginPage = new LoginPage();
    MyOrdersPage myOrdersPage=new MyOrdersPage();

    @Given("Clicks on the Home tab")
    public void clicksOnTheHomeTab() {

        Driver.get().get(ConfigurationReader.getProperty("userUrl"));
        Driver.get().manage().window().maximize();
        loginPage.joinBtn.click();
        ReusableMethods.wait(2);
        loginPage.loginAsUser();
        ReusableMethods.wait(2);
       // myOrdersPage.homeclick();
        ReusableMethods.wait(2);
        //myOrdersPage.scrollDown(Driver.get(), 500);
       // myOrdersPage.scrollDown(Driver.get(), 500);
        //myOrdersPage.scrollDown(Driver.get(), 500);
       // myOrdersPage.scrollDown(Driver.get(), 500);

    }
    @When("Clicks on the first two products that are in stock")
    public void clicksOnTheFirstFiveProductsThatAreInStock() {
        ReusableMethods.wait(2);
        myOrdersPage.clickOnFirstTwoProducts();

    }

    @And("Clicks on the cart")
    public void clicksOnTheCart() {
        ReusableMethods.wait(2);
        myOrdersPage.homePagebagIconClick();
    }

    @Then("Confirms that the selected products are in the cart")
    public void confirmsThatTheSelectedProductsAreInTheCart() {
        ReusableMethods.wait(2);
    }

    @Then("Verifies that the items in the cart can be successfully deleted")
    public void verifiesThatTheItemsInTheCartCanBeSuccessfullyDeleted() {
        myOrdersPage.inBagProductDelete();
    }

    @Then("Clicks on the checkout button")
    public void clicksOnTheCheckoutButton() {
        myOrdersPage.bagCheckoutButtonClick();
    }

    @Then("A delivery date is selected")
    public void aDeliveryDateIsSelected() {
        ReusableMethods.wait(2);
      myOrdersPage.scrollDown(Driver.get(), 500);;
        myOrdersPage.deliveryScheduleClick();
    }

    @Then("Clicks on Place Order")
    public void clicksOnPlaceOrder() {
        myOrdersPage.placeOrderButtonClick();
    }

    @Then("Verify that the message Congratulations! Your order has been created successfully. is displayed")
    public void verifyThatTheMessageCongratulationsYourOrderHasBeenCreatedSuccessfullyIsDisplayed() {
        ReusableMethods.wait(2);
        myOrdersPage.orderHasBeenCreatedSuccessfullyVeryfy();
        ReusableMethods.wait(2);
        myOrdersPage.yourOrderProductsList();
    }

    @Given("The user clicks on the profile picture")
    public void theUserClicksOnTheProfilePicture() {
        myOrdersPage.profileIconClick();
    }

    @When("The user clicks on My Orders")
    public void theUserClicksOnMyOrders() {
        myOrdersPage.myOrdersButtonClick();
    }

    @Then("Verifies that the user is on the Orders page")
    public void verifiesThatTheUserIsOnTheOrdersPage() {
        myOrdersPage.scrollDown(Driver.get(), 500);;
        ReusableMethods.wait(2);
        myOrdersPage.orderPageGetTittle();
    }
    @Then("Click on the last order")
    public void clickOnTheLastOrder() {
        ReusableMethods.wait(4);
        myOrdersPage.lastOrderClick();

    }
    @Then("The user confirms that the products added to the cart have been successfully ordered")
    public void theUserConfirmsThatTheProductsAddedToTheCartHaveBeenSuccessfullyOrdered() {

        myOrdersPage.myOrderProductsList();
        myOrdersPage.OrderVeryfy();


    }


}