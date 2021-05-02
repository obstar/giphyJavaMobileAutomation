package steps;

import io.cucumber.java.en.Given;
import screenActions.MainScreenActions;

public class MainScreenSteps {
    private MainScreenActions mainScreenActions;

    public MainScreenSteps(MainScreenActions mainScreenActions) {
        this.mainScreenActions = mainScreenActions;
    }

    @Given("user go to Login screen")
    public void userGoToLoginScreen() {
        mainScreenActions.goToLoginScreen();
    }
}