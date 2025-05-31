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

    @AndroidFindBy(accessibility = "Product Details")
    public WebElement productDetailTitle;

    @AndroidFindBy(accessibility = "Details")
    public WebElement Details;

    @AndroidFindBy(accessibility = "Videos")
    public WebElement Videos;

    @AndroidFindBy(accessibility = "Product Videos")
    public WebElement VideosTitle;

    @AndroidFindBy(accessibility = "Review")
    public WebElement Review;

    @AndroidFindBy(accessibility = "Product Reviews")
    public WebElement ProductReviews;

    @AndroidFindBy(xpath = "(//android.view.View[@content-desc=\"Shipping & Return\"])[1]")
    public WebElement shippingAndReturnTab;

    @AndroidFindBy(xpath = "(//android.view.View[@content-desc=\"Shipping & Return\"])[2]")
    public WebElement ShippingAndReturnTitle;


}
