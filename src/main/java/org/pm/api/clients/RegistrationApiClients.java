package org.pm.api.clients;

import io.restassured.response.Response;
import org.pm.api.dto.UserRegistrationRequest;
import org.pm.api.dto.response.RegistrationResponse;

public class RegistrationApiClients extends BaseApiClients {

    public RegistrationResponse postUser(UserRegistrationRequest newUser, int httpStatusCode) {
        Response response = postRegistration("/api/v3/registration/byform", newUser);
        return response.then()
                .statusCode(httpStatusCode)
                .extract()
                .body()
                .as(RegistrationResponse.class);
    }
}
