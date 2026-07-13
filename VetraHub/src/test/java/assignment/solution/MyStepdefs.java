package assignment.solution;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import screen.VetraMainScreen;

public class MyStepdefs {
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

}
