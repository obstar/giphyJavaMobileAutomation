package steps;

import configuration.User;
import io.cucumber.java.en.When;
import screenActions.LoginScreenActions;

public class LoginScreenSteps {
    private LoginScreenActions loginScreenActions;

    public LoginScreenSteps(LoginScreenActions loginScreenActions) {
        this.loginScreenActions = loginScreenActions;
    }

    @When("I enter credentials of existing user on Login screen")
    public void iEnterCredentialsOfExistingUserOnLoginScreen() {
        loginScreenActions.loginUserToApp(User.ExistingEmail, User.ExistingPassword);
    }
}