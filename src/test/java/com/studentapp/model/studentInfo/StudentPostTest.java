package com.studentapp.model.studentInfo;

import com.studentapp.model.StudentPojo;
import com.studentapp.model.testBase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

public class StudentPostTest extends TestBase {

    @Test

    public void createStudentData(){

        List<String> courseList=new ArrayList<>();
        courseList.add("Accounting");
        courseList.add("Statistics");

        StudentPojo studentPojo=new StudentPojo();
        studentPojo.setFirstName("krishna");
        studentPojo.setLastName("vasudev");
        studentPojo.setEmail("krishnav@gmail.com");
        studentPojo.setProgramme("cloud");
        studentPojo.setCourses(courseList);

        Response response=
                given()
                .header("Content-Type","application/json")
                .body(studentPojo)
                .when()
                .post();
        response.then().statusCode(201);
        response.prettyPrint();
    }
}
