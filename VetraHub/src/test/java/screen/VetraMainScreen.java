package screen;

import org.apache.commons.io.filefilter.TrueFileFilter;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import setup.driver.SeleniumWebDriver;

public class VetraMainScreen extends SeleniumWebDriver {
    public static void GetNavigateVetraHub() throws InterruptedException{
        getWebDriver().get("https://vetrahub.com/");
        Thread.sleep(5000);
    }
    public static void GetTitle(){
        String title = Title().getText();
        Assert.assertTrue(title.contains("Practice"));
    }
    public static void GetPageHeader(){
        String header1 = Header1().getText();
        Assert.assertTrue(header1.contains("Features"));
        System.out.println(header1);
    }

//Web Elements
    public static WebElement Title(){
        return getWebDriver().findElement(By.xpath("//div[h1]"));
    }
    public static WebElement Header1(){
        return getWebDriver().findElement(By.xpath("//button[text()='Features']"));
    }


}
