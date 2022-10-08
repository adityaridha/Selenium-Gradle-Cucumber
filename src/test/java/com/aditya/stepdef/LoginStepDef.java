package com.aditya.stepdef;

import com.aditya.BaseTest;
import com.aditya.page.LoginPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LoginStepDef {

    protected static WebDriver driver;

  @Before()
  public void beforeTest() {
    ChromeOptions options = new ChromeOptions();
    options.addArguments("--no-sandbox");
    options.addArguments("--disable-dev-shm-usage");
    options.addArguments("--headless");
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver(options);
  }

  @Then("user is on homepage")
  public void userIsOnHomepage() {}

  @Given("user is on login page")
  public void userIsOnLoginPage() throws InterruptedException {
    driver.get("https://www.saucedemo.com/");
    Thread.sleep(1000);
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

  @And("user see error message")
  public void userSeeErrorMessage() {}
}
