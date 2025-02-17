package com.testingacademy.ex03_30122024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Selenium23 {

    @Test
    public void testMethod1() throws Exception {

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://cdpn.io/AbdullahSajjad/fullpage/LYGVRgK?anon=true&view=fullpage");

        driver.switchTo().frame("result");


        WebElement button = driver.findElement(By.xpath("//button[contains(text(),'Submit')]"));
        button.click();

        // error will Come

        String input_box_path = "//input[@id= 'username']";
        String small_path = input_box_path+"/following-sibling::small";
        String label_path = input_box_path+"/preceding-sibling::label";
        WebElement error_small_tag = driver.findElement(By.xpath(small_path));
        WebElement label_tag = driver.findElement(By.xpath(label_path));
        System.out.printf(label_tag.getText());

       // Assert.assertEquals(error_small_tag.getText(),"username must be at least 3 characters");
        Assert.assertEquals(error_small_tag.getText(),"Username must be at least 3 characters");




        Thread.sleep(3000);

        driver.quit();

    }
}
