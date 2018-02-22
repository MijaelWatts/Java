package com.watts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverDemoChrome4 {
    
    private static WebDriver driver = null;
    
    // For setUp();
    private static final String DRIVER_PATH   = System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe";
    private static final String CHROME_DRIVER = "webdriver.chrome.driver";
    
    private static final String SITE          = "https://ustglobal.sharepoint.com/Home/SitePages/home.aspx";
    private static final String MENU_ICON     = "O365_MainLink_NavMenu";
    private static final String MAIL_ICON     = "O365_AppTile_Mail";
    private static final String NEW_EMAIL     = "//*[@id=\"primaryContainer\"]/div[4]/div/div[1]/div/div[4]/div[1]/div/div[1]/div/div/div[1]/div/button[1]";
    private static final String TO_INPUT      = "//*[@id=\"primaryContainer\"]/div[4]/div/div[1]/div/div[4]/div[3]/div/div[5]/div[1]/div/div[3]/div[4]/div/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div/div/div/span/div[1]/form/input";
    private static final String SUBJECT_INPUT = "//*[@id=\"primaryContainer\"]/div[4]/div/div[1]/div/div[4]/div[3]/div/div[5]/div[1]/div/div[3]/div[4]/div/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[6]/div[2]/div/input";
    private static final String MESSAGE_BODY  = "//*[@id=\"primaryContainer\"]/div[4]/div/div[1]/div/div[4]/div[3]/div/div[5]/div[1]/div/div[3]/div[4]/div/div[1]/div[2]/div[2]/div[2]/div[3]/div/div[3]/div[1]/div[3]/div";
    private static final String SEND_EMAIL    = "//*[@id=\"primaryContainer\"]/div[4]/div/div[1]/div/div[4]/div[1]/div/div[1]/div/div/div[1]/div/button";

    public static void main(String[] args) {
        WebDriverDemoChrome4 demo3 = new WebDriverDemoChrome4();
        
        driver = demo3.setUp();
        WebDriverWait wait = new WebDriverWait(driver, 30);
        
        if (driver != null) {
            demo3.openWebPage(SITE);
            
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id(MENU_ICON)));
            demo3.clickOnElement(By.id(MENU_ICON));
            
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id(MAIL_ICON)));
            demo3.clickOnElement(By.id(MAIL_ICON));
            
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(NEW_EMAIL)));
            demo3.clickOnElement(By.xpath(NEW_EMAIL));
            
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(TO_INPUT)));
            demo3.typeInElement(By.xpath(TO_INPUT), "victor.lopez@ust-global.com");
            demo3.typeInElement(By.xpath(SUBJECT_INPUT), "Automation with Web Driver Demo4");
            demo3.typeInElement(By.xpath(MESSAGE_BODY), "This is the body of the message");
            
            demo3.clickOnElement(By.xpath(SEND_EMAIL));
            
            demo3.millisecondsToWait(10000);
            driver.close();
        }
    }
    
    private WebDriver setUp() {
        System.setProperty(CHROME_DRIVER, DRIVER_PATH);
        
        WebDriver driver = new ChromeDriver();
        
        return driver;
    }
    
    private void openWebPage(String url) {
        driver.get(url);
    }
    
    private void clickOnElement(By by) {
        driver.findElement(by).click();
    }
    
    private void typeInElement(By by, String message) {
        driver.findElement(by).sendKeys(message);
    }
    
    private void millisecondsToWait(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
}
