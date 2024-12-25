package com.herokuapp.booker.bookinginfo;

import com.herokuapp.booker.testbase.TestBase;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class DeleteBooking extends TestBase {

    @Test
    public void deleteBooking(){
        given().log().all()
                .pathParam("id",1)
                .when()
                .delete("/{id}")
        .then().log().all()
                .statusCode(201);
    }
}
