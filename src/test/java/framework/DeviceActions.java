package framework;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DeviceActions extends BaseDriver {
    private AndroidDriver<AndroidElement> androidDriver;

    public DeviceActions(AndroidDriver<AndroidElement> androidDriver) {
        super(androidDriver);
        this.androidDriver = androidDriver;
    }

    public boolean checkElementExists(By target) {
        try {
            return driver.findElements(target).size() > 0;
        }
        catch(Throwable t){
            t.printStackTrace();
        }
        return false;
    }

    public void clearText(By target) {
        try {
            driver.findElement(target).clear();
        } catch(Throwable t){
            t.printStackTrace();
        }
    }

    public String getText(By target) {
        waitElementExists(target);
        return driver.findElement(target).getText();

    }

    public void sendKeys(By target, String textToSend){
        waitElementExists(target);
        waitElementClickable(target);
        try {
            clearText(target);
            driver.findElement(target).sendKeys(textToSend);
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

    public void sendKeys(By target, Keys keyToSend){
        waitElementExists(target);
        waitElementClickable(target);
        try {
            driver.findElement(target).sendKeys(keyToSend);
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

    public void doubleTap(By target) {
        for(int i = 1; i <= 2; i++) {
        tap(target);
        }
    }

    public void tap(By target)  {
        waitElementExists(target);
        waitElementClickable(target);
        try{
            TouchAction action = new TouchAction(driver);
            action.tap(new TapOptions()
                    .withElement(new ElementOption()
                            .withElement(driver.findElement(target))));
            action.perform();
        }
        catch(Throwable t){
            t.printStackTrace();
        }
    }

    private void waitElementClickable(By target) {
        getWait().until(ExpectedConditions.elementToBeClickable(target));
    }

    public void waitElementExists(By target) {
        getWait().until(ExpectedConditions.presenceOfElementLocated(target));
    }

    private void waitElementVisible(By target) {
        getWait().until(ExpectedConditions.visibilityOfElementLocated(target));
    }
}