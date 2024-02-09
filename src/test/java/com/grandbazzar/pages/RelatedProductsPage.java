package com.grandbazzar.pages;

import com.grandbazzar.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RelatedProductsPage {

    public RelatedProductsPage(){

        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(xpath = "(//span[.='Categories']/following-sibling::button)[1]")
    public WebElement categoryOfProduct;

    @FindBy(xpath = "//h4[.='Related Products']")
    public WebElement relatedProductsHeader;

    @FindBy(xpath = "//div[@class='productcard_cardImage__fPqSA']/img")
    public WebElement oneRelatedProduct;

    public static void hoverElementWithJS(WebElement element) throws InterruptedException {
        ((JavascriptExecutor) Driver.get()).executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(500);
    }

}
