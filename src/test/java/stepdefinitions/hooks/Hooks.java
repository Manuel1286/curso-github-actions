package stepdefinitions.hooks;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import net.serenitybdd.screenplay.actors.OnStage;

import net.thucydides.core.util.EnvironmentVariables;
import stepdefinitions.actors.EnvironmentCast;

public class Hooks {

    private EnvironmentVariables environmentVariables;

    @Before
    public void setUp(Scenario scenario) {
        OnStage.setTheStage(new EnvironmentCast(environmentVariables));

    }
}

