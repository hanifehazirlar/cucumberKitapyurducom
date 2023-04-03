package screens;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.time.Duration;

public class AdressScreen {
    public AdressScreen() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver(), Duration.ofSeconds(30)), this);
    }
    @AndroidFindBy(xpath="(//android.widget.EditText)[1]")
    public MobileElement nameBox;

    @AndroidFindBy( id= "com.mobisoft.kitapyurdu:id/surnameText")
    public MobileElement lastNameBox;

    @AndroidFindBy( id= "com.mobisoft.kitapyurdu:id/countrySpinner")
    public MobileElement country;

    @AndroidFindBy(id="com.mobisoft.kitapyurdu:id/zoneSpinner")
    public MobileElement cityBox;


    @AndroidFindBy(id="com.mobisoft.kitapyurdu:id/search_box")
    public MobileElement searchBox;

    @AndroidFindBy(id="com.mobisoft.kitapyurdu:id/countySpinner")
    public MobileElement cauntyBox;

    @AndroidFindBy(id="com.mobisoft.kitapyurdu:id/districtSpinner")
    public MobileElement districtBox;

    @AndroidFindBy(id="com.mobisoft.kitapyurdu:id/addressText")
    public MobileElement addressText;


    @AndroidFindBy(id="com.mobisoft.kitapyurdu:id/telephone")
    public MobileElement telephoneBox;

    @AndroidFindBy(id="com.mobisoft.kitapyurdu:id/mobileTelephone")
    public MobileElement mobilTelephoneBox;

    @AndroidFindBy(id="com.mobisoft.kitapyurdu:id/submitButton")
    public MobileElement submitButton;


    @AndroidFindBy(id="com.mobisoft.kitapyurdu:id/imageViewRadioButton")
    public MobileElement bankTransferRadioButton;



}
