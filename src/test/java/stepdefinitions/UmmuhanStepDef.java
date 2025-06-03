package stepdefinitions;

import Page.UmmuhanPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import utilities.Driver;
import utilities.ReusableMethods;

public class UmmuhanStepDef {

    UmmuhanPage page = new UmmuhanPage(Driver.getAppiumDriver());

    //US_001
    @Given("The application is opened")
    public void the_application_is_opened() {
        Driver.getAppiumDriver();
        ReusableMethods.wait(2);
    }

    @And("The user navigates to the home page")
    public void the_user_navigates_to_the_home_page() {
    }

    @And("The home page should be visible")
    public void the_home_page_should_be_visible() {
        Assert.assertTrue(page.homeLogo.isDisplayed());
    }

    //US_005
    @And("The {string} title should be visible")
    public void the_title_should_be_visible(String title) {
        ReusableMethods.wait(2);
        ReusableMethods.ekranKaydirmaMethodu(528,2732,557,444,1000);
        ReusableMethods.wait(2);
        ReusableMethods.ekranKaydirmaMethodu(528,2732,557,444,1000);
        Assert.assertTrue(page.popularBrands.isDisplayed());
    }

    @And("The list of popular brands should be visible")
    public void the_list_of_popular_brands_should_be_visible() {
        ReusableMethods.wait(2);
        Assert.assertTrue(page.blossomBoutique.isDisplayed());
        Assert.assertTrue(page.nikeBrand.isDisplayed());
        Assert.assertTrue(page.drMartensBrand.isDisplayed());
        Assert.assertTrue(page.clarksBrand.isDisplayed());
    }
}
