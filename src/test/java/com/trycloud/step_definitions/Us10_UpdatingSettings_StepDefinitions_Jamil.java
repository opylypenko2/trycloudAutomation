package com.trycloud.step_definitions;

import com.trycloud.pages.Us10_UpdatingSettingsPage_Jamil;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Configuration_Reader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class Us10_UpdatingSettings_StepDefinitions_Jamil {

    US1_Login_StepDefinitions us1_login_stepDefinitions = new US1_Login_StepDefinitions();
    Us10_UpdatingSettingsPage_Jamil us10_updatingSettingsPage_jamil = new Us10_UpdatingSettingsPage_Jamil();
    @Given("user on the dashboard pagee")
    public void user_on_the_dashboard_pagee() {
        us1_login_stepDefinitions.user_on_the_login_page();
        us1_login_stepDefinitions.userEntersUsernameAndPasscodeAndClicksTheLoginButton(Configuration_Reader.getProperty("username"),Configuration_Reader.getProperty("password"));
    }
    @When("the user clicks the Files modulee")
    public void the_user_clicks_the_modulee() {
//        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
      //  BrowserUtils.waitForVisibilityOf(us10_updatingSettingsPage_jamil.filesButton);
        us10_updatingSettingsPage_jamil.filesButton.click();
    }
    @When("user clicks Settings on the left bottom cornerr")
    public void user_clicks_settings_on_the_left_bottom_cornerr() {
//        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
      //  BrowserUtils.waitForVisibilityOf(us10_updatingSettingsPage_jamil.settingsButton);
        us10_updatingSettingsPage_jamil.settingsButton.click();
    }
    @Then("the user should be able to click any buttonss")
    public void the_user_should_be_able_to_click_any_buttonss() {
        BrowserUtils.sleep(2);
        for (WebElement each : us10_updatingSettingsPage_jamil.list()){
            each.click();
        }
    }
    String storageBeforeUpload;
    @When("user checks the current storage usagee")
    public void user_checks_the_current_storage_usagee() {
         storageBeforeUpload = us10_updatingSettingsPage_jamil.storage.getText();
    }

    @When("user uploads file with the upload file optionn")
    public void user_uploads_file_with_the_upload_file_optionn() {
        us10_updatingSettingsPage_jamil.plusButton.click();
        us10_updatingSettingsPage_jamil.uploadFileButton.click();
        BrowserUtils.sleep(5);
        //Driver.getDriver().manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        //us10_updatingSettingsPage_jamil.uploadFileButton.sendKeys("C:\\Users\\jdaot\\OneDrive\\Desktop\\Selenium\\Screenshot.png");
        us10_updatingSettingsPage_jamil.inputFile.sendKeys("C:\\Users\\jdaot\\OneDrive\\Desktop\\Selenium\\Screenshot.png");
        //BrowserUtils.sleep(5);
        //us10_updatingSettingsPage_jamil.uploadFileButton.sendKeys("C:\\Users\\jdaot\\OneDrive\\Desktop\\Selenium\\Screenshot.png");
        BrowserUtils.waitForInvisibilityOf(us10_updatingSettingsPage_jamil.uploadProgressBar);

    }
    @When("user refresh the pagee")
    public void user_refresh_the_pagee() {
        Driver.getDriver().navigate().refresh();
    }
    @Then("the user should be able to see storage usage is increasedd")
    public void the_user_should_be_able_to_see_storage_usage_is_increasedd() {
        //BrowserUtils.waitForVisibilityOf(us10_updatingSettingsPage_jamil.storage);
        Driver.getDriver().manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        String storageAfterUpload = us10_updatingSettingsPage_jamil.storage.getText();
        Assert.assertNotEquals(storageBeforeUpload,storageAfterUpload);
    }
}
