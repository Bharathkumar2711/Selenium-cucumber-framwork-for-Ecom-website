package com.saucedemo.pages;

import com.saucedemo.core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class InventoryPage extends BasePage {



private final By Title = By.xpath("//span[text()='Products']");


    public InventoryPage(WebDriver driver) {
        super(driver);
    }

    public String getTitle() {
        return Title.toString();
    }

}
