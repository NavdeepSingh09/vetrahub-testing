package screen;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import setup.driver.SeleniumWebDriver;

import static org.junit.Assert.assertTrue;

public class AIScreeningPage extends SeleniumWebDriver {

    public static void GetNavigateVetraHub() throws InterruptedException {
        getWebDriver().get("https://vetrahub.com/");
    }

    public static void clickForEmployers() throws InterruptedException {
        forEmployersButton().click();
    }

    public static void clickAIScreening() throws InterruptedException {
        aiScreeningButton().click();
    }

    public static void verifyLabel() throws InterruptedException {
        assertTrue(label().getText().contains("AI SCREENING & EVALUATION"));
    }

    public static void clickGetStartedButton() throws InterruptedException {
        getStartedFreeButton().click();
    }

    public static void navigateBackToAIScreening() throws InterruptedException {
        driver.navigate().back();
    }

    public static void clickOnBookDemo() throws InterruptedException {
        bookADemoButton().click();
    }

    public static void navigateBack() throws InterruptedException {
        driver.navigate().back();
    }

    public static void scrollDown() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,4500);");
    }

    public static void clickOnInterviewIntegrity() throws InterruptedException {
        driver.findElement(By.xpath("//a[contains(@href, 'video-interviews')]")).click();
    }

    public static void navigateBackFromInterview() throws InterruptedException {
        driver.navigate().back();
    }

    public static void scrollIntoLeanTeams() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,4000);");
    }

    public static void leanTeamsIsDisplayed() throws InterruptedException {
        assertTrue(leanTeams().isDisplayed());
    }

    //WebElements
    public static WebElement forEmployersButton() {
        return driver.findElement(By.xpath("//*[@id=\"root\"]/div/header/div/nav/div[1]/div[2]/button"));
    }

    public static WebElement aiScreeningButton() {
        return driver.findElement(By.xpath("//*[@id=\"root\"]/div/header/div/nav/div[1]/div[2]/div/div/a[1]/div[2]/div[2]"));
    }

    public static WebElement label() {
        return driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/section[1]/div[2]/div[1]/div[1]"));
    }

    public static WebElement getStartedFreeButton() {
        return driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/section[1]/div[2]/div[1]/div[2]/a[1]"));
    }

    public static WebElement bookADemoButton() {
        return driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/section[1]/div[2]/div[1]/div[2]/a[2]"));
    }

    public static WebElement leanTeams() {
        return driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/section[4]/div[2]/div[2]"));
    }


}
