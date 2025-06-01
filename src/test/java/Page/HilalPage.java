package Page;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.cucumber.java.bs.A;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HilalPage {

    public HilalPage(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver()),this);
    }

    @AndroidFindBy(accessibility = "Category")
    public WebElement CategoryButton;

    @AndroidFindBy(accessibility = "Men")
    public WebElement MenCategoryItem;

    @AndroidFindBy(accessibility = "Women")
    public WebElement WomenCategoryItem;

    @AndroidFindBy(accessibility = "Juniors")
    public WebElement JuniorsCategoryItem;

    @AndroidFindBy(className = "android.widget.ImageView")
    public WebElement CategoryFilterButton;

    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[2]/android.widget.ImageView")
    public WebElement CategorySideButton;

    @AndroidFindBy(accessibility = "Women")
    public WebElement SideWomanText;

    @AndroidFindBy(xpath = "@AndroidFindBy(xpath = \"//*[contains(@content-desc, 'Womens Short Sleeve Tie Dye Blosue T-Shirt')]\")\n" +
            "private WebElement Firstcolomn;")
    public WebElement Firstcolomn;

    @AndroidFindBy(accessibility = "M")
    public WebElement Msize;

    @AndroidFindBy(accessibility = "Add To Cart")
    public WebElement AddToCartButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(6)")
    public WebElement AddedCart;

    @AndroidFindBy(accessibility = "(18, Wine Red) Womens Short Sleeve Tie Dye Blosue T-Shirt\\nM\\n$21.00\\n1")
    public WebElement FirstTshirt;
}
