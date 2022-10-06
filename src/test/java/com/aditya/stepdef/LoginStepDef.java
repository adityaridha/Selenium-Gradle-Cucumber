package com.aditya.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef {
    @When("user click login button")
    public void userClickLoginButton() {

    }

    @Given("user is on login page")
    public void userIsOnLoginPage() {
        System.out.println("wey");
    }

    @Then("user will be on homepage")
    public void userWillBeOnHomepage() {
    }
}
