package tests;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Steps;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import Steps.*;

@RunWith(SerenityRunner.class)
public class ContactUsTest extends BaseTest{


    @Steps
    LoginPageSteps loginPageSteps;

    @Steps
    contactUsPageSteps contactUsPageSteps;


    @Before
    public void setup()
    {
        loginPageSteps.isOnLoginPage();
        loginPageSteps.navigateToContactUsPage();
    }

    String expMesg="Your message has been successfully sent to our team";

    @Pending
    @Test
    public void YetToImplementIt()
    {

    }

    @Test
    public void fillContactUsPageTest()
    {
        String actualMessage = contactUsPageSteps.fillContactUsFormStep();
        System.out.println(actualMessage);
        Assertions.assertThat(actualMessage).contains(expMesg);

    }


}
