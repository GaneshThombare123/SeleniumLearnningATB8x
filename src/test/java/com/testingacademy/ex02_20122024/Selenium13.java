package com.testingacademy.ex02_20122024;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Selenium13 {
    
    @Test
    public void testMethod1() throws InterruptedException {

        EdgeDriver driver = new EdgeDriver();
        driver.get("Https://sdet.live");

        // No back, forward allowed in case of get

       // Navigate.to, forward, back

        driver.navigate().to("https://thetestingacademy.com");
        driver.navigate().back();
        driver.navigate().forward();
        System.out.println(driver.getTitle());

        Thread.sleep(5000);

        driver.quit();



    }
}
