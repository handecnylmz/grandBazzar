package com.grandbazzar.pages;

import com.grandbazzar.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CardPage {

    public CardPage() {

    PageFactory.initElements(Driver.get(), this);
}

    @FindBy(xpath = "//input[@class='searchbar_searchInput__SUIQd']")
    public WebElement SearchButton;



}
