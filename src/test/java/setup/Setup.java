package setup;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Setup {

    public AndroidDriver driver;

    @BeforeTest
    public AndroidDriver setup() throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "android");
        capabilities.setCapability("platformVersion", "11");
        capabilities.setCapability("appPackage", "com.google.android.calculator");
        capabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
        capabilities.setCapability("app", System.getProperty("user.dir")+"/src/test/resources/calculator.apk");
        capabilities.setCapability("automationName", "UIAutomator2");

        URL url = new URL("http://127.0.0.1:4723");

        driver = new AndroidDriver(url, capabilities);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        return driver;

    }

    @AfterTest
    public void quitApp() throws InterruptedException {

        Thread.sleep(3000);
        driver.quit();

    }

}
