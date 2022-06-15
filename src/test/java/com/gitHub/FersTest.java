package com.gitHub;

import org.junit.Test;
import org.openqa.selenium.By;

public class FersTest extends SeleniumTest {

    private By searchText = By.xpath("/html/body/div[1]/header/div/div[2]/div[2]/div[1]/div/div/form/label/input[1]");
    private By searchClick = By.xpath("/html/body/div[1]/header/div/div[2]/div[2]/div[1]/div/div/form/label/div");
    private By clickLink = By.xpath("//*[@id=\"js-pjax-container\"]/div/div[3]/div/ul/li[1]/div[2]/div[1]/div[1]/a");
    private By clickIssues = By.xpath("/html/body/div[4]/div/main/div[1]/nav/ul/li[2]/a");
    private By clickFirstList = By.xpath("//*[@id=\"issue_1682_link\"]");
    private By statusOpen = By.xpath("//*[@title=\"Status: Open\"]");

    @Test
    public void firsTest() {
        driver.get("https://github.com/");
        driver.findElement(searchText).sendKeys("Allure");
        driver.findElement(searchClick).click();
        driver.findElement(clickLink).click();
        driver.findElement(clickIssues).click();
        driver.findElement(clickFirstList).click();
        driver.findElement(statusOpen);
    }
}
