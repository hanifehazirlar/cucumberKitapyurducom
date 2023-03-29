package pages;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.time.Duration;

public class AdressPage {
    public AdressPage() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver(), Duration.ofSeconds(30)),this);
    }

    @FindBy(xpath = "//*[@id='firstname_companyname']")
    public WebElement namebox;

    @FindBy(xpath = "//*[@id='lastname_title']")
    public WebElement lastnamebox;

    @FindBy(xpath = "//*[@id='btn-modal-country']")
    public WebElement countryBox;

    @FindBy(xpath = "//*[@data-name='Türkiye']")
    public WebElement turkiye;

    @FindBy(xpath = "//*[@id='btn-modal-zone']")
    public WebElement cityBox;

    @FindBy(xpath = "//*[@id='county']")
    public WebElement townBox;

    @FindBy(xpath = "//*[@id='btn-modal-district']")
    public WebElement districtBox;

    @FindBy(xpath = "//*[@id='address']")
    public WebElement adressBox;


    @FindBy(xpath = "//*[@id='postcode']")
    public WebElement postcodeBox;

    @FindBy(xpath = "//*[@id='telephone']")
    public WebElement telephoneBox;
    @FindBy(xpath = "//*[@id='mobile_telephone']")
    public WebElement mobile_telephoneBox;

    @FindBy(xpath = "//*[@id='tax_id']")
    public WebElement tax_idBox;

    @FindBy(xpath = "//*[@id='insert-address-button']")
    public WebElement summitButton;

    @FindBy(xpath = "//*[@id='swal2-html-container']")
    public WebElement verifyMessage;

    @FindBy(xpath = "//button[@class='swal2-confirm swal2-styled swal2-default-outline']")
    public WebElement OKButton;


}
