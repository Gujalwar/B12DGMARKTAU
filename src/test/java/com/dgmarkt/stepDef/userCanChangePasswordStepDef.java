package com.dgmarkt.stepDef;

import com.dgmarkt.pages.HomePage;
import com.dgmarkt.pages.MyAccount;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class userCanChangePasswordStepDef {

    HomePage homePage = new HomePage();
    MyAccount myAccount = new MyAccount();

    @Then("the user navigates to my account and clicks change password")
    public void theUserNavigatesToMyAccountAndClicksChangePassword() {
        homePage.mAMenu.click();
        homePage.myAccountButton.click();
        myAccount.passwordTab.click();
    }

    @And("the user should enter the new password as {string} and verify that password has changed")
    public void theUserShouldEnterTheNewPasswordAsAndVerifyThatPasswordHasChanged(String password) {
        myAccount.passwordInput.sendKeys(password);
        myAccount.passwordConfirmInput.sendKeys(password);
        myAccount.continueButton.click();
        String expectedMessage = "Success";
        String actualMessage = myAccount.passwordChangedSuccessMessage.getText();
        Assert.assertTrue(actualMessage.contains(expectedMessage));
    }

    @And("the user should enter the new password as {string} and confirmation password as {string} and verify error message")
    public void theUserShouldEnterTheNewPasswordAsAndConfirmationPasswordAsAndVerifyErrorMessage(String password, String confirmationPassword) {
        myAccount.passwordInput.sendKeys(password);
        myAccount.passwordConfirmInput.sendKeys(confirmationPassword);
        myAccount.continueButton.click();
        String expectedMessage = "Password confirmation does not match password!";
        String actualMessage = myAccount.passwordConfirmationError.getText();
        Assert.assertEquals(expectedMessage,actualMessage);
    }
}
