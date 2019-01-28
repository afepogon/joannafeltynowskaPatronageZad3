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
    public void verifyIfPositiveResultsAreVisible() {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.textToBePresentInElement(newsletterAlertSuccess, "Newsletter : You have successfully subscribed to this newsletter."));
     }

    public void leaveEmptyNewsletterField() {
        newsletterInput.sendKeys(Keys.ENTER);
    }

    public void verifyIfEmailIsAlreadyRegistered() {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.textToBePresentInElement(newsletterAlertFailed, "Newsletter : This email address is already registered."));
    }

    public void verifyIfEmailIsInvalid() {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.textToBePresentInElement(newsletterAlertFailed, "Newsletter : Invalid email address."));
    }
}
