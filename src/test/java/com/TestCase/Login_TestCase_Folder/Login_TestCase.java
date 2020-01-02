package com.TestCase.Login_TestCase_Folder;

import com.PageObject.Loginpage.LoginPage;
import org.testng.annotations.Test;

@Test(priority = 1)
public class Login_TestCase {
    public static LoginPage loginPage = new LoginPage();
    @Test(priority = 2)
    public void Url_Hit()throws Exception{
        loginPage.init();
    }
    @Test(priority = 3)
    public void Without_Password()throws Exception{
        loginPage.UserName();
           }
    @Test(priority = 4)
    public void Without_UserName()throws Exception{
        loginPage.Password_Data();
            }
    @Test(priority = 5)
    public void With_Username_Password()throws Exception{
        loginPage.LogIn();
    }
}
