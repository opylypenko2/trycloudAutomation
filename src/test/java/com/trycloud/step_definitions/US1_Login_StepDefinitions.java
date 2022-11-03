package com.trycloud.step_definitions;

import com.trycloud.pages.US1_LoginPage;
import com.trycloud.utilities.Configuration_Reader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US1_Login_StepDefinitions {

    US1_LoginPage us1_loginPage_ = new US1_LoginPage();

    @Given("user on the login page")
    public void user_on_the_login_page() {
        Driver.getDriver().get(Configuration_Reader.getProperty("URL"));

    }
    @When("user use username {string} and passcode {string}")
    public void user_use_username_and_passcode(String username, String password) {
        us1_loginPage_.login(username, password);
    }
    @When("user click the login button")
    public void user_click_the_login_button() {
        us1_loginPage_.loginBtn.click();
    }
    @Then("verify the user should be at the dashboard page")
    public void verify_the_user_should_be_at_the_dashboard_page() {

       Assert.assertTrue(Driver.getDriver().getTitle().contains("Dashboard"));
    }
}
