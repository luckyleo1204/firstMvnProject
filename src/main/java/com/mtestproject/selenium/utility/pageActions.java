package com.mtestproject.selenium.utility;

import com.mtestproject.selenium.Base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.mtestproject.selenium.Base.BaseTest.driver;

public class pageActions  {

    WebDriver driver;
    public pageActions(WebDriver driver){
        this.driver=driver;
    }

    public void clickButton(WebElement element){
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofMillis(200));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

        public void enterData(WebElement element,String s){
            WebDriverWait wait=new WebDriverWait(driver, Duration.ofMillis(200));
            wait.until(ExpectedConditions.visibilityOf(element));
            element.sendKeys(s);
        }

    public void selectValueFromList(){

    }
}
