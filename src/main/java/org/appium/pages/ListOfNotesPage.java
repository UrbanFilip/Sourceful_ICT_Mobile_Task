package org.appium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class ListOfNotesPage extends BasePage {
    @FindBy(id = "com.example.android.notepad:id/fab_add")
    private WebElement addNoteButton;
    @FindBy(id = "com.example.android.notepad:id/item_title")
    private List<WebElement> listOfTitles;

    public ListOfNotesPage(WebDriver driver) {
        super(driver);
    }

    public AddPage clickOnAddButton() {
        clickOn(addNoteButton);
        return new AddPage(driver);
    }

    public String getFirstTitle() {
        wait.until(ExpectedConditions.visibilityOfAllElements(listOfTitles));
        return listOfTitles.get(0).getText();
    }
}