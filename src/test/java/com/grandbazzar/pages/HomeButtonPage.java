package com.grandbazzar.pages;

import com.grandbazzar.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeButtonPage {

    public HomeButtonPage()

    {PageFactory.initElements(Driver.get(), this);}

    @FindBy(xpath = "//span[text()='Home']")
    public WebElement HomeButton;

    @FindBy(xpath = "//section[@class='grocery_groceryBackground__E0YDv']")
    public WebElement HomeBackground;
}
