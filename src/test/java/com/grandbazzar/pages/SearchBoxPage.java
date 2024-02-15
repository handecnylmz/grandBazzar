package com.grandbazzar.pages;

import com.grandbazzar.stepDefinitions.SearchboxTestStep;
import com.grandbazzar.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchBoxPage {

    public SearchBoxPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy (xpath = "//input[@class='searchbox_searchInput__AKALy']")
    public WebElement searchbox;

    @FindBy (xpath = "//article[@class='filterbox_cards__0dS5d']")
    public WebElement productSearch;
}
