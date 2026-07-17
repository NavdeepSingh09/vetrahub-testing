import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import setup.driver.SeleniumWebDriver;

import java.io.IOException;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"classpath:features/AIScreeningpage.feature"},//classpath:features/sauceDemoLogin.feature    classpath:features/saucedemoE2E.feature

        glue = {"assignment.solution"}
        //plugin = {"pretty"}
        //plugin = {"pretty", "html:target/cucumber-reports/index.html", "json:target/cucumber-reports/Cucumber.json", "junit:target/cucumber-reports/Cucumber.xml"}
)
public class RunCucumberTest extends SeleniumWebDriver {
    @BeforeClass
    public static void  initDrivers() {
        initDriver();
    }

    @AfterClass
    public static void tearDown() {
       // closeDriver();
    }
}
