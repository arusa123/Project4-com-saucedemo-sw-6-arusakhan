package com.saucedemo.pages;

import com.saucedemo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());
    //declaring the variables


    @CacheLookup
    @FindBy(id = "user-name")
    WebElement usernameField;
    @FindBy(id = "password")
    WebElement passwordField;
    @FindBy(xpath = "//input[@class='submit-button btn_action']")
    WebElement loginButton;

    //this method will enter the username
    public void enterUserNameInTheUserNameField(String username) {
        sendTextToElement(usernameField, username);
    }

    // this method will enter the password
    public void enterPasswordInThePasswordField(String password) {
        sendTextToElement(passwordField, password);
        log.info("Enter password " + password + " to email field " + passwordField.toString());
    }

    //this method will click on the  login button
    public void clickOnLoginButton() {

        clickOnElement(loginButton);
        log.info("click on log in button " + loginButton.toString());


    }
}