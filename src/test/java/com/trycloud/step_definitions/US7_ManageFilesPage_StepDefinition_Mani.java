package com.trycloud.step_definitions;

import com.trycloud.pages.US1_LoginPage;
import com.trycloud.pages.US7_ManageFilesPage_Mani;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Configuration_Reader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;


public class US7_ManageFilesPage_StepDefinition_Mani {

       US7_ManageFilesPage_Mani filesPage = new US7_ManageFilesPage_Mani();
       US1_LoginPage us1_loginPage = new US1_LoginPage();

    //TC1 _________________________________________________________________________
//    @Given("user on the dashboard page")
//    public void user_on_the_dashboard_page() {
//        Driver.getDriver().get(Configuration_Reader.getProperty("URL"));
//        us1_loginPage.login("User22", "Userpass123");
//
//    }
//    @When("the user clicks the {string} module")
//    public void the_user_clicks_the_module(String string) {
//        filesPage.filesModule.click();
//    }
    @When("user clicks the add icon on the top")
    public void user_clicks_the_add_icon_on_the_top() {
        filesPage.addIcon.click();
    }
    @When("user click {string}")
    public void user_click(String string) {
        filesPage.newFolderIcon.click();
    }
    @When("user write a folder name")
    public void user_write_a_folder_name() {
        filesPage.newFolderInput.sendKeys("folderMani1");
    }
    @When("the user click submit icon")
    public void the_user_click_submit_icon() {
        filesPage.submitBtn.click();
    }
    @Then("Verify the {string} is displayed on the page")
    public void verify_the_is_displayed_on_the_page(String string) {

        BrowserUtils.sleep(3);
        for (WebElement eachFolder : filesPage.fileAndFoldersList) {
            System.out.println(eachFolder.getText());

        }
        boolean isFolderExists = false;
        for (WebElement each : filesPage.fileAndFoldersList) {
            if (each.getText().equals("folderMani1")) {
                isFolderExists = true;

                BrowserUtils.sleep(3);
                filesPage.deleteFolder(each);
                BrowserUtils.sleep(3);

            }
        }
        Assert.assertTrue(isFolderExists);
    }

   //TC2 _________________________________________________________________________________
    @When("user choose a folder from the page")
    public void user_choose_a_folder_from_the_page() {

        filesPage.firstFolder.click();
        BrowserUtils.sleep(3);

    }

    String expectedFileName = "TryCloud-BDD_cucumber_Assignment_";
    @When("the user uploads a file with the upload file option")
    public void the_user_uploads_a_file_with_the_upload_file_option() {

        BrowserUtils.sleep(3);
        filesPage.inputButton.sendKeys("C:\\Users\\manin\\OneDrive\\Desktop\\TryCloud-BDD_cucumber_Assignment_.pdf");

        filesPage.addIcon.click();
        BrowserUtils.sleep(3);


    }
    @Then("Verify that the file is displayed on the page")
    public void verify_that_the_file_is_displayed_on_the_page() {

        filesPage.verifyFileName(filesPage.fileName, expectedFileName);

    }

}
