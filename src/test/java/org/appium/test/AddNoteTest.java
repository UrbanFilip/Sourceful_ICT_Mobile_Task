package org.appium.test;

import com.github.javafaker.Faker;
import org.appium.pages.ListOfNotesPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddNoteTest extends BaseTest {

    @Test
    public void shouldBeAbleToAddNote() {
        long number = new Faker().number().randomNumber(10, true);
        String note = "Lorem ipsum";
        String title = note + number;

        ListOfNotesPage listOfNotesPage = new ListOfNotesPage(getDriver()).clickOnAddButton()
                .fillNote(title, note).clickSaveButton().clickOnBackButton();

        Assert.assertEquals(listOfNotesPage.getFirstTitle(), title);
    }
}
