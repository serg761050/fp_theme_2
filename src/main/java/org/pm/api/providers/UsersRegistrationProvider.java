package org.pm.api.providers;

import org.apache.commons.lang3.RandomStringUtils;
import org.pm.api.dto.UserRegistrationRequest;

public class UsersRegistrationProvider {
    public UserRegistrationRequest getNewUser() {

        String generatedString = RandomStringUtils.randomNumeric(3);

        return UserRegistrationRequest.builder()
                .formName("REGISTRATIONBYPHONE")
                .phone("+38011065" + generatedString)
                .email("test_" + generatedString + "@gmail.com")
                .password("Qwerty123!")
                .defaultCurrency("XTS")
                .selectedLanguage("en")
                .isPlayerAgree("true").build();
    }
}

