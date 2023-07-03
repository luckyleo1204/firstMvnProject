package com.mtestproject.api;

import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class getHeadersFromResponse {
    @Test(enabled = false)
    public void getHeaders(){
        given()
                .when()
                .get("https://www.google.com")
                .then()
                .log()
                .headers();

    }

    @Test(enabled = false)
    public void getAllHeaders(){
        Response res=given()
                .when()
                .get("https://www.google.com");

        //get Single Header
        System.out.println("Header details of given Header==>"+ res.getHeader("Content-Type"));

        // get all the headers
          Headers allheaders= res.getHeaders();
          for(Header i: allheaders)
          {
              System.out.println(i+ "Value of header"+i.getValue());
          }
    }
}
