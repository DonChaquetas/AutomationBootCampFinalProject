package mercuryTours.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.HashMap;

public class ContactInformationElements extends BaseElement{
    public ContactInformationElements(WebElement rootElement) {
        super(rootElement);
    }
    private String[][] rawElements =
                    {{"firstName","input[name=firstName]","CSS"},
                    {"lastName","input[name=lastName]","CSS"},
                    {"phone","input[name=phone]","CSS"},
                    {"email","input[name=userName]","CSS"},
                    {"firstNameLblColor","//b[contains(text(),'First')]/parent::font","XPATH"},
                    {"lastNameLblColor","//b[contains(text(),'Last')]/parent::font","XPATH"},
                    {"phoneLblColor","//b[contains(text(),'Phone')]/parent::font","XPATH"},
                    {"emailLblColor","//b[contains(text(),'Phone')]/parent::font","XPATH"},
                    };

    public HashMap<String, WebElement> getContactInfoElements(){

        return this.getWebElements(rawElements);
    }
}
