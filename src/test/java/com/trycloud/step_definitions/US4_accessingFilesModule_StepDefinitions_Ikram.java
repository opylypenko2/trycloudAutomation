package com.trycloud.step_definitions;

import com.trycloud.pages.US1_LoginPage;
import com.trycloud.pages.US4_accessingFilesModulePage_Ikram;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Configuration_Reader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class US4_accessingFilesModule_StepDefinitions_Ikram {

    US1_LoginPage US1_loginPage = new US1_LoginPage();
    US4_accessingFilesModulePage_Ikram US4_accessingFilesModulepage_ikram = new US4_accessingFilesModulePage_Ikram();

    @Given("user on the dashboard page")

    public void user_on_the_dashboard_page() {
        Driver.getDriver().get(Configuration_Reader.getProperty("URL"));
        US1_loginPage.login("User22", "Userpass123");
    }

//    @When("the user clicks the {string} module")
//    public void the_user_clicks_the_module(String string) {
//
//        US4_accessingFilesModulepage_ikram.filesIcon.click();
//        BrowserUtils.sleep(10);
//
//    }

    @Then("verify the page title is {string}")
    public void verifyThePageTitleIs(String arg0) {
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals("Files - Trycloud QA", actualTitle);
    }


    @When("user click the top-left checkbox of the table")
    public void user_click_the_top_left_checkbox_of_the_table() {

        //WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        //wait.until(ExpectedConditions.elementToBeClickable(US4_accessingFilesModulepage_ikram.plusCheckBox));
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(US4_accessingFilesModulepage_ikram.plusCheckBox).click();
        //US4_accessingFilesModulepage_ikram.plusCheckBox.click();

    }

    @Then("verify all the files are selected")
    public void verify_all_the_files_are_selected() {
        for (WebElement each : US4_accessingFilesModulepage_ikram.nameCheckboxes) {
            each.isSelected();
        }

    }


}
