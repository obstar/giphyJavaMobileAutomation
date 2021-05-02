package screenActions;

import screenObjects.MainScreen;
import screenObjects.SignUpLogInScreen;

import static steps.ScenarioHooks.deviceActions;

public class MainScreenActions {

    public void goToLoginScreen() {
        deviceActions.doubleTap(MainScreen.buttonProfile);
        deviceActions.tap(SignUpLogInScreen.tabLogIn);
    }
}