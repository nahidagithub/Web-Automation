package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Navigations {
    WebDriver driver;
    @BeforeClass
   public void setUp(){
       WebDriverManager.chromedriver().setup();
       driver = new ChromeDriver();
       driver.manage().window().maximize();
   }
   @Test
   public void Navigations() throws InterruptedException {
        driver.navigate().to("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
       Thread.sleep(3000);
       WebElement login=driver.findElement(By.xpath("//a[@href='login.php']"));
       login.click();
       Thread.sleep(3000);

       driver.navigate().back();
       Thread.sleep(2000);
       driver.navigate().forward();
       Thread.sleep(2000);
       driver.navigate().refresh();
       Thread.sleep(2000);
   }

   @AfterClass
   public void closeBrowser(){
       driver.quit();
   }
}
