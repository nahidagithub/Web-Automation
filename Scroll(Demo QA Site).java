package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static java.awt.SystemColor.window;

public class Scroll {
    WebDriver driver;
    @BeforeClass
    public void StartBrowser(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void scroll() throws InterruptedException {
        driver.get("http://www.automationpractice.pl/index.php");
       String scroll_down="window.scrollTo(0,document.body.scrollHeight);";
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript(scroll_down);
        Thread.sleep(2000);

        String scroll_up="window.scrollTo(0, 0);";
        js.executeScript(scroll_up);
        Thread.sleep(2000);


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
