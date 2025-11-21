package org.example;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import java.time.Duration;
import java.util.List;
import java.util.logging.Logger;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginFunctionalitySeleniumTest {
    Logger logger = Logger.getLogger(LoginFunctionalitySeleniumTest.class.getName());

    @Test
    void test_successful_login(){
        ChromeOptions options = new ChromeOptions();

        // Startar server
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.saucedemo.com/");
        logger.info("Navigerar till logg in sidan");

        WebElement username_field = driver.findElement(By.name("user-name"));
        WebElement password_field = driver.findElement(By.name("password"));
        WebElement login_btn = driver.findElement(By.id("login-button"));


        username_field.sendKeys("standard_user");
        password_field.sendKeys("secret_sauce");
        login_btn.click();

        boolean isTitleVisible = driver.findElement(By.className("inventory_list")).isDisplayed();
        logger.info("Produkt listan är synlig");
        assertTrue(isTitleVisible);

        WebElement titles = driver.findElement(By.className("title"));
        String titleText = titles.getText();

        assertEquals("Products", titleText);
        logger.info("Product sida texten är: " + titleText);

        List<WebElement> products = driver.findElements(By.xpath(".//div[@class='inventory_list']/div"));

        int count = products.size();

        logger.info("Number of products: " + count + " are visible");

        driver.quit();

    }

    @Test
    void test_login_failure() {
        ChromeOptions options = new ChromeOptions();

        // Startar server
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.saucedemo.com/");
        logger.info("Navigerar till logg in sidan");

        WebElement username_field = driver.findElement(By.name("user-name"));
        WebElement password_field = driver.findElement(By.name("password"));
        WebElement login_btn = driver.findElement(By.id("login-button"));


        username_field.sendKeys("standard_user");
        password_field.sendKeys("secret_sauce");
        login_btn.click();
    }

}
