package com.example.step_definitions;

import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class B {
    InjectionClass inj;
    public B(InjectionClass injectionClass){
        inj=injectionClass;
    };

    @When("user send a GET request to the specific Station")
    public void user_send_a_GET_request_to_the_specific_Station() {
         inj.setResponse(given().pathParam("id", 1)
                .when().get("stations/{id}"));
    }
}
