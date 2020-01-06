package com.demo;

import com.sun.java.swing.plaf.windows.WindowsBorders;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import sun.security.krb5.Config;

public class DriverManager extends ConfigarationManager {
    //public static ConfigarationManager configarationManager = new ConfigarationManager();
    public static WebDriver driver;


    public static void browser() throws Exception {

        ConfigarationManager.conficfile();
        String Url = ConfigarationManager.config.getProperty("URL");
        String browsername = ConfigarationManager.config.getProperty("browser");
        if (browsername.equalsIgnoreCase("Chrome")) {

//            WebElement frm = driver.findElement(By.xpath("//iframe[@tabindex='0']"));
//    driver.switchTo().frame(frm); using Frame
            System.setProperty("webdriver.chrome.driver", "D:\\com_nexbox_demo\\Driver\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }
        driver.get(Url);
        System.out.println("URL HIT");
        WebDriverWait wait=new WebDriverWait(driver, 20);
        System.out.println("URL Open");
    }
}