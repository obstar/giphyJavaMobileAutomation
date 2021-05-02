package steps;

import configuration.User;
import io.cucumber.java.en.Then;
import screenActions.ProfileScreenActions;

public class ProfileScreenSteps {
    private ProfileScreenActions profileScreenActions;

    public ProfileScreenSteps(ProfileScreenActions profileScreenActions) {
        this.profileScreenActions = profileScreenActions;
    }

    @Then("user is logged in")
    public void userIsLoggedIn() {
        profileScreenActions.AssertUserIsLoggedIn(User.ExistingName);
    }
}