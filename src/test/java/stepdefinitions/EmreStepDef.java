package stepdefinitions;

import Page.EmrePage;
import Page.HilalPage;
import Page.YusufPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;


public class EmreStepDef {
    AndroidDriver driver = (AndroidDriver) Driver.getAppiumDriver();
    EmrePage page = new EmrePage(Driver.getAppiumDriver());
    YusufPage yusufPage;
    HilalPage hilalPage;
    private ReusableMethods MobileUtils;

    @Then("choose Adidas 3-Stripes Cushioned Crew Socks in men category")
    public void chooseAdidascoprainmencategory(){
        page.menCateButonu.click();
        ReusableMethods.wait(2);
        page.adidasCopraButonu.click();
        ReusableMethods.wait(2);
        ReusableMethods.ekranKaydirmaMethodu(779,2234,300,779,1114);
    }



    @When("User selects a color option")
    public void userselectsacoloroption() {

        page.copraColorButonu.click();
        ReusableMethods.wait(1);
        page.copraColor2Butonu.click();
    }

    @When("Guest choose black color")
            public void guestchooseblack() {
            page.copraColorButonu.click();


    }

    @When("Guest click cart buton")
    public void guestclickcartbuton(){
        page.Cartbuton.click();
    }

    @When("User click WishList")
    public void userclickwish(){
        page.DilekKutusu.click();
    }

    @Then("User click fav buton")
    public void userclickfav(){
        page.Favbuton.click();
    }

    @When("User click Men side")
    public void clickmenside() {page.MenSide.click();}

    @When("User click adidas21 wishlist")
    public void clickwishadidas21(){page.adidas21wishbuton.click();}

    @When("User choose adidas corap")
    public void chooseadidascorap(){
        page.adidasCopraButonu.click();
        ReusableMethods.ekranKaydirmaMethodu(779,2234,300,779,1114);
    }
    @Then("choose men category")
    public void choosemencategory() {
        page.menCateButonu.click();
    }

    @Then("click men filter")
    public void clickmenfilter(){
        page.getMenfilter().click();
    }

    @Then("click request return")
    public void clivkrequestbuton(){
        page.Requestbuton.click();
    }

    @When("User scrolls and taps on {string}")
    public void user_scrolls_and_taps_on(String text) {
        MobileUtils.scrollWithUiScrollableContentDescClick(text);
    }

    @When("User taps the first delivered order icon")
    public void user_taps_the_first_delivered_order_icon() {
        ReusableMethods.clickFirstDeliveredOrderIconn();
    }
    @Then("User taps the pending icon")
    public void userpendingicon(){
        ReusableMethods.clickFirstPendingOrderIcon();
    }

    @Then("Text {string} should be visible and enabled on screen")
    public void text_should_be_visible_and_enabled_on_screen(String text) {
        ReusableMethods.isTextVisibleAndEnabled(text);
    }

    @When("User selects product for return")
    public void user_selects_product_for_return() {
        ReusableMethods.selectReturnProduct(driver);
    }

    @When("User opens return screen")
    public void user_opens_return_screen() {
        ReusableMethods.openReturnScreen(driver);
    }

    @When("User selects return reason")
    public void user_selects_return_reason() {
        ReusableMethods.selectReturnReason(driver);
    }

    @When("User enters return note {string}")
    public void user_enters_return_note(String note) {
        ReusableMethods.enterReturnNote(driver, note);
    }

    @Then("User taps Request Return button")
    public void user_taps_request_return_button() {
        ReusableMethods.tapRequestReturn(driver);
    }



}














