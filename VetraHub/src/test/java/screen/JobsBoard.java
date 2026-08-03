package screen;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import static setup.driver.SeleniumWebDriver.driver;

public class JobsBoard {


    public static WebElement JobBoradButton() {
        return driver.findElement(By.xpath("//*[@id=\"modules\"]/div[2]/a[2]/h3"));
    }

    public static WebElement JobBoardTitle() {
        return driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/section[1]/div[2]/div[1]/h1"));
    }


    public static void ScrollDown1() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000);");
    }

    public static void JobBoardpage() {
        JobBoradButton().click();
    }

    public static void JobTitle() {
        String actualText = JobBoardTitle().getText();
        System.out.println("Header Text:" + actualText);
        Assert.assertTrue(actualText.contains("right jobs"));

    }
}
