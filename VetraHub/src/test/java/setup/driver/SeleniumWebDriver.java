package setup.driver;

import common.CommonConfig;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.IOException;

public class SeleniumWebDriver extends CommonConfig {
    public static WebDriver driver;
    public static WebDriver initChrome() throws IOException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        return driver;
    }

    public static void closeDriver() {
        driver.quit();
    }

    public static WebDriver getWebDriver() {
        return driver;
    }

}

