package com.mtestproject.selenium.Base;

import com.mtestproject.selenium.utility.PropertyReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;

public class BaseTest {

    public static WebDriver driver;

    @BeforeMethod(alwaysRun = true)
    public void init() throws IOException {
        if(PropertyReader.getProperty("browser").equalsIgnoreCase("Chrome"))
        {
            System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
            ChromeOptions options=new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
            driver=new ChromeDriver(options);
        }
        else if(PropertyReader.getProperty("browser").equalsIgnoreCase("firefox"))
            {
            System.out.println("FireFox Driver");
            }
        else{
            System.out.println("IE Driver");
        }


        driver.manage().window().maximize();
    }

    @AfterMethod(alwaysRun = true)
    public void teardown(){
      driver.close();
    }
}
