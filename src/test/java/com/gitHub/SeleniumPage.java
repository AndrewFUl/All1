package com.gitHub;

import org.openqa.selenium.WebDriver;

abstract public class SeleniumPage {
    protected static WebDriver driver;

    public static void setDriver(WebDriver webDriver) {
        driver = webDriver;
    }
}
