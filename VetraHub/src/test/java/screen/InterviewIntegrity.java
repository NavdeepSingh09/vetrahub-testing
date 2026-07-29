package screen;

import org.junit.Assert;

import static setup.driver.SeleniumWebDriver.driver;

public class InterviewIntegrity {

    public static void verifyPageTitle() throws InterruptedException {
        String title = driver.getTitle();
        Assert.assertEquals(title, "Recorded Video Interviews with Transcripts | VetraHub");

    }


}
