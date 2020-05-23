package mercuryTours.pages;

import mercuryTours.sections.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class BasePage {

    protected WebDriver driver;
    protected String baseURL;
    protected TopSection topSection;
    protected LeftSection leftSection;
    protected ContactInformationSection contactInformationSection;
    protected MailingInformationSection mailingInformationSection;
    protected UserInformationSection userInformationSection;
    protected SpecialsSection specialsSection;
    protected FlightDetailsSection flightDetailsSection;
    protected FlightPreferencesSection flightPreferencesSection;
    protected SelectFlightTable selectFlightTable;
    protected BookFlightPassengerInfoSection bookFlightPassengerInfoSection;
    protected BookFlightSummarySection bookFlightSummarySection;

    public BasePage(WebDriver driver, String baseURL) {
        this.driver = driver;
        this.baseURL = baseURL;
        initSections();
        PageFactory.initElements(driver, this);
    }

    private void initSections() {
        if (this.isLoaded()) {
            this.topSection = new TopSection(driver);
            this.leftSection = new LeftSection(driver);
            this.contactInformationSection = new ContactInformationSection(driver);
            this.mailingInformationSection = new MailingInformationSection(driver);
            this.userInformationSection = new UserInformationSection(driver);
            this.specialsSection = new SpecialsSection(driver);
            this.flightPreferencesSection = new FlightPreferencesSection(driver);
            this.flightDetailsSection = new FlightDetailsSection(driver);
            this.selectFlightTable = new SelectFlightTable(driver);
            this.bookFlightPassengerInfoSection = new BookFlightPassengerInfoSection(driver);
            this.bookFlightSummarySection = new BookFlightSummarySection(driver);
        }
    }


    public boolean isLoaded() {

            return true;

    }
}
