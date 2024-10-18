package com.APIFrameworkOct18th.pojo;

public class CreateBookingResponse {

    private String bookingid;
    private CreateBooking booking;

    public String getBookingid() {
        return bookingid;
    }

    public void setBookingid(String bookingid) {
        this.bookingid = bookingid;
    }

    public CreateBooking getBooking() {
        return booking;
    }

    public void setBooking(CreateBooking booking) {
        this.booking = booking;
    }
}
