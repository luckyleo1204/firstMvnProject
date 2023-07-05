package com.mtestproject.api.org.testingworld.api;

import com.mtestproject.api.pojo.studentData;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC010_PostRequestByUsingJsonObject {
    String Baseurl = "https://thetestingworldapi.com/api/studentsDetails";
    RequestSpecification rs;
    @BeforeMethod
    public void config(){
        JSONObject json=new JSONObject();
        json.put("Id",1);
        json.put("first_name","Mohan" );
        json.put("last_name","C" );
        json.put("date_of_birth","12/11/2021" );
        rs = RestAssured.given();
        rs.header("Content-Type", "application/json");
        rs.body(json);
        rs.log().all();
    }

    @Test
    public void TC0010_AddNewStudentusingJsonObject() {

        Response respone = rs.post(Baseurl);
        System.out.println(respone.asPrettyString());
        Assert.assertEquals(respone.getStatusCode(),201);
    }
}