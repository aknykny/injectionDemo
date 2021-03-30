package com.example.step_definitions;

import io.cucumber.java.en.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


import static io.restassured.RestAssured.*;
import static org.junit.Assert.*;

public class A {
    InjectionClass injectionClass;

    public A(InjectionClass injectionClass1) {
        this.injectionClass=injectionClass1;
    }

    //1. step
    @Given("Accept type is Application-Json")
    public void accept_type_is_Application_Json() {
        RequestSpecification requestSpecification = given().accept(ContentType.JSON);
        injectionClass.setRequestSpecification(requestSpecification);
    }

    @When("user send a GET request to the stations endPoint")
    public void user_send_a_GET_request_to_the_stations_endPoint() {
         Response responseA=injectionClass.getRequestSpecification().get("/stations");
        injectionClass.setResponse(responseA);
    }

    @Then("Status code should be {int}")
    public void status_code_should_be(int expectedStatusCode) {
        assertEquals(expectedStatusCode,injectionClass.getResponse().statusCode());
    }

    @Then("Accept type should be Application Json")
    public void accept_type_should_be_Application_Json() {
        assertEquals("application/json; charset=utf-8",injectionClass.getResponse().contentType());
        injectionClass.getResponse().prettyPrint();
    }
}
