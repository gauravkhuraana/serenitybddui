package tests;

import Steps.LoginPageSteps;
import UIPages.LoginPage;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
//@RunWith(JunitPlatform.class)
public class loginPageTests {

    @Steps
    LoginPageSteps loginPageSteps;

    @Managed(driver = "chrome")
    WebDriver browser;

    @Test
    public void appLoginTest()
    {
        loginPageSteps.isOnLoginPage();
        loginPageSteps.enterInformation();
        loginPageSteps.userShouldBeAbleToEnterInformation();

    }

}
