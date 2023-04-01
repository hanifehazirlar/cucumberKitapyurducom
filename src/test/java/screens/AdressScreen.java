package screens;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class AdressScreen {
    public AdressScreen() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver()), this);
    }
    @AndroidFindBy(xpath="(//android.widget.EditText)[1]")
    public MobileElement nameBox;

    @AndroidFindBy( id= "com.mobisoft.kitapyurdu:id/surnameText")
    public MobileElement lastNameBox;

    @AndroidFindBy( id= "com.mobisoft.kitapyurdu:id/countrySpinner")
    public MobileElement country;




}
