package screenActions;

import screenObjects.SignUpLogInScreen;

import static steps.ScenarioHooks.deviceActions;

public class LoginScreenActions {

    public void enterUserCredentials(String email, String password) {
        deviceActions.sendKeys(SignUpLogInScreen.inputEmail, email);
        deviceActions.sendKeys(SignUpLogInScreen.inputPassword, password);
    }

    public void tapLogInButton() {
        deviceActions.tap(SignUpLogInScreen.buttonLogIn);
    }
}