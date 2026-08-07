package assignment.solution;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import screen.ForEmployerScreen;
import screen.VetraMainScreen;

public class MyStepdefs {
    @Given("navigate to VetraHub website")
    public void navigateToVetraHubWebsite() throws InterruptedException {
        VetraMainScreen.getNavigateVetraHub();
    }

    @When("check title of VetraHub main page")
    public void checkTitleOfVetraHubMainPage() {

        VetraMainScreen.getTitle();
    }

    @And("verify header of the page")
    public void verifyHeaderOfThePage() {

        VetraMainScreen.getPageHeader();
    }

    @Then("verify Log in is available")
    public void verifyLogInIsAvailable() {
        VetraMainScreen.getLoginButton();
    }

    @Given("the user is on home page")
    public void theUserIsOnHomePage() throws InterruptedException {
        VetraMainScreen.getNavigateVetraHub();
    }

    @When("the user click on For Employer button")
    public void theUserClickOnForEmployerButton() {
        ForEmployerScreen.clickForEmployer();
    }

    @And("the user click on AI Screening")
    public void theUserClickOnAIScreening() throws InterruptedException{
        ForEmployerScreen.clickAiScreening();
    }

    @Then("the user should be on For Employer Screen")
    public void theUserShouldBeOnForEmployerScreen() {
        ForEmployerScreen.onEmployerScreen();
    }

    @And("the Get started free button should be enabled")
    public void theGetStartedFreeButtonShouldBeEnabled() {
        ForEmployerScreen.getStartedButton();
    }

    @And("the Book a Demo button should be Displayed")
    public void theBookADemoButtonShouldBeDisplayed() {
        ForEmployerScreen.bookDemoButton();
    }

    @When("the user Scrolls and click on Video Interviews")
    public void theUserScrollsAndClickOnVideoInterviews() throws InterruptedException {
        ForEmployerScreen.clickVideoInterviews();
    }

    @Then("the user should be on Video interview page")
    public void theUserShouldBeOnVideoInterviewPage() {
        ForEmployerScreen.onVideoInterviewPage();
    }


}
