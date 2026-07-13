package assignment.solution;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import screen.AIScreeningPage;


public class MyStepdefs1 {
    @Given("the user navigates to Vetrahub home page")
    public void navigateToVetraHubWebsite() throws InterruptedException {
        AIScreeningPage.GetNavigateVetraHub();
    }

    @When("the user clicks on For Employers")
    public void clickOnForEmoloyers()throws InterruptedException{
        AIScreeningPage.clickForEmployers();
    }

    @And("the user clicks on AI Screening")
    public void clickOnAiScreening()throws InterruptedException{
        AIScreeningPage.clickAIScreening();
    }

    @Then("the AI Screening and Evalution label should be displayed")
    public void verifyLabel() throws InterruptedException{
        AIScreeningPage.verifyLabel();
    }
}
