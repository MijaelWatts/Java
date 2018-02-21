package com.watts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverDemoChrome2 {

    public static void main(String[] args) throws InterruptedException {
        WebDriverDemoChrome2 webDriverDemo2 = new WebDriverDemoChrome2();
        
        WebDriver driver = webDriverDemo2.setUp();
        
        webDriverDemo2.openWebPage(driver, "https://ustglobal.sharepoint.com/Home/SitePages/home.aspx");
        
        Thread.sleep(5000);
        webDriverDemo2.clickOnElement(driver, By.xpath("//*[@id=\"O365_MainLink_NavMenu\"]"));
        
        Thread.sleep(5000);
        webDriverDemo2.clickOnElement(driver, By.className("o365cs-nav-appTileBackground"));
        
        Thread.sleep(5000);
        webDriverDemo2.clickOnElement(driver, By.xpath("//*[@id=\"primaryContainer\"]/div[4]/div/div[1]/div/div[4]/div[1]/div/div[1]/div/div/div[1]/div/button[1]"));
        
        Thread.sleep(5000);
        webDriverDemo2.typeInElement(driver, By.xpath("//*[@id=\"primaryContainer\"]/div[4]/div/div[1]/div/div[4]/div[3]/div/div[5]/div[1]/div/div[3]/div[4]/div/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div/div/div/span/div[1]/form/input"), "victor.lopez@ust-global.com");
        webDriverDemo2.typeInElement(driver, By.xpath("//*[@id=\"primaryContainer\"]/div[4]/div/div[1]/div/div[4]/div[3]/div/div[5]/div[1]/div/div[3]/div[4]/div/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[6]/div[2]/div/input"), "Automation with Web Driver Yeiiii");
        webDriverDemo2.typeInElement(driver, By.xpath("//*[@id=\"primaryContainer\"]/div[4]/div/div[1]/div/div[4]/div[3]/div/div[5]/div[1]/div/div[3]/div[4]/div/div[1]/div[2]/div[2]/div[2]/div[3]/div/div[3]/div[1]/div[3]/div"), "This is the body of the message");
        
        webDriverDemo2.clickOnElement(driver, By.xpath("//*[@id=\"primaryContainer\"]/div[4]/div/div[1]/div/div[4]/div[1]/div/div[1]/div/div/div[1]/div/button"));
        
        Thread.sleep(5000);
        driver.close();
    }
    
    private WebDriver setUp() {
        String userPath   = System.getProperty("user.dir");
        String staticPath = "\\Drivers\\chromedriver.exe";
        String driverPath = userPath + staticPath;

        System.setProperty("webdriver.chrome.driver", driverPath);
        WebDriver driver = new ChromeDriver();
        
        return driver;
    }
    
    private void openWebPage(WebDriver driver, String url) {
        driver.get(url);
    }
    
    private void clickOnElement(WebDriver driver, By by) {
        driver.findElement(by).click();
    }
    
    private void typeInElement(WebDriver driver, By by, String message) {
        driver.findElement(by).sendKeys(message);
    }
    
}
