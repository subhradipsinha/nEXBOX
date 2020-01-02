package com.PageObject.Email;


import org.openqa.selenium.Keys;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.util.Properties;

public class SendEmail {
    public  void MailText() {
        String to = "spradhan@newamps.co.in";
        String from = "ssinha@newamps.co.in";
        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "newamps.co.in");
        properties.put("mail.smtp.port", 587);


        Session session = Session.getDefaultInstance(properties, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("ssinha@newamps.co.in", "ssh@2019");
            }
        });
        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setSubject("nEXBOX TestCase Report");
            BodyPart messageBodyPart = new MimeBodyPart();
            messageBodyPart.setText("Respected Sir/Ma'am," +" \n "+"\n"+
                    "Let to inform you It's your  Software Testing Report..So Please Fixed the Bug Issue Urgent Basis.." +
                    " \n "+"Please Find the Attachment File"+"\n"+"\n"+
                    "Thanking You To Give me the Valuable Time..");

            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(messageBodyPart);
            messageBodyPart = new MimeBodyPart();
            String filename = "OutPut/emailable-report.html";
            FileDataSource source =  new FileDataSource(filename);
            messageBodyPart.setDataHandler(new DataHandler((source)));
            messageBodyPart.setFileName(filename);
            multipart.addBodyPart(messageBodyPart);
            message.setContent(multipart);
            Transport.send(message);
            System.out.println("Send mail successfully");
        }
        catch (MessagingException mex) {
            mex.printStackTrace();

        }
    }
}
