package com.trycloud.step_definitions;

import com.trycloud.pages.US1_LoginPage;
import com.trycloud.pages.US9_CommentingToFilesOrFoldersPage_Fiby;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Configuration_Reader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US9_CommentingToFilesOrFolders_StepDefinitions_Fiby {

    US1_LoginPage us1_loginPage = new US1_LoginPage();
    US9_CommentingToFilesOrFoldersPage_Fiby us9_commentingToFilesOrFoldersPage_fiby = new US9_CommentingToFilesOrFoldersPage_Fiby();


    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {
        Driver.getDriver().get(Configuration_Reader.getProperty("URL"));
        us1_loginPage.login("user22", "Userpass123");
    }

    @When("the user clicks the Files module")
    public void the_user_clicks_the_files_module() {
        us9_commentingToFilesOrFoldersPage_fiby.filesModule.click();
    }

    @When("user click action-icon from any file on the page")
    public void user_click_action_icon_from_any_file_on_the_page() {
        BrowserUtils.sleep(2);
        us9_commentingToFilesOrFoldersPage_fiby.actionIcon.click();
    }

    @When("user choose the Details option")
    public void user_choose_the_details_option() {
        us9_commentingToFilesOrFoldersPage_fiby.detailsOption.click();
        us9_commentingToFilesOrFoldersPage_fiby.commentsTab.click();
    }

    @When("user write a comment inside the input box")
    public void user_write_a_comment_inside_the_input_box() {
        us9_commentingToFilesOrFoldersPage_fiby.inputBox.sendKeys("Hello");
    }

    @When("user write a {string} inside the input box")
    public void user_write_a_inside_the_input_box(String string) {
        us9_commentingToFilesOrFoldersPage_fiby.inputBox.sendKeys(string);
    }


    @When("user click the submit button to post it")
    public void user_click_the_submit_button_to_post_it() {
        us9_commentingToFilesOrFoldersPage_fiby.submitButton.click();
    }


    @Then("Verify the comment is displayed in the comment section.")
    public void verify_the_comment_is_displayed_in_the_comment_section() {
        String actual = us9_commentingToFilesOrFoldersPage_fiby.commentSection.getText();
       Assert.assertTrue(actual.contains("Hello"));

        //Assert.assertTrue("Title verification is failed!",actual.contains("Hello"));
    }

    @Then("Verify the {string} is displayed in the comment section.")
    public void verify_the_is_displayed_in_the_comment_section(String string) {
        BrowserUtils.sleep(1);
        String actual = us9_commentingToFilesOrFoldersPage_fiby.commentSection.getText();
        //Assert.assertTrue(actual.contains(string));

        Assert.assertTrue("Title verification is failed!",actual.contains(string));
    }
}
