package com.saucedemo.steps;

import com.saucedemo.core.DriverFactory;
import com.saucedemo.pages.*;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;



public class SaucedemoSteps {
    private WebDriver driver;
    private LoginPage login;
    private InventoryPage inventory;




    @Given("user open the Swag Labs login page")
    public void openLogin() {
        DriverFactory.initDriver();
        driver = DriverFactory.getDriver();
        login = new LoginPage(driver);
        login.open();
    }

    @When("user login with username {string} and password {string}")
    public void login(String user, String pass) {
        login.login(user, pass);
        inventory = new InventoryPage(driver);

    }

    @Then("user should be on the products page")
    public void assertLoggedIn() {
        Assert.assertTrue(inventory.getTitle().contains("Products"));
    }


    @Then("user should see an error {string}")
    public void assertLoginError(String message) {
        Assert.assertTrue(login.getError().contains(message));
    }

    @When("user login with wrong username {string} and password {string}")
    public void userLoginWithWrongUsernameAndPassword(String user2, String pass2) {
        login.login(user2, pass2);
        inventory = new InventoryPage(driver);

    }

    @When("user login with username {string} and wrong password {string}")
    public void userLoginWithUsernameAndWrongPassword(String user3, String pass3) {
        login.login(user3, pass3);
        inventory = new InventoryPage(driver);
    }
}
