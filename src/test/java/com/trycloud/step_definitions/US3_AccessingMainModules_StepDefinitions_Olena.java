package com.trycloud.step_definitions;

import com.trycloud.pages.US1_LoginPage;
import com.trycloud.pages.US3_BasePage_AccessingMainModules_Olena;
import com.trycloud.utilities.Configuration_Reader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

public class US3_AccessingMainModules_StepDefinitions_Olena {

    US1_LoginPage us1_loginPage = new US1_LoginPage();
    US3_BasePage_AccessingMainModules_Olena us3_basePage = new US3_BasePage_AccessingMainModules_Olena();
    Actions actions = new Actions(Driver.getDriver());

    @When("users log in with valid credentials")
    public void users_log_in_with_valid_credentials() {

        us1_loginPage.login(Configuration_Reader.getProperty("username"), Configuration_Reader.getProperty("password"));
    }

    @Then("Verify the user see the following modules:")
    public void verify_the_user_see_the_following_modules(List<String> expectedMainModulesText) {
        List<String> actualMainModulesText = new ArrayList<>();

        for (WebElement eachMainModule : us3_basePage.actualMainModules) {

            actions.moveToElement(eachMainModule).perform();
            String moduleName = eachMainModule.getText();
            actualMainModulesText.add(moduleName);
        }

        Assert.assertEquals("Not all main modules are displayed", expectedMainModulesText, actualMainModulesText);
    }
}
