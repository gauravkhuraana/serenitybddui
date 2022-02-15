package tests;

import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class BaseTest {

    @Managed(driver = "chrome",uniqueSession = true)
    //should pick from serenity.properties
    //@Managed
    WebDriver browser;
}
