package com.watts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverTechniques {
    
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        
        //Radio buttons
        List<WebElement> radioButtons = driver.findElements(By.name("color"));
        radioButtons.get(1).click();
        
        //Check boxes
        WebElement checkBox = driver.findElement(By.id("checkBoxId"));
        checkBox.click();
        
        //Select items
        WebElement selectElement = driver.findElement(By.id("elementId"));
        Select select = new Select(selectElement);
        select.selectByVisibleText("Visible text name");
        
        // Table
        WebElement outerTable = driver.findElement(By.tagName("table"));
        WebElement innerTable = outerTable.findElement(By.tagName("table"));
        WebElement td = innerTable.findElements(By.tagName("td")).get(1);
        System.out.println("TD gotten: " + td);
        
        // Xpath
        WebElement row = driver.findElement(By.xpath("spath here"));
        System.out.println("TD gotten: " + row.getText());
        
        // Implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        // Explicit Wait
        WebDriverWait driverWait = new WebDriverWait(driver, 10);
        driverWait.until(ExpectedConditions.presenceOfElementLocated(By.id("Element to be located.")));
    }
}
