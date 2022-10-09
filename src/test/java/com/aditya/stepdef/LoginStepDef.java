package com.aditya.stepdef;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginStepDef {

  WebDriver driver;

  @Before
  public void beforeTest() {
    driver = WebDriverManager.chromedriver().create();
  }

  @After
  public void AfterTest() {
    driver.close();
  }

  @Given("user is on login page")
  public void userIsOnLoginPage() {
    driver.get("https://www.saucedemo.com/");
  }

  @And("user input username with {string}")
  public void userInputUsernameWith(String username) {
    By usernameInputText = By.cssSelector("input#user-name");
    driver.findElement(usernameInputText).sendKeys(username);
  }

  @And("user input password with {string}")
  public void userInputPasswordWith(String password) {
    By passwordInputText = By.xpath("//*[@id=\"password\"]");
    driver.findElement(passwordInputText).sendKeys(password);
  }

  @When("user click login button")
  public void userClickLoginButton() {
    By loginButton = By.id("login-button");
    driver.findElement(loginButton).click();
  }

  @Then("user is on homepage")
  public void userIsOnHomepage() {
    By productTitle = By.xpath("//*[@id=\"item_4_title_link\"]/div");
    WebElement productElement = driver.findElement(productTitle);
    assertTrue(productElement.isDisplayed());
    assertEquals("Sauce Labs Backpack", productElement.getText());
  }

  @Then("user able to see error message {string}")
  public void userAbleToSeeErrorMessage(String errorMessage) {
    assertTrue(driver.getPageSource().contains(errorMessage));
  }
}
