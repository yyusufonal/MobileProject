package Page;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.cucumber.java.bs.A;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.lang.reflect.Field;

public class HilalPage {

    public HilalPage(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver()),this);
    }


    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Category\"]")
    public static WebElement  CategoryItemButton;

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

    @AndroidFindBy(xpath = "//android.view.View[string-length(@content-desc) > 20][1]")
    public WebElement FirstProduct;

    @AndroidFindBy(accessibility = "M")
    public WebElement Msize;

    @AndroidFindBy(accessibility = "Details:")
    public WebElement ProductDetails;

    @AndroidFindBy(accessibility = "Add To Cart")
    public WebElement AddToCartButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(3)")
    public WebElement LikeProduct;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(2)")
    public WebElement FilterProduct;

    @AndroidFindBy(accessibility = "Profile")
    public WebElement ProfileItemButton;

    @AndroidFindBy(accessibility = "Edit Profile")
    public WebElement EditProfileItem;

    @AndroidFindBy(xpath = "//android.widget.EditText[1]")
    public WebElement EditProfileFullName;

    @AndroidFindBy(xpath = "//android.widget.EditText[2]")
    public WebElement EditProfileFullMail;

    @AndroidFindBy(xpath = "//android.widget.EditText[3]")
    public WebElement EditProfileFullPhone;

    @AndroidFindBy(accessibility = "Save Changes")
    public WebElement EditProfileSaveButton;

}
