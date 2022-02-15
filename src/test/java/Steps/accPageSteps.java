package Steps;

import UIPages.AccPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class accPageSteps {

    private AccPage accPage;

    @Step
    public void validateAppLogo()
    {
        accPage.doesLogoExist();
    }

    @Step
    public String searchProduct(String SearchKey, String productName)
    {
        return accPage.doSearch(SearchKey,productName);
    }
}
