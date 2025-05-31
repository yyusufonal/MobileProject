package Page;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CemPage {

    public CemPage() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver()), this);
    }


    @AndroidFindBy(xpath = "//android.view.View[contains(@content-desc, 'Flower Print Foil T-shirt')]")
    public WebElement firstProduct;

    @AndroidFindBy(xpath = "//android.view.View[contains(@content-desc, 'Flower Print Foil T-shirt')]")
    public WebElement detailTitle;

    @AndroidFindBy(accessibility = "Floral Print Midi Dress\\n0 (0  Reviews)\\n$100.00")
    public WebElement product;

    @AndroidFindBy(accessibility = "Product Details")
    public WebElement productDetailTitle;
}
