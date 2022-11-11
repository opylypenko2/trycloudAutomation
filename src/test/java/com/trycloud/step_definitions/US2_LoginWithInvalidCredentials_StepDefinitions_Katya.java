package com.trycloud.step_definitions;

import com.trycloud.pages.US1_LoginPage;
import com.trycloud.pages.US2_LoginWithInvalidCredentialsPage_Katya;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Configuration_Reader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class US2_LoginWithInvalidCredentials_StepDefinitions_Katya {
    US1_LoginPage us1_loginPage = new US1_LoginPage();
    US2_LoginWithInvalidCredentialsPage_Katya invalidLogin = new US2_LoginWithInvalidCredentialsPage_Katya();
    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(Configuration_Reader.getProperty("URL"));
    }
    @When("User enters invalid {string} and {string} and clicks login button")
    public void user_enters_invalid_and_and_clicks_login_button(String username, String password) {
        us1_loginPage.login(username,password);
    }
    @Then("verify {string} should be displayed")
    public void verify_should_be_displayed(String message) {
        Assert.assertTrue(invalidLogin.message.getText().equals(message));
    }

}
