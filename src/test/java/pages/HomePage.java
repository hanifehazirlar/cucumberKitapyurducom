package pages;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.time.Duration;
import java.util.List;

public class HomePage {
public HomePage() {
    PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver(), Duration.ofSeconds(30)),this);
}
    @FindBy(xpath = "//*[@class='main-sprite icon-header-account-nologin d-block']")
    public WebElement myAccountIconWE;
    //ONEMLI NOT: WebChromium (mobil uygulamalari chrome uzerinden acma) uzerinden calismak istersek browser uzerinden
    //            ilerledigimiz icin Screens de @AndroidFindBy ve MobileElement calismiyor. Bu yuzden @FindBy ve WebElement
    //            kullanmamiz gerekti.

    @FindBy(xpath = "//a[contains(@href,'register')]")
    public WebElement registerButton;

    @FindBy(xpath = "//*[@id=\"js-popup-accept-button\"]")
    public List<WebElement> acceptCookiePopUp;






}
