package com.intive.patronage.Steps;

import com.intive.patronage.DriverFactory;
import com.intive.patronage.pages.MainPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NewsletterStep extends DriverFactory {
    MainPage mainPage = new MainPage(driver);

    @Given("^User is on the main page in section Newsletter$")
    public void userIsOnTheMainPageInSectionNewsletter() {
        mainPage.openAutomationPage();
    }

    @When("^User enters his/her e-mail address asha7788@gmail.com$")
    public void userEntersHisHerEMailAddressAshaGmailCom() {
        mainPage.writeEmailAddressToNewsletterField("asha7788@gmail.com");
    }

    @And("^User clicks Enter key$")
    public void userClicksEnterKey() {
        mainPage.sendKeyEnterToNewsletterField();
    }

    @Then("^User should see the subscription confirmation on the Website and his/her inbox$")
    public void userShouldSeeTheSubscriptionConfirmationOnTheWebsiteAndHisHerInbox() {
        mainPage.verifyIfPositiveResultsAreVisible();
    }

    @Then("^User should see a prompt that this e-mail address was already registered$")
    public void userShouldSeeAPromptThatThisEMailAddressWasAlreadyRegistered() {
        mainPage.verifyIfEmailIsAlreadyRegistered();
    }

    @When("^User enters his or her wrong e-mail address asha7788gmail.com$")
    public void userEntersHisOrHerWrongEMailAddressAshaGmailCom() {
        mainPage.writeEmailAddressToNewsletterField("asha7788gmail.com");
    }

    @Then("^User should see a prompt that this e-mail address is invalid$")
    public void userShouldSeeAPromptThatThisEMailAddressIsInvalid() {
        mainPage.verifyIfEmailIsInvalid();
    }

    @When("^User doesn't enter his/her e-mail address$")
    public void userDoesnTEnterHisHerEMailAddress() {
        mainPage.leaveEmptyNewsletterField();

    }
}
