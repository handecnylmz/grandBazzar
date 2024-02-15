package com.grandbazzar.pages;

import com.grandbazzar.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LanguagePage {

    public LanguagePage()
    {
        PageFactory.initElements(Driver.get(), this);}

    @FindBy(xpath = "//span[text()='Dili Seçin']")
    public WebElement LanguageButton;

    @FindBy(xpath = "(//iframe[@class='VIpgJd-ZVi9od-xl07Ob-OEVmcd skiptranslate'])[1]")
    public WebElement LanguageControl;

    @FindBy (xpath = "//div[@id='google_translate_element']//span[text()='Almanca']")
    public WebElement almancaOption;

    @FindBy (xpath = "(//input[@placeholder='Durchsuchen Sie Ihre Produkte...'])[2]")
    public WebElement almancaText;






}
