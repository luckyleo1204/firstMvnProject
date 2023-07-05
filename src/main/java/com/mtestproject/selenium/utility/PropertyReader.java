package com.mtestproject.selenium.utility;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {

    public static String getProperty(String key) throws IOException {
       File f=new File("config/applicationConfig.properties");
        FileReader fis=new FileReader(f);
        Properties pr=new Properties();
        pr.load(fis);
        return pr.getProperty(key).toString();
    }
}
