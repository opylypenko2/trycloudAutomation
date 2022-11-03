package com.trycloud.utilities;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class BrowserUtils {
    // Methods are static because we do not want to create an object to call those methods
    // We just want to call them with class name.


    // This method is used to pause the code for given seconds.
    // It is static method, we can call it with class name: BrowserUtils.sleep(3);
    public static void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("Exception happened in sleep method");
        }
    }

    // Method info:
    //• Name: verifyTitle()
    //• Return type: void
    //• Arg1: WebDriver driver
    //• Arg2: String expectedTitle

    // to call this method: BrowserUtils.verifyTitle(driver, "Google")
    public static void verifyTitle(String expectedTitle) {
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle, actualTitle); // different from TestNG where actual comes first then expected --> (actualTitle,expectedTitle)
    }

    public static void waitForInvisibilityOf(WebElement element) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 15);
        wait.until(ExpectedConditions.invisibilityOf(element));
    }


    /* This method will accept dropdown as a WebElement and return all the options as a List of String
     @return type List<String>
     */
    public static List<String> dropdownOptionsAsString(WebElement dropdown) {

        Select select = new Select(dropdown);

        // List of all ACTUAL month <options> as a WebElement
        List<WebElement> actualOptionsWebElement = select.getOptions();

        // List of all ACTUAL month options as a String
        List<String> actualOptionsString = new ArrayList<>();

        // with using for loop we will convert each WebElement of options to String with using getText() method
        // with using add() method we will add each String option in List<String> actual options as String
        for (WebElement each : actualOptionsWebElement) {
            actualOptionsString.add(each.getText());
        }

        return actualOptionsString;
    }


    /**
     * This method will accept a group of radio buttons as a List<WebElement>
     * it will loop through the List, and click to the radio button with provided attribute value
     * @param radioButtons
     * @param attributeValue
     */
    public static void clickRadioButton(List<WebElement> radioButtons, String attributeValue) {

        for (WebElement each : radioButtons) {
            if (each.getAttribute("value").equalsIgnoreCase(attributeValue)) {
                each.click();
            }
        }

    }
}
