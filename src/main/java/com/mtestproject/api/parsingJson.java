package com.mtestproject.api;



import org.json.JSONObject;
import org.testng.annotations.Test;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;


public class parsingJson {
    @Test
    public void parseJasonDemo(){
        Response res=
                given()
                    .when()
                        .get("http://localhost:3000");

        JSONObject jo=new JSONObject(res.asString());

        for(int i=0;i<jo.getJSONArray("posts").length();i++)
        {
            System.out.println(jo.getJSONArray("posts").getJSONObject(i).get("title").toString());
        }

    }
}
