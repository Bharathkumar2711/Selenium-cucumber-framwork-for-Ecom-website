package com.saucedemo.pages;

import com.saucedemo.core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    private final By USERNAME = By.id("user-name");
    private final By PASSWORD = By.id("password");
    private final By LOGIN_BTN = By.id("login-button");
    private final By ERROR = By.cssSelector("[data-test='error']");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get("https://www.saucedemo.com/");
    }

    public void login(String user, String pass) {
        type(USERNAME, user);
        type(PASSWORD, pass);
        click(LOGIN_BTN);
    }

    public String getError() {
        return $(ERROR).getText();
    }
}
