package com.mtestproject.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class firstSelenium {

    WebDriver driver;

    @BeforeMethod(alwaysRun = true)
    public void init(){
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver=new ChromeDriver(options);
        driver.manage().window().maximize();
    }

    //@Test(groups = {"Smoke","medium"})
    @Test(enabled = false)
    public void flipkartSearch(){
        driver.get("https://www.flipkart.com/");
        driver.findElement(By.xpath("//button[text()='✕']")).click();
        WebElement search=driver.findElement(By.xpath("//input[@name=\"q\"]"));
        search.sendKeys("apple phone");
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
        List<WebElement> al=driver.findElements(By.xpath("//div[text()='₹71,999']/parent::div/parent::div/parent::div/parent::div/div/div"));
        for(WebElement i: al)
            System.out.println(i.getText());
    }



    @Test(groups = {"Sanity","high"})
    public void validateLinkStatus() throws IOException {
        driver.get("https://www.google.com");
        List<WebElement> al=driver.findElements(By.tagName("a"));
        List<WebElement> alnew=new ArrayList<>();
        for(WebElement i: al){
            if(i.getAttribute("href")!=null){
                alnew.add(i);
            }
        }

        for(WebElement i: alnew){
            System.out.println("Link==>"+i.getAttribute("href")+"==>"+getStatus(new URL(i.getAttribute("href"))));

        }
    }


    private String getStatus(URL url) throws IOException {
        String status=null;
        HttpURLConnection connection= (HttpURLConnection) url.openConnection();
        connection.connect();
        status=connection.getResponseMessage();
        connection.disconnect();
        return  status;
    }


    @AfterMethod(alwaysRun = true)
    public void teardown(){
        driver.close();
    }
}
