package com.mtestproject.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class seleniumPractice {

    WebDriver driver;

    @BeforeMethod(alwaysRun = true)
    public void init(){
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver=new ChromeDriver(options);
        driver.manage().window().maximize();
    }

    @Test(groups = {"Smoke","medium"})
    public void gurucourses() throws InterruptedException {
       driver.get("https://www.guru99.com/");
        printCourseName("AI");
        }

        @Test
        public void getSearchResult(){
            driver.get("https://www.google.com/");
            driver.findElement(By.name("q")).sendKeys("Selenium");
                driver.manage().timeouts().pageLoadTimeout(Duration.ofMillis(25000));
            List<WebElement> al=driver.findElements(By.xpath("(//ul[@role=\"listbox\"])[1]/li"));
            System.out.println(al.size());
            for(int i=1;i<al.size();i++){
                String txt=driver.findElement(By.xpath("(//ul[@role=\"listbox\"])[1]/li["+i+"]/div/div[2]/div[1]")).getAttribute("aria-label");
                System.out.println(txt);
            }
        }
    public void printCourseName(String courseType){
        List<WebElement> al =driver.findElements(By.xpath("//h4/b[text()='"+courseType+"']//parent::h4//following-sibling::ul[1]/li"));
        System.out.println(al.size());
        for(WebElement i: al)
            System.out.println(i.getText());
    }



    @AfterMethod(alwaysRun = true)
    public void teardown(){
        driver.close();
    }
}
