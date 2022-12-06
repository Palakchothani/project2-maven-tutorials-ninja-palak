package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.*;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterPageTest extends BaseTest
{
    ComponentsPage componentsPage = new ComponentsPage();
    DesktopPage desktopPage = new DesktopPage();
    LaptopAndNotebookPage laptopAndNoteBookPage = new LaptopAndNotebookPage();
    HpProductPage hpProductPage = new HpProductPage();
    CartPage cartPage = new CartPage();
    RegisterPage registerPage = new RegisterPage();
    LoginPage loginPage = new LoginPage();


    @Test
    public void verifyThatUserRegisterAccountSuccessfully() {
        loginPage.setClickOnMyAccount();
        registerPage.verifySelectMyAccountOptions("Register");
        registerPage.firstnameField("Palak");
        registerPage.lastNameField("Chothani");
        registerPage.setEmail("palak@gmail.com");
        registerPage.setTelephone("07648561792");
        registerPage.setPassword("palak123");
        registerPage.confirmPassword("palak123");
        registerPage.setRadioButton();
        registerPage.agreeButtonClick();
        registerPage.setContinueButton();
        String expectedMessage = "Your Account Has Been Created!";
        Assert.assertEquals(registerPage.verifyAccountCreated(),expectedMessage,"");
        registerPage.continueText();
        registerPage.ClickOnMyAccount();
        registerPage.verifySelectMyLogOutOptions("Logout");
        registerPage.continueText();
        String expectedMessages = "Account Logout";
        Assert.assertEquals(registerPage.verifyAccountCreated(),expectedMessages,"");
    }
}
