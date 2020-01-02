package com.demo;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigarationManager {
    /**
     * @param config : It read the configuratio
     *
     */
    public static Properties config;
    public static Properties OR;
    public static Properties TestData;


    public static void conficfile() throws Exception {

        //Read confic file
        File con = new File("D:\\com_nexbox_demo\\src\\main\\resources\\Config.properties");
        FileInputStream file = new FileInputStream(con);
        config = new Properties();
        config.load(file);
        System.out.println(config.getProperty("browser"));

        //Read OR file
        File con1 = new File("D:\\com_nexbox_demo\\src\\main\\resources\\OR.properties");
        FileInputStream file1 = new FileInputStream(con1);
        OR = new Properties();
        OR.load(file1);
        System.out.println(OR.getProperty("username"));

        //Read TestData file
        File con2 = new File("D:\\com_nexbox_demo\\src\\main\\resources\\TestData.properties");
        FileInputStream file2 = new FileInputStream(con2);
        TestData = new Properties();
        TestData.load(file2);
        System.out.println(TestData.getProperty("Email_Address"));
    }

    public static String getxpath(String key){
        return OR.getProperty(key);
    }
}