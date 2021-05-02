package framework;

import java.io.File;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class AppiumServer {

    public AppiumDriverLocalService service;
    public DesiredCapabilities dc;
    AndroidDriver<AndroidElement> driver;
    private File app = new File("./src/test/resources/app/com.giphy.messenger.apk");

    public AndroidDriver<AndroidElement> startServer() throws Exception {

        // apk Capabilities
        dc = new DesiredCapabilities();
        dc.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
        dc.setCapability("deviceName", "SamsungS7Edge");
        dc.setCapability("automationName","UiAutomator2");
        dc.setCapability("app",app.getAbsolutePath());
        dc.setCapability("appPackage", "com.giphy.messenger");
        dc.setCapability("appActivity", "com.giphy.messenger.app.MainActivity");

        try {
            service = AppiumDriverLocalService.buildService(new AppiumServiceBuilder());
            service.start();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }

        driver = new AndroidDriver<AndroidElement>(service.getUrl(), dc);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        return driver;
    }

    public void stopServer() {
        service.stop();
    }
}