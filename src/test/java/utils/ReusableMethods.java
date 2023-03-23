package utils;


import com.github.javafaker.Faker;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertTrue;


public class ReusableMethods {

         public static void tapOnElementWithText(String text) {
            List<MobileElement> mobileElementList = Driver.getAppiumDriver().findElementsByClassName("android.widget.TextView");
            for (MobileElement page: mobileElementList) {
                if (page.getText().equals(text)){
                    page.click();
                }else{
                    scrollWithUiScrollable(text);
                }
                break;
            }
        }

//ikinci alternatif bir method
        public static void clickOnElementWithText(String elementText) throws InterruptedException {
            Thread.sleep(4000);
            List<MobileElement> mobileElementList = Driver.getAppiumDriver().findElementsByXPath("//android.widget.TextView[@text='"+elementText+"']");
            if (mobileElementList.size()>0){
                mobileElementList.get(0).click();
            }else scrollWithUiScrollable(elementText);
        }


    public static boolean isElementPresent(String text) {
        boolean elementFound = false;
        List<MobileElement> mobileElementList = Driver.getAppiumDriver().findElementsByXPath("//android.widget.TextView[@text='" + text + "']");
        for (MobileElement el : mobileElementList) {
            if (el.getText().equals(text)) {
                waitToBeVisible(el, 10);
                if (el.isDisplayed()) {
                    elementFound = true;
                }
            }
        }
        return elementFound;
    }

    public static void wait(int second) {
        try {
            Thread.sleep(second * 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void tapOn(MobileElement element) {
        waitToBeClickable(element, 20);
        element.click();
    }
    public static void tapOn(WebElement element) {
        waitToBeClickable(element, 20);
        element.click();
    }


    public static void enterText(MobileElement element, String text) {
        waitToBeClickable(element, 10);
        element.sendKeys(text);
    }

    public static void enterText(MobileElement element, String text, boolean needClear) {
        waitToBeClickable(element, 10);
        if (needClear) {
            element.clear();
        }
        element.sendKeys(text);
    }

    public static boolean isElementPresent(MobileElement mobileElement) {
        boolean elementFound = false;
        waitToBeVisible(mobileElement, 10);
        if (mobileElement.isDisplayed()) {
            elementFound = true;
        }
        return elementFound;
    }

    public static void waitToBeVisible(MobileElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getAppiumDriver(), timeout);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void waitToBeClickable(MobileElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getAppiumDriver(), timeout);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    public static void waitToBeClickable(WebElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getAppiumDriver(), timeout);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }



    public static void scrollWithUiScrollable(String elementText) {
        AndroidDriver<MobileElement> driver = (AndroidDriver) Driver.getAppiumDriver();
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+elementText+"\"))");
        tapOn(driver.findElementByXPath("//android.widget.TextView[@text='" + elementText + "']"));
    }

    public static void scrollDownToBeVisible(MobileElement element) {

    }

    public static void scrollUpToBeVisible(MobileElement element) {

    }

    public static void swipeFromElementToElement(MobileElement el1, MobileElement el2) {

    }
//attribute check
static Faker faker;

    public static WebElement waitForVisibility(WebElement element, long timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getAppiumDriver(), timeout);
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void clickElement(WebElement element) {
        waitForVisibility(element, 9);
        element.click();

    }

    public static void isElementPresent(WebElement element) {
        waitForVisibility(element, 9);
        assertTrue(element.isDisplayed());
    }

    public static void enterKeys(WebElement element, String keys) {
        waitForVisibility(element, 9);
        element.sendKeys(keys);
    }

    public static void enterKeys(WebElement element, String keys, Boolean clear) {
        waitForVisibility(element, 9);
        if (clear) {
            element.clear();
        }
        element.sendKeys(keys);
    }

    public static Faker getFaker() { // getFaker method
        return faker = new Faker();
    }
    public static void jsclick(WebElement webElement){
        JavascriptExecutor js = (JavascriptExecutor) Driver.getAppiumDriver();
        try {
            webElement.click();
        } catch (Exception e) {
            js.executeScript("arguments[0].scrollIntoView(true);", webElement);
            js.executeScript("arguments[0].click()", webElement);

        }
    }
    public static String  getValueWithJs(String elementId){
        JavascriptExecutor js=(JavascriptExecutor)Driver.getAppiumDriver();
        String value=js.executeScript("return document.getElementById('"+elementId+"').value").toString();
        return value;
    }
    public static String getScreenshot(String name) throws IOException {
        // naming the screenshot with the current date to avoid duplication
        String date = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        // TakesScreenshot is an interface of selenium that takes the screenshot
        TakesScreenshot ts = (TakesScreenshot) Driver.getAppiumDriver();
        File source = ts.getScreenshotAs(OutputType.FILE);
        // full path to the screenshot location
        String target = System.getProperty("user.dir") + "/target/Screenshots/" + name + date + ".png";
        File finalDestination = new File(target);
        // save the screenshot to the path given
        FileUtils.copyFile(source, finalDestination);
        return target;
    }

    public void clickIfItIsNotChecked(WebElement webElement){
        waitForVisibility(webElement,9);
        if(!webElement.isSelected()){
            jsclick(webElement);
        }
    }

    public void clickIfItIsChecked(WebElement webElement){
        waitForVisibility(webElement,9);
        if(webElement.isSelected()){
            jsclick(webElement);
        }
    }



    public boolean isNumberIsBiggerThanTheNumber(WebElement element,int numb){
        return Integer.parseInt(element.getText())>numb;
    }
    public boolean isNumberIsBiggerThanTheNumber(WebElement element,double numb){
        return Double.parseDouble(element.getText())>numb;
    }
    public static void setValueByJS(WebElement element, String key, String text) {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getAppiumDriver();
        js.executeScript("arguments[0].setAttribute('" + key + "','" + text + "')", element);
    }


}
