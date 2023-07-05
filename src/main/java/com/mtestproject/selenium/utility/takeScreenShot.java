package com.mtestproject.selenium.utility;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.UUID;


public class takeScreenShot {

    public static void getSS(WebDriver driver) throws IOException {
        TakesScreenshot screenshot=(TakesScreenshot) driver;
        FileUtils.copyFile(screenshot.getScreenshotAs(OutputType.FILE),new File("screenShots/"+getFileName()+".png"));
    }

    public static String getFileName(){
       // return UUID.randomUUID().toString().replace("-", "");
        Calendar c=Calendar.getInstance();
      return  c.getTime().toString().replace(":","").replace(" ","");
    }
}
