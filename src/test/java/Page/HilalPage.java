package Page;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HilalPage {

    public HilalPage(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver()),this);
    }

    @FindBy(xpath = "//android.widget.ImageView[@content-desc='Category']")
    public WebElement CategoryButton;

}
