package Page;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.cucumber.java.bs.A;
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

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"L\"]")
    public WebElement sizeBtn;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Add To Cart\"]")
    public WebElement addToCartBtn;

    @AndroidFindBy(xpath = "//android.view.View[contains(@content-desc, 'Success') and contains(@content-desc, 'added to cart')]")
    public WebElement succesProductCartAdded;

    @AndroidFindBy(accessibility = "Favorite")
    public WebElement favoriteBtn;

    @AndroidFindBy(accessibility = "Add\nAdded to Wishlist")
    public WebElement succesWishListAdded;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(2)")
    public WebElement filterIcon;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(0)")
    public WebElement filterExitIcon;

    @AndroidFindBy(accessibility = "Sort By")
    public WebElement sortBy;

    @AndroidFindBy(accessibility = "Brands")
    public WebElement Brands;

    @AndroidFindBy(accessibility = "color")
    public WebElement color;

    @AndroidFindBy(accessibility = "size")
    public WebElement size;

}
