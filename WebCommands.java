package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class WebCommands {
    WebDriver driver;
    @BeforeClass
    public void startBrowser(){

        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test
    public void webCommands() throws InterruptedException {
        driver.navigate().to("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
        Thread.sleep(2000);
        WebElement home=driver.findElement(By.xpath("//a[@href='https://www.tutorialspoint.com']"));

        home.click();
        Thread.sleep(2000);
        String CurrentUrl=driver.getCurrentUrl();
        System.out.println("Current Url:"+CurrentUrl);
    }
    @Test
    public void sendValues() throws InterruptedException {
        driver.navigate().to("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
     WebElement firstName=  driver.findElement(By.id("name"));
     firstName.sendKeys("Nahida Akter");
     Thread.sleep(3000);
     firstName.clear();
     firstName.sendKeys("Nadia");
     Thread.sleep(3000);
     String attributeValue=firstName.getAttribute("placeholder");
     System.out.println("AttributeValue: "+attributeValue);
     String cssColor=firstName.getCssValue("color");
     System.out.println("CssColor: " +cssColor);

     WebElement text=driver.findElement(By.xpath("//h1[contains(text(),'Selenium - Automation Practice Form')]"));
     System.out.println("TextValue: " +text.getText());


    }

    @AfterClass
    public void closeBrowser(){
        driver.quit();
    }
}
