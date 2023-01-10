package org.pm.api.clients;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;
import static io.restassured.http.ContentType.*;

public class BaseApiClients {

    RequestSpecification rqSpec;

    public BaseApiClients() {
        rqSpec = given()
                .contentType(JSON)
                .accept(JSON)
                .baseUri("https://pm.ua")
                .header("User-Agent", "ParimatchTechAcademy/89870edc1aaea008bd3a519c")
                .log().ifValidationFails();
    }

    public Response post(String uri, Object body) {
        return  given().spec(rqSpec)
                .body(body)
                .log().ifValidationFails()
                .when()
                .post(uri)
                .then()
                .log().ifValidationFails()
                .extract()
                .response();
    }
}
