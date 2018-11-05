package com.kodilla.testing2.google;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleTestingApp {
    public static final String FIELD = "lst-ib";

    public static void main(String[] args) {
        WebDriver webDriver = WebDriverConfig.getDriver(WebDriverConfig.FIREFOX);
        webDriver.get("https://www.google.com/");

        WebElement searchField = webDriver.findElement(By.id(FIELD));
        searchField.sendKeys("Kodilla");
        searchField.submit();
    }
}
