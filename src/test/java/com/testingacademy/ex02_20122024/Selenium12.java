package com.testingacademy.ex02_20122024;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Selenium12 {
    
    @Test
    public void testMethod1() throws InterruptedException {

        EdgeDriver driver = new EdgeDriver();
        driver.get("Https://sdet.live");

        //Close vs Quit

     //   driver.close(); // close the current window(minimize)

        Thread.sleep(5000);

        driver.quit(); // completely close the browser







    }
}
