package mercuryTours.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MercuryAccountCreatedPage extends BasePage{
    public MercuryAccountCreatedPage(WebDriver driver) {
        super(driver, driver.getCurrentUrl());
    }

    @FindBy(how = How.XPATH, using = "//b[contains(text(),'Dear')]")
    private WebElement msg1;

    @FindBy(how = How.XPATH, using = "//b[contains(text(),'Note:')]")
    private WebElement successMsg;

       @FindBy(how = How.XPATH, using = "//a[contains(text(),' sign-in ')]")
    private WebElement singInLnk;

    public boolean registrationMessageIsVisible(){

        return (msg1.isDisplayed());
    }

    /*public boolean registrationMessageExpectedValue(String expectedMessage){
        //System.out.println(msg1.getText() + " <>" + expectedMessage);
        return (msg1.getText().equals(expectedMessage));
    }*/

    public boolean registrationMessageExpectedValue(String expectedMessage){
        //System.out.println(msg1.getText() + " <>" + expectedMessage);
        return (successMsg.getText().contains(expectedMessage));
    }

    public MercurySignOnPage pressSignInLink(){
        singInLnk.click();
        return new MercurySignOnPage(this.driver);
    }

    public boolean isSignInLinkAvailable(){
        return singInLnk.isDisplayed();
    }

    public MercuryFlightsPage goFlightsPage(String option){
        this.leftSection.clickOnMenuOption(option);
        return new MercuryFlightsPage(this.driver);
    }



}
