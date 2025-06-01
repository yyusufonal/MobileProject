package Page;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import lombok.Getter;
import org.openqa.selenium.WebElement;

import java.nio.file.WatchEvent;

@Getter
public class EmrePage extends BasePage {

    public EmrePage(AppiumDriver driver) {
        super(driver);
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Adidas 3-Stripes Cushioned Crew Socks\n" +
            "0 (0  Reviews)\n" +
            "$15.00\")")
    public WebElement adidasCopraButonu;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Black\")")
    public WebElement copraColorButonu;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"White\")")
    public WebElement copraColor2Butonu;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Men\")")
    public WebElement menCateButonu;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(10)")
    public WebElement Cartbuton;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Wishlist\")")
    public WebElement DilekKutusu;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Favorite\")")
    public  WebElement Favbuton;




}
