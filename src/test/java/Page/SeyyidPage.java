package Page;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SeyyidPage extends BasePage{

	public SeyyidPage(AppiumDriver driver) {
		super(driver);
	}


	@AndroidFindBy (xpath = "(//android.widget.ImageView[@content-desc=\"Home\"])")
	public WebElement homeLink;

	@AndroidFindBy (uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(1)")
	public WebElement searchButton;

	@AndroidFindBy (uiAutomator = "new UiSelector().className(\"android.widget.EditText\")")
	public WebElement searchAramaKismi;

	@AndroidFindBy(xpath = "(//android.view.View[@content-desc=\"Women Snow Boots\n0 (0  Reviews)\n$75.00\"])")
	public WebElement womanSnowBoots;

	@AndroidFindBy (uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(0)")
	public WebElement fullName;

	@AndroidFindBy (uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(1)")
	public WebElement email;

	@AndroidFindBy (uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(2)")
	public WebElement phone;

	@AndroidFindBy (uiAutomator = "new UiSelector().description(\"Country\")")
	public WebElement adress;

	@AndroidFindBy (uiAutomator = "new UiSelector().description(\"State\")")
	public WebElement state;

	@AndroidFindBy (uiAutomator = "new UiSelector().description(\"City\")")
	public WebElement city;

	@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(2)")
	public WebElement zipCode;

	@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(3)")
	public WebElement streetAdress;

	@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\")")
	public WebElement countryStateSearchPart;

	@AndroidFindBy(uiAutomator = "new UiSelector().descriptionContains(\"Seyyid\")")
	public WebElement seyyidAdressName;

	@AndroidFindBy (uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(1)")
	public WebElement editButton;

	@AndroidFindBy (uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(2)")
	public WebElement deleteButton;

	@AndroidFindBy(uiAutomator = "new UiSelector().descriptionContains(\"Flower Print Foil T-shirt\").descriptionContains(\"$65.00\")")
	public WebElement flowerTshirt;

	@AndroidFindBy (uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(12)")
	public WebElement rightBottomChart;


}
