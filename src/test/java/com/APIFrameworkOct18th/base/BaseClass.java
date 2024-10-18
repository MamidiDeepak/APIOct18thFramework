package com.APIFrameworkOct18th.base;

import com.APIFrameworkOct18th.assertions.AssertActions;
import com.APIFrameworkOct18th.endpoints.APIConstants;
import com.APIFrameworkOct18th.payload.CreateBookingPayload;
import com.APIFrameworkOct18th.pojo.CreateBooking;
import com.APIFrameworkOct18th.pojo.CreateBookingDates;
import com.google.gson.Gson;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeClass;

public class BaseClass {

    public APIConstants apiConstants;
    public CreateBookingPayload bookingPayload;
    public CreateBooking createBooking;
    public CreateBookingDates createBookingDates;
    public AssertActions assertActions;
    public BaseClass baseClass;
    public RequestSpecification requestSpecification;
    public Gson gson;
    public JsonPath jsonPath;
    public Response response;

    @BeforeClass
    public void getBaseUrl(){

        requestSpecification = RestAssured.given()
                .baseUri(APIConstants.BASE_URL)
                .contentType("application/json");
//                .log().all();
    }
}