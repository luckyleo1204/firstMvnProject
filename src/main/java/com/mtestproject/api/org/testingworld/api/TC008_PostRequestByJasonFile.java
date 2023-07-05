package com.mtestproject.api.org.testingworld.api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;

public class TC008_PostRequestByJasonFile {
    String Baseurl = "https://thetestingworldapi.com/api/studentsDetails";
    RequestSpecification rs;
    @BeforeMethod
    public void config(){
        File jsonbody=new File("jasonInputFolder/AddStudent.json");
        rs = RestAssured.given();
        rs.header("Content-Type", "application/json");
        rs.body(jsonbody);
        rs.log().all();
    }

    @Test
    public void TC008_AddNewStudentusingJsonFile() {
        Response respone = rs.post(Baseurl);
        System.out.println(respone.asPrettyString());
        Assert.assertEquals(respone.getStatusCode(),201);
    }
}