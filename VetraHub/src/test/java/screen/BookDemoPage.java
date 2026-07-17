package screen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static setup.driver.SeleniumWebDriver.driver;

public class BookDemoPage {

    public static void verifyBookDemoTitle() throws InterruptedException {
        bookDemoTitle().isDisplayed();
    }
//WebElement

    public static WebElement bookDemoTitle() {
        return driver.findElement(By.className("font-mono"));
    }
}
