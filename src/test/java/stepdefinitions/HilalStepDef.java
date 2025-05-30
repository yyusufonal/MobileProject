package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import Page.HilalPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class HilalStepDef {
    HilalPage page =new HilalPage();

    @Given("User opens the application")
    public void openApp() {
        Driver.getAppiumDriver();
    }
}
