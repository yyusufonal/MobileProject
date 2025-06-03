package stepdefinitions;

import Page.CemPage;
import Page.QueryCardPage;
import io.appium.java_client.MobileBy;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
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

    @When("the Shipping&Return button is clicked, the Shipping&Return heading and the shipping and return conditions of the product should be displayed")
    public void theShippingReturnButtonIsClickedTheShippingReturnHeadingAndTheShippingAndReturnConditionsOfTheProductShouldBeDisplayed() {
        ReusableMethods.ekranKaydirmaMethodu(687,2412,300,698,975);
        ReusableMethods.wait(2);
        cemPage.shippingAndReturnTab.click();
        Assert.assertTrue(cemPage.ShippingAndReturnTitle.isDisplayed());
    }

    @And("User adds product to cart and confirms that product can be added")
    public void userAddsProductToCartAndConfirmsThatProductCanBeAdded() {
        ReusableMethods.ekranKaydirmaMethodu(695,2539,300,707,1707);
        cemPage.sizeBtn.click();
        ReusableMethods.wait(1);

        cemPage.addToCartBtn.click();
        Assert.assertTrue(cemPage.succesProductCartAdded.isDisplayed());

    }

    @And("User adds the product to favorites and confirms that the product has been added to favorites")
    public void userAddsTheProductToFavoritesAndConfirmsThatTheProductHasBeenAddedToFavorites() {
        cemPage.favoriteBtn.click();
        Assert.assertTrue(cemPage.succesWishListAdded.isDisplayed());
    }

    @Then("filtering icons such as {string}, {string}, {string} and {string} should be visible")
    public void filteringIconsSuchAsAndShouldBeVisible(String filter1, String filter2, String filter3, String filter4) {

        cemPage.filterIcon.click();
        ReusableMethods.wait(1);

        List<String> filters = Arrays.asList(filter1, filter2, filter3, filter4);

        for (String filter : filters) {
            WebElement filterElement = Driver.getAppiumDriver().findElement(
                    MobileBy.AndroidUIAutomator("new UiSelector().description(\"" + filter + "\")")
            );
            Assert.assertTrue("Filter not visible: " + filter, filterElement.isDisplayed());
            Assert.assertTrue("Filter not visible: " + filter, filterElement.isEnabled());
        }
    }

    @Then("the {string} filter options such as {string}, {string}, {string}, and {string} should be visible and enabled")
    public void theFilterOptionsSuchAsAndShouldBeVisibleAndEnabled(String filterGroup, String opt1, String opt2, String opt3, String opt4) {
        cemPage.sortBy.click();
        List<String> options = Arrays.asList(opt1, opt2, opt3, opt4);
        for (String option : options) {
            WebElement optionElement = Driver.getAppiumDriver().findElement(
                    MobileBy.AndroidUIAutomator("new UiSelector().description(\"" + option + "\")")
            );
            Assert.assertTrue("Filter option not visible: " + option, optionElement.isDisplayed());
            Assert.assertTrue("Filter option not enabled: " + option, optionElement.isEnabled());
        }
    }

    @Then("the {string} filter image options should be visible and enabled")
    public void theFilterImageOptionsShouldBeVisibleAndEnabled(String filterName) {
        cemPage.sortBy.click();
        OptionsMet.clickButtonByDescription(filterName);
        ReusableMethods.wait(1);

        for (int i = 3; i <= 15; i++) {
            WebElement brandOption = Driver.getAppiumDriver().findElement(
                    MobileBy.AndroidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(" + i + ")")
            );
            Assert.assertTrue("Brand option not visible: instance " + i, brandOption.isDisplayed());
            Assert.assertTrue("Brand option not enabled: instance " + i, brandOption.isEnabled());
        }
    }

    @Then("the {string} filter options should be visible and enabled")
    public void theFilterOptionsShouldBeVisibleAndEnabled(String filterName) {
        cemPage.Brands.click();
        OptionsMet.clickButtonByDescription(filterName);
        for (int i = 4; i <= 7; i++) {
            WebElement sizeOption = Driver.getAppiumDriver().findElement(
                    MobileBy.AndroidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(" + i + ")")
            );
            Assert.assertTrue("Size option not visible: instance " + i, sizeOption.isDisplayed());
            Assert.assertTrue("Size option not enabled: instance " + i, sizeOption.isEnabled());
        }
    }


    @Then("the {string} filterr options should be visible and enabled")
    public void theFilterrOptionsShouldBeVisibleAndEnabled(String filterName) {
        OptionsMet.clickButtonByDescription(filterName);

        for (int i = 5; i <= 10; i++) {
            WebElement colorOption = Driver.getAppiumDriver().findElement(
                    MobileBy.AndroidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(" + i + ")")
            );
            Assert.assertTrue("Color option not visible: instance " + i, colorOption.isDisplayed());
            Assert.assertTrue("Color option not enabled: instance " + i, colorOption.isEnabled());
        }
    }
}
