package com.aditya.stepdef;

import com.aditya.BaseTest;
import com.aditya.page.HomePage;
import io.cucumber.java.en.Then;

public class HomeStepDef extends BaseTest {

  @Then("user is on homepage")
  public void userIsOnHomepage() {
    HomePage homePage = new HomePage(driver);
    homePage.validateOnHomePage();
  }
}
