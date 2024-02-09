package com.grandbazzar.stepDefinitions;

import com.grandbazzar.pages.HomePage;
import com.grandbazzar.pages.RelatedProductsPage;
import com.grandbazzar.utilities.Driver;
import com.grandbazzar.utilities.ReusableMethods;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class RelatedProductsSteps {

    String categoryOfCiziCracker;
    String relatedProdCategory;
    Actions actions = new Actions(Driver.get());
    HomePage homePage = new HomePage();
    RelatedProductsPage relatedProducts = new RelatedProductsPage();

    @When("user on the home page, scrolls down and selects one product")
    public void user_on_the_home_page_scrolls_down_and_selects_one_product() {

        actions.scrollToElement(homePage.productCiziCracker);
        ReusableMethods.wait(5);
        homePage.productCiziCracker.click();

        ReusableMethods.wait(3);
        categoryOfCiziCracker = relatedProducts.categoryOfProduct.getText();
        System.out.println("categoryOfCiziCracker = " + categoryOfCiziCracker);

    }

    @When("scrolls down to related products and selects one of them")
    public void scrolls_down_to_related_products_and_selects_one_of_them() throws InterruptedException {

        RelatedProductsPage.hoverElementWithJS(relatedProducts.relatedProductsHeader);
        ReusableMethods.wait(2);

        actions.moveToElement(relatedProducts.oneRelatedProduct).click().perform();
        ReusableMethods.wait(3);
    }

    @Then("both product's category must be same")
    public void both_product_s_category_must_be_same() {

        System.out.println("related product' category = " + relatedProducts.categoryOfProduct.getText());

        relatedProdCategory = relatedProducts.categoryOfProduct.getText();

        Assert.assertTrue(categoryOfCiziCracker.equals(relatedProdCategory));

    }


}
