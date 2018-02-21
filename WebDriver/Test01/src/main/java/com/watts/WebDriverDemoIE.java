package com.watts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WebDriverDemoIE {

    public static void main(String[] args) throws InterruptedException {
        
        System.setProperty("webdriver.ie.driver", "C:/Users/U34006/Documents/GitHub/Java/WebDriver/Test01/Drivers/IEDriverServer_2-53.exe");
        WebDriver driver = new InternetExplorerDriver();
        
        // Open the browser
        driver.get("https://ustglobal.sharepoint.com/Home/SitePages/home.aspx");
        
        Thread.sleep(10000);
        
        //Click in the menu bar
        driver.findElement(By.xpath("//button[@title=\"Open the app launcher to access Office 365 apps\"]")).click();
        
        System.out.println("Got here");
        
        Thread.sleep(10000);
        
        // Click the email icon
        driver.findElement(By.className("o365cs-nav-appTileBackground")).click();
        
        // Close the browser
//        driver.close();
    }

}
