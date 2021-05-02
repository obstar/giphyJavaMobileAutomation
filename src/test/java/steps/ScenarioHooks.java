package steps;

import configuration.Log;
import framework.AppiumServer;
import framework.DeviceActions;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class ScenarioHooks {
    public static DeviceActions deviceActions = null;
    private static AppiumServer appiumServer = new AppiumServer();

    @Before()
    public static void InitialTest(Scenario scenario) throws Exception {
        Log.startTestCase(scenario.getName());
        deviceActions = new DeviceActions(appiumServer.startServer());
    }

    @After()
    public void TearDown(Scenario scenario) {
        Log.endTestCase(scenario.getName());
        deviceActions.getDriver().quit();
        appiumServer.stopServer();
    }
}