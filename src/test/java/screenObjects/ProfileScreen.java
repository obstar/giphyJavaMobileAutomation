package screenObjects;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class ProfileScreen {
    public static By iconInfo = MobileBy.id("com.giphy.messenger:id/info_item");
    public static By iconSettings = MobileBy.id("com.giphy.messenger:id/settings_item");
    public static By labelUserName = MobileBy.id("com.giphy.messenger:id/userName");
}
