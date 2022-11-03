package com.trycloud.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

    // Creating a private constructor, so we are closing access to the object of this class from outside classes
    private Driver() {
    }

    // Making our 'driver' instance private, so that it is not reachable from outside this class.
    // We make it static, because we want it to run before anything else, also we'll use it in a static method

    private static InheritableThreadLocal<WebDriver> driverPool = new InheritableThreadLocal<>(); // value is null by default

    // creating a reusable utility method which will return the same single driver instance when we call it
    public static WebDriver getDriver() {

        if (driverPool.get() == null) { // if driver/browser was never opened

            String browserType = Configuration_Reader.getProperty("browser");

            // Depending on the browserType our switch statement will determine which browser to open
            switch (browserType) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driverPool.set(new ChromeDriver());
                    driverPool.get().manage().window().maximize();
                    driverPool.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;

                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driverPool.set(new FirefoxDriver());
                    driverPool.get().manage().window().maximize();
                    driverPool.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;

                case "safary":
                    WebDriverManager.safaridriver().setup();
                    driverPool.set(new SafariDriver());
                    driverPool.get().manage().window().maximize();
                    driverPool.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;
            }
        }
        // Same driver instance will be returned every time we call Driver.getDriver() method
        return driverPool.get();
    }

    // This method will make sure our driver value is always null after using quit() method
    public static void closeDriver() {
        if (driverPool.get() != null) {
            driverPool.get().quit(); // this line will terminate the existing session, driver value will not even be null yet
            driverPool.remove();
        }
    }
}
