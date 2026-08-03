package screen;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import setup.driver.SeleniumWebDriver;

public class ATSscreen extends SeleniumWebDriver{

    public static WebElement AtsScreenButton()
    {return driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/section[1]/div[2]/div[1]/div[2]/a[1]"));}
    public static WebElement AtsHeader()
    {return driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[1]/div/div[2]/h1"));}
    public static WebElement LoginButton()
    {return driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[1]/div/div[2]/p[2]/a"));}

    public static void RefreshHomePage()
    { driver.navigate().refresh();}
    public static void Scrolldown()
    {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,5000);");
    }
    public static void AtsButton() throws InterruptedException
    { AtsScreenButton().click();
        Thread.sleep(1000);}
    public static void AtsTitle()
    {
        String actualText = AtsHeader().getText();
        System.out.println("Header Text:" +actualText);
        Assert.assertTrue(actualText.contains("Choose how"));
    }
    public static void LoginButton1()
    { LoginButton().click();}
}
