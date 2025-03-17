package com.bdd.runner;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.appmanagement.AndroidInstallApplicationOptions;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = {"src/test/resources/features/"},
        stepNotifications = true,
        glue = {"com.bdd.stepdefinitions"},
        tags = "@ReservaAppBooking01"
)

public class RunnerTest {

    @BeforeClass
    public static void beforeExecution() throws MalformedURLException, URISyntaxException {
        AndroidDriver driver;
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("automationName","UiAutomator2");
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("deviceName","emulator-5554");
        capabilities.setCapability("platformVersion","11");
        capabilities.setCapability("udid","emulator-5554");
        capabilities.setCapability("app","/Users/ycaneloc/Documents/MobileProyectos/Booking.apk");
        capabilities.setCapability("appPackage","com.booking");
        capabilities.setCapability("appActivity","com.booking.startup.HomeActivity");
        capabilities.setCapability("noReset","true");
        capabilities.setCapability("autoGrantPermissions","true");

        URL urlAppiumHub = new URL ("http://127.0.0.1:4723");
        driver = new AndroidDriver( urlAppiumHub.toURI().toURL(), capabilities);
    }

}
