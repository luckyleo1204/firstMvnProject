package com.mtestproject.api.org.testingworld.api;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import io.restassured.response.Response;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC003_AddNewStudent {
    String url="https://thetestingworldapi.com/api/studentsDetails";
    @Test
    public void TC003_AddNewStudent(){
        RequestSpecification rs=RestAssured.given();
            rs.header("Content-Type","application/json");
            rs.body("{\"id\": 1,\"first_name\": \"Murali\",\"middle_name\": \"C \",\"last_name\": \"veera\",\"date_of_birth\": \"12/04/1978\"}");
            Response respone=rs.post(url);
        System.out.println(respone.asPrettyString());
            Assert.assertEquals(respone.getStatusCode(),201);


    }
}
