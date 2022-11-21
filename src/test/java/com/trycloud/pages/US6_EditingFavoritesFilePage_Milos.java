package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US6_EditingFavoritesFilePage_Milos {

    public US6_EditingFavoritesFilePage_Milos() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//a[@aria-label='Files'])[1]")
    public WebElement filesModule;

    @FindBy(xpath = "(//a[@data-action='menu'])[1]")
    public WebElement actionIcon;

//    @FindBy(xpath = "//div[@class='fileActionsMenu popovermenu bubble open menu']/ul/li[3]")
    @FindBy(xpath = "//a[@class='menuitem action action-favorite permanent']")
    public WebElement addToFavorites;

    @FindBy(xpath = "//a[@class='menuitem action action-favorite permanent']")
    public WebElement removeFromFavorites;

    @FindBy(xpath = "//div[@id='app-navigation']/ul/li[3]")
    public WebElement favoritesSubModule;

    @FindBy(xpath = "(//tbody[@id='fileList'])[3]")
    public List <WebElement> favoritesTable;

    @FindBy(xpath = "(//*[@id=\"emptycontent\"]/h2)[2]")
    public WebElement noFavoritesText;

    @FindBy(xpath = "//div[@class='actions creatable']/a")
    public WebElement addIcon;

    @FindBy(xpath = "//div/ul/li/label[@data-action='upload']")
    public WebElement uploadFileBtn;

    @FindBy(xpath = "//input[@type='file']")
    public WebElement inputFile;

    @FindBy(xpath = "//table[@id='filestable']/tbody/tr")
    public List <WebElement> filesTable;




    

}
