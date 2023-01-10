package org.pm.ui;

import org.pm.ui.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    @BeforeTest
    public void loginWithId() {
        HomePage.open().clickOnLoginButton().loginWithTestCredentialId();
    }
}
