package com.intive.patronage.Steps;

import com.intive.patronage.DriverFactory;
import com.intive.patronage.pages.MainPage2;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.hamcrest.MatcherAssert.assertThat;

public class SendToAFriendStep extends DriverFactory {
    MainPage2 mainPage2 = new MainPage2(driver);


    @Given("^User is on the main page in section Dresses$")
    public void userIsOnTheMainPageInSectionDresses() {
        mainPage2.openAutomationPage();
    }

    @When("^User clicks Dresses$")
    public void userClicksDresses() {
        mainPage2.clickDressesButton();
//        mainPage2.clickDressesButton();
        String actualURL = driver.getCurrentUrl();
        assertThat("User should be on Automation Practice page", actualURL.equals("http://automationpractice.com/index.php?id_category=8&controller=category"));
    }

    @And("^User clicks Evening Dresses$")
    public void userClicksEveningDresses() {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOf(mainPage2.sfwithul));
        mainPage2.clicksEveningDresses();
        String actualURL = driver.getCurrentUrl();
        assertThat("User should be on Automation Practice page", actualURL.equals("http://automationpractice.com/index.php?id_category=10&controller=category"));
    }

    @And("^User clicks a picture with a Printed Dress$")
    public void userClicksAPictureWithAPrintedDress() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(mainPage2.picture));
        mainPage2.focusOnThePicture();
//        Thread.sleep(5000);

//        String actualURL = driver.getCurrentUrl();
//        assertThat("User should be on Automation Practice page", actualURL.equals("http://automationpractice.com/index.php?id_product=4&controller=product"));
    }
    @And("^User clicks More$")
    public void userClicksMore() throws InterruptedException {
        mainPage2.userClicksMore();
//        Thread.sleep(5000);
//        mainPage2.clicksEveningDreseses();
//        String actualURL = driver.getCurrentUrl();
//        assertThat("User should be on Automation Practice page", actualURL.equals("//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[2]"));
    }

    @And("^User clicks Send to a friend$")
    public void userClicksSendToAFriend() {
        mainPage2.ClicksSendToAFriend();
    }

    @And("^User enters Name of his/her friend Asia and E-mail address of his/her friend asha7788@gmail.com$")
    public void userEntersNameOfHisHerFriendAsiaAndEMailAddressOfHisHerFriendAshaGmailCom() {
        mainPage2.WriteNameOfYourFriend("Asia");
        mainPage2.WriteEmailAddressOfYourFriend("asha7788@gmail.com");
    }

    @And("^User clicks Send button$")
    public void userClicksSendButton() {
        mainPage2.clickSendButton();
    }

    @Then("^User should see the confirmation on the Website$")
    public void userShouldSeeTheConfirmationOnTheWebsite() {
        mainPage2.verifyIfResultIsSuccessfully();
    }

    @And("^User enters Name of his/her friend Asia and wrong E-mail address of his/her friend asha7788gmail.com$")
    public void userEntersNameOfHisHerFriendAsiaAndWrongEMailAddressOfHisHerFriendAsha7788GmailCom() {
        mainPage2.WriteNameOfYourFriend("Asia");
        mainPage2.WriteWrongEmailAddressOfYourFriend("asha7788gmail.com");
    }

    @And("^User enters wrong Name of his/her friend A! and E-mail address of his/her friend asha7788@gmail.com$")
    public void userEntersWrongNameOfHisHerFriendAsiaAndEMailAddressOfHisHerFriendAsha7788GmailCom() {
        mainPage2.WriteWrongNameOfYourFriend("A!");
        mainPage2.WriteEmailAddressOfYourFriend("asha7788@gmail.com");
    }

    @And("^User enters wrong Name of his/her friend A! and wrong E-mail address of his/her friend asha7788gmail.com$")
    public void userEntersWrongNameOfHisHerFriendAAndWrongEMailAddressOfHisHerFriendAshaGmailCom() {
        mainPage2.WriteWrongNameOfYourFriend("A!");
        mainPage2.WriteWrongEmailAddressOfYourFriend("asha7788gmail.com");
    }

    @And("^User doesn't enter Name of his/her friend but enters E-mail address of his/her friend asha7788@gmail.com$")
    public void userDoesnTEnterNameOfHisHerFriendButEntersEMailAddressOfHisHerFriendAshaGmailCom() {
        mainPage2.leaveEmptyFriendName();
        mainPage2.WriteEmailAddressOfYourFriend("asha7788@gmail.com");
    }

    @Then("^User should see a prompt that he/she didn't fill required fields$")
    public void userShouldSeeAPromptThatHeSheDidnTFillRequiredFields() {
        mainPage2.verifyIfRequiredFieldsAreEmpty();
    }

    @And("^User enters Name of his/her friend Asia but doesn't enter E-mail address of his/her friend$")
    public void userEntersNameOfHisHerFriendAsiaButDoesnTEnterEMailAddressOfHisHerFriend() {
        mainPage2.WriteNameOfYourFriend("Asia");
        mainPage2.leaveEmptyEmailAddressOfYourFriend();
    }

    @And("^User doesn't enter Name and E-mail address of his/her friend$")
    public void userDoesnTEnterNameAndEMailAddressOfHisHerFriend() {
        mainPage2.leaveEmptyFriendName();
        mainPage2.leaveEmptyEmailAddressOfYourFriend();
    }
}
