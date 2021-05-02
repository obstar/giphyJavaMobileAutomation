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
        loginScreenActions.enterUserCredentials(User.ExistingEmail, User.ExistingPassword);
    }

    @When("I tap Log In button on Login screen")
    public void iTapLogInButtonOnLoginScreen() {
        loginScreenActions.tapLogInButton();
    }
}