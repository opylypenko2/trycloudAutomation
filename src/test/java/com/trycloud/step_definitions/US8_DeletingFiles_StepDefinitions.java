package com.trycloud.step_definitions;

import com.trycloud.pages.DeletedFilesPage;
import com.trycloud.pages.US8_DeletingFilesPage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class US8_DeletingFiles_StepDefinitions {

    US8_DeletingFilesPage us8_deletingFilesPage = new US8_DeletingFilesPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 90);
    //   Actions actions = new Actions(Driver.getDriver());
//    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();


    @And("user clicks action-icon from any file on the page")
    public void userClickTheActionIconFromAnyFileOnThePage() {
        us8_deletingFilesPage.actionsIconFile.click();
    }

    @When("user chooses the Delete file option")
    public void user_chooses_the_delete_file_option() {
        us8_deletingFilesPage.deleteFileOption.click();
        BrowserUtils.sleep(3);
    }

    @When("user clicks the Deleted files sub-module on the left side")
    public void user_clicks_the_deleted_files_sub_module_on_the_left_side() {
        us8_deletingFilesPage.deletedFilesModule.click();
    }

    @Then("verify the {string} is displayed on the page")
    public void verify_the_deleted_file_is_displayed_on_the_page(String fileName) {
        wait.until(ExpectedConditions.titleIs("Deleted files - Trycloud QA"));

        for (WebElement eachDeletedFile : us8_deletingFilesPage.allDeletedFiles) {
            if (eachDeletedFile.getAttribute("data-path").equals(fileName)) {
                Assert.assertTrue(eachDeletedFile.isDisplayed());
            }
        }
    }
}
