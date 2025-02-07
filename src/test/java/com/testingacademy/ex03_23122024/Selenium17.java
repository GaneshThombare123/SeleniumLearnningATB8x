package com.testingacademy.ex03_23122024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium17 {
    
    @Test
    public void testMethod1() throws Exception {


          EdgeOptions edgeOptions = new EdgeOptions();
          edgeOptions.addArguments("--start-maximized");
          edgeOptions.addArguments("--incognito"); // Not working as of now

          WebDriver driver = new EdgeDriver(edgeOptions);
          driver.get("https://app.vwo.com");

        // Assert.assertEquals(driver.getTitle(),"Login - VWO");
         Assert.assertEquals(driver.getCurrentUrl(),"https://app.vwo.com/#/login");

       WebElement emailInputBox = driver.findElement(By.id("login-username"));
       emailInputBox.sendKeys("admin@admin.com");

       Thread.sleep(5000);



       driver.quit();

    }
}
