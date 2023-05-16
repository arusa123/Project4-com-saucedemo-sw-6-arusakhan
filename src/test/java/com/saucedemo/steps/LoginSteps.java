package com.saucedemo.steps;

import com.saucedemo.pages.InventoryPage;
import com.saucedemo.pages.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class LoginSteps {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I enter \"([^\"]*)\" in the username field$")
    public void iEnterInTheUsernameField(String email) {
        new LoginPage().enterUserNameInTheUserNameField(email);

    }

    @And("^I enter \"([^\"]*)\" in the password field$")
    public void iEnterInThePasswordField(String password) {
        new LoginPage().enterPasswordInThePasswordField(password);
    }

    @And("^I click on the login button$")
    public void iClickOnTheLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @And("^I verify the title of the page$")
    public void iVerifyTheTitleOfThePage() {
        Assert.assertEquals("title is incorrect", "Products", new InventoryPage().getTitleOfThePage());

    }

    @Then("^I verify the list of the products$")
    public void iVerifyTheListOfTheProducts() {
        Assert.assertEquals("incorrect list", 6, new InventoryPage().sizeOfTheList());
    }


}
