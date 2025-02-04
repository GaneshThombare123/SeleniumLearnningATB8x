package com.testingacademy.ex_18122024;
import org.junit.Test;
import org.openqa.selenium.edge.EdgeDriver;

public class Selenium01 {
    @Test
    public void test_Selenium(){
        EdgeDriver driver = new EdgeDriver();
        //  driver.get("https://www.google.co.in/");
        driver.get("https://app.vwo.com");
        driver.quit();

    }

}


