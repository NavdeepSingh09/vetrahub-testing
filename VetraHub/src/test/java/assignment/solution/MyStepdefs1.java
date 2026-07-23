package assignment.solution;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import screen.AIScreeningPage;
import screen.BookDemoPage;
import screen.InterviewIntegrity;
import screen.SignupPage;


public class MyStepdefs1 {
    @Given("the user navigates to Vetrahub home page")
    public void navigateToVetraHubWebsite() throws InterruptedException {
        AIScreeningPage.GetNavigateVetraHub();
    }

    @When("the user clicks on For Employers")
    public void clickOnForEmoloyers() throws InterruptedException {
        AIScreeningPage.clickForEmployers();
    }

    @And("the user clicks on AI Screening")
    public void clickOnAiScreening() throws InterruptedException {
        AIScreeningPage.clickAIScreening();
    }

    @Then("the AI Screening and Evalution label should be displayed")
    public void verifyLabel() throws InterruptedException {
        AIScreeningPage.verifyLabel();
    }

    @Given("User is on AI Screening page")
    public void verifyAIScreeningPage() throws InterruptedException {
        AIScreeningPage.verifyLabel();
    }

    @When("the user clicks on get started free button")
    public void clickOnGetStarted() throws InterruptedException {
        AIScreeningPage.clickGetStartedButton();
    }

    @Then("the user should be navigated to sign up page")
    public void userOnSignupPage() {
        SignupPage.verifyTitle();
    }

    @Given("the user navigates to AI Screening Page")
    public void navigatesToAIScreeningPage() throws InterruptedException {
        AIScreeningPage.navigateBackToAIScreening();
    }

    @When("the user clicks on Book a demo button")
    public void clickOnBookDemo() throws InterruptedException {
        AIScreeningPage.clickOnBookDemo();
    }

    @Then("User should be navigated to book a demo page")
    public void verifyBookDemoTitle() throws InterruptedException {
        BookDemoPage.verifyBookDemoTitle();
    }

    @Given("the user navigates back to AI Screening Page from BookDemo")
    public void navigateBackToAIScreeningPAge() throws InterruptedException {
        AIScreeningPage.navigateBack();
    }

    @When("the user scrolls down to the Interview Integrity Section")
    public void scrollDown() throws InterruptedException {
        AIScreeningPage.scrollDown();
    }

    @And("The user clicks on Interview Integrity")
    public void clickOnInterviewIntegrity() throws InterruptedException {
        AIScreeningPage.clickOnInterviewIntegrity();
    }

    @Then("The user verifies the page title")
    public void verifyPageTitle() throws InterruptedException {
        InterviewIntegrity.verifyPageTitle();
    }

    @Given("the user navigates back to AI Screening Page from Interview")
    public void navigateBackFromInterview() throws InterruptedException {
        AIScreeningPage.navigateBackFromInterview();
    }

    @When("the user scrolls down to Lean Teams section")
    public void scrollIntoLeanTeams() throws InterruptedException {
        AIScreeningPage.scrollIntoLeanTeams();
    }

    @Then("Lean Teams section should be displayed")
    public void leanTeamsIsDisplayed() throws InterruptedException {
        AIScreeningPage.leanTeamsIsDisplayed();
    }

}



