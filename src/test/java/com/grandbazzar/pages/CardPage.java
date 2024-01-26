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

    @FindBy(xpath = "(//button[@class='productcard_beforeButton__qweBg'])[6]")
    public WebElement AddMelkekrem;

    @FindBy(xpath = "//span[normalize-space()='1 Item']")
    public WebElement ShowCard;

    @FindBy(xpath = "(//div[@class='basketmodal_basketItem__bf7ci'])[1]")
    public WebElement CardItem;

    @FindBy(xpath = "//span[normalize-space()='x']")
    public WebElement CancelItem;

    @FindBy(xpath = "//span[normalize-space()='No products found']")
    public WebElement NoProductsFound;

    @FindBy(xpath = "(//span[contains(text(),'Add')])[1]")
    public  WebElement AddTodayDonut;

    @FindBy(xpath = "(//img[@alt='image'])[5]")
    public  WebElement TodayDonut;

    @FindBy(xpath = "(//button[contains(text(),'+')])[2]")
    public  WebElement IncreaseButtonTodayDonut;

    @FindBy(xpath = "(//span[contains(text(),'1')])[3]")
    public  WebElement NumberOfTodayDonut;



}
