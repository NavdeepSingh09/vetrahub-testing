package setup.driver;

import common.CommonConfig;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.IOException;

public class SeleniumWebDriver extends CommonConfig {
    public static WebDriver driver;
    public static WebDriver initDriver()
    {
        System.setProperty("webdriver.edge.driver", "C:\\edgedriver\\msedgedriver.exe");
        driver = new EdgeDriver();
        return driver;
    }

    public static void closeDriver() {
        driver.close();
    }

    public static WebDriver getWebDriver() {
        return driver;
    }

}

