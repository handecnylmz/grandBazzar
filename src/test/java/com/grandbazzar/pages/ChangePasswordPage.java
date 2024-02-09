package com.grandbazzar.pages;

import com.grandbazzar.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChangePasswordPage {


    public ChangePasswordPage(){

        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(xpath = "//button[.='Change Password']")
    public WebElement changePasswordLink;

    @FindBy(xpath = "//input[@id='oldPassword']")
    public WebElement oldPasswordBox;

    @FindBy(xpath = "//input[@id='newPassword']")
    public WebElement newPasswordBox;

    @FindBy(xpath = "//input[@id='confirmPassword']")
    public WebElement confirmPasswordBox;

    @FindBy(xpath = "//button[.='Submit']")
    public WebElement submitButton;

    @FindBy(xpath = "//span[.='Password changed successfully!']")
    public WebElement changeSuccessfullyMsg;

    @FindBy(xpath = "//label[.='Confirm Password']/following-sibling::span")
    public WebElement confirmPassWarningMsg;




}
