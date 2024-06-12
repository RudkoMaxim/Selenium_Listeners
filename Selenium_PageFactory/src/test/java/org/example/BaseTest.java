package org.example;

import Pages.utils.DriverFactory;
import Pages.utils.PropertyReader;
import enums.Capability;
import listeners.ElementActionListener;
import listeners.TestListeners;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import java.sql.DriverManager;
import java.time.Duration;

@Listeners(TestListeners.class)
public class BaseTest {

        protected WebDriver driver;

    @BeforeTest
    public void setUp() {
        driver = DriverFactory.createDriver(PropertyReader.getConfigProperty(Capability.BROWSER));
        EventFiringDecorator<WebDriver> decorator = new EventFiringDecorator(new ElementActionListener());
        driver = decorator.decorate(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @AfterTest
    public void closeSession() {
        driver.quit();
    }
}
//    WebDriver driver;
//
//    @BeforeMethod
//    public void setUp() {
//        driver = DriverManager.getDriver();
//    }
//}
