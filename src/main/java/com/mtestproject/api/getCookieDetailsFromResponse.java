package com.mtestproject.api;

import org.testng.annotations.Test;
import io.restassured.response.Response;

import java.util.Map;

import static io.restassured.RestAssured.given;

public class getCookieDetailsFromResponse {
    @Test(enabled = false)
    public void getCookie(){
        given().
                when()
                .get("https://www.google.com")
                .then()
                .log().cookies();
    }

    @Test(enabled = true)
    public void getCookieSpecificCookie(){
       Response res= given().
                when()
                .get("https://www.google.com");

       String cookie_value=res.getCookie("AEC");
        System.out.println("Printing the value of the given cookie"+ cookie_value);

         Map<String,String> cookies=res.getCookies();
         for(String i: cookies.keySet()){
             System.out.println(i+ "value of the cookie"+ cookies.get(i));
         }

    }
}
