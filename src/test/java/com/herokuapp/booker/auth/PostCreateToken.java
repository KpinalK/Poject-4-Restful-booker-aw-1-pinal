package com.herokuapp.booker.auth;

import com.herokuapp.booker.model.BookingPojo;
import com.herokuapp.booker.testbase.TestBase;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class PostCreateToken extends TestBase {

    @Test
    public void createToken(){

        BookingPojo bookingPojo = new BookingPojo();
        bookingPojo.setUsername("admin");
        bookingPojo.setPassword("password123");

        Response response = given().log().all()
                .when()
                .body(bookingPojo)
                .post("/auth");
        response.prettyPrint();
        response.then().statusCode(200);

    }
}
