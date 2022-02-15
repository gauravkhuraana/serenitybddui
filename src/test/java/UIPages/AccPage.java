package UIPages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class AccPage extends PageObject {

    public void doesLogoExist()
    {
        shouldBeVisible(By.className("logo"));
    }
    public String doSearch(String searchKey, String productNAme)
    {
        typeInto($("#search_query_top"),searchKey);
        waitForTextToAppear(productNAme);
        clickOn($("//li[contains(text(),'"+productNAme+"')]"));
        return find(By.tagName("h1")).getText();
    }
}
