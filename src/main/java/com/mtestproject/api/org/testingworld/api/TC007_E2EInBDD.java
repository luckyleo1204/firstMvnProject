package com.mtestproject.api.org.testingworld.api;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC007_E2EInBDD {
     String studentId="";
     @BeforeMethod
     public void precondition(){
         RestAssured.baseURI="https://thetestingworldapi.com/api/";;
     }
    @Test(priority = 1)
    public void TC007_AddNewStudent() {
        Response rs = given()
                .contentType(ContentType.JSON)
                .body("{\"id\": 1,\"first_name\": \"Murali\",\"middle_name\": \"C \",\"last_name\": \"veera\",\"date_of_birth\": \"12/04/1978\"}")
                .when()
                .post("studentsDetails");
        System.out.println(rs.asPrettyString());
        Assert.assertEquals(rs.getStatusCode(), 201);
        studentId= rs.jsonPath().getString("id");
    }

    @Test(priority = 3)
    public void TC007_GetStudentDetails() {
        Response res = given().get(  "studentsDetails/"+studentId);
        System.out.println(res.getStatusCode());
        Assert.assertEquals(res.getStatusCode(), 200);
        System.out.println(res.prettyPrint());
        Assert.assertEquals(res.jsonPath().getString("msg"),"No data Found");
    }

    @Test(priority = 2)
    public void TC007_DeleteStudentData(){
        Response rs=given()
            .delete("studentsDetails/"+studentId);
        System.out.println(rs.asPrettyString());
        Assert.assertEquals(rs.getStatusCode(),200);
    }
}
