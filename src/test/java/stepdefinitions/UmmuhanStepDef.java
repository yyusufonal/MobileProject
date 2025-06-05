package stepdefinitions;

import Page.UmmuhanPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Driver;
import utilities.OptionsMet;
import utilities.ReusableMethods;

public class UmmuhanStepDef {

    UmmuhanPage page = new UmmuhanPage
            (Driver.getAppiumDriver());

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
        ReusableMethods.ekranKaydirmaMethodu(528, 2732, 557, 444, 1000);
        ReusableMethods.wait(2);
        ReusableMethods.ekranKaydirmaMethodu(528, 2732, 557, 444, 1000);
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

    //US_008
    @And("The user clicks the profile icon on the home page")
    public void the_user_clicks_profile_icon() {
        page.profileIcon.click();
    }

    @And("The login options screen is displayed")
    public void the_login_options_screen_is_displayed() {
        Assert.assertTrue( page.signInButton.isDisplayed());
    }

    @And("The user clicks the \"Sign In\" option")
    public void the_user_clicks_sign_in_option() {
        ReusableMethods.wait(2);
        page.signInButton.click();
    }

    @And("The user clicks the \"Use email instead\" option")
    public void the_user_clicks_use_email_instead_option() {
        ReusableMethods.wait(2);
        page.useEmailInsteadButton.click();
    }


    @And("The user logs in with email {string} and password {string}")
    public void the_user_logs_in_with_email_and_password(String email, String password) {
        ReusableMethods.wait(3);
        OptionsMet.clickAndSendKeys(page.emailField, email);
        ReusableMethods.wait(3);
        OptionsMet.clickAndSendKeys(page.passwordField, password);
    }


    @And("The user clicks the \"Remember Me\" checkbox")
    public void the_user_clicks_remember_me_checkbox_if_any() {
        ReusableMethods.wait(2);
        page.rememberImageView.click();

    }

    @And("The user clicks the \"Sign In\" button login")
    public void the_user_clicks_sign_in_button_login() {
        ReusableMethods.wait(2);
        page.loginSignInButton.click();
    }

    @And("I should see the {string} message login")
    @And("I should see the {string} message")
    @And("I should see the {string} error message")
    @And("I should see the {string} warning message")
    public void iShouldSeeTheMessage(String expectedMessage) {
        try {
            Thread.sleep(500);
        } catch (InterruptedException ignored) {}

        boolean isVisible = Driver.getAppiumDriver()
                .findElements(By.xpath("//*[contains(@text, '" + expectedMessage + "')]"))
                .size() > 0;

        assert isVisible;
    }


    @And("The user clicks the {string} button")
    public void theUserClicksTheButton(String buttonName) {
        switch (buttonName.toLowerCase()) {
            case "sign in":
                page.signInButton.click();
                break;
            case "login sign in button":
                page.loginSignInButton.click();
                break;
            default:
                throw new IllegalArgumentException("Button not found: " + buttonName);
        }
    }
    //US_016
    @And("The user logs in successfully and navigates to the homepage")
    public void theUserLogsInSuccessfullyAndNavigatesToTheHomepage() {
        the_user_clicks_profile_icon();
        the_login_options_screen_is_displayed();
        the_user_clicks_sign_in_option();
        the_user_clicks_use_email_instead_option();
        the_user_logs_in_with_email_and_password("ummuhankacmaz.user@querycart.com", "Query.151224");
        the_user_clicks_remember_me_checkbox_if_any();
        the_user_clicks_sign_in_button_login();

        Assert.assertTrue( page.profileIcon.isDisplayed());
    }


    @And("The profile icon should be visible and clickable")
    public void theProfileIconShouldBeVisibleAndClickable() {
        Assert.assertTrue( page.profileIcon.isDisplayed());
        Assert.assertTrue(page.profileIcon.isEnabled());
    }


    @And("The user clicks the profile icon")
    public void theUserClicksTheProfileIcon() {
        page.profileIcon.click();
    }

    @And("The dashboard page should open")
    public void theDashboardPageShouldOpen() {
        ReusableMethods.wait(2);
        Assert.assertTrue(page.secondImageView.isDisplayed());
    }

    @And("The user clicks the my account tab")
    public void theUserClicksTheMyAccountTab() {
        page.myAccountTab.click();
    }

    @And("Total Orders, Total Completed, Total Returned, and Wallet Balance should be visible")
    public void dashboardSummaryWidgetsShouldBeVisible() {
        assert page.totalOrders.isDisplayed();
        assert page.totalCompleted.isDisplayed();
        assert page.totalReturned.isDisplayed();
        assert page.walletBalance.isDisplayed();
    }

    @And("The user sees the {string} section under {string}")
    public void theUserSeesSectionUnderTab(String section, String tab) {
        Assert.assertTrue(page.welcomeMessage.isDisplayed());
    }

    @And("The order history list should be displayed")
    public void theOrderHistoryListShouldBeDisplayed() {
        assert page.orderHistoryList.isDisplayed();
    }

}
