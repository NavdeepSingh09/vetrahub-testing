package common;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class CommonConfig {
    public static String chromePath() throws IOException {
        InputStream input = new FileInputStream("src/test/resources/CommonProperties.properties");
        Properties prop = new Properties();
        prop.load(input);
        return prop.getProperty("chrome.driver.path");

    }
}
