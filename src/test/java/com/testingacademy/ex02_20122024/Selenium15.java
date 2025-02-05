package com.testingacademy.ex02_20122024;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

public class Selenium15 {
    
    @Test
    public void testMethod1() throws Exception {

        // Open the Catalon home page and find the CURA HEALTH CARE SERVICE


       EdgeOptions edgeOptions = new EdgeOptions();
       edgeOptions.addArguments("--start-maximized");


        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://katalon-demo-cura.herokuapp.com/");

        // Alternate way to maximize
      //  driver.manage().window().maximize();

        // TestNG Assertion
    //    Assert.assertEquals(driver.getTitle(),("CURA Healthcare Service"));


        // AssertJ Assertion

        assertThat(driver.getTitle()).isEqualTo("CURA Healthcare Service").isNotBlank().isNotEmpty();
        assertThat(driver.getCurrentUrl()).isEqualTo("https://katalon-demo-cura.herokuapp.com/");

      if(driver.getPageSource().contains("CURA Healthcare Service"))
      {
            Assert.assertTrue(true);
        }else
        {
throw new Exception("Heading Not found!!!!");
        }

        driver.quit();


    }
}
