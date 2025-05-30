package Page;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import static utilities.Driver.getAppiumDriver;
@Getter
public class YusufPage {
    public YusufPage(){
        PageFactory.initElements(new AppiumFieldDecorator(getAppiumDriver()),this);
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






}
