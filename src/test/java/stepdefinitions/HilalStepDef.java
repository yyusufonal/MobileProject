package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import org.junit.Assert;
import Page.HilalPage;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.ReusableMethods;
import org.openqa.selenium.WebElement;
import java.lang.reflect.Field;
import utilities.ConfigReader;

public class HilalStepDef {
    HilalPage page = new HilalPage();

    @Given("User opens the application")
    public void openApp() {
        Driver.getAppiumDriver();
        ReusableMethods.wait(5);
    }

    @Given("User signs in with email {string} and password {string}")
    public void loginWithCredentials(String emailKey, String passwordKey) {
        String email = ConfigReader.getProperty(emailKey);
        String password = ConfigReader.getProperty(passwordKey);
        ReusableMethods.userLogin(email, password);
    }

    @And("{string} is visible")
    public void elementIsVisible(String elementName) {
        WebElement element = getElementByName(elementName);
        Assert.assertTrue(element.isDisplayed());
    }

    @And("{string} is click")
    public void elementIsClick(String elementName) {
        WebElement element = getElementByName(elementName);
        element.click();
    }

    @And("{string} is enabled")
    public void elementIsEnabled(String elementName) {
        WebElement element = getElementByName(elementName);
        Assert.assertTrue(element.isEnabled());
    }

    @And("send {string} to {string}")
    public void sendKeysToElement(String text, String elementName) {
        WebElement element = getElementByName(elementName);
        element.click();
        element.clear();
        element.sendKeys(text);
    }

    @And("wait {int} seconds")
    public void waitSeconds(int seconds) {
        ReusableMethods.wait(seconds);
    }

    @And("Scroll the page")
    public void scrollThePage() {
        try {
            // Ekranı aşağı kaydıralım (başlangıç ve bitiş koordinatları)
            ReusableMethods.ekranKaydirmaMethodu(1000, 1000, 500, 500, 1);
            ReusableMethods.wait(2);
        } catch (Exception e) {
            ReusableMethods.ekranKaydirmaMethodu(1000, 1000, 500, 500, 1);
            ReusableMethods.wait(2);
        }
    }

    private WebElement getElementByName(String elementName) {
        try {
            Field field = HilalPage.class.getField(elementName);
            return (WebElement) field.get(page);
        } catch (Exception e) {
            throw new IllegalArgumentException("Element not found: " + elementName);
        }
    }
}