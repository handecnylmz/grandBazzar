package com.grandbazzar.pages;

import com.grandbazzar.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FagButtonPage {

    public FagButtonPage() {
        PageFactory.initElements(Driver.get(), this);
    }
    @FindBy(xpath = "//span[text()='FAQ']")
    public WebElement FAQButtons;

    @FindBy(xpath = "//section[@class='faq_faq__CgodN']")
    public WebElement FAQbackground;
}

