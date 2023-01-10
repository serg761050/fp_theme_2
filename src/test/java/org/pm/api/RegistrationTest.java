package org.pm.api;

import org.apache.http.HttpStatus;
import org.pm.api.clients.RegistrationApiClients;
import org.pm.api.dto.UserRegistrationRequest;
import org.pm.api.dto.response.RegistrationResponse;
import org.pm.api.providers.UsersRegistrationProvider;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.*;

public class RegistrationTest {

    RegistrationApiClients registrationApiClients = new RegistrationApiClients();

    @Test
    public void registration() {
        UserRegistrationRequest newUser = new UsersRegistrationProvider().getNewUser();

        RegistrationResponse postActualNewUser = registrationApiClients.postUser(newUser, HttpStatus.SC_OK);

        assertThat(postActualNewUser.getToken()).as("Token in response is null").isNotNull();
    }
}
