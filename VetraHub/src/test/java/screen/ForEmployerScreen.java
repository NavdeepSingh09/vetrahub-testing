package screen;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import setup.driver.SeleniumWebDriver;

import javax.swing.*;

public class ForEmployerScreen extends SeleniumWebDriver {
    public static void clickForEmployer() {
        forEmployer().click();
    }
    public static void clickAiScreening() throws InterruptedException{
        aiScreening().click();
        Thread.sleep(3000);
    }
    public static void onEmployerScreen(){
        String employerScreenUrl = "https://vetrahub.com/solutions/ai-screening";
        Assert.assertEquals(employerScreenUrl, getWebDriver().getCurrentUrl());
        String employerPageUrl1 = getWebDriver().getCurrentUrl();
        System.out.println(employerPageUrl1);
    }
    public static void getStartedButton(){
        Assert.assertTrue(getStarted().isDisplayed());
    }
    public static void bookDemoButton(){
        Assert.assertTrue(bookDemo().isDisplayed());
    }
    public static void clickVideoInterviews() throws InterruptedException{
        WebElement videoInterview = videoInterviews();
        Actions actions = new Actions(getWebDriver());
        actions.moveToElement(videoInterview).perform();
        Thread.sleep(2000);
        videoInterview.click();
        Thread.sleep(3000);
    }
    public static void onVideoInterviewPage(){
        String videoPageUrl = "https://vetrahub.com/solutions/video-interviews";
        Assert.assertEquals(videoPageUrl,getWebDriver().getCurrentUrl());
    }

    //Web Elements
    public static WebElement forEmployer() {
        return getWebDriver().findElement(By.xpath("//button[@data-testid = 'nav-employers']"));
    }
    public static WebElement aiScreening(){
        return getWebDriver().findElement(By.xpath("//div[contains(text(),'AI Screening')]"));
    }
    public static WebElement getStarted(){
        return getWebDriver().findElement(By.xpath("//a[text() = 'Get started free']"));
    }
    public static WebElement bookDemo(){
        return getWebDriver().findElement(By.linkText("Book a demo"));
    }
    public static WebElement videoInterviews(){
        return getWebDriver().findElement(By.xpath("//a[@href = '/solutions/video-interviews']"));
    }
}
