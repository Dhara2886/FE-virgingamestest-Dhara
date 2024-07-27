package com.virgingames.testsuite;

import com.virgingames.pages.HomePage;
import com.virgingames.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSuite extends BaseTest {
    HomePage homePage = new HomePage();

    @Test
    public void verifyThatUserCanClickOnAllowAllCookiesButton(){
        homePage.clickOnAllowAllCookiesButton();
    }

    @Test
    public void verifyThatWelcomeSignIsDisplayed(){
        homePage.verifyWelcomeSign();
        String expectedText = "Welcome to Virgin Games";
        String actualText = homePage.verifyWelcomeSign();
        Assert.assertEquals(actualText, expectedText, "Home page is not displayed");
    }

 }
