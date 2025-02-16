package com.testingacademy.ex03_23122024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

public class Selenium17 {
    
    @Test
    public void testMethod1() throws Exception {


          EdgeOptions edgeOptions = new EdgeOptions();
          edgeOptions.addArguments("--start-maximized");
         // edgeOptions.addArguments("--incognito"); // Not working as of now

          WebDriver driver = new EdgeDriver(edgeOptions);
          driver.get("https://app.vwo.com");

        // Assert.assertEquals(driver.getTitle(),"Login - VWO");
        // Assert.assertEquals(driver.getCurrentUrl(),"https://app.vwo.com/#/login");

       WebElement emailInputBox = driver.findElement(By.id("login-username"));
       emailInputBox.sendKeys("admin@admin.com");

       WebElement passwordInputBox = driver.findElement(By.name("password"));
       passwordInputBox.sendKeys("admin123");

       WebElement buttonSubmit = driver.findElement(By.id("js-login-btn"));
       buttonSubmit.click();

        Thread.sleep(3000);

       WebElement error_message = driver.findElement(By.className("notification-box-description"));
       Assert.assertEquals(error_message.getText(),"Your email, password, IP address or location did not match");

       assertThat(error_message.getText()).isNotEmpty().isNotBlank().isEqualTo("Your email, password, IP address or location did not match");

       Thread.sleep(3000);



       driver.quit();

    }
}
