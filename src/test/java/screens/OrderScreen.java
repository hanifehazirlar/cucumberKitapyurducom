package screens;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class OrderScreen {
    public OrderScreen(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver()), this);
    }
    @AndroidFindBy(xpath = "(//android.widget.ImageView)[5]")
    public MobileElement firstProduct;

    @AndroidFindBy(xpath = "(//android.widget.ImageView)[14]")
    public MobileElement myBasket;

    @AndroidFindBy(id = "com.mobisoft.kitapyurdu:id/registerButton")
    public MobileElement registerButton;
}
