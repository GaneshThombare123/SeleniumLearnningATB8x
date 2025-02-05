package com.testingacademy.ex02_20122024;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Selenium14 {
    
    @Test
    public void testMethod1() throws InterruptedException {

        EdgeDriver driver = new EdgeDriver();
        driver.get("https://sdet.live");  // it will works

    //    driver.get("http://sdet.live");  // it will works

     //     driver.get("www.google.com");  // without https not work

      //  driver.get("sdet.live");  // without https not work



    }
}
