package com.testingacademy.ex_18122024;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium04 {
    @Test
    public void test_Selenium(){


        WebDriver driver = new FirefoxDriver();
        driver.get("https://app.vwo.com");

    }

}


