package stepdefinitions;

import Page.BasePage;
import Page.SeyyidPage;
import Page.YusufPage;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.Driver;
import utilities.OptionsMet;
import utilities.ReusableMethods;


import static utilities.ReusableMethods.selectFromDropdownByContentDesc;

public class SeyyidStepDef  {

	SeyyidPage page = new SeyyidPage(Driver.getAppiumDriver());

	@Then("test the visibility of the {string} link")
	public void test_the_visibility_of_the_link(String string) {

		OptionsMet.VerifyElementText(string);

	}

	@Then("click the {string} link")
	public void click_the_link(String string) {
		OptionsMet.clickButtonByDescription(string);
	}
	@Then("test the visibility of the {string} text")
	public void test_the_visibility_of_the_text(String string) {
		ReusableMethods.wait(3);
		OptionsMet.VerifyElementText(string);
	}

	@Then("test the visibility of the {string} on the screen")
	public void test_the_visibility_of_the_on_the_screen(String button) {
		WebElement searchButton = page.getElementByName(button);
		Assert.assertTrue("button is unseen", searchButton.isDisplayed());
	}

	@Then("type Women Snow Boots to the search button and click")
	public void type_women_snow_boots_to_the_search_button_and_click() {
		page.searchButton.click();
		ReusableMethods.wait(2);
		OptionsMet.clickAndSendKeys(page.searchAramaKismi, "Women Snow Boots");
		ReusableMethods.wait(2);
		OptionsMet.touchDown(993, 2187);
		ReusableMethods.wait(2);

	}


	@Then("type iki tane bounty to the search button and click")
	public void type_iki_tane_bounty_to_the_search_button_and_click() {
		page.searchButton.click();
		ReusableMethods.wait(2);
		OptionsMet.clickAndSendKeys(page.searchAramaKismi, "İki tene bounty");
		ReusableMethods.wait(2);
		OptionsMet.touchDown(993, 2187);
		ReusableMethods.wait(2);// Write code here that turns the phrase above into concrete actions
	}

	@Then("test the visbility of the created adress")
	public void test_the_visbility_of_the_created_adress() {

		Assert.assertTrue("adress is unseen", page.seyyidAdressName.isDisplayed());

	}

	@Then("test the visibility of the edit button")
	public void test_the_visibility_of_the_edit_button() {
		Assert.assertTrue("edit button is unseen", page.editButton.isDisplayed());
	}

	@Then("click the delete button")
	public void click_the_delete_button() {
		page.deleteButton.click();
	}

	@Then("crete a new adress")
	public void crete_a_new_adress() {

		ReusableMethods.Address("Seyyid","seyyidefekaraman47@gmail.com","5555555555","Japan","Tokyo","Adachi Ku","5555","5555");

	}
	@Then("clicks the flower Print Tshirt")
	public void clicks_the_flower_print_tshirt() {
		page.flowerTshirt.click();
	}
	@Then("scrols down the page")
	public void scrols_down_the_page() {
		ReusableMethods.ekranKaydirmaMethodu(463,1763,200,495,1296);
	}
	@Then("click the right bottom chart button")
	public void click_the_right_bottom_chart_button() {
		page.rightBottomChart.click();
	}

	@Then("click the {string} links")
	public void click_the_links(String string) {
		ReusableMethods.wait(2);
		OptionsMet.clickButtonByDescription(string);
		ReusableMethods.wait(2);
	}

	@Then("click the eddit button")
	public void click_the_eddit_button() {
		page.editButton.click();
	}
	@Then("scroll down the page")
	public void scroll_down_the_page() {
		ReusableMethods.ekranKaydirmaMethodu(521,1421,200,533,1073);
	}
	@Then("click the adress name")
	public void click_the_adress_name() {
		page.seyyidAdressName.click();
	}

	@Then("click the back button")
	public void click_the_back_button() {
		page.backButton.click();
	}

	@Then("test the visibility of the Success Address Added Successfully! text")
	public void test_the_visibility_of_the_success_address_added_successfully_text() {
		page.successNewAdressMessage.isDisplayed();
	}

	@Then("test the visbility of the upsdated adress")
	public void test_the_visbility_of_the_upsdated_adress() {
		page.successUpdate.isDisplayed();
	}








}
