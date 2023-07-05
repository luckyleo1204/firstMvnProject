package com.mtestproject.api.org.testingworld.api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC004_updateStudent_Put {
    String url="https://thetestingworldapi.com/api/studentsDetails/7621756";
    @Test
    public void TC004_updateStudentData(){
        RequestSpecification rs=RestAssured.given();
            rs.header("Content-Type","application/json");
            rs.body("{\"id\": 7621756,\"first_name\": \"Murali\",\"middle_name\": \" \",\"last_name\": \"chennaveerappa\",\"date_of_birth\": \"12/04/1978\"}");
            Response respone=rs.put(url);
            System.out.println(respone.asPrettyString());
            Assert.assertEquals(respone.getStatusCode(),200);


    }
}
