package com.saucedemo.core;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverFactory {
    private static final ThreadLocal<WebDriver> TL_DRIVER = new ThreadLocal<>();

    public static void initDriver() {
        if (TL_DRIVER.get() == null) {
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            if (Boolean.getBoolean("headless")) {
                options.addArguments("--headless=new");
            }
            options.addArguments("--window-size=1920,1080");
            TL_DRIVER.set(new ChromeDriver(options));
        }
    }

    public static WebDriver getDriver() {
        return TL_DRIVER.get();
    }

    public static void quitDriver() {
        if (TL_DRIVER.get() != null) {
            TL_DRIVER.get().quit();
            TL_DRIVER.remove();
        }
    }
}
