package com.grandbazzar.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminProductPage {

    @FindBy(xpath = "(//a[text()='Products'])[2]")
    public WebElement productButton;



}
