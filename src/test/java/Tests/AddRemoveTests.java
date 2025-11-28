package Tests;

import BaseTest.BaseTestClass;
import Pages.AddRemoveElementsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddRemoveTests  extends BaseTestClass {

    @Test
    public void testAddAndRemoveElements() {

        addremovePage=homePage.clickAddRemoveLink();

        for (int i = 0; i < 5; i++) {
            addremovePage.clickAddButton();
        }

        for (int i = 0; i < 7; i++) {
            addremovePage.clickDeleteButton();
        }




//        int remaining = addremovePage.getDeleteButtonsCount();
//        Assert.assertEquals(remaining,2);
    }
}





