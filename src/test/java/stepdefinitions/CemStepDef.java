package stepdefinitions;

import Page.CemPage;
import Page.QueryCardPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import utilities.OptionsMet;
import utilities.ReusableMethods;

import javax.sound.midi.InvalidMidiDataException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static utilities.Driver.getAppiumDriver;
import static utilities.OptionsMet.clickButtonByDescription;

public class CemStepDef extends OptionsMet {

    CemPage cemPage = new CemPage();

    @When("the user clicks on the product named Flower Print Foil T-shirt")
    public void theUserClicksOnTheProductNamedFlowerPrintFoilTShirt() {
        cemPage.firstProduct.click();
        ReusableMethods.wait(3);
    }

    @Then("the user should be navigated to the product detail page")
    public void the_user_should_be_navigated_to_the_product_detail_page() {
        ReusableMethods.wait(3);
        Assert.assertTrue(cemPage.detailTitle.isDisplayed());
    }


}
