package com.herokuapp.booker.bookinginfo;

import com.herokuapp.booker.model.BookingPojo;
import com.herokuapp.booker.testbase.TestBase;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class PostBookingCreate extends TestBase {

    @Test
    public void createBooking(){

        BookingPojo bookingPojo = new BookingPojo();
        bookingPojo.setFirstname("Jim");
        bookingPojo.setLastname("Brown");
        bookingPojo.setTotalprice("111");
        bookingPojo.setDepositpaid("true");
        bookingPojo.setBookingdates(" ");
        bookingPojo.setCheckin("2018-01-01");
        bookingPojo.setCheckout("2019-01-01");
        bookingPojo.setAdditionalneeds("Breakfast");

        Response response = given().log().all()
                .header("Content-Type","application/json")
                .when()
                .body(bookingPojo)
                .post("/booking");
        response.prettyPrint();
        response.then().statusCode(200);

    }
}
