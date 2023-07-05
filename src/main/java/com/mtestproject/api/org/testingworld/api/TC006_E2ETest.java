package com.mtestproject.api.org.testingworld.api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC006_E2ETest {

    String Baseurl = "https://thetestingworldapi.com/api/";
    String studentId="";

    @Test(priority = 1)
    public void TC006_AddNewStudent() {
        RequestSpecification rs = RestAssured.given();
        rs.header("Content-Type", "application/json");
        rs.body("{\"id\": 1,\"first_name\": \"Murali\",\"middle_name\": \"C \",\"last_name\": \"veera\",\"date_of_birth\": \"12/04/1978\"}");
        rs.log().all(); // Check what is passed along with request
        Response respone = rs.post(Baseurl + "studentsDetails");
        System.out.println(respone.asPrettyString());
        Assert.assertEquals(respone.getStatusCode(), 201);
        studentId= respone.jsonPath().getString("id");
    }

    @Test(priority = 3)
    public void TC006_GetStudentDetails() {
        Response res = RestAssured.get(Baseurl + "studentsDetails/"+studentId);
        System.out.println(res.getStatusCode());
        Assert.assertEquals(res.getStatusCode(), 200);
        System.out.println(res.prettyPrint());
    }

    @Test(priority = 2)
    public void TC006_DeleteStudentData(){
        RequestSpecification rs=RestAssured.given();
        Response respone=rs.delete(Baseurl+"studentsDetails/"+studentId);
        System.out.println(respone.asPrettyString());
        Assert.assertEquals(respone.getStatusCode(),200);
    }
}
