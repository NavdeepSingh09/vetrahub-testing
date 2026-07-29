package screen;

import org.apache.commons.io.filefilter.TrueFileFilter;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import setup.driver.SeleniumWebDriver;

public class VetraMainScreen extends SeleniumWebDriver {
    public static void getNavigateVetraHub() throws InterruptedException{
        String vetraUrl = "https://vetrahub.com/";
        if(getWebDriver().getCurrentUrl().equals(vetraUrl)) {
            Thread.sleep(2000);
        }else {
            getWebDriver().get("https://vetrahub.com/");
            Thread.sleep(2000);
        }
    }
    public static void getTitle(){
        String title = title().getText();
        Assert.assertTrue(title.contains("Know why"));
    }
    public static void getPageHeader(){
        String header1 = header1().getText();
        Assert.assertTrue(header1.contains("Features"));
        System.out.println(header1);
    }
    public static void getLoginButton(){
        String loginText = loginButton().getText();
        Assert.assertEquals("Log in", loginText);
        System.out.println(loginText);
    }

//Web Elements
    public static WebElement title(){

        return getWebDriver().findElement(By.xpath("//div[h1]"));
    }
    public static WebElement header1(){
        return getWebDriver().findElement(By.xpath("//button[text()='Features']"));
    }
    public static WebElement loginButton(){
        return getWebDriver().findElement(By.xpath("//a[@data-testid='nav-login']"));

    }

}
