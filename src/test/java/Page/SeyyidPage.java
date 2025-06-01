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



}
