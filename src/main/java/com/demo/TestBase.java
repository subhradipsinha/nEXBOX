package com.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestBase extends DriverManager {
    public static WebDriver driver;
    //ConfigarationManager configarationManager = new ConfigarationManager();


    public static void initilize() throws Exception{
        //com.demo.DriverManager.configarationManager.conficfile();
        DriverManager.browser();

        driver= DriverManager.driver;
        Thread.sleep(5000);
    }

    public static WebElement byXpath(String Email_Address) throws Exception {
        return driver.findElement(By.xpath(ConfigarationManager.OR.getProperty(Email_Address)));

    }
    public static WebElement byId(String Password){
        return driver.findElement(By.id(ConfigarationManager.OR.getProperty(Password)));
    }

    public  boolean isElementPresentXpath(String Sing_In_Xpath )
    {
        WebElement data = driver.findElement(By.xpath(ConfigarationManager.OR.getProperty(Sing_In_Xpath)));
        return true;

    }
}
