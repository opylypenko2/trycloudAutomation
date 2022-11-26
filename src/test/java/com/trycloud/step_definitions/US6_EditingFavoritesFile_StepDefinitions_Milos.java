package com.trycloud.step_definitions;

import com.trycloud.pages.US1_LoginPage;
import com.trycloud.pages.US6_EditingFavoritesFilePage_Milos;
import com.trycloud.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;


public class US6_EditingFavoritesFile_StepDefinitions_Milos {

    US1_LoginPage us1_loginPage = new US1_LoginPage();
    US6_EditingFavoritesFilePage_Milos us6_editingFavoritesFilePage_milos = new US6_EditingFavoritesFilePage_Milos();
//   int listSize;

    //    @Given("user on the dashboard page")
//    public void user_on_the_dashboard_page() {
//        Driver.getDriver().get(Configuration_Reader.getProperty("URL"));
//        us1_loginPage.login("User22", "Userpass123");
//    }
//    @When("the user clicks the {string} module")
//    public void the_user_clicks_the_module(String string) {
//        us6_editingFavoritesFilePage_milos.filesModule.click();
//    }

    @When("the users click action-icon from any file on the page to remove")
    public void the_users_click_action_icon_from_any_file_on_the_page_to_remove() {
        us6_editingFavoritesFilePage_milos.actionIcon.click();
//       listSize = us6_editingFavoritesFilePage_milos.favoritesTable.size();
        BrowserUtils.sleep(3);
    }

    @When("user choose the {string} option")
    public void user_choose_the_option(String string) {
        if (us6_editingFavoritesFilePage_milos.addToFavorites.getText().equalsIgnoreCase("Add to favorites")) {
            us6_editingFavoritesFilePage_milos.addToFavorites.click();
            BrowserUtils.sleep(3);
            us6_editingFavoritesFilePage_milos.actionIcon.click();
            us6_editingFavoritesFilePage_milos.removeFromFavorites.getText().equalsIgnoreCase("Remove from favorites");
            us6_editingFavoritesFilePage_milos.removeFromFavorites.click();
            BrowserUtils.sleep(3);
        } else {
            us6_editingFavoritesFilePage_milos.actionIcon.click();
            us6_editingFavoritesFilePage_milos.removeFromFavorites.click();
        }
//        listSize = us6_editingFavoritesFilePage_milos.favoritesTable.size();
    }

    @When("user click the {string} sub-module on the left side")
    public void user_click_the_sub_module_on_the_left_side(String string) {
        us6_editingFavoritesFilePage_milos.favoritesSubModule.click();
        BrowserUtils.sleep(2);
    }

    @Then("Verify that the file is removed from the Favorites sub-module’s table")
    public void verify_that_the_file_is_removed_from_the_favorites_sub_module_s_table() {
//        us6_editingFavoritesFilePage_milos.favoritesSubModule.click();
        Assert.assertTrue("File is not removed", us6_editingFavoritesFilePage_milos.noFavoritesText.isDisplayed());
//        Assert.assertNotEquals(listSize, us6_editingFavoritesFilePage_milos.favoritesTable.size());
    }


    @When("the user clicks the add icon on the top")
    public void the_user_clicks_the_add_icon_on_the_top() {
        us6_editingFavoritesFilePage_milos.addIcon.click();
    }

    @When("users uploads file with the “upload file” option")
    public void users_uploads_file_with_the_upload_file_option() {
        us6_editingFavoritesFilePage_milos.uploadFileBtn.click();
        us6_editingFavoritesFilePage_milos.inputFile.sendKeys("/Users/milosmihajlovic/Desktop/IMG_3104.HEIC");
        BrowserUtils.sleep(5);
    }

    @Then("verify the file is displayed on the page")
    public void verify_the_file_is_displayed_on_the_page() {
        for (WebElement eachElement : us6_editingFavoritesFilePage_milos.filesTable) {
            if (eachElement.getText().contains("IMG")) ;
            break;
        }
    }
}
