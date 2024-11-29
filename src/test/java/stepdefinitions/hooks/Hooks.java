package stepdefinitions.hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import net.serenitybdd.screenplay.actors.OnStage;

import net.thucydides.core.util.EnvironmentVariables;
import org.openqa.selenium.JavascriptExecutor;
import stepdefinitions.actors.EnvironmentCast;
import utils.BrowserstackLogs;
import utils.ConexionBrowserStackLocal;

import static net.serenitybdd.core.Serenity.getDriver;

public class Hooks {

    private EnvironmentVariables environmentVariables;

    @Before
    public void setUp(Scenario scenario) {
        OnStage.setTheStage(new EnvironmentCast(environmentVariables));

    }
    @After
    public void checkTestCase(Scenario scenario) {
        JavascriptExecutor jse = (JavascriptExecutor) getDriver();
        if (scenario.isFailed()) {
            jse.executeScript("browserstack_executor: {\"action\": \"setSessionStatus\","
                    + " \"arguments\": {\"status\": \"failed\", \"reason\": \"TestFailed\"}}");
        } else {
            jse.executeScript("browserstack_executor: {\"action\": \"setSessionStatus\", "
                    + "\"arguments\": {\"status\": \"passed\", \"reason\": \"TestPassed\"}}");
        }
        BrowserstackLogs.informationBrowserstackLogs(getDriver());
    }
    @AfterAll
    public static void stopTunnel() throws Exception {
        ConexionBrowserStackLocal.browserStackLocalfinish();
    }
}

