package screens;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.time.Duration;
import java.util.List;

public class OrderScreen {
    public OrderScreen(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver(), Duration.ofSeconds(30)), this);
    }
    @AndroidFindBy(xpath = "(//android.widget.ImageView)[5]")
    public MobileElement firstProduct;


    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Sepetim\"]/android.widget.ImageView")
    public MobileElement myBasket;

    @AndroidFindBy(id = "android:id/button2")
    public MobileElement loginRegisterButton;

    @AndroidFindBy(id="com.mobisoft.kitapyurdu:id/imageViewRadioButton")
    public MobileElement bankTransferRadioButton;

    @AndroidFindBy(id = "com.mobisoft.kitapyurdu:id/registerButton")
    public MobileElement registerButton;

    @AndroidFindBy(id = "com.mobisoft.kitapyurdu:id/checkBoxAgreement")
    public MobileElement checkBoxAgreement;

    @AndroidFindBy(id = "com.mobisoft.kitapyurdu:id/textViewTotalPrice")
    public MobileElement prices;

    @AndroidFindBy(xpath = "(//android.widget.TextView[@resource-id='com.mobisoft.kitapyurdu:id/textViewPrice'])[2]")
    public MobileElement totalPrices;

    @AndroidFindBy(id="com.mobisoft.kitapyurdu:id/orderCompleteMessageTextView")
    public MobileElement messageTextVerifies;

    @AndroidFindBy(id="android:id/button3")
    public List<MobileElement>okButton;

    //========Total amount
    @AndroidFindBy(xpath="//android.widget.FrameLayout[@content-desc=\"Ana Sayfa\"]/android.widget.ImageView")
    public MobileElement homeScreenIcon;

    @AndroidFindBy(xpath = "(//android.widget.ImageView)[4]")
    public MobileElement secondProduct;

    @AndroidFindBy(id = "com.mobisoft.kitapyurdu:id/textViewTotalPrice")
    public List<MobileElement> pricesProduct;

    @AndroidFindBy(id = "com.mobisoft.kitapyurdu:id/textViewTotal")
    public MobileElement totalAmount;


    @AndroidFindBy(xpath = "(//android.widget.TextView)[12]")
    public MobileElement subtotal;

    @AndroidFindBy(xpath = "(//android.widget.TextView)[16]")
    public MobileElement shippingCost;

}
