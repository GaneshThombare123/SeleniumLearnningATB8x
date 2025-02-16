package com.testingacademy.ex03_30122024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class Selenium21 {

    @Test
    public void testMethod1() throws Exception {

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://www.idrive360.com/enterprise/login");

       //  driver.manage().window().maximize(); --> To maximize driver window

       // <input _ngcontent-jtl-c4="" autofocus=""
        // class="id-form-ctrl ng-pristine ng-valid ng-touched"
        // id="username"
        // name="username"
        // type="email">

      //      WebElement username_input_id = driver.findElement(By.id("username"));
      //      username_input_id.sendKeys("augtest_040823@idrive.com");
     //        WebElement username_input_name = driver.findElement(By.name("username"));
     //        WebElement username_input_classname = driver.findElement(By.className("id-form-ctrl"));


       WebElement username_input_xpath = driver.findElement(By.xpath("//input[@id ='username']"));
       username_input_xpath.sendKeys("augtest_040823@idrive.com");


        //<input _ngcontent-jtl-c4=""
        // class="id-form-ctrl ng-pristine ng-valid ng-touched"
       // id="password" maxlength="20"
       // name="password" tabindex="0"
       // type="password">

        WebElement password_input_xpath = driver.findElement(By.xpath("//input[@id ='password']"));
        password_input_xpath.sendKeys("123456");

        //<button _ngcontent-jtl-c4=""
        // class="id-btn id-info-btn-frm"
        // id="frm-btn"
        // type="submit">Sign in</button>

        WebElement sign_in_button_xpath = driver.findElement(By.xpath("//input[@id ='frm-btn']"));
        sign_in_button_xpath.click();

        Thread.sleep(6000);

       //<h5 _ngcontent-gxb-c10=""
       // class="id-card-title">Your free trial has expired</h5>

        WebElement error_message = driver.findElement(By.xpath("//hs[@class ='id-card-title']"));
        error_message.getText();


        Thread.sleep(3000);

        driver.quit();

    }
}
