package com.dgmarkt.stepDef;

import com.dgmarkt.pages.BasePage;
import com.dgmarkt.pages.HomePage;
import com.dgmarkt.pages.LoginPopUp;
import com.dgmarkt.utilities.BrowserUtils;
import com.dgmarkt.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class userLoginFunctionalityStepDef {

    HomePage homePage = new HomePage();
    LoginPopUp loginPopUp = new LoginPopUp();

    @Given("the user navigates to the My Account menu and selects login")
    public void the_user_navigates_to_the_my_account_menu_and_selects_login() {
        homePage.myAccountMenuList.click();
        homePage.loginButton.click();
    }

    @When("the user enter valid username {string} and password {string}")
    public void the_user_enter_valid_username_and_password(String email, String password) {
        loginPopUp.login(email, password);
    }

    @Then("the user should verify that successfully logged in")
    public void the_user_should_verify_that_successfully_logged_in() {
        String expectedMessage = "Congratulation! Login Successfully";
        String actualMessage = homePage.loginSuccessfulMessage.getText();
        Assert.assertTrue(actualMessage.contains(expectedMessage));
    }

    @Then("the user should verify that error message appears")
    public void the_user_should_verify_that_error_message_appears() {
        String expectedMessage = "Warning: No match for E-Mail Address and/or Password.";
        String actualMessage = loginPopUp.wrongEmailOrPasswordWarningMessage.getText();
        Assert.assertTrue(actualMessage.contains(expectedMessage));
    }

    @Then("the user enter valid username {string} and password {string}*)\\(K\"")
    public void the_user_enter_valid_username_and_password_k(String email, String password) {
        loginPopUp.login(email, password);
    }

    @Then("the user enter any username {string} and password {string}")
    public void the_user_enter_any_username_and_password(String email, String password) {
        loginPopUp.emailInput.sendKeys(email);
        loginPopUp.passwordInput.sendKeys(password);
    }
    @Then("the user should verify that password is visible as bullet signs by default")
    public void the_user_should_verify_that_password_is_visible_as_bullet_signs_by_default() {
        WebElement passwordInput = Driver.get().findElement(By.id("input-password"));
        boolean isEncrypted = passwordInput.getAttribute("type").equals("password");
        Assert.assertEquals(isEncrypted,true);
    }

    @Then("verify that forgotten password link is visible and working")
    public void verifyThatForgottenPasswordLinkIsVisibleAndWorking() {
        boolean isVisible = loginPopUp.forgottenPasswordLink.isEnabled();
        Assert.assertEquals(true,isVisible);
        loginPopUp.forgottenPasswordLink.click();

        String expectedText = "Forgot Your Password?";
        WebElement text = Driver.get().findElement(By.xpath("//h1[text()='Forgot Your Password?']"));
        String actualText = text.getText();
        Assert.assertEquals(expectedText,actualText);
    }

    @Then("the user should verify that warning message shown")
    public void theUserShouldVerifyThatWarningMessageShown() {
        String expectedMessage = "Warning";
        String actualMessage = Driver.get().findElement(By.xpath("//div[contains(text(),'Warning')]")).getText();
        Assert.assertTrue(actualMessage.contains(expectedMessage));
    }
}
