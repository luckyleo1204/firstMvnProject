package com.mtestproject.selenium;

import com.mtestproject.selenium.Base.BaseTest;
import com.mtestproject.selenium.utility.takeScreenShot;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class crickinfo extends BaseTest {



    @Test(groups = {"Smoke","medium"})
    public void flipkartSearch() throws InterruptedException, IOException {
        driver.get("https://www.espncricinfo.com/series/icc-cricket-world-cup-qualifier-2023-1377745/netherlands-vs-oman-25th-match-super-six-1377772/live-cricket-score");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofMillis(5000));
       List<WebElement> a=driver.findElements(By.xpath("//*[@id=\"main-container\"]/div[3]/div/div/div[2]/div[4]/div[2]/div/div/div[1]/div/table[@class=\"ds-w-full ds-table ds-table-xs ds-table-auto \"]/tbody[1]/tr/td[5][text()>0]/parent::tr/td/a/span"));
        System.out.println(a.size());
       for(WebElement i: a)
           System.out.println(i);
        takeScreenShot.getSS(driver);
    }

}
