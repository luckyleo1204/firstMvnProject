package com.mtestproject.selenium;

import com.mtestproject.selenium.Base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SecondSelenium extends BaseTest {

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

  }
