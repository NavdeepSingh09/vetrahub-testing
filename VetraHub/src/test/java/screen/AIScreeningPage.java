package screen;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import setup.driver.SeleniumWebDriver;

import static org.junit.Assert.assertTrue;

public class AIScreeningPage extends SeleniumWebDriver {

    public static void GetNavigateVetraHub() throws InterruptedException {
        getWebDriver().get("https://vetrahub.com/");
        Thread.sleep(5000);
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

}
