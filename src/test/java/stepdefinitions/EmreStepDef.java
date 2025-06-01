package stepdefinitions;

import Page.EmrePage;
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


public class EmreStepDef {
    EmrePage page = new EmrePage(Driver.getAppiumDriver());
    YusufPage yusufPage;
    HilalPage hilalPage;

    @Then("choose Adidas 3-Stripes Cushioned Crew Socks in men category")
    public void chooseAdidascoprainmencategory(){
        page.menCateButonu.click();
        ReusableMethods.wait(2);
        page.adidasCopraButonu.click();
        ReusableMethods.wait(2);
        ReusableMethods.ekranKaydirmaMethodu(779,2234,300,779,1114);
    }



    @When("User selects a color option")
    public void userselectsacoloroption() {

        page.copraColorButonu.click();
        ReusableMethods.wait(1);
        page.copraColor2Butonu.click();
    }

    @When("Guest choose black color")
            public void guestchooseblack() {
            page.copraColorButonu.click();


    }

    @When("Guest click cart buton")
        public void guestclickcartbuton(){
        page.Cartbuton.click();
    }

    @When("User click WishList")
    public void userclickwish(){
        page.DilekKutusu.click();
    }

    @Then("User click fav buton")
    public void userclickfav(){
        page.Favbuton.click();
    }
}














