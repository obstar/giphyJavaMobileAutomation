package screenActions;

import org.junit.Assert;
import screenObjects.ProfileScreen;

import static steps.ScenarioHooks.deviceActions;

public class ProfileScreenActions {

    public void AssertUserIsLoggedIn(String userName) {
        Assert.assertEquals(userName, deviceActions.getText(ProfileScreen.labelUserName));
        Assert.assertTrue(deviceActions.checkElementExists(ProfileScreen.iconInfo));
        Assert.assertTrue(deviceActions.checkElementExists(ProfileScreen.iconSettings));
    }
}
