package com.grandbazzar.pages;

import com.grandbazzar.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JoinPage {

    public JoinPage() {
        PageFactory.initElements(Driver.get(), this);
    }
    @FindBy (xpath = "//button[@class='header_become__BknPq']")
    public WebElement joinButton;

    @FindBy (xpath = "//div[@class='loginmodal_loginModalContent__VZSev']")
    public WebElement joinControl;
}
