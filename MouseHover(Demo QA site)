package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

public class MouseHover {
    WebDriver driver;
    @BeforeClass
    public void StartBrowser(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test
    public void Mousehover() throws InterruptedException {
        driver.get("http://www.automationpractice.pl/index.php");
        WebElement woman=driver.findElement(By.xpath("//a[@title='Women']"));
        Actions action=new Actions(driver);
        action.moveToElement(woman).perform();

        Thread.sleep(3000);
        WebElement summer_dress=driver.findElement(By.xpath("//a[@title='Summer Dresses']"));
        summer_dress.click();
        Thread.sleep(3000);


    }
    @Test
    public void Mousehover2() throws InterruptedException {
        driver.get("http://www.automationpractice.pl/index.php");
        WebElement women=driver.findElement(By.xpath("//a[@title='Women']"));
        hover(women);

        Thread.sleep(3000);
        WebElement summer_dress=driver.findElement(By.xpath("//a[@title='Summer Dresses']"));
        summer_dress.click();
        Thread.sleep(3000);


    }
    @AfterClass
    public void closeBrowser(){
        driver.quit();
    }
    public void hover(WebElement element){
        Actions woman=new Actions(driver);
        woman.moveToElement(element).perform();
    }

}
