package screen;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import static setup.driver.SeleniumWebDriver.driver;

public class CheckFooter {
    public static WebElement Footer() {
        return driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/footer/div/div[1]/div[2]/ul/li[1]/a"));
    }

    public static WebElement FooterTitle() {
        return driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/section[1]/div[2]/div[1]/h1"));
    }


    public static void ScrollDown1() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,4000);");
        Thread.sleep(2000);
    }
    public static void FooterButton(){Footer().click();}

    public static void FooterTitleCheck() {
        String actualText = FooterTitle().getText();
        System.out.println("Header Text:" + actualText);
        Assert.assertTrue(actualText.contains("real interviews"));
    }

}