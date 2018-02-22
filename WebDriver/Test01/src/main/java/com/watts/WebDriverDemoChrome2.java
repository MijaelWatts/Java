package com.watts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverDemoChrome2 {

    /**
     * TODO: 
     *  Remove the Exception
     *  Call demo2.setUp() inside demo2.whatToDo()
     */
    public static void main(String[] args) throws Exception {
        WebDriverDemoChrome2 demo2 = new WebDriverDemoChrome2();
        
        WebDriver driver = demo2.setUp();
        
        demo2.whatToDo(demo2, driver);
    }
    
    private WebDriver setUp() {
        String userPath   = System.getProperty("user.dir");
        String staticPath = "\\Drivers\\chromedriver.exe";
        String driverPath = userPath + staticPath;

        System.setProperty("webdriver.chrome.driver", driverPath);
        WebDriver driver = new ChromeDriver();
        
        return driver;
    }
    
    private void whatToDo(WebDriverDemoChrome2 demo2, WebDriver driver) throws Exception {
        demo2.openWebPage(driver, "https://ustglobal.sharepoint.com/Home/SitePages/home.aspx");
        
        millisecondsToWait(10000);
        demo2.clickOnElement(driver, By.xpath("//*[@id=\"O365_MainLink_NavMenu\"]"));
        
        millisecondsToWait(10000);
        demo2.clickOnElement(driver, By.className("o365cs-nav-appTileBackground"));
        
        millisecondsToWait(10000);
        demo2.clickOnElement(driver, By.xpath("//*[@id=\"primaryContainer\"]/div[4]/div/div[1]/div/div[4]/div[1]/div/div[1]/div/div/div[1]/div/button[1]"));
        
        millisecondsToWait(10000);
        demo2.typeInElement(driver, By.xpath("//*[@id=\"primaryContainer\"]/div[4]/div/div[1]/div/div[4]/div[3]/div/div[5]/div[1]/div/div[3]/div[4]/div/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div/div/div/span/div[1]/form/input"), "victor.lopez@ust-global.com");
        demo2.typeInElement(driver, By.xpath("//*[@id=\"primaryContainer\"]/div[4]/div/div[1]/div/div[4]/div[3]/div/div[5]/div[1]/div/div[3]/div[4]/div/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[6]/div[2]/div/input"), "Automation with Web Driver Demo2");
        demo2.typeInElement(driver, By.xpath("//*[@id=\"primaryContainer\"]/div[4]/div/div[1]/div/div[4]/div[3]/div/div[5]/div[1]/div/div[3]/div[4]/div/div[1]/div[2]/div[2]/div[2]/div[3]/div/div[3]/div[1]/div[3]/div"), "This is the body of the message");
        
        demo2.clickOnElement(driver, By.xpath("//*[@id=\"primaryContainer\"]/div[4]/div/div[1]/div/div[4]/div[1]/div/div[1]/div/div/div[1]/div/button"));
        
        millisecondsToWait(10000);
        driver.close();
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
    
    private void millisecondsToWait(int milliseconds) throws Exception {
        Thread.sleep(milliseconds);
    }
    
}
