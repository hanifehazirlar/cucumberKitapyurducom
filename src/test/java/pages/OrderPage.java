package pages;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class OrderPage  {
    public OrderPage(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver()), this);
    }
    @FindBy(xpath = "//*[@src='https://img.kitapyurdu.com/v1/getImage/fn:11656593/wi:200/wh:true']")
    public WebElement physicalProduct;

    @FindBy(xpath = "//*[@src='https://img.kitapyurdu.com/v1/getImage/fn:11676514/wi:200/wh:true']")
    public WebElement secondProduct;

    @FindBy(xpath = "//*[@id='js-add-to-cart']")
    public WebElement addBasket;

    @FindBy(xpath = "//*[@class='main-sprite icon-tabbar-cart']")
    public WebElement basketIcon;


    @FindBy(xpath = "//*[@href='https://www.kitapyurdu.com/index.php?route=checkout/delivery']")
    public WebElement buyButton;

    @FindBy(xpath = "//*[@href='index.php?route=account/address/insert']")
    public WebElement addAddressButton;



}
