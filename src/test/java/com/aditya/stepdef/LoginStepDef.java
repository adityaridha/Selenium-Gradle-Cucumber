package com.aditya.stepdef;

import com.aditya.page.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class LoginStepDef {

  WebDriver driver = WebDriverManager.chromedriver().create();

  LoginPage loginPage = new LoginPage(driver);

  @Then("user is on homepage")
  public void userIsOnHomepage() {

  }

  @Given("user is on login page")
  public void userIsOnLoginPage() {
      driver.get("https://www.saucedemo.com/");
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

  @And("user see error message")
  public void userSeeErrorMessage() {}
}
