package stepdefinitions;

import Page.YusufPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.ConfigReader;
import utilities.ReusableMethods;

public class YusufStepDef {
    YusufPage page = new YusufPage();


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


    }
}
