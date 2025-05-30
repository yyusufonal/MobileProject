package Page;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.lang.reflect.Field;

public class BasePage {

    protected AppiumDriver driver;

    public BasePage(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public WebElement getElementByName(String elementName) {
        try {
            Field field = this.getClass().getField(elementName);  // Burada this.getClass() sayesinde çağıran page class’ın alanlarına bakılır
            return (WebElement) field.get(this);
        } catch (Exception e) {
            throw new IllegalArgumentException("Element not found: " + elementName);
        }
    }
}
