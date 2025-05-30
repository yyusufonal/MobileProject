package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import org.junit.Assert;
import Page.HilalPage;
import utilities.Driver;
import utilities.ReusableMethods;
import org.openqa.selenium.WebElement;
import java.lang.reflect.Field;

public class HilalStepDef {
    HilalPage page = new HilalPage();

    @Given("User opens the application")
    public void openApp() {
        Driver.getAppiumDriver();
        ReusableMethods.wait(5);
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

    @And("{string} is disabled")
    public void elementIsDisabled(String elementName) {
        WebElement element = getElementByName(elementName);
        Assert.assertFalse(element.isEnabled());
    }

    @And("{string} text is {string}")
    public void elementTextIs(String elementName, String expectedText) {
        WebElement element = getElementByName(elementName);
        Assert.assertEquals(expectedText, element.getText());
    }

    @And("{string} contains text {string}")
    public void elementContainsText(String elementName, String expectedText) {
        WebElement element = getElementByName(elementName);
        Assert.assertTrue(element.getText().contains(expectedText));
    }

    @And("clear {string}")
    public void clearElement(String elementName) {
        WebElement element = getElementByName(elementName);
        element.clear();
    }

    @And("send {string} to {string}")
    public void sendKeysToElement(String text, String elementName) {
        WebElement element = getElementByName(elementName);
        element.clear();
        element.sendKeys(text);
    }

    @And("wait {int} seconds")
    public void waitSeconds(int seconds) {
        ReusableMethods.wait(seconds);
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
