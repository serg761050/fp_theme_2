package org.pm.ui;

import com.codeborne.selenide.Selenide;
import org.pm.ui.pages.Bet;
import org.pm.ui.pages.HomePage;
import org.pm.ui.pages.LoginPage;
import org.testng.annotations.Test;

public class BetslipTest extends BaseTest {

    @Test
    public void addSingleBetFromProposedBetsTest() {
        new LoginPage().chooseLoginTypeById()
                .loginWithTestCredentialId()
                .selectSport("soccer")
                .selectEventAndOutcome(1, Bet.P1)
                .chooseProposedAmountForBet()
                .clickPlaceBetButtonOnBetslip();
        //assertThat(new BetslipPage().getAlert()).as("Single bet was created successfully! " +
        //    "The text in alert is differ from expected").isEqualTo("Bet accepted");
    }
}
