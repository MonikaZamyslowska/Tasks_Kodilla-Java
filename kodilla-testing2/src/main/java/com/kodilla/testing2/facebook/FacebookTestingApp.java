package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String XPATH_DAY= "//div[contains(@class, \"_5k_5\")]/span/span/select[1]";
    public static final String XPATH_MONTH= "//div[contains(@class, \"_5k_5\")]/span/span/select[2]";
    public static final String XPATH_YEAR= "//div[contains(@class, \"_5k_5\")]/span/span/select[3]";
    public static final String XPATH_SELECT_1 = "//select[1]";
    public static final String XPATH_SELECT_2 = "//select[2]";
    public static final String XPATH_SELECT_3 = "//select[3]";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        while (!driver.findElement(By.xpath(XPATH_SELECT_1)).isDisplayed() &&
                !driver.findElement(By.xpath(XPATH_SELECT_2)).isDisplayed() &&
                !driver.findElement(By.xpath(XPATH_SELECT_3)).isDisplayed());

        WebElement xpathDay = driver.findElement(By.xpath(XPATH_DAY));
        Select selectDay = new Select(xpathDay);
        selectDay.selectByIndex(13);

        WebElement xpathMonth = driver.findElement(By.xpath(XPATH_MONTH));
        Select selectMonth = new Select(xpathMonth);
        selectMonth.selectByVisibleText("lip");

        WebElement xpathYear = driver.findElement(By.xpath(XPATH_YEAR));
        Select selectYear = new Select(xpathYear);
        selectYear.selectByValue("1999");
    }
}
