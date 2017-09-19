package pl.com.tt.qa.framework.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Config {
    private static final Config instance = new Config();
    private Properties properties;
    private WebDriver driver;

    private Config() {

        this("C:\\Users\\KJ1\\workspace\\BillingAutomaticTest\\src\\main\\resources\\config.properties");

           System.setProperty("webdriver.chrome.driver", getChromedriver());
           driver = new ChromeDriver();
           driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
           driver.manage().window().maximize();
    }

    private Config(String mapFile) {
        properties = new Properties();
        try {
            FileInputStream in = new FileInputStream(mapFile);
            properties.load(in);
            in.close();
        } catch (IOException e) {

        }
    }

    public String getUrl() {
        return properties.getProperty("url");
    }

    public String getChromedriver() {
        return properties.getProperty("chromeDriver");
    }

    public String getProperties(String propertyName) {
        return properties.getProperty(propertyName);
    }

    public WebDriver getDriver() {
        return driver;
    }

    public static Config getInstance() {
        return instance;
    }


}
