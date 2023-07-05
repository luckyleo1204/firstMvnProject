package com.mtestproject.api.org.testingworld.api;

import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC007_E2EInBDD {
    String Baseurl = "https://thetestingworldapi.com/api/";
    String studentId="";

    @Test(priority = 1)
    public void TC007_AddNewStudent() {
        Response rs = given()
                .contentType(ContentType.JSON)
                .body("{\"id\": 1,\"first_name\": \"Murali\",\"middle_name\": \"C \",\"last_name\": \"veera\",\"date_of_birth\": \"12/04/1978\"}")
                .when()
                .post(Baseurl + "studentsDetails");
        System.out.println(rs.asPrettyString());
        Assert.assertEquals(rs.getStatusCode(), 201);
        studentId= rs.jsonPath().getString("id");
    }

    @Test(priority = 3)
    public void TC007_GetStudentDetails() {
        Response res = given().get(Baseurl + "studentsDetails/"+studentId);
        System.out.println(res.getStatusCode());
        Assert.assertEquals(res.getStatusCode(), 200);
        System.out.println(res.prettyPrint());
    }

    @Test(priority = 2)
    public void TC007_DeleteStudentData(){
        Response rs=given()
            .delete(Baseurl+"studentsDetails/"+studentId);

        System.out.println(rs.asPrettyString());
        Assert.assertEquals(rs.getStatusCode(),200);
    }
}
