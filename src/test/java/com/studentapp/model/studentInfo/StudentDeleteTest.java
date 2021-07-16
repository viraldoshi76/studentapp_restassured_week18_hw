package com.studentapp.model.studentInfo;

import com.studentapp.model.testBase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class StudentDeleteTest extends TestBase {

    @Test

    public void deleteStudentDataWithId(){

        Response response=
                given()
                 .pathParam("id",101)
                .when()
                .delete("/{id}");
        response.then().statusCode(204);
        response.prettyPrint();
    }
}
