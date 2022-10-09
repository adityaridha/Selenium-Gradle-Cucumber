package com.aditya.stepdef;

import com.aditya.BaseTest;
import com.aditya.page.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef extends BaseTest {

  protected LoginPage loginPage;

  @Given("user is on login page")
  public void userIsOnLoginPage() {
    loginPage = new LoginPage(driver);
    loginPage.goToLoginPage();
  }

  @And("user input username with {string}")
  public void userInputUsernameWith(String username) {
    loginPage.inputUsername(username);
  }

  @And("user input password with {string}")
  public void userInputPasswordWith(String password) {
    loginPage.inputPassword(password);
  }

  @When("user click login button")
  public void userClickLoginButton() {
    loginPage.clickLoginButton();
  }

  @Then("user able to see error message {string}")
  public void userAbleToSeeErrorMessage(String errorMessage) {
    loginPage.validateErrorAppear(errorMessage);
  }
}
