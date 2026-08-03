package assignment.solution;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import screen.ATSscreen;
import screen.CheckFooter;
import screen.JobsBoard;
import screen.VetraMainScreen;

public class MyStepdefs1 {
    @Given("navigate to VetraHub website")
    public void navigateToVetraHubWebsite() throws InterruptedException {
        VetraMainScreen.GetNavigateVetraHub();
    }

    @When("check title of VetraHub main page")
    public void checkTitleOfVetraHubMainPage() {
        VetraMainScreen.GetTitle();
    }

    @And("verify header of the page")
    public void verifyHeaderOfThePage() {
        VetraMainScreen.GetPageHeader();
    }

    @Then("verify Log in is available")
    public void verifyLogInIsAvailable() {
    }


    @Given("User is on home page")
    public void userIsOnHomePage() {
        ATSscreen.RefreshHomePage();
    }

    @When("User click on ATS screen page")
    public void userClickOnATSscreenPage() throws InterruptedException {
        ATSscreen.AtsButton();
    }

    @And("Verify header of the page2")
    public void verifyHeaderOfThePage2() {
        ATSscreen.AtsTitle();
    }

    @And("Scroll down to login button")
    public void scrollDownToLOginButton() {
        ATSscreen.Scrolldown();
    }

    @Then("verify login button on Ats")
    public void verifyLoginButtonONAts() {
        ATSscreen.LoginButton1();
    }

    @Given("User is on home page1")
    public void UserisOnHomePage1() throws InterruptedException {
        VetraMainScreen.GetNavigateVetraHub();
        Thread.sleep(2000);
    }

    @When("User scroll down till jobs board")
    public void UserscrollDownTillJObsaBoard() {
        JobsBoard.ScrollDown1();
    }

    @And("User click on jobs board")
    public void UserclickOnJobsBoard() {
        JobsBoard.JobBoardpage();
    }

    @Then("User verify page Title2")
    public void UserverifyPageTitle2() {
        JobsBoard.JobTitle();
    }

    @Given("User is on home page2")
    public void UserisOnHomePage2() throws InterruptedException {
        VetraMainScreen.GetNavigateVetraHub();
    }

    @When("USer scroll down till footer")
    public void USerScrolldownTillFooter() throws InterruptedException {
        CheckFooter.ScrollDown1();
    }

    @And("user click on one of the footer")
    public void userClickONoneOftheFooter() {
        CheckFooter.FooterButton();
    }

    @Then("User verify page Title")
    public void UserVerifyPageTitle() {
        CheckFooter.FooterTitleCheck();
    }
}


