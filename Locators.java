package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.List;

public class Locators {
    WebDriver driver;
    @BeforeSuite
    public void startBrowser(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }
    @AfterSuite
    public void stopBrowser() {
        driver.close();
    }
    @Test(priority = 0)
    public void locatorsById() throws InterruptedException {
        driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
        WebElement FirstName=driver.findElement(By.id("name"));
        FirstName.sendKeys("Nahida Akter");
        Thread.sleep(3000);
        FirstName.clear();
    }
    @Test(priority = 1)
    public void locatorsByEmail() throws InterruptedException {
        driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
        WebElement email=driver.findElement(By.name("email"));
        email.sendKeys("akternahida625@gmail.com");
        Thread.sleep(3000);

    }
    @Test(priority = 2)
    public void LocatorsByLink() throws InterruptedException {
        driver.get("https://www.facebook.com/");
        WebElement linkText=driver.findElement(By.linkText("Forgotten password?"));
        linkText.click();
        Thread.sleep(3000);
    }
    @Test(priority=3)
    public void LocatorsByPartialLink() throws InterruptedException {
        driver.get("https://www.facebook.com/");
        WebElement partialLink=driver.findElement(By.partialLinkText("Forgott"));
        partialLink.click();
        Thread.sleep(3000);
    }
    @Test(priority = 4)
    public void LocatorsByList() throws InterruptedException {
        driver.navigate().to("https://www.facebook.com/");
        List<WebElement> linkList=driver.findElements(By.tagName("a"));
        System.out.println(linkList.size());
        for(WebElement link:linkList){
            System.out.println(link.getText());
        }

    }
}
