package com.mtestproject.api.org.testingworld.api;

import com.mtestproject.api.pojo.studentData;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC009_PostRequestByUsingPojo {
    String Baseurl = "https://thetestingworldapi.com/api/studentsDetails";
    RequestSpecification rs;
    @BeforeMethod
    public void config(){
        studentData s1=new studentData();
        s1.setId(1);
        s1.setFirst_name("Ravish");
        s1.setMiddle_name("JM");
        s1.setLast_name("MC");
        s1.setDate_of_birth("11/12/2023");
        rs = RestAssured.given();
        rs.header("Content-Type", "application/json");
        rs.body(s1);
        rs.log().all();
    }

    @Test
    public void TC009_AddNewStudentusingPojo() {

        Response respone = rs.post(Baseurl);
        System.out.println(respone.asPrettyString());
        Assert.assertEquals(respone.getStatusCode(),201);
    }
}