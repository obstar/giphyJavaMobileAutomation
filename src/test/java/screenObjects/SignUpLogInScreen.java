package screenObjects;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class SignUpLogInScreen {
    public static By buttonLogIn = MobileBy.id("com.giphy.messenger:id/startSignUp");
    public static By inputEmail = MobileBy.id("com.giphy.messenger:id/signupEmailEditText");
    public static By inputPassword = MobileBy.id("com.giphy.messenger:id/signupPasswordEditText");
    public static By tabLogIn = MobileBy.AccessibilityId("Log In");
}