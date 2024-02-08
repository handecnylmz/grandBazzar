package com.grandbazzar.pages;

import com.grandbazzar.utilities.Driver;
import com.grandbazzar.utilities.ReusableMethods;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChangePasswordImagePage {

    public    ChangePasswordImagePage(){

        PageFactory.initElements(Driver.get(),this);

    }

    @FindBy(xpath = "//span[text()='Profile']")
    public WebElement profileButton;
    @FindBy(xpath = "//button[text()='Change Password']")
    public WebElement changePasswordButton;
    @FindBy(xpath = "//input[@id='oldPassword']")
    public WebElement oldPasswordButton;
    @FindBy(xpath = "(//img[@class='change_eyeSvg__WXZw3'])[1]")
    public WebElement oldPasswordImg;
    @FindBy(xpath = "//input[@id='newPassword']")
    public WebElement newPasswordButton;
    @FindBy(xpath = "(//img[@class='change_eyeSvg__WXZw3'])[2]")
    public WebElement newPasswordImg;
    @FindBy(xpath = "//input[@id='confirmPassword']")
    public WebElement confirmPasswordButton;
    @FindBy(xpath = "(//img[@class='change_eyeSvg__WXZw3'])[3]")
    public WebElement confirmPasswordImg;

    public void profileButtonClick(){
        ReusableMethods.clickWithJS(profileButton);
    }
    public void changePasswordButtonClick(){
        ReusableMethods.clickWithJS(changePasswordButton);
    }
    public void changePasswordPageGetTittle(){
        String pageUrl=Driver.get().getCurrentUrl();
        String expectedPageUrl="https://grandbazaar.no/change-password";
        System.out.println( "actualPageUrl "+pageUrl) ;
        Assert.assertEquals(expectedPageUrl,pageUrl);
    }
    public void EnterOldPassword(){
        ReusableMethods.clickWithJS(oldPasswordButton);
        oldPasswordButton.sendKeys("98765432");
    }
    public void oldPasswordIsVisibleOrHidden(){
    String beforeOldPAsswordtype=oldPasswordButton.getAttribute("type");
    System.out.println("The type value Before clicking on the Old Password Img : "+ beforeOldPAsswordtype);
    ReusableMethods.clickWithJS(oldPasswordImg);
    String afterOldPasswordType=oldPasswordButton.getAttribute("type");

    System.out.println("The type value After clicking on the Old Password Img : "+afterOldPasswordType);
    Assert.assertNotEquals("The before and after values are equal "+beforeOldPAsswordtype,afterOldPasswordType);
    }
    public void EnterNewPassword(){
        ReusableMethods.clickWithJS(newPasswordButton);
        newPasswordButton.sendKeys("23456789");
    }
    public void newPasswordIsVisibleOrHidden(){
        String beforeNewPAsswordtype=newPasswordButton.getAttribute("type");
        System.out.println("The type value Before clicking on the New Password Img : "+ beforeNewPAsswordtype);
        ReusableMethods.clickWithJS(newPasswordImg);
        String afterNewPasswordType=newPasswordButton.getAttribute("type");
        System.out.println("The type value After clicking on the New Password Img : "+afterNewPasswordType);
        Assert.assertNotEquals("The before and after values are equal "+beforeNewPAsswordtype,afterNewPasswordType);
    }
    public void EnterConfirmPassword(){
        ReusableMethods.clickWithJS(confirmPasswordButton);
        confirmPasswordButton.sendKeys("23456789");
    }
    public void confirmPasswordIsVisibleOrHidden(){
        String beforeConfirmPAsswordtype=confirmPasswordButton.getAttribute("type");
        System.out.println("The type value Before clicking on the Confirm Password Img : "+ beforeConfirmPAsswordtype);
        ReusableMethods.wait(2);
        ReusableMethods.clickWithJS(confirmPasswordImg);

        String afterConfirmPasswordType=confirmPasswordButton.getAttribute("type");
        ReusableMethods.wait(4);
        System.out.println("The type value After clicking on the Confirm Password Img : "+afterConfirmPasswordType);

       // Assert.assertNotEquals("The before and after values are equal "+beforeConfirmPAsswordtype,afterConfirmPasswordType);
        Assert.assertTrue(afterConfirmPasswordType.equalsIgnoreCase("password"));
    }

}
