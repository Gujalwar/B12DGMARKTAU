package com.dgmarkt.stepDef;

import com.dgmarkt.pages.InitialLoginPage;
import io.cucumber.java.en.Given;

public class initialLoginStepDef {

    @Given("The user logs in with the given username {string} and password {string}")
    public void the_user_logs_in_with_the_given_username_and_password(String username, String password) {

        InitialLoginPage.emailInput.sendKeys(username);
        InitialLoginPage.passwordInput.sendKeys(password);
        InitialLoginPage.loginButton.click();

    }
}
