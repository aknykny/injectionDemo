package com.example.step_definitions;


import io.cucumber.java.Before;
import com.example.utilityClasses.ConfigReader;

import static io.restassured.RestAssured.baseURI;

public class Hooks {
    @Before
    public void setUp(){
        baseURI= ConfigReader.get("apiUrl");
    }

}
