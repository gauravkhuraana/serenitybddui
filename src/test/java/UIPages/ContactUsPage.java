package UIPages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUsPage extends PageObject {

    @FindBy(id="email")
    WebElement email;

    @FindBy(id="id_order")
    WebElement orderRef;

    @FindBy(id="message")
    WebElement message;

    @FindBy(id="submitMessage")
    WebElement sendButton;

    By heading = By.id("id_contact");
    By chooseFile = By.id("fileUpload");

    By successMesg = By.cssSelector(".alert-success");

    public String fillContactsUsPage()
    {
        email.sendKeys("gauravkhurana@xyz.com");
        orderRef.sendKeys("123456476");
        message.sendKeys("hi thank you for creatingt this site");

        element(heading).selectByVisibleText("Webmaster");
        upload("src/test/resources/a.jpg").to(find(chooseFile));
        sendButton.click();
        return element(successMesg).getText();

    }

}
