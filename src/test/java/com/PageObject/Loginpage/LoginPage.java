package com.PageObject.Loginpage;

import com.demo.TestBase;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;


/**
 * @author Subhradip Sinha
 * Start Date : 26th Dec 2019
 */


public class LoginPage extends TestBase {
    @Test
    public void init() throws Exception {
        // Call URL Hit
        TestBase.initilize();
    }
    @Test
    public void UserName()throws Exception {
        // Email ID Given
        TestBase.byXpath("Email_Address_Xpath").sendKeys(TestData.getProperty("Email_Address"));
        Thread.sleep(2000);
        // Click Login button
        TestBase.byXpath("Sing_In_Xpath").click();
        Thread.sleep(2000);
        //Clear Email Filled
        TestBase.byXpath("Email_Address_Xpath").clear();
        // Refresh Total page
        driver.navigate().refresh();
        Thread.sleep(5000);
        System.out.println("UserName Test 1 complete");


        // Apply for condition
        Boolean isPresent = driver.findElements(By.id("DashBoard")).size()>0;

        if (isPresent == true) {
            System.out.println("Successfully Dashboard show List");
        } else {
            System.out.println("Not show Dashboard show List");
            Assert.assertTrue(isPresent, "WithOut Password Successfully login...==");
        }

    }
   @Test
    public void Password_Data()throws Exception{
        //Password Given
        TestBase.byXpath("Password_Xpath").sendKeys(TestData.getProperty("Password"));
        // Click Login Button
        TestBase.byXpath("Sing_In_Xpath").click();
        Thread.sleep(2000);
        //Clear Password filled
        TestBase.byXpath("Password_Xpath").clear();
        // refresh Total Page
        driver.navigate().refresh();
        Thread.sleep(5000);
        System.out.println("Password_Data Test 2 complete");

        // Apply for condition
        Boolean isPresent = driver.findElements(By.id("DashBoard")).size()>0;

        if (isPresent == true) {
            System.out.println("Successfully Dashboard show List");
        } else {
            System.out.println("Not show Dashboard show List");
            Assert.assertTrue(isPresent, "WithOut UserName Successfully login...==");
        }
    }
    @Test
    public void LogIn()throws Exception{
        //Email Address Given
        TestBase.byXpath("Email_Address_Xpath").sendKeys(TestData.getProperty("Email_Address"));
        Thread.sleep(2000);
        //Password Given
        TestBase.byXpath("Password_Xpath").sendKeys(TestData.getProperty("Password"));
        Thread.sleep(2000);

        //Click Login Button
        TestBase.byXpath("Sing_In_Xpath").click();
        Thread.sleep(2000);
        System.out.println("LogIn Test 3 complete");

        // Apply for condition
        Boolean isPresent = driver.findElements(By.name("DashBoard")).size()>0;
        if (isPresent == true) {
            System.out.println("Successfully Dashboard show List");
        } else {
            System.out.println("Not show Dashboard show List");
           // Assert.assertTrue(isPresent, "With UserName & Password Successfully login==");
            Assert.assertEquals(isPresent,isPresent,"With UserName & Password Successfully login==");
        }
    }
    @Test
    public void Quite(){
        System.out.println("LogOut Successfully");
    }

}
