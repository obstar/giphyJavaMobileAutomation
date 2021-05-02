package screenActions;

import screenObjects.SignUpLogInScreen;

import static steps.ScenarioHooks.deviceActions;
public class LoginScreenActions {

    public void loginUserToApp(String email, String password) {
        deviceActions.sendKeys(SignUpLogInScreen.inputEmail, email);
        deviceActions.sendKeys(SignUpLogInScreen.inputPassword, password);
        deviceActions.tap(SignUpLogInScreen.buttonLogIn);
    }
}