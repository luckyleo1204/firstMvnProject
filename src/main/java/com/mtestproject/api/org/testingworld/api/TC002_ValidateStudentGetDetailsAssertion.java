package com.mtestproject.api.org.testingworld.api;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC002_ValidateStudentGetDetailsAssertion {
    String url="https://thetestingworldapi.com/api/studentsDetails/7621756";
    @Test
    public void tc002_getStudentDetails(){
       Response res= RestAssured.get(url);
       System.out.println(res.getStatusCode());
        Assert.assertEquals(res.getStatusCode(),200);
        Assert.assertEquals(res.getHeader("Server"),"Microsoft-IIS/10.0");
       Assert.assertEquals(res.getBody().jsonPath().get("msg"),"No data Found");
        Assert.assertEquals(res.jsonPath().getString("msg"),"No data Found");


    }
}
