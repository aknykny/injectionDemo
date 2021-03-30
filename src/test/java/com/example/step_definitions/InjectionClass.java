package com.example.step_definitions;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class InjectionClass {
    private Response response;
    private RequestSpecification requestSpecification;
    private ValidatableResponse validatableResponse;

//    Setters

    public void setResponse(Response response) {
        this.response = response;
    }

    public void setRequestSpecification(RequestSpecification requestSpecification) {
        this.requestSpecification = requestSpecification;
    }


    //    getters
    public Response getResponse() {
        return response;
    }

    public RequestSpecification getRequestSpecification() {
        return requestSpecification;
    }
}