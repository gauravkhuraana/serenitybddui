package Steps;

import UIPages.LoginPage;
import net.thucydides.core.annotations.Step;
import org.assertj.core.api.Assertions;

public class LoginPageSteps {

    private LoginPage loginPage;

    @Step
    public void isOnLoginPage()
    {
        loginPage.open();
    }

    @Step
    public void enterInformation()
    {
        loginPage.doLogin();
    }

    @Step
    public void userShouldBeAbleToEnterInformation()
    {
        Assertions.assertThat(loginPage.headingIsPresent()).isEqualTo("MY ACCOUNT");
    }



}
