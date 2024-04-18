package com.dgmarkt.stepDef;

import com.dgmarkt.pages.InitialLoginPage;
import io.cucumber.java.en.Given;

public class initialLoginStepDef {

    InitialLoginPage initialLoginPage = new InitialLoginPage();

    @Given("The user logs in with the given username {string} and password {string}")
    public void the_user_logs_in_with_the_given_username_and_password(String username, String password) {
        initialLoginPage.emailInput.sendKeys(username);
        initialLoginPage.passwordInput.sendKeys(password);
        initialLoginPage.loginButton.click();
        initialLoginPage.newsLetterPopupExit.click();
    }
}
