package com.testingacademy.ex03_23122024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class Selenium18 {

    @Test
    public void testMethod1() throws Exception {

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");


        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://app.vwo.com");


//        WebElement link_free_trail_element = driver.findElement(By.linkText("Start a free trial"));
//        link_free_trail_element.click(); //--> Link tex

        WebElement link_free_trail_element = driver.findElement(By.partialLinkText("free trial"));
        link_free_trail_element.click();  // --> partial link text


        Thread.sleep(3000);

       driver.quit();

    }
}
