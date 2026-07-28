import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import setup.driver.SeleniumWebDriver;

import java.io.IOException;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"classpath:features/loginPage.feature",
                    "classpath:features/employerPage.feature"},
        glue = {"assignment.solution"},
        plugin = {"pretty", "html:target/cucumber-reports/index.html",
                "json:target/cucumber-reports/Cucumber.json",
                "junit:target/cucumber-reports/Cucumber.xml",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)
public class RunCucumberTest extends SeleniumWebDriver {
    @BeforeClass
    public static void initDriver() throws IOException,InterruptedException{
        initChrome();
        driver.manage().window().maximize();
    }
    @AfterClass
    public static void tearDown(){
        closeDriver();
    }

}
