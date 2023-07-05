package com.mtestproject.selenium.pages;

import com.mtestproject.selenium.Base.BaseTest;
import com.mtestproject.selenium.utility.pageActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class testingWorldRegPage extends BaseTest{
    WebDriver driver=null;
    pageActions actions;
    public testingWorldRegPage(WebDriver driver){
        this.driver=driver;
        actions= new pageActions(driver);
    }
    @FindBy(how= How.NAME,using="fld_username")
    @CacheLookup
    public WebElement username;
    @FindBy(how= How.NAME,using="fld_email")
    @CacheLookup
    public WebElement email;
    @FindBy(how= How.NAME,using="fld_password")
    @CacheLookup
    public WebElement password;

    public  void feedData(){
        actions.enterData(username,"Test");
        actions.enterData(email,"test@test.com");
        actions.enterData(password,"121212");
//              password.clear();
//        password.sendKeys("112121");
    }

}
