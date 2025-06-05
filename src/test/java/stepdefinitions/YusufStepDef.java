package stepdefinitions;

import Page.HilalPage;
import Page.YusufPage;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.OptionsMet;
import utilities.ReusableMethods;

import static utilities.ReusableMethods.verifySelectedProductInCart;

public class YusufStepDef {
    YusufPage page = new YusufPage(Driver.getAppiumDriver());


    @Given("User logs in with email {string} and password {string}")
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

        WebElement selectedButton = page.getElementByName(button);
        ReusableMethods.click(selectedButton,10);
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
        ReusableMethods.wait(2);
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
        page.cvcTextBox.sendKeys(CVC);
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
                page.isVisible(page.orderConfirmedMessage));

    }

    @Then("fill card information with card number {string}")
    public void fill_card_information_with_card_number(String cardNumber) {
        WebElement textBox = page.getElementByName("cardInformationsTextBox");
        textBox.click();
        ReusableMethods.wait(1);
        textBox.sendKeys(cardNumber);
        ReusableMethods.wait(1);


    }
    @Then("verify that card number, expiration date, CVC and zip are visible")
    public void verify_that_card_number_expiration_date_cvv_and_zip_are_visible() {

        OptionsMet.clickAndVerify(page.cardInformationsTextBox);
        ReusableMethods.wait(1);
        OptionsMet.clickAndVerify(page.monthYearTextBox);
        ReusableMethods.wait(2);
        OptionsMet.clickAndVerify(page.cvcTextBox);
        ReusableMethods.wait(2);
        OptionsMet.clickAndVerify(page.addressZipCodeBox);
        ReusableMethods.wait(1);

    }

    @When("user click {string} button")
    public void user_click_button(String text) {
        ReusableMethods.wait(1);
        ReusableMethods.clickButtonByDescription(text);

    }
    @Then("user click last order's order details button")
    public void user_click_last_order_s_order_details_button() {
        ReusableMethods.wait(3);
        OptionsMet.touchDown(1246,701);
    }


    @Then("click {string} button and verify that the {string} button is visible on the page")
    public void click_button_and_verify_that_the_button_is_visible_on_the_page(String text1, String text2) {
        ReusableMethods.wait(2);
        ReusableMethods.ekranKaydirmaMethodu(653, 2659, 300, 641, 779);
        ReusableMethods.wait(1);
        OptionsMet.clickButtonByDescription(text1);
        ReusableMethods.wait(2);
        OptionsMet.VerifyElementText(text2);

    }

    @Given("scroll to Men's Analog Watch in homepage")
    public void scroll_to_men_s_analog_watch_in_homepage() {
        ReusableMethods.wait(1);
        ReusableMethods.ekranKaydirmaMethodu(743,2246,300,743,1126);
    }
    @Given("verify that favorite button is visible on product and click it")
    public void verify_that_favorite_button_is_visible_on_product_and_click_it() {

        ReusableMethods.wait(1);
        Assert.assertTrue("Favori butonu gözükmüyor",page.favoriteButtonOnProduct.isDisplayed());
        ReusableMethods.wait(1);
        page.favoriteButtonOnProduct.click();

    }
    @Given("verify that product be added to the favorite list")
    public void verify_that_product_be_added_to_the_favorite_list() {

       ReusableMethods.wait(1);
       Assert.assertTrue("Ürün başarıyla eklenemedi",page.addedWishMessage.isDisplayed());
       ReusableMethods.wait(1);

    }

    @Given("verify that the Wishlist button is visible, enabled, and navigates to the correct page when clicked.")
    public void verify_that_the_wishlist_button_is_visible_enabled_and_navigates_to_the_correct_page_when_clicked() {

        OptionsMet.clickAndVerify(page.homepageWishlistButton);
        ReusableMethods.wait(2);
        OptionsMet.VerifyElementText("Wishlist");
        ReusableMethods.wait(1);

    }

    @Then("click favorite button on selected product and click {string} button")
    public void click_favorite_button_on_selected_product_and_click_button(String text) {

        page.favoriteButtonOnProduct.click();
        ReusableMethods.wait(1);
        OptionsMet.clickButtonByDescription(text);
        ReusableMethods.wait(1);

    }
    @Then("verify that added product display on the Wishlist page")
    public void verify_that_added_product_display_on_the_wishlist_page() {

        Assert.assertTrue(page.productInWishlist.isDisplayed());
        ReusableMethods.wait(1);

    }

    @Given("click {string} on homepage")
    public void click_on_homepage(String button) {

        OptionsMet.clickButtonByDescription(button);


    }

    @Then("click favorite button on first product in Wishlist")
    public void click_favorite_button_on_first_product_in_wishlist() {

        page.favoriteButtonOnFirstProductInWishlist.click();
        ReusableMethods.wait(1);

    }
    @Then("verify that product removed on Wishlist successfully")
    public void verify_that_product_removed_on_wishlist_successfully() {

        Assert.assertTrue(page.removedWishMessage.isDisplayed());
        ReusableMethods.wait(1);

    }

    @Given("verify that cart button displayed and active")
    public void verify_that_cart_button_displayed_and_active() {

        OptionsMet.clickAndVerify(page.homepageWishlistButton);
        ReusableMethods.wait(1);
        OptionsMet.VerifyElementText("Shopping Cart");
        ReusableMethods.wait(1);
    }


    @Then("click Men category choose random product,choose color or size and click {string} button")
    public void click_men_category_choose_random_product_choose_color_or_size_and_click_button(String button) throws InterruptedException {

        ReusableMethods.wait(1);
        ReusableMethods.click(page.menCategoryButonu, 10);
        ReusableMethods.wait(1);
        boolean variantSelected = ReusableMethods.selectProductWithAvailableVariant(5);

        if (variantSelected) {
            ReusableMethods.ekranKaydirmaMethodu(635, 2677, 300, 665, 1353);
            ReusableMethods.click(page.addToCartButonu, 10);

        } else {
            throw new RuntimeException("Uygun varyantlı ürün bulunamadı!");
        }


    }

    @Then("click cart button and verify that added product is displayed in cart")
    public void click_cart_button_and_verify_that_product_is_displayed_in_cart() {

        OptionsMet.touchDown(1276,2869);
        ReusableMethods.wait(2);
        verifySelectedProductInCart();

    }

    @Then("click {string} button on added product and verify that that removed from cart")
    public void click_button_on_added_product_and_verify_that_that_removed_from_cart(String button) {

        ReusableMethods.clickButtonByDescription(button);
        ReusableMethods.wait(1);
        ReusableMethods.verifyProductIsNotInCart();


    }

    @Then("click cart button")
    public void click_cart_button() {

        OptionsMet.touchDown(1276,2869);
    }

    @Then("verify that subtotal value is displayed")
    public void verify_that_subtotal_value_is_displayed() {
        ReusableMethods.wait(2);
        ReusableMethods.checkSubtotalVisibilityAndLogValue();

    }

    @Then("verify that the page navigated to is the {string} title in the page")
    public void verify_that_the_page_navigated_to_is_title_in_the_page(String title) {

        ReusableMethods.wait(1);
        OptionsMet.VerifyElementText(title);

    }

    @Then("click logout button")
    public void click_logout_button() {

        OptionsMet.touchDown(281,2707);
    }

    @Given("verify that logout successfully")
    public void verify_that_logout_successfully() {

        ReusableMethods.wait(1);
        Assert.assertTrue(page.logoutMessage.isDisplayed());
    }





}
