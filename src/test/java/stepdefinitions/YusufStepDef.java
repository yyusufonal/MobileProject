package stepdefinitions;

import Page.HilalPage;
import Page.YusufPage;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.OptionsMet;
import utilities.ReusableMethods;

public class YusufStepDef {
    YusufPage page = new YusufPage(Driver.getAppiumDriver());


    @Given("Given User logs in with email {string} and password {string}")
    public void given_user_logs_in_with_email_and_password(String email, String password) {
       ReusableMethods.userLogin(email,password);
    }

    @Then("choose Canvas Backpack for Men Zipper Rucksacks in men category")
    public void choose_canvas_backpack_for_men_zipper_rucksacks_in_men_category() {
        page.menCategoryButonu.click();
        ReusableMethods.wait(2);
        ReusableMethods.ekranKaydirmaMethodu(687,2412,300,698,975);
        ReusableMethods.wait(2);
        page.canvasBackpackButonu.click();
        ReusableMethods.wait(2);


    }
    @When("choose color,add to cart and click cart button")
    public void choose_color_add_to_cart_and_click_cart_button() {

        page.backpackColorButonu.click();
        ReusableMethods.wait(1);
        ReusableMethods.ekranKaydirmaMethodu(635,2677,200,665,1353);
        ReusableMethods.wait(2);
        page.addToCartButonu.click();
        ReusableMethods.wait(1);
        page.CartButonu.click();
        ReusableMethods.wait(2);

    }
    @When("click {string}")
    public void click(String button) {

        WebElement proceedToCheckout = page.getElementByName(button);
        proceedToCheckout.click();
        ReusableMethods.wait(2);


    }

    @When("add new address")
    public void add_new_address() {
        ReusableMethods.addAddress("Yusuf Onal","yusufonal.user@querycart.com","5555555555","Turkey",
                "Istanbul Province","Esenyurt","34500","Guzelyurt Street");

    }

    @Then("select address and click {string}")
    public void select_address_and_click(String selectedButton) {

        OptionsMet.touchDown(138,880);
        ReusableMethods.wait(2);
        ReusableMethods.ekranKaydirmaMethodu(755,2318,200,761,1629);
        ReusableMethods.wait(1);
        WebElement saveAndPay =page.getElementByName(selectedButton);
        saveAndPay.click();
        ReusableMethods.wait(2);


    }

    @Then("verify that {string} option is visible")
    public void verify_that_option_is_visible(String text) {

        OptionsMet.VerifyElementText(text);

    }

    @Given("user select {string} option and click {string}")
    public void user_select_option_and_click(String stripe, String confirmOrder) {

        OptionsMet.clickButtonByDescription(stripe);
        ReusableMethods.wait(1);
        OptionsMet.clickButtonByDescription(confirmOrder);
        ReusableMethods.wait(5);

    }
    @Then("fill card information with card number {string},month and year {string},CVC {string},zip {string} and click {string}")
    public void fill_card_information_with_card_number_month_and_year_cvc_zip_and_click(String cardNumber, String monthYear, String CVC, String zip, String confirm) {


    WebElement textBox = page.getElementByName("cardInformationsTextBox");
        textBox.click();
        ReusableMethods.wait(1);


        textBox.sendKeys(cardNumber);
        ReusableMethods.wait(1);
        page.monthYearTextBox.sendKeys(monthYear);
        ReusableMethods.wait(1);
        page.CVCTextBox.sendKeys(CVC);
        ReusableMethods.wait(1);
        page.cardZipTextBox.sendKeys(zip);
        ReusableMethods.wait(1);
        OptionsMet.hideKeyboard();
        ReusableMethods.wait(1);

        WebElement button = page.getElementByName(confirm);
        ReusableMethods.wait(1);
        button.click();
        ReusableMethods.wait(8);


    }
    @Then("verify that order confirmed message is visible")
    public void verify_that_order_confirmed_message_is_visible() {

        Assert.assertTrue("Order confirmation message is not visible",
                page.isOrderConfirmedMessageVisible());

    }




}
