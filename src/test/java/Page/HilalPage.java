package Page;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
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
}
