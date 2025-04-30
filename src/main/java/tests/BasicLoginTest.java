package tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.URL;

public class BasicLoginTest {

    public AppiumDriver<MobileElement> driver;

    @BeforeClass
    public void setup() {
        try {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
            caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
            caps.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir") + "/resources/app-debug.apk");
            caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");

            driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void sampleTest() {
        System.out.println("App launched successfully.");
        // Add simple element interaction here
    }

    @AfterClass
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
