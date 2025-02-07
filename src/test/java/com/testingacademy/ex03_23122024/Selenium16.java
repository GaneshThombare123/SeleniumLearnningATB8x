package com.testingacademy.ex03_23122024;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Selenium16 {
    
    @Test
    public void testMethod1() throws Exception {

        // Open the Catalon home page and find the CURA HEALTH CARE SERVICE


       EdgeOptions edgeOptions = new EdgeOptions();
       edgeOptions.addArguments("--start-maximized");


        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://katalon-demo-cura.herokuapp.com/");

// HTML element = Web Element

        // Find element --
        // BAsic 1) ID, Name, Class Name, Tag Name
        // Advance 2) Css Selector , Xpath












      driver.quit();
    }
}
