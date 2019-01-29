package com.intive.patronage.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.naming.Name;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;


public class MainPage2 {

    private static String Automation_URL = "http://automationpractice.com/index.php";
    private WebDriver driver;


    @FindBy(how = How.XPATH, using = "//*[@id=\"block_top_menu\"]/ul/li[2]/a")
    public WebElement sfwithul;

    @FindBy(how = How.XPATH, using = "//a[@class='img' and @title='Evening Dresses']")
    private WebElement replace2x;

//    public void checkResultPopUp (String arg0) {
//        WebDriverWait wait = new WebDriverWait(driver,timeOutInSeconds: 5)
//        wait.until (ExpectedConditions.textToBePresentInElement(AlertResult, arg0));

    @FindBy(how = How.XPATH, using = "//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img")
    public WebElement picture;

    @FindBy(how = How.XPATH, using = "//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[2]")
    public WebElement more;

    @FindBy(how = How.ID, using = "send_friend_button")
    public WebElement friend;

    @FindBy(how = How.NAME, using = "friend_name")
    public WebElement friendName;

    @FindBy(how = How.NAME, using = "friend_email")
    public WebElement friendEmail;

    @FindBy(how = How.ID, using = "sendEmail")
    public WebElement sendEmail;

    @FindBy(how = How.XPATH, using = "//*[@id=\"product\"]/div[2]/div/div/div/p[1]")
    public WebElement ResultSuccessfully;

    @FindBy(how = How.XPATH, using = "//*[@id=\"send_friend_form_error\"]")
    public WebElement RequiredFields;

    public MainPage2(final WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void openAutomationPage() {
        driver.get(Automation_URL);
    }

    public void clickDressesButton() {
        sfwithul.click();
    }

    public void clicksEveningDresses() {
        replace2x.click();
    }

    public void focusOnThePicture() {
        new Actions(driver).moveToElement(picture).perform();
    }

    public void userClicksMore() {
        more.click();
    }

    public void ClicksSendToAFriend() {
        friend.click();
    }

    public void WriteNameOfYourFriend(String asia) {
        friendName.sendKeys(asia);
    }

    public void WriteEmailAddressOfYourFriend(String email) {
        friendEmail.sendKeys(email);
    }

    public void clickSendButton() {
        sendEmail.click();
    }

    public void verifyIfResultIsSuccessfully() {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.textToBePresentInElement(ResultSuccessfully, "Your e-mail has been sent successfully"));
    }

    public void WriteWrongEmailAddressOfYourFriend(String email) {
        friendEmail.sendKeys(email);
    }

    public void WriteWrongNameOfYourFriend(String asia) {
        friendName.sendKeys(asia);
    }

    public void leaveEmptyFriendName() {
        friendName.sendKeys(Keys.ENTER);
    }

    public void verifyIfRequiredFieldsAreEmpty() {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.textToBePresentInElement(RequiredFields, "You did not fill required fields"));
    }

    public void leaveEmptyEmailAddressOfYourFriend() {
        friendEmail.sendKeys(Keys.ENTER);
    }
}