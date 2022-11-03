package com.trycloud.step_definitions;

import com.trycloud.utilities.Configuration_Reader;
import com.trycloud.utilities.Driver;
import com.trycloud.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    // @Before
    public void setupScenario() {
        System.out.println("Setting up browser using cucumber @Before each scenario");
        Driver.getDriver().get(Configuration_Reader.getProperty("URL")); // you can use it only if you are using the same url for all scenarios
    }

    @After // after scenario
    public void teardownScenario(Scenario scenario) {
        // We will implement taking screenshot in this method
        // System.out.println("Closing browser using cucumber @After each scenario");

        // (TakesScreenshot)Driver.getDriver() --> DOWNCASTING our driver instance (which has a WebDriver interface reference type) to TakesScreenshot interface to be able to access TakesScreenshot interface's .getScreenshotAs() method

        if (scenario.isFailed()) {

            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }

        Driver.closeDriver();
    }


    // @Before(value = "@login", order = 2)
    public void setupForLogin() {
        // if you want any code to run before any specific feature/scenario, you can use value = "@tagname" to determine this
        System.out.println("Setting up browser using cucumber @Before @login scenario");
    }

    // @Before(value = "@db", order = 3)
    public void setupDatabaseScenario() {

    }

    //@BeforeStep
    public void setupScenarioStep() {
        System.out.println("Setting up browser using cucumber @Before each scenario step");
    }

    // @BeforeStep
    public void setupScenarioStepForLogin() {
        System.out.println("Setting up browser using cucumber @Before each scenario step for login");
    }

}
