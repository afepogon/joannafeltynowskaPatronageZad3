package com.intive.patronage.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.hamcrest.MatcherAssert.assertThat;

public class MainPage {

    private static String Automation_URL = "http://automationpractice.com/index.php";
    private WebDriver driver;

    @FindBy(how = How.ID, using = "newsletter-input")
    private WebElement newsletterInput;

    @FindBy(how = How.CLASS_NAME, using = "alert-success")
    private WebElement newsletterAlertSuccess;

    @FindBy(how = How.CLASS_NAME, using = "alert-danger")
    private WebElement newsletterAlertFailed;

    public MainPage(final WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void openAutomationPage() {
        driver.get(Automation_URL);
    }

    public void writeEmailAddressToNewsletterField( String email) {
        newsletterInput.sendKeys(email);
    }
    public void sendKeyEnterToNewsletterField(){
        newsletterInput.sendKeys(Keys.ENTER);
    }
    public void verifyIfPositiveResultsAreVisible(/* String message*/) {
        assertThat("user should have positive verification",
                driver.findElements(By.className("alert-success")).size() != 0 );

//        assertThat("user should have positive verification",
//                newsletterAlertSuccess.getText().equals("NewsLetter: email is added to ..."));
     }

//  public void checkResultPopUp (String arg0) {
//        WebDriverWait wait = new WebDriverWait(driver,timeOutInSeconds: 5)
//        wait.until (ExpectedConditions.textToBePresentInElement(AlertResult, arg0));

    public void verifyIfNegativeResultsAreVisible() {
        assertThat("user should have negative verification",
                driver.findElements(By.className("alert-danger")).size() != 0);
    }

    public void leaveEmptyNewsletterField() {


    }

}
