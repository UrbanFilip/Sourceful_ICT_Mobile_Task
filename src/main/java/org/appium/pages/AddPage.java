package org.appium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AddPage extends BasePage {
    @FindBy(id = "com.example.android.notepad:id/title")
    private WebElement titleInput;

    @FindBy(id = "com.example.android.notepad:id/notetext_textview")
    private WebElement textInput;

    @FindBy(id = "com.example.android.notepad:id/toolbar_save_p")
    private WebElement saveButton;

    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Wstecz\"]")
    private WebElement backButton;

    public AddPage(WebDriver driver) {
        super(driver);
    }

    private AddPage fillTitle(String title) {
        fillInput(titleInput, title);

        return this;
    }

    private AddPage fillText(String text) {
        fillInput(textInput, text);

        return this;
    }

    public AddPage clickSaveButton() {
        clickOn(saveButton);

        return this;
    }

    public AddPage fillNote(String title, String text) {
        fillTitle(title).
                fillText(text);

        return this;
    }

    public ListOfNotesPage clickOnBackButton() {
        clickOn(backButton);

        return new ListOfNotesPage(driver);
    }
}
