package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SelectValueFromDropdownbox {
    WebDriver driver;
    @BeforeClass
    public void StartBrowser(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test
    public void SelectValue() throws InterruptedException {
        driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
        WebElement state=driver.findElement(By.xpath("//select[@id='state']"));
        Select select=new Select(state);
        //Select by index
        select.selectByIndex(2);
        Thread.sleep(2000);
        //Select By Value
        select.selectByValue("NCR");
        Thread.sleep(2000);
        //Select By Visible Text
        select.selectByVisibleText("Haryana");
        Thread.sleep(2000);
    }
    @AfterClass
    public void closeBrowser(){
        driver.quit();
    }
}
