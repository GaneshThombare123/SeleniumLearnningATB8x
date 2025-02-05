package com.testingacademy.ex02_20122024;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.io.File;

public class Selenium10 {

    @Test
    public void testMethod1(){

//             EdgeOptions edgeOptions = new EdgeOptions();
//             edgeOptions.addExtensions(new File("src/test/java/com/testingacademy/ex02_20122024/Addblock.CRX"));
//
//             EdgeDriver driver = new EdgeDriver(edgeOptions);
//             driver.get("https://youtube.com");

              ChromeOptions chromeOptions = new ChromeOptions();
              chromeOptions.addExtensions(new File("src/test/java/com/testingacademy/ex02_20122024/Addblock.CRX"));
              ChromeDriver driver =new ChromeDriver(chromeOptions);
              driver.get("https://youtube.com");



    }

}

