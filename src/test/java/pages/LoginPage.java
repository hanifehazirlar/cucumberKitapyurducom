package pages;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver()), this);
    }
    @FindBy(xpath = "//*[@id='login-email']")
    public WebElement emailBox;

    @FindBy(xpath = "//*[@id='login-password']")
    public WebElement passwordBox;

    @FindBy(xpath = "//*[@id=\"login-button\"]")
    public WebElement loginButton;

    @FindBy(xpath = "//*[@class='fs-14 mb-3 text-gray']")
    public WebElement userEmailHeader;
}
