package com.APIFrameworkOct18th.payload;

import com.APIFrameworkOct18th.pojo.CreateBooking;
import com.APIFrameworkOct18th.pojo.CreateBookingDates;
import com.google.gson.Gson;

public class BookingPayload {

   public static Gson gson = new Gson();

    public static String getBookingPayload(){

        CreateBooking createBooking = new CreateBooking();
        createBooking.setFirstname("deepak");
        createBooking.setLastname("Mamidi");
        createBooking.setTotalprice(1200);
        createBooking.setDepositpaid(true);

        CreateBookingDates createBookingDates = new CreateBookingDates();
        createBookingDates.setCheckin("18-10-2024");
        createBookingDates.setCheckout("20-10-2024");

        createBooking.setBookingdates(createBookingDates);
        createBooking.setAdditionalneeds("Chicken Dinner");

        //Serializing the Create Booking Payload
        String requestPayload = gson.toJson(createBooking);
        return requestPayload;

    }
}
