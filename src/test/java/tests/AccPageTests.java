package tests;
import Steps.*;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class AccPageTests extends BaseTest{

    @Steps
    LoginPageSteps loginPageSteps;

    @Steps
    accPageSteps accPageSteps;

    @Before
    public void setup()
    {
        loginPageSteps.isOnLoginPage();
        //loginPageSteps.enterInformation();
    }

    @Test
    public void accPageLogoTest()
    {
        accPageSteps.validateAppLogo();
    }

    @Test
    public void searchTest()
    {
        String result = accPageSteps.searchProduct("summer","Summer Dresses");
        Assertions.assertThat(result).isEqualTo("Printed Summer Dress");

    }

}
