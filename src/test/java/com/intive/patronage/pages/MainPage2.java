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

    @FindBy(how = How.XPATH,using = "//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[2]")
    public WebElement more;

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

}

