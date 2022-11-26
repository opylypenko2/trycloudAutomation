package com.trycloud.step_definitions;

import com.trycloud.pages.US12_ContactsPage;
import com.trycloud.pages.US1_LoginPage;
import com.trycloud.utilities.Configuration_Reader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US12_ContactsPage_StepDefs {

    US1_LoginPage loginPage = new US1_LoginPage();

    US12_ContactsPage contactsPage = new US12_ContactsPage();

//    @Given("user on the dashboard page")
//    public void user_on_the_dashboard_page() {
//        Driver.getDriver().get(Configuration_Reader.getProperty("URL"));
//        loginPage.login("user22", "Userpass123");
//        String expectedTitle = "Dashboard";
//        Assert.assertEquals(expectedTitle, Driver.getDriver().getTitle());
//    }

    @When("the user clicks the {string} modules")
    public void the_user_clicks_the_modules(String string) {
        contactsPage.contactsModule.click();
    }

    @Then("verify page title is {string}")
    public void verify_page_title_is(String string) {
        String expectedTitle2 = "Contacts - Trycloud QA";
        Assert.assertEquals(expectedTitle2, Driver.getDriver().getTitle());
    }
}
