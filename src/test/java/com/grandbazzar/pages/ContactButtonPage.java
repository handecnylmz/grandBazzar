package com.grandbazzar.pages;

import com.grandbazzar.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactButtonPage {

    public ContactButtonPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//span[text()='Contact']")
    public WebElement contactButton;

    @FindBy(xpath = "//section[@class='contact_contact__GstcN']")
    public WebElement contactBackgtound;
}
