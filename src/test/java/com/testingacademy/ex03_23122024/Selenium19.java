package com.testingacademy.ex03_23122024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Selenium19 {

    @Test
    public void testMethod1() throws Exception {

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://vwo.com/free-trial/");

       // <input
        // class="W(100%) Py(14px) input-text"
        // placeholder="name@yourcompany.com"
        // type="email"
        // id="page-v1-step1-email"
        // name="email"
        // data-qa="page-su-step1-v1-email"
        // required="">

       WebElement email = driver.findElement(By.id("page-v1-step1-email"));
       email.sendKeys("dsdsdsdsdddsdd");

        Thread.sleep(5000);

       //<input
        // class="Cur(p) Flxs(0) M(0) Pos(r) T(2px)"
        // type="checkbox"
        //name="gdpr_consent_checkbox"
        // id="page-54cu-gdpr-consent-checkbox"
        // value="true" data-qa="page-gdpr-consent-checkbox"
        // data-gtm-form-interact-field-id="0">

        WebElement checkbox_policy = driver.findElement(By.id("gdpr_consent_checkbox"));
        checkbox_policy.click();

        //<button
        // type="submit"
        // class="button W(100%) btn-modal-form-submit
        // button--disabled-primary"
        // data-qa="page-su-submit"
        // disabled="disabled">Create a Free Trial Account</button>

        List<WebElement> button_list = driver.findElements(By.tagName("button"));
        button_list.get(0).click();

        WebElement error_message = driver.findElement(By.className("invalid-reason"));
        Assert.assertEquals(error_message.getText(),"The email address you entered is incorrect.");

        Thread.sleep(3000);

        driver.quit();

    }
}
