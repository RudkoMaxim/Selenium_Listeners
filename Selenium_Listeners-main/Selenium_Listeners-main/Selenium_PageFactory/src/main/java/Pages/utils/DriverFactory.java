package Pages.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverFactory {
        public static WebDriver createDriver(String browser) {
        if (browser.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\ZelenskayaOlga\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
            return new ChromeDriver();
        } else if (browser.equals("firefox")) {
            System.setProperty("webdriver.firefox.driver", "C:\\Users\\ZelenskayaOlga\\Downloads\\geckodriver-v0.34.0-win-aarch64\\geckodriver.exe");
            return new FirefoxDriver();
        }
        return null;
    }
//    public static WebDriver createDriver(String browser) {
//        URL url;  // Запуск с Selenium server
//        try {
//            url = new URL("http://localhost:4444");
//        } catch (MalformedURLException e) {
//            throw new RuntimeException(e);
//        }
//        if (browser.equals("chrome")) {
//            LOGGER.debug("Browser is chrome");
//            ChromeOptions chromeOptions = new ChromeOptions();
//            return new RemoteWebDriver(url, chromeOptions);
//        } else if (browser.equals("firefox")) {
//            LOGGER.debug("Browser is firefox");
//            FirefoxOptions firefoxOptions = new FirefoxOptions();
//            LOGGER.debug("Options are created");
//            return new RemoteWebDriver(url, firefoxOptions);
//        }
//        return null;
//    }
}

