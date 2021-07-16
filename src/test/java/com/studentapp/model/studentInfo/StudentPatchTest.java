package com.studentapp.model.studentInfo;

import com.studentapp.model.StudentPojo;
import com.studentapp.model.testBase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class StudentPatchTest extends TestBase {

    @Test

    public void updateStudentDataWithPatch(){

        StudentPojo studentPojo=new StudentPojo();
        studentPojo.setEmail("Jimmyshergil@Gmail.com");

        Response response=
                given()
                        .header("Content-Type","application/json")
                        .pathParam("id",101)
                .body(studentPojo)
                .when()
                .patch("/{id}");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
