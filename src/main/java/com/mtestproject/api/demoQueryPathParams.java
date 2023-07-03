package com.mtestproject.api;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class demoQueryPathParams {
    @Test
    public void demoQueryAndPathParms(){
        //https://reqres.in/api/users?page=2&id=5
        given()
                .pathParam("Mypath","users")
                .queryParam("page","2")
                .queryParam("id",5)
                .when()
                .get("https://reqres.in/api/{Mypath}")
                .then()
                .log()
                .all();
    }
}
