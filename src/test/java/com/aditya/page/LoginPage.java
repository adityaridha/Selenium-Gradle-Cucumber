package com.aditya.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
  WebDriver driver;

  By usernameInputText = By.cssSelector("input#user-name");
  By passwordInputText = By.xpath("//*[@id=\"password\"]");
  By loginButton = By.id("login-button");

  public LoginPage(WebDriver driver) {
    this.driver = driver;
  }

  public void inputUsername(String username) {
    driver.findElement(usernameInputText).sendKeys(username);
  }

  public void inputPassword(String password) {
    driver.findElement(passwordInputText).sendKeys(password);
  }

  public void clickLoginButton() {
    driver.findElement(loginButton).click();
  }
}
