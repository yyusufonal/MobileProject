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


    @Then("the user should see {string}, {string}, {string}, and {string} sections")
    public void theUserShouldSeeAndSections(String Details, String Videos, String Review, String ShippingReturn) {
        ReusableMethods.ekranKaydirmaMethodu(687,2412,300,698,975);
        Assert.assertTrue(cemPage.Review.isDisplayed());
        Assert.assertTrue(cemPage.Details.isDisplayed());
        Assert.assertTrue(cemPage.Videos.isDisplayed());
        Assert.assertTrue(cemPage.shippingAndReturnTab.isDisplayed());

        Assert.assertTrue(cemPage.Review.isEnabled());
        Assert.assertTrue(cemPage.Details.isEnabled());
        Assert.assertTrue(cemPage.Videos.isEnabled());
        Assert.assertTrue(cemPage.shippingAndReturnTab.isEnabled());
    }

    @When("you click on the Details button, the Product Details title and product information should be displayed.")
    public void youClickOnTheDetailsButtonTheProductDetailsTitleAndProductInformationShouldBeDisplayed() {
        ReusableMethods.ekranKaydirmaMethodu(687,2412,300,698,975);
        ReusableMethods.wait(2);
        cemPage.Details.click();
        Assert.assertTrue(cemPage.productDetailTitle.isDisplayed());
        System.out.println("Product Details İçeriği Aktif");
    }

    @When("clicking the Videos button, the Product Videos title and product videos should be displayed")
    public void clickingTheVideosButtonTheProductVideosTitleAndProductVideosShouldBeDisplayed() {
        ReusableMethods.ekranKaydirmaMethodu(687,2412,300,698,975);
        ReusableMethods.wait(2);
        cemPage.Videos.click();
        Assert.assertTrue(cemPage.VideosTitle.isDisplayed());
        System.out.println("Video Başlığı görünür durumda");
    }

    @When("the Review button is clicked, the Review title and reviews of the product should be displayed")
    public void theReviewButtonIsClickedTheReviewTitleAndReviewsOfTheProductShouldBeDisplayed() {
        ReusableMethods.ekranKaydirmaMethodu(687,2412,300,698,975);
        ReusableMethods.wait(2);
        cemPage.Review.click();
        Assert.assertTrue(cemPage.ProductReviews.isDisplayed());
    }
}
