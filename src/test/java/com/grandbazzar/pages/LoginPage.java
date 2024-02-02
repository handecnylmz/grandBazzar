package com.grandbazzar.pages;

import com.grandbazzar.utilities.ConfigurationReader;
import com.grandbazzar.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){

        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(xpath = "//button[.='Join']")
    public WebElement joinBtn;

    @FindBy(xpath = "//div[@class='loginmodal_loginModalContent__VZSev']")
    public WebElement loginBox;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement emailBox;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordBox;

    @FindBy(xpath = "//button[@value='submit']")
    public WebElement loginBtn;

    @FindBy(xpath = "//img[@alt='profile']")
    public WebElement profileImg;

    @FindBy(xpath = "//span[.='Profile']")
    public WebElement profileLink;

    @FindBy(xpath = "//span[.='Invalid email address']")
    public WebElement invalidEmailMsg;

    @FindBy(xpath = "//span[.='Password must be at least 8 characters']")
    public WebElement invalidPasswordMsg;

    public void loginAsUser(){

        emailBox.sendKeys(ConfigurationReader.getProperty("userEmail"));
        passwordBox.sendKeys(ConfigurationReader.getProperty("userPassword"));
        loginBtn.click();
    }

    // -------- ADMIN -----------
    @FindBy(xpath = "//input[@name='email']")
    public WebElement adminUsernameBox;  //input[@name='email']

    @FindBy(xpath = "//input[@name='password']")
    public WebElement adminPasswordBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submitBtn;

    @FindBy(xpath = "//a[.='Dashboard']")
    public WebElement adminDashboardLink;

    public void loginAsAdmin(){

        adminUsernameBox.sendKeys(ConfigurationReader.getProperty("AdminEmail"));
        adminPasswordBox.sendKeys(ConfigurationReader.getProperty("AdminPassword"));
        submitBtn.click();
    }
}
