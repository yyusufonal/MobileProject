package Page;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import static utilities.Driver.getAppiumDriver;
@Getter
public class YusufPage extends BasePage {

    public YusufPage(AppiumDriver driver) {
        super(driver);
    }


    @AndroidFindBy(xpath = "(//android.widget.ImageView[@content-desc=\"Profile\"])")
    public WebElement profileButonu;

    @AndroidFindBy(xpath = "(//android.view.View[@content-desc=\"Sign In\"])")
    public WebElement signInButonu;

    @AndroidFindBy(xpath = "(//android.view.View[@content-desc=\"*Use Email Instead\"])")
    public WebElement useEmailInsteadButonu;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(0)")
    public WebElement emailTextBoxu;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(1)")
    public WebElement passwordTextBoxu;

    @AndroidFindBy(xpath = "(//android.view.View[@content-desc=\"Sign In\"])[2]")
    public WebElement signInSayfasiSignInButonu;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Men\")")
    public WebElement menCategoryButonu;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Canvas Backpack for Men Zipper Rucksacks\n" +
            "0 (0  Reviews)\n" +
            "$54.00\")")
    public WebElement canvasBackpackButonu;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Brown\")")
    public WebElement backpackColorButonu;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Add To Cart\")")
    public WebElement addToCartButonu;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(6)")
    public WebElement CartButonu;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Proceed to Checkout\")")
    public WebElement proceedToCheckoutButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Add\")")
    public WebElement addAddressButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(0)")
    public WebElement fullNameTextBox;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(1)")
    public WebElement addressEmailTextBox;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(2)")
    public WebElement addressPhoneTextBox;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Country\")")
    public WebElement addressCountryBox;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\")")
    public WebElement addressCountryTextBox;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"State\")")
    public WebElement addressStateBox;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\")")
    public WebElement addressStateTextBox;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"City\")")
    public WebElement addressCityBox;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\")")
    public WebElement addressCityTextBox;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(3)")
    public WebElement addressZipCodeBox;

    @AndroidFindBy(uiAutomator= "new UiSelector().className(\"android.widget.EditText\").instance(4)")
    public WebElement streetAddressBox;

    @AndroidFindBy(uiAutomator= "new UiSelector().className(\"android.widget.EditText\").instance(3)")
    public WebElement streetAddressTextBox;


    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Add Address\")")
    public WebElement finalAddAddressButton;



}
