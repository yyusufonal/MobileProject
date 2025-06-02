package utilities;

import Page.YusufPage;
import io.appium.java_client.*;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.ActionOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.DesiredCapabilities;

import static java.time.Duration.ofMillis;
import static java.util.Collections.singletonList;
import static utilities.Driver.driver;
import static utilities.Driver.getAppiumDriver;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.sound.midi.InvalidMidiDataException;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.Key;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class ReusableMethods {
   private static DesiredCapabilities desiredCapabilities=new DesiredCapabilities();




    public static void apkYukle(){

        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME,ConfigReader.getProperty("deviceName"));
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,ConfigReader.getProperty("version"));
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
        //desiredCapabilities.setCapability(MobileCapabilityType.APP,ConfigReader.getProperty(apk));
        desiredCapabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,ConfigReader.getProperty("appPackage"));
        desiredCapabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,ConfigReader.getProperty("appActivity"));
    }
    public static void elementClick(WebElement elementName){
        var el1 = getAppiumDriver().findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\""+elementName+"\").instance(0)"));
        el1.click();
    }
    public static void koordinatTiklama(int xKoordinat, int yKoordinat, int bekleme, WebElement slider) throws InterruptedException {
        Point source = slider.getLocation();
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence sequence = new Sequence(finger, 1);
        sequence.addAction(finger.createPointerMove(ofMillis(0),
                PointerInput.Origin.viewport(), source.x, source.y));
        sequence.addAction(finger.createPointerDown(PointerInput.MouseButton.MIDDLE.asArg()));
        sequence.addAction(new Pause(finger, ofMillis(600)));
        sequence.addAction(finger.createPointerMove(ofMillis(600),
                PointerInput.Origin.viewport(), source.x + 400, source.y));
        sequence.addAction(finger.createPointerUp(PointerInput.MouseButton.MIDDLE.asArg()));

        getAppiumDriver().perform(singletonList(sequence));
           }

  //  static AndroidDriver<AndroidElement> driver=Driver.getAppiumDriver();
    public static void koordinatTiklamaMethodu(int x,int y) throws InterruptedException {
        TouchAction action=new TouchAction((PerformsTouchActions) getAppiumDriver());
        action.press(PointOption.point(x,y)).release().perform();
        Thread.sleep(1000);
    }

    public static void scrollWithUiScrollableAndClick(String elementText) {
        AndroidDriver driver = (AndroidDriver)  Driver.getAppiumDriver();
      //  driver.findElement(AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"" + elementText + "\"))");
        driver.findElement(By.xpath("//*[@text='" + elementText + "']")).click();

    }
    public static void scrollWithUiScrollable(String elementText) {
        AndroidDriver driver = (AndroidDriver)  getAppiumDriver();
     //   driver.findElement(AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"" + elementText + "\"))"));

    }

    public static String getScreenshot(String name) throws IOException {
        // naming the screenshot with the current date to avoid duplication
        String date = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        // TakesScreenshot is an interface of selenium that takes the screenshot
        TakesScreenshot ts = (TakesScreenshot)Driver.getAppiumDriver();

        File source = ts.getScreenshotAs(OutputType.FILE);
        // full path to the screenshot location
        String target = System.getProperty("user.dir") + "/target/Screenshots/" + name + date + ".png";
        File finalDestination = new File(target);
        // save the screenshot to the path given
        FileUtils.copyFile(source, finalDestination);
        return target;
    }

    public static void ekranKaydirmaMethodu(int xPress, int yPress, int wait, int xMove, int yMove) {
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence swipe = new Sequence(finger, 1);

        swipe.addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), xPress, yPress));
        swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        swipe.addAction(finger.createPointerMove(Duration.ofMillis(wait), PointerInput.Origin.viewport(), xMove, yMove));
        swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

        getAppiumDriver().perform(Collections.singletonList(swipe));
    }
    public static void wait(int saniye) {
        try {
            Thread.sleep(saniye * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void scrollWithUiScrollableContentDescClick(String elementText) {

        Driver.getAppiumDriver().findElement(
                MobileBy.AndroidUIAutomator(
                        "new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().description(\"" + elementText + "\"));"
                )
        ).click();
    }
    public static void clickButtonByDescription(String description) {
        AndroidDriver driver = (AndroidDriver) getAppiumDriver();
        WebElement button = driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiSelector().description(\"" + description + "\")"));
        button.click();
    }
    public static void scrollWithUiScrollableContentDesc(String elementText) {

        Driver.getAppiumDriver().findElement(
                MobileBy.AndroidUIAutomator(
                        "new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().description(\"" + elementText + "\"));"
                )
        );
    }

    public static void scrollWithPartialContentDesc(String partialDesc) {
        Driver.getAppiumDriver().findElement(
                MobileBy.AndroidUIAutomator(
                        "new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().descriptionContains(\"" + partialDesc + "\"));"
                )
        ).click();
    }


    public static List<String> getAllCategories() throws InvalidMidiDataException {
        List<String> allCategories = new ArrayList<>();
        boolean isEndOfList = false;

        while (!isEndOfList) {

            List<WebElement> visibleCategories = Driver.getAppiumDriver().findElements(By.xpath("(//android.view.View)[11]//android.view.View"));

            for (WebElement category : visibleCategories) {
                String categoryName = category.getAttribute("content-desc");

                if (categoryName != null && !categoryName.equals("null") && !categoryName.trim().isEmpty()) {
                    if (!allCategories.contains(categoryName)) {
                        allCategories.add(categoryName);
                    }
                }
            }

            OptionsMet.swipe(1188, 1162, 0, 1162);
            ReusableMethods.wait(1);

            List<WebElement> currentVisibleCategories = Driver.getAppiumDriver().findElements(By.xpath("(//android.view.View)[11]//android.view.View"));
            String currentCategoryName = currentVisibleCategories.get(currentVisibleCategories.size() - 1).getAttribute("content-desc");

            String lastCategory = allCategories.get(allCategories.size() - 1);

            if (currentCategoryName.equals(lastCategory)) {
                isEndOfList = true;
            }
        }
        return allCategories;
    }

    public static void selectCategory(String categoryNameVariable) {
        List<String> allCategories = new ArrayList<>();
        boolean categoryFound = false;
        boolean reachedEnd = false;

        while (!categoryFound) {

            List<WebElement> visibleCategories = Driver.getAppiumDriver().findElements(By.xpath("(//android.view.View)[11]//android.view.View"));

            for (WebElement category : visibleCategories) {
                String categoryName = category.getAttribute("content-desc");

                if (categoryName != null && !categoryName.equals("null") && !categoryName.trim().isEmpty()) {
                    if (!allCategories.contains(categoryName)) {
                        allCategories.add(categoryName);

                        if (categoryName.equals(categoryNameVariable)) {
                            categoryFound = true;
                            category.click();
                            break;
                        }
                    }
                }
            }

            if (categoryFound) break;

            if (reachedEnd) {
                try {
                    OptionsMet.swipe(0, 1162, 1188, 1162);
                } catch (InvalidMidiDataException e) {
                    throw new RuntimeException(e);
                }
                ReusableMethods.wait(1);

            } else {

                String lastVisibleCategory = visibleCategories.get(visibleCategories.size() - 1).getAttribute("content-desc");

                try {
                    OptionsMet.swipe(1188, 1162, 0, 1162);
                } catch (InvalidMidiDataException e) {
                    throw new RuntimeException(e);
                }
                ReusableMethods.wait(1);

                visibleCategories = Driver.getAppiumDriver().findElements(By.xpath("(//android.view.View)[11]//android.view.View"));

                String newLastVisibleCategory = visibleCategories.get(visibleCategories.size() - 1).getAttribute("content-desc");
                if (lastVisibleCategory.equals(newLastVisibleCategory)) {
                    reachedEnd = true;
                }
            }
        }
    }

    public static void userLogin(String email, String password) {
        YusufPage page = new YusufPage(Driver.getAppiumDriver());

        ReusableMethods.wait(2);
        page.getProfileButonu().click();

        ReusableMethods.wait(1);
        page.getSignInButonu().click();

        ReusableMethods.wait(1);
        page.getUseEmailInsteadButonu().click();

        ReusableMethods.wait(1);
        OptionsMet.clickAndSendKeys(page.emailTextBoxu,email);

        OptionsMet.clickAndSendKeys(page.passwordTextBoxu,password);

        ReusableMethods.wait(1);
        page.getSignInSayfasiSignInButonu().click();
        ReusableMethods.wait(2);
    }

    public static void addAddress(String fullName ,String email,String phone,String country, String state, String city, String zip, String street){
        YusufPage page = new YusufPage(Driver.getAppiumDriver());

        page.addAddressButton.click();
        OptionsMet.clickAndSendKeys(page.fullNameTextBox,fullName);
        OptionsMet.clickAndSendKeys(page.addressEmailTextBox,email);
        OptionsMet.clickAndSendKeys(page.addressPhoneTextBox,phone);
        ReusableMethods.wait(1);
        page.addressCountryBox.click();
        ReusableMethods.wait(1);
        OptionsMet.clickAndSendKeys(page.addressCountryTextBox,country);
        ReusableMethods.wait(1);
        selectFromDropdownByContentDesc(country, driver);
        ReusableMethods.wait(1);
        page.addressStateBox.click();
        ReusableMethods.wait(2);
        OptionsMet.clickAndSendKeys(page.addressStateTextBox,state);
        ReusableMethods.wait(1);
        selectFromDropdownByContentDesc(state, driver);
        ReusableMethods.wait(1);
        page.addressCityBox.click();
        ReusableMethods.wait(1);
        OptionsMet.clickAndSendKeys(page.addressCityTextBox,city);
        ReusableMethods.wait(1);
        selectFromDropdownByContentDesc(city, driver);
        ReusableMethods.wait(1);
        OptionsMet.clickAndSendKeys(page.addressZipCodeBox,zip);
        ReusableMethods.wait(1);
        OptionsMet.hideKeyboard();
        ReusableMethods.wait(2);
        page.streetAddressBox.click();
        ReusableMethods.wait(1);
        page.streetAddressTextBox.sendKeys(street);
        OptionsMet.hideKeyboard();
        page.finalAddAddressButton.click();
        ReusableMethods.wait(2);


    }

    public static void selectFromDropdownByContentDesc(String optionText, AppiumDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // XPath içeriği dinamik olarak oluşturuluyor
        String xpath = "//android.view.View[@content-desc='" + optionText + "']";

        WebElement option = (WebElement) wait.until(
                ExpectedConditions.elementToBeClickable(By.xpath(xpath))
        );

        option.click();
    }

    public static void Address(String fullName ,String email,String phone,String country, String state, String city, String zip, String street){
        YusufPage page = new YusufPage(Driver.getAppiumDriver());

        OptionsMet.clickAndSendKeys(page.fullNameTextBox,fullName);
        OptionsMet.clickAndSendKeys(page.addressEmailTextBox,email);
        OptionsMet.clickAndSendKeys(page.addressPhoneTextBox,phone);
        ReusableMethods.wait(1);
        page.addressCountryBox.click();
        ReusableMethods.wait(1);
        OptionsMet.clickAndSendKeys(page.addressCountryTextBox,country);
        ReusableMethods.wait(1);
        selectFromDropdownByContentDesc(country, driver);
        ReusableMethods.wait(1);
        page.addressStateBox.click();
        ReusableMethods.wait(2);
        OptionsMet.clickAndSendKeys(page.addressStateTextBox,state);
        ReusableMethods.wait(1);
        selectFromDropdownByContentDesc(state, driver);
        ReusableMethods.wait(1);
        page.addressCityBox.click();
        ReusableMethods.wait(1);
        OptionsMet.clickAndSendKeys(page.addressCityTextBox,city);
        ReusableMethods.wait(1);
        selectFromDropdownByContentDesc(city, driver);
        ReusableMethods.wait(1);
        OptionsMet.clickAndSendKeys(page.addressZipCodeBox,zip);
        ReusableMethods.wait(1);
        OptionsMet.hideKeyboard();
        ReusableMethods.wait(2);
       // page.streetAddressBox.click();
        ReusableMethods.wait(1);
        OptionsMet.clickAndSendKeys(page.streetAddressBox,street);
        //page.streetAddressTextBox.sendKeys(street);
        OptionsMet.hideKeyboard();
        page.finalAddAddressButton.click();
        ReusableMethods.wait(2);


    }



}
