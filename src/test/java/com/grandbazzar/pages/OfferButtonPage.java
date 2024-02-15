package com.grandbazzar.pages;

import com.grandbazzar.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OfferButtonPage {
    public OfferButtonPage() {
        PageFactory.initElements(Driver.get(), this);
    }
    @FindBy(xpath = "//span[text()='Offers']")
    public WebElement offerButton;

    @FindBy(xpath = "//div[@class='offers_cupons__DcLOB']")
    public WebElement backGround;
}



