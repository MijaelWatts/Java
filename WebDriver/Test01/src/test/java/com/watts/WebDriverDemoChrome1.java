package com.watts;

import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WebDriverDemoChrome1 {

    private WebDriver driver;
    private WebDriverWait wait;
    
    private final String SITE          = "https://ustglobal.sharepoint.com/Home/SitePages/home.aspx";
    private final String MENU_ICON     = "O365_MainLink_NavMenu";
    private final String MAIL_ICON     = "O365_AppTile_Mail";
    private final String NEW_EMAIL     = "//*[@id=\"primaryContainer\"]/div[4]/div/div[1]/div/div[4]/div[1]/div/div[1]/div/div/div[1]/div/button[1]";
    private final String TO_INPUT      = "//*[@id=\"primaryContainer\"]/div[4]/div/div[1]/div/div[4]/div[3]/div/div[5]/div[1]/div/div[3]/div[4]/div/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div/div/div/span/div[1]/form/input";
    private final String SUBJECT_INPUT = "//*[@id=\"primaryContainer\"]/div[4]/div/div[1]/div/div[4]/div[3]/div/div[5]/div[1]/div/div[3]/div[4]/div/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[6]/div[2]/div/input";
    private final String MESSAGE_BODY  = "//*[@id=\"primaryContainer\"]/div[4]/div/div[1]/div/div[4]/div[3]/div/div[5]/div[1]/div/div[3]/div[4]/div/div[1]/div[2]/div[2]/div[2]/div[3]/div/div[3]/div[1]/div[3]/div";
    private final String SEND_EMAIL    = "//*[@id=\"primaryContainer\"]/div[4]/div/div[1]/div/div[4]/div[1]/div/div[1]/div/div/div[1]/div/button";

    
    @BeforeClass
    public void setUp() {
        String userPath = System.getProperty("user.dir");
        String staticPath = "\\Drivers\\chromedriver.exe";
        String driverPath = userPath + staticPath;

        System.setProperty("webdriver.chrome.driver", driverPath);

        driver = new ChromeDriver();
        wait   = new WebDriverWait(driver, 30);
    }
    
    @AfterClass
    public void closeBrowser() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        driver.close();
    }

    @Test //(groups = {"init"})
    public void validateChromeIsOpen() {
        driver.get(SITE);
        
        Assert.assertEquals(SITE, driver.getCurrentUrl());
    }
    
    @Test 
    public void validateEmailIconIsPresent() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id(MENU_ICON)));
        driver.findElement(By.id(MENU_ICON)).click();
        
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id(MAIL_ICON)));
        
        boolean mailIconDisplayed = driver.findElement(By.id(MAIL_ICON)).isDisplayed();
        
        Assert.assertTrue(mailIconDisplayed);
    }
    
    @Test //(dependsOnGroups = {"init.*"})
    public void validateSentEmail() {
        clickOnElement(By.id(MAIL_ICON));
        
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(NEW_EMAIL)));
        clickOnElement(By.xpath(NEW_EMAIL));
        
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(TO_INPUT)));
        typeInElement(By.xpath(TO_INPUT), "victor.lopez@ust-global.com");
        typeInElement(By.xpath(SUBJECT_INPUT), "Automation with Web Driver and TestNG");
        typeInElement(By.xpath(MESSAGE_BODY), "This is the body of the message");
        
        boolean sendButtonDisplayed = driver.findElement(By.xpath(SEND_EMAIL)).isDisplayed();
        
        Assert.assertTrue(sendButtonDisplayed);
        
        if (sendButtonDisplayed) {
            clickOnElement(By.xpath(SEND_EMAIL));
        }
    }

    private void clickOnElement(By by) {
        driver.findElement(by).click();
    }
    
    private void typeInElement(By by, String message) {
        driver.findElement(by).sendKeys(message);   
    }
}
