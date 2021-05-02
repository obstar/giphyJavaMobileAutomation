package framework;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseDriver {

    protected AndroidDriver driver;
    private WebDriverWait wait;
    private final int maxWaitTime = 15;


    public BaseDriver(AndroidDriver<AndroidElement> androidDriver) {
        this.driver = androidDriver;
        wait = new WebDriverWait(driver, maxWaitTime);

    }

    public WebDriverWait getWait() {
        return wait;
    }

    public AndroidDriver getDriver() {
        return driver;
    }
}