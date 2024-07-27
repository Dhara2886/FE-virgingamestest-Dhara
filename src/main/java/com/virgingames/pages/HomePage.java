package com.virgingames.pages;

import com.virgingames.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By allowAllCookies = By.className("dialog_button");

    By welcomeSign = By.xpath("//h1[normalize-space()='Welcome to Virgin Games']");


    public void clickOnAllowAllCookiesButton() {
        clickOnElement(allowAllCookies);
    }

    public String verifyWelcomeSign() {
        return getTextFromElement(welcomeSign);
    }


}

