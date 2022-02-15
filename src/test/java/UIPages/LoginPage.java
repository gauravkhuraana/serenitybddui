package UIPages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

//@DefaultUrl("http://automationpractice.com/index.php?controller=my-account")

public class LoginPage extends PageObject {

    public void doLogin()
    {
        $("//input[@id='email']").sendKeys("dec2020secondbatch@gmail.com");
        $("#passwd").sendKeys("Selenium@12345");
        $("button[id=\"SubmitLogin\"] span").click();

    }

    public String headingIsPresent() {
        return $("//h1[@class=\"page-heading\"]").getText();
    }

    public void goToContactsUsPage()
    {
        $(By.linkText("Contact us")).click();
    }

}
