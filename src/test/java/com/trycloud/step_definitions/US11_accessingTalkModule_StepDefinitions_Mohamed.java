package com.trycloud.step_definitions;

import com.trycloud.pages.US11_accessingTalkModulePage_Mohamed;
import com.trycloud.pages.US1_LoginPage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Configuration_Reader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US11_accessingTalkModule_StepDefinitions_Mohamed {


   US11_accessingTalkModulePage_Mohamed us11_accessingTalkModulePage_mohamed = new US11_accessingTalkModulePage_Mohamed();

    US1_LoginPage us1_loginPage = new US1_LoginPage();



    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {
     Driver.getDriver().get(Configuration_Reader.getProperty("URL"));
     us1_loginPage.login(Configuration_Reader.getProperty("Username"),Configuration_Reader.getProperty("password"));




    }
    @When("the user clicks the {string} module")
    public void the_user_clicks_the_module(String string) {
       us11_accessingTalkModulePage_mohamed.TalkButton.click();


    }
    @Then("verify the page title is {string}")
    public void verify_the_page_title_is(String string) {
     Assert.assertEquals(string,Driver.getDriver().getTitle());

    }


    @When("user search user from the search box")
    public void user_search_user_from_the_search_box() {
     us11_accessingTalkModulePage_mohamed.searchBoxInput.sendKeys("Mike");
     us11_accessingTalkModulePage_mohamed.userMike.click();

    }
    @When("user write a message")
    public void user_write_a_message() {
     us11_accessingTalkModulePage_mohamed.inputMesgBox.sendKeys("hii");

    }
    @When("user clicks to submit button")
    public void user_clicks_to_submit_button() {
     BrowserUtils.sleep(3);
     us11_accessingTalkModulePage_mohamed.submitButtn.click();

    }
    @Then("the user should be able to see the message is displayed on the conversation log")
    public void the_user_should_be_able_to_see_the_message_is_displayed_on_the_conversation_log() {
     Assert.assertTrue(us11_accessingTalkModulePage_mohamed.textMessage.getText().contains("hii"));

    }
}
