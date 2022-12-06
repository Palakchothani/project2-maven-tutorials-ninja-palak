package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.ComponentsPage;
import com.tutorialsninja.pages.DesktopPage;
import com.tutorialsninja.pages.LaptopAndNotebookPage;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest
{
    ComponentsPage componentsPage = new ComponentsPage();
    DesktopPage desktopPage = new DesktopPage();

    LaptopAndNotebookPage laptopAndNoteBookPage = new LaptopAndNotebookPage();


    @Test
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() {
        desktopPage.userMouseHoverOnDesktopPage();
        String expectedText = "Desktops";
        desktopPage.selectMenu("Show All Desktops");
        Assert.assertEquals(desktopPage.userVerifyDesktopText(),expectedText,"Not Navigate to DesktopPage");

    }
    @Test
    public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully() {
        laptopAndNoteBookPage.userShouldMouseHoverOnLaptopAndBookPageTest();
        laptopAndNoteBookPage.selectMenu("Show All Laptops & Notebooks");
        String expectedMessage = "Laptops & Notebooks";
        Assert.assertEquals(laptopAndNoteBookPage.verifyNotebookAndLaptop(),expectedMessage,"no message displayed");

    }

    @Test
    public void verifyUserShouldNavigateToComponentsPageSuccessfully() {
        componentsPage.userMouseHoverOnComponent();
        componentsPage.selectMenu("Show All Components");
        String  expectedMessage = "Components";
        Assert.assertEquals(componentsPage.userVerifyComponentText(),expectedMessage,"No Element Found");

    }
}
