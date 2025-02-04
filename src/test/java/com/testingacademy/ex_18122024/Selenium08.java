package com.testingacademy.ex_18122024;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class Selenium08 {

@Test
    public void testMethod1(){

    // EdgeOptions -> It will help you set the browser
    // option to browsers
    // window size
    // headless mode - there is not UI
    // full UI mode - default - UI browser
    // incognito mode - switch
    // start Max
    // add extension
    // 100 + others, https , http
    // Local storage, download

    EdgeOptions edgeOptions = new EdgeOptions();
//    edgeOptions.addArguments("--Start-maximized");
    edgeOptions.addArguments("--Window-size=800,600");


    EdgeDriver driver = new EdgeDriver();
    driver.get("https://google.com");



}


}
