package mercuryTours.sections;

import mercuryTours.elements.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;



public class BaseSection {
    protected WebDriver driver;
    protected TopMenuElement topMenuElement;
    protected ContactInformationElements contactInformationElements;
    protected MailingInformationElements mailingInformationElements;
    protected UserInformationElements userInformationElements;
    protected SpecialsElemets specialsElemets;
    protected Logger log;

    public BaseSection(WebDriver driver) {
        this.driver = driver;
        this.initElements();

    }

    private void initElements() {
        WebElement rootElement = this.driver.findElement(By.xpath("//body/div/table"));
        this.topMenuElement = new TopMenuElement(rootElement);
        this.contactInformationElements = new ContactInformationElements(rootElement);
        this.mailingInformationElements = new MailingInformationElements(rootElement);
        this.userInformationElements = new UserInformationElements(rootElement);
        this.specialsElemets = new SpecialsElemets(rootElement);
        this.log = LogManager.getLogger(BaseSection.class.getName());
    }
}
