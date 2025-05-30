package stepdefinitions;

import Page.HilalPage;
import Page.YusufPage;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import utilities.ConfigReader;
import utilities.Driver;
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

}
