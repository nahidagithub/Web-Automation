package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionExample {
    WebDriver driver;
    @BeforeClass
    public void  openBrowser(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test
    public void Assertion() throws InterruptedException {
        driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
        Thread.sleep(2000);
        String expectedTitle="Selenium Practice - Student Registration For";
        String actualTitle=driver.getTitle();
        SoftAssert ss=new SoftAssert();
        ss.assertEquals(actualTitle,expectedTitle);
        System.out.println("Currenturl : " + driver.getCurrentUrl());
        ss.assertAll();
    }
    @AfterClass
    public void stopBrowser(){
        driver.quit();
    }
}
