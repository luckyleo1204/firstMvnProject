package com.mtestproject.selenium.Tests;

import com.mtestproject.selenium.Base.BaseTest;
import com.mtestproject.selenium.pages.testingWorldRegPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.time.Duration;

public class testingWorldRegPageTest extends BaseTest {
    @Test
    public void TestCase01() {
        driver.get("https://www.thetestingworld.com/testings/");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofMillis(5000));
        testingWorldRegPage trp = PageFactory.initElements(driver, testingWorldRegPage.class);
        trp.feedData();
    }
}
