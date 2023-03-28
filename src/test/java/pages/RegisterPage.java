package pages;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.time.Duration;

public class RegisterPage {
    public RegisterPage(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver(), Duration.ofSeconds(30)),this);
    }
    @FindBy(xpath = "//a[contains(@href,'register')]")
    public WebElement registerButton;

    @FindBy(xpath = "//*[@id='firstname']")
    public WebElement firstNameBox;

    @FindBy(xpath = "//*[@id='lastname']")
    public WebElement lastNameBox;

    @FindBy(xpath = "//*[@id='email']")
    public WebElement emailBox;

    @FindBy(xpath = "//*[@id='password']")
    public WebElement passwordBox;

    @FindBy(xpath = "//*[@id='confirm']")
    public WebElement confirmPasswordBox;

    @FindBy(xpath = "//*[@id='form-check-input']")
    public WebElement privacyCheckBox;

    @FindBy(xpath = "//*[@class='btn btn-primary text-white fw-bolder p-3 w-100 mb-3']")
    public WebElement register;

    @FindBy(xpath = "//*[@class='fs-24 fw-bold mt-4 text-green-dark']")
    public WebElement accountText;










}
