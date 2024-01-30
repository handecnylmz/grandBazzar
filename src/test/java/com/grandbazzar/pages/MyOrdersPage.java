package com.grandbazzar.pages;

import com.grandbazzar.utilities.Driver;
import com.grandbazzar.utilities.ReusableMethods;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import static org.bouncycastle.oer.its.ieee1609dot2.SignerIdentifier.self;

public class MyOrdersPage {


    public MyOrdersPage(){

        PageFactory.initElements(Driver.get(),this);
    }


    @FindBy(xpath = "//button[@class='productcard_beforeButton__qweBg']")
    public static List<WebElement> allProducts;
    @FindBy(xpath = "//button[@class='bag_bag__5_lhh']")
    public WebElement homePagebagIcon;

    @FindBy(xpath = "(//img[@alt='plus'])[2]")
    public WebElement checkoutPlusButton;

    @FindBy(xpath = "(//img[@alt='minus'])[2]")
    public WebElement checkoutminusButton;

    @FindBy(xpath = "/html[1]/body[1]/main[1]/section[3]/div[2]/div[1]/div[1]/div[1]/span[1]")
    public WebElement checkoutItemButton;
    @FindBy(xpath = "//button[@class='basketmodal_deleteButton__MKw9I']")
    public WebElement inBagProductDeleteButton;
    @FindBy(xpath = "//span[text()='Checkout']")
    public WebElement bagCheckoutButton;

    @FindBy(xpath = "//span[text()='90 min express delivery']")
    public WebElement deliverySchedule;
    @FindBy(xpath = "//span[text()='Place Order']")
    public WebElement placeOrderButton;
    @FindBy(xpath = "/html[1]/body[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[2]")
    public WebElement orderHasBeenCreatedSuccessfully;
    @FindBy(xpath = "//button[@class='header_profile__Zu0NR']")
    public WebElement profileIcon;
    @FindBy(xpath = "//span[text()='My Orders']")
    public WebElement myOrdersButton;

    @FindBy(xpath = "/html[1]/body[1]/main[1]/section[2]/div[2]/div[1]/div[1]/div[1]/div[2]/p[1]")
    public  List<WebElement> yourOrderProducts;
    @FindBy(xpath = "//span[@class='OrderDetails_cellDivTitle__chkgF']")
    public  List<WebElement> myOrderProducts;
    @FindBy(xpath = "//div[@class='OrderCard_ordersCard__e5Fqq']")
    public  List<WebElement> myOrdersList;
    public void homePagebagIconClick(){
        ReusableMethods.clickWithJS(homePagebagIcon);}

    public void scrollDown(WebDriver webDriver, int i) {

    }
    public void clickOnFirstTwoProducts(){

        int clickedCount = 0;

        for (WebElement product : allProducts) {
            String stockStatus = product.getText();
            System.out.println(stockStatus);


            if (!stockStatus.equalsIgnoreCase("Out of stock")) {
                // Click on the product if it is not out of stock

               ReusableMethods.clickWithJS(product);
                ReusableMethods.wait(2);
                clickedCount++;

                if (clickedCount == 2) {
                    // Break the loop after clicking on the first five products
                    break;
                }
            }
        }}

    public void inBagProductDelete(){
        ReusableMethods.clickWithJS(inBagProductDeleteButton);}
    public void bagCheckoutButtonClick(){
        ReusableMethods.clickWithJS(bagCheckoutButton);}
    public void deliveryScheduleClick(){
        ReusableMethods.clickWithJS(deliverySchedule);}

    public void placeOrderButtonClick(){
        ReusableMethods.clickWithJS(placeOrderButton);}

    public void orderHasBeenCreatedSuccessfullyVeryfy(){
        String expectedResult="Gratulations! Your order has been created successfully.";
        ReusableMethods.waitForVisibility(orderHasBeenCreatedSuccessfully, Duration.ofSeconds(5));
        String orderSuccesfully=orderHasBeenCreatedSuccessfully.getText();
        System.out.println(orderSuccesfully);
        Assert.assertTrue(orderSuccesfully.equalsIgnoreCase(expectedResult));
    }
    List<String> elementInfoList = new ArrayList<>();
    public void yourOrderProductsList(){

        for (WebElement element : yourOrderProducts) {
            // Elementin tag adı ve text içeriğini al
            String text = element.getText();

                // Elementin bilgilerini yazdır ve listeye ekle
                String elementInfo =text;
                System.out.println(elementInfo);
                elementInfoList.add(elementInfo);
            }


        }
        public void profileIconClick(){
        ReusableMethods.clickWithJS(profileIcon);}

    public void myOrdersButtonClick(){
        ReusableMethods.clickWithJS(myOrdersButton);}
    public void orderPageGetTittle(){
        String pageUrl=Driver.get().getCurrentUrl();
        String expectedPageUrl="https://grandbazaar.no/orders";
        System.out.println( "actualPageUrl "+pageUrl) ;
        Assert.assertEquals(expectedPageUrl,pageUrl);
    }



     public void lastOrderClick(){
        if (!myOrdersList.isEmpty()) {
            WebElement lastLink = myOrdersList.get(myOrdersList.size() - 1);
            lastLink.click();
            System.out.println("Son elemana tıklandı.");
        } else {
            System.out.println("Liste boş, hiçbir eleman bulunamadı.");
        }

    }
    List<String> elementInfoList2 = new ArrayList<>();
    public void myOrderProductsList(){

        for (WebElement element2 : myOrderProducts) {
            // Elementin tag adı ve text içeriğini al
            String text2 = element2.getText();

            // Elementin bilgilerini yazdır ve listeye ekle
            String elementInfo2 =text2;
            System.out.println(elementInfo2);
            elementInfoList2.add(elementInfo2);
        }

}
    public void OrderVeryfy(){
        Assert.assertEquals("Listeler eşleşmiyor.", elementInfoList, elementInfoList2);
    }

}








