package com.mtestproject.api.org.testingworld.api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class TC001_ValidateStudentGetDetails {
    String url="https://thetestingworldapi.com/api/studentsDetails/7621756";
    @Test
    public void tc001_getStudentDetails(){
       Response res= RestAssured.get(url);
       System.out.println(res.getStatusCode());
        System.out.println(res.getHeaders());
        System.out.println(res.getHeader("Date"));
        System.out.println(res.asString());
        System.out.println("======================================");
        System.out.println(res.asPrettyString());

    }
}
