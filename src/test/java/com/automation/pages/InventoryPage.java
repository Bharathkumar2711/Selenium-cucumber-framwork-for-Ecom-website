package com.automation.pages;

import com.automation.core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InventoryPage extends BasePage {



private final By Title = By.xpath("//span[text()='Products']");


    public InventoryPage(WebDriver driver) {
        super(driver);
    }

    public String getTitle() {
        return Title.toString();
    }

}
