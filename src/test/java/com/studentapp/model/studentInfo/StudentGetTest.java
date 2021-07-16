package com.studentapp.model.studentInfo;

import com.studentapp.model.testBase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class StudentGetTest extends TestBase {

    @Test
    public void getAllStudentInfo(){

        Response response=
                given()
                .when()
                .get("/list");
        response.then().statusCode(200);
        response.prettyPrint();
    }

    @Test

    public void getSingleStudentInfo(){

        Response response=
                given()
                        .pathParam("id",3)
                        .when()
                        .get("/{id}");
        response.then().statusCode(200);
        response.prettyPrint();
    }

    @Test

    public void getStudentInfoWithParameter(){

        HashMap<String,Object> qParams=new HashMap<>();
        qParams.put("programme","Financial Analysis");
        qParams.put("limit",3);

        Response response=
                given()
                .queryParams(qParams)
                .when()
                .get("/list");
        response.then().statusCode(200);
        response.prettyPrint();
    }


}
