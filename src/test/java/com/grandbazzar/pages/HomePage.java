package com.grandbazzar.pages;

import com.grandbazzar.stepDefinitions.SearchBoxSteps;
import com.grandbazzar.utilities.Driver;
import com.grandbazzar.utilities.ReusableMethods;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;
import java.time.Duration;

public class HomePage {
     public    HomePage(){

     PageFactory.initElements(Driver.get(),this);

}


    @FindBy(xpath = "//input[@class='searchbox_searchInput__AKALy']")
    public WebElement SearchBox ;


    @FindBy(xpath = "//button[@class='searchbox_searchButton__gBBcf']")
    public WebElement SearchLens ;

    @FindBy(xpath = "(//span[@class='productcard_cardPrice__3wTgM'])[1]//following-sibling::p")

    public WebElement FirstProductsTittle;


    public void SearchPage (String product){
      SearchBox.sendKeys(product);

    }
    public void checkproduct(String Tittle){

        ReusableMethods.waitForVisibility(FirstProductsTittle, Duration.ofSeconds(3));
        Assert.assertTrue(FirstProductsTittle.getText().contains( Tittle));


    }


}

