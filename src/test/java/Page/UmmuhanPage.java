package Page;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;


public class UmmuhanPage extends BasePage {

    public UmmuhanPage(AppiumDriver driver) {
            super(driver);
    }

    @AndroidFindBy(xpath = "(//android.widget.ImageView)[1]")
    public WebElement homeLogo;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc='Popular Brands']")
    public WebElement popularBrands;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc='Blossom Boutique']")
    public WebElement blossomBoutique;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc='Nike']")
    public WebElement nikeBrand;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc='Dr. Martens']")
    public WebElement drMartensBrand;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc='Clarks']")
    public WebElement clarksBrand;

    @AndroidFindBy(accessibility = "Profile")
    public WebElement profileIcon;

    @AndroidFindBy(xpath = "(//android.view.View[@content-desc=\"Sign In\"])")
    public WebElement signInButton;

    @AndroidFindBy(xpath = "(//android.view.View[@content-desc=\"*Use Email Instead\"])")
    public WebElement useEmailInsteadButton;

    @AndroidFindBy(xpath = "(//android.view.View[@content-desc='Sign In'])[2]")
    public WebElement loginSignInButton;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc='Success\nLogin Successfully.']")
    public WebElement successLoginMessage;

    @AndroidFindBy(xpath = "(//android.widget.EditText)[1]")
    public WebElement emailField;

    @AndroidFindBy(xpath = "(//android.widget.EditText)[2]")
    public WebElement passwordField;

    @AndroidFindBy(xpath = "(//android.widget.ImageView)[2]")
    public WebElement rememberImageView;

    @AndroidFindBy(accessibility = "Welcome Back, ")
    public WebElement welcomeMessage;

    @AndroidFindBy(accessibility = "Total Orders")
    public WebElement totalOrders;

    @AndroidFindBy(accessibility = "Total Completed")
    public WebElement totalCompleted;

    @AndroidFindBy(accessibility = "Total Returnd")
    public WebElement totalReturned;

    @AndroidFindBy(accessibility = "Wallet Balance")
    public WebElement walletBalance;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc='Order History List']")
    public WebElement orderHistoryList;

    @AndroidFindBy(xpath = "(//android.widget.ImageView)[2]")
    public WebElement secondImageView;

    @AndroidFindBy(accessibility = "My Account")
    public WebElement myAccountTab;
}
