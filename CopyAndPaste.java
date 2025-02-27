package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CopyAndPaste {
   WebDriver driver;
   @BeforeClass
    public void startbrowser(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();

    }
    @Test
    public void CopyAndPaste() throws InterruptedException {
       driver.get("https://www.tutorialspoint.com/selenium/practice/register.php");
       WebElement lastName=driver.findElement(By.id("lastname"));
       lastName.sendKeys("Nahida");
        Actions state=new Actions(driver);

        //Select
        state.keyDown(Keys.CONTROL);
        state.sendKeys("a");
        state.keyUp(Keys.CONTROL);
        state.build().perform();
        Thread.sleep(2000);

        //Copy
        state.keyDown(Keys.CONTROL);
        state.sendKeys("c");
        state.keyUp(Keys.CONTROL);
        state.build().perform();
        Thread.sleep(2000);

        //Tab
        state.sendKeys(Keys.TAB);
        state.build().perform();
        Thread.sleep(2000);

        //Paste
        state.keyDown(Keys.CONTROL);
        state.sendKeys("v");
        state.keyUp(Keys.CONTROL);
        state.build().perform();
        Thread.sleep(2000);


    }

    @AfterClass
    public void closebrowser(){
        driver.quit();
    }
}
