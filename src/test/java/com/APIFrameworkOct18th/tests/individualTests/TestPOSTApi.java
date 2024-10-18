package com.APIFrameworkOct18th.tests.individualTests;

import com.APIFrameworkOct18th.assertions.AssertActions;
import com.APIFrameworkOct18th.base.BaseClass;
import com.APIFrameworkOct18th.endpoints.APIConstants;
import com.APIFrameworkOct18th.payload.CreateBookingPayload;
import com.APIFrameworkOct18th.pojo.CreateBookingResponse;
import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TestPOSTApi extends BaseClass {

        @Test
        public void testCreationOfBooking(){

            requestSpecification.basePath(APIConstants.CREATE_BOOKING);

            response = RestAssured.given(requestSpecification)
                    .when().body(CreateBookingPayload.getBookingPayload()).post();

//            response.then().log().all();

            CreateBookingResponse convertedResponse = CreateBookingPayload.getDeSerializedResponse(response.asString());

            System.out.println(convertedResponse);
            System.out.println("Created Booking Id: " +convertedResponse.getBookingid());

//            AssertActions.validateStringResponse(convertedResponse.getBooking().getFirstname(),"deepu");
//            AssertActions.validateStringResponse(convertedResponse.getBooking().getAdditionalneeds(),"deepu");

        }

}
