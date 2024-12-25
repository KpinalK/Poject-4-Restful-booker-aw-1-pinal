package com.herokuapp.booker.bookinginfo;

import com.herokuapp.booker.model.BookingPojo;
import com.herokuapp.booker.testbase.TestBase;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class PatchBookingPartial extends TestBase {

    @Test
    public void patchPartialBooking(){
        BookingPojo bookingPojo = new BookingPojo();
        bookingPojo.setFirstname("James");
        bookingPojo.setLastname("Brown");

        Response response = given().log().all()
                .header("Content-Type","application/json")
                .pathParam("id",1)
                .when()
                .body(bookingPojo)
                .patch("/{id}");
        response.prettyPrint();
        response.then().statusCode(200);
    }
}
