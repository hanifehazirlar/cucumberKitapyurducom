package pages;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.time.Duration;

public class HomePage {
public HomePage() {
    PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver(), Duration.ofSeconds(30)),this);
}
    @FindBy(xpath = "//*[@class='main-sprite icon-header-account-nologin d-block']")
    public WebElement myAccountIconWE;
    //ONEMLI NOT: WebChromium (mobil uygulamalari chrome uzerinden acma) uzerinden calismak istersek browser uzerinden
    //            ilerledigimiz icin Screens de @AndroidFindBy ve MobileElement calismiyor. Bu yuzden @FindBy ve WebElement
    //            kullanmamiz gerekti.


    @FindBy(xpath = "//*[@id='login-email']")
    public WebElement emailBoxWE;

    @FindBy(xpath = "//*[@id='login-password']")
    public WebElement passwordBoxWE;

    @FindBy(xpath = "//*[@id='login-button']")
    public WebElement loginButtonWE;


    @FindBy(xpath = "//*[@class='fs-18 fw-bold mt-2 text-orange-dark']")
    public WebElement userNameText;


    @FindBy(xpath = "//*[@class='fs-14 mb-3 text-gray']")
    public WebElement emailHeaderText;


}
