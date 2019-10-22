package org.webapp.example.school.integration.tests.stepdef;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class StudentStepDef {
    private Response response;
    private ValidatableResponse json;
    private String CREATE_USER_ENDPOINT = "http://localhost:8080/students/add";
    private String LIST_USER_ENDPOINT = "http://localhost:8080/students/list";
    private String GET_USER_ENDPOINT = "http://localhost:8080/students/";

    @Given("I create a student with data")
    public void createStudent(Map<String,String> student){

        RequestSpecification request = given().param("name", student.get("name"))
                .param("socialSecurityNumber", student.get("socialSecurityNumber"))
                .param("birthDate", student.get("birthDate"));
        response = request.when().post(CREATE_USER_ENDPOINT);
    }

    @And("I get the student list")
    public void studentList(){
        RequestSpecification request = given();
        response = request.when().get(LIST_USER_ENDPOINT);
    }

    @And("I verify the create user status code is (.*)")
    public void studentList(int statusCode){
        json = response.then().statusCode(statusCode);
    }

    @And("I verify response includes the following$")
    public void response_equals(Map<String,String> responseFields){
        for (Map.Entry<String, String> field : responseFields.entrySet()) {
            json.body(field.getKey(), equalTo(field.getValue()));
        }
    }

    @And("I get a student by name with: (.*)")
    public void studentByName(String name){
        RequestSpecification request = given();
        response = request.when().get(GET_USER_ENDPOINT+name);
    }
}
