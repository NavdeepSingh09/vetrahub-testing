package screen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import setup.driver.SeleniumWebDriver;

import static org.junit.Assert.assertTrue;
import static setup.driver.SeleniumWebDriver.driver;

public class SignupPage {

    public static void verifyTitle() {
        createAccountTitle().isDisplayed();
    }

    public static WebElement createAccountTitle() {
        return driver.findElement(By.className("font-mono"));
    }
}