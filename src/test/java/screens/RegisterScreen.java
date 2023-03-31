package screens;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class RegisterScreen {
    public RegisterScreen() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver()), this);
    }
    @AndroidFindBy(id = "com.mobisoft.kitapyurdu:id/editTextName")
    public MobileElement nameBox;

    @AndroidFindBy(id = "com.mobisoft.kitapyurdu:id/editTextSurname")
    public MobileElement lastNameBox;

    @AndroidFindBy(id = "com.mobisoft.kitapyurdu:id/editTextMail")
    public MobileElement emailBox;

    @AndroidFindBy(id = "com.mobisoft.kitapyurdu:id/editTextPassword")
    public MobileElement passwordBox;

    @AndroidFindBy(id = "com.mobisoft.kitapyurdu:id/editTextAgainPassword")
    public MobileElement confirmPasswordBox;

    @AndroidFindBy(id = "com.mobisoft.kitapyurdu:id/aggreement")
    public MobileElement aggreementCheckBox;


    @AndroidFindBy(id = "com.mobisoft.kitapyurdu:id/btnRegister")
    public MobileElement registerButton;

    @AndroidFindBy(id = "com.mobisoft.kitapyurdu:id/textViewMail")
    public MobileElement verifiesAccount;

}
