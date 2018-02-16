package com.watts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverDemo {

    public static void main(String[] args) throws Exception {
        String userPath   = System.getProperty("user.dir");
        String staticPath = "\\Drivers\\chromedriver.exe";
        String driverPath = userPath + staticPath;

        System.setProperty("webdriver.chrome.driver", driverPath);
        WebDriver driver = new ChromeDriver();
        
         driver.get("https://ustglobal.sharepoint.com/Home/SitePages/home.aspx"); // Opening kubera
         
         Thread.sleep(5000);
         
         driver.findElement(By.xpath("//*[@id=\"O365_MainLink_NavMenu\"]")).click();
         
         Thread.sleep(5000);
         
         driver.findElement(By.className("o365cs-nav-appTileBackground")).click();
         
        Thread.sleep(10000);

        driver.findElement(By.xpath("//*[@id=\"primaryContainer\"]/div[4]/div/div[1]/div/div[4]/div[1]/div/div[1]/div/div/div[1]/div/button[1]")).click();

        Thread.sleep(15000);
        
        driver.findElement(By.xpath("//*[@id=\"primaryContainer\"]/div[4]/div/div[1]/div/div[4]/div[3]/div/div[5]/div[1]/div/div[3]/div[4]/div/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div/div/div/span/div[1]/form/input")).sendKeys("victor.lopez@ust-global.com");
        
        driver.findElement(By.xpath("//*[@id=\"primaryContainer\"]/div[4]/div/div[1]/div/div[4]/div[3]/div/div[5]/div[1]/div/div[3]/div[4]/div/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[6]/div[2]/div/input")).sendKeys("Automation with web driver");

        driver.findElement(By.xpath("//*[@id=\"primaryContainer\"]/div[4]/div/div[1]/div/div[4]/div[3]/div/div[5]/div[1]/div/div[3]/div[4]/div/div[1]/div[2]/div[2]/div[2]/div[3]/div/div[3]/div[1]/div[3]/div")).sendKeys("This message was written using selenium web driver with Java.");

        Thread.sleep(5000);
        
        driver.findElement(By.xpath("//*[@id=\"primaryContainer\"]/div[4]/div/div[1]/div/div[4]/div[1]/div/div[1]/div/div/div[1]/div/button")).click();
    }

}
