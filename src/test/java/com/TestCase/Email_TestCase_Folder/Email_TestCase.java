package com.TestCase.Email_TestCase_Folder;

import com.PageObject.Email.SendEmail;
import org.testng.annotations.Test;

public class Email_TestCase {
    SendEmail sendEmail = new SendEmail();
    @Test(priority = 4)
    public void Email_Send()
    {
        sendEmail.MailText();
        System.out.println("Email Send....");
    }
}
