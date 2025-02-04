package com.testingacademy.ex_18122024;
import org.junit.Test;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium02 {
    @Test
    public void test_Selenium(){
        FirefoxDriver driver = new FirefoxDriver();
        //  driver.get("https://www.google.co.in/");
        driver.get("https://app.vwo.com");

        driver.quit();


    }

}


