package Page;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static utilities.Driver.getAppiumDriver;

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

    @AndroidFindBy(xpath = "//android.view.View[@content-desc='Profile']")
    public WebElement profileButton;

    @AndroidFindBy(xpath = "(//android.view.View[@content-desc=\"Sign In\"])")
    public WebElement signInButton;

    @AndroidFindBy(xpath = "(//android.view.View[@content-desc=\"*Use Email Instead\"])")
    public WebElement useEmailInsteadButton;

    @AndroidFindBy(xpath = "(//android.view.View[@content-desc='Sign In'])[2]")
    public WebElement secondSignInButton;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc='Success\nLogin Successfully.']")
    public WebElement successLoginMessage;

    @AndroidFindBy(xpath = "(//android.widget.EditText)[1]")
    public WebElement emailField;

    @AndroidFindBy(xpath = "(//android.widget.EditText)[2]")
    public WebElement passwordField;

    @AndroidFindBy(xpath = "(//android.widget.ImageView)[2]")
    public WebElement rememberImageView;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc='Logout']")
    public WebElement logoutButton;

    @AndroidFindBy(accessibility = "Welcome Back, ")
    public WebElement welcomeMessage;

    @AndroidFindBy(accessibility = "Order History")
    public WebElement orderHistorySection;

    @AndroidFindBy(accessibility = "Total Orders")
    public WebElement totalOrders;

    @AndroidFindBy(accessibility = "Total Completed")
    public WebElement totalCompleted;

    @AndroidFindBy(accessibility = "Total Returnd")
    public WebElement totalReturned;

    @AndroidFindBy(accessibility = "Wallet Balance")
    public WebElement walletBalance;

    @AndroidFindBy(accessibility = "Error\nInvalid credentials or you are blocked")
    public WebElement incorrectLoginMessage;

    @AndroidFindBy(accessibility = "Enter Valid Email Address")
    public WebElement invalidEmailWarning;

    @AndroidFindBy(accessibility = "Passord is required")
    public WebElement emptyFieldWarning;

    @AndroidFindBy(accessibility = "Don't have an account?")
    public WebElement dontHaveAccountText;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc='Order History List']")
    public WebElement orderHistoryList;


    public void navigateToTab(String tabName) {
        String xpath = "//android.view.View[@content-desc='" + tabName + "']";
        WebElement tabElement = getAppiumDriver().findElement(By.xpath(xpath));
        tabElement.click();
    }

    public WebElement getSection(String sectionName) {
        String xpath = "//android.view.View[@content-desc='" + sectionName + "']";
        return getAppiumDriver().findElement(By.xpath(xpath));
    }

}
