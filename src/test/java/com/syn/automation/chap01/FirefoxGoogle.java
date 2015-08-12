package com.syn.automation.chap01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

/**
 * Created by Ashish on 8/12/2015.
 */
public class FirefoxGoogle {

    @Test
    public void testGoogle() throws Exception {
        System.setProperty("webdriver.ie.driver", "C:\\Program Files\\Internet Explorer\\iexplore.exe");
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.google.com");

        WebElement element = driver.findElement(By.name("q"));
        element.clear();

        element.sendKeys("Cheese");

        element.submit();





    }
}
