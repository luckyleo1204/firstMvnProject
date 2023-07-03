package com.mtestproject.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SecondSelenium {
    WebDriver driver;

    @BeforeMethod(alwaysRun = true)
    public void init(){
        System.setProperty("webdriver.chrome.driver","C:\\Softwares\\drivers\\chromedriver.exe");
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver=new ChromeDriver(options);
        driver.manage().window().maximize();
    }

    @Test(groups = {"Smoke","high"})
    public void test1(){
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(),"Google");
    }

    @Test(groups = {"Sanity","high"})
    public void test2(){
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(),"Google");
    }

    @Test(groups = {"Smoke","medium"})
    public void test3(){
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(),"Google");
    }

    @AfterMethod(alwaysRun = true)
    public void teardown(){
        driver.close();
    }
}
