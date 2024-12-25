package com.herokuapp.booker.bookinginfo;

import com.herokuapp.booker.testbase.TestBase;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetBooking extends TestBase {

    @Test
    public void getAllBookingIDs(){
        Response response = given()
                .when()
                .get("/booking");
        response.prettyPrint();
        response.then().statusCode(200);

    }

    @Test
    public void getBookingID1(){
        Response response = given()
                .pathParam("id",1)
                .when()
                .get("/{id}");
        response.prettyPrint();
        response.then().statusCode(200);


    }
}
