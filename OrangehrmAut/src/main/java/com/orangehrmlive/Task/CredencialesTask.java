package com.orangehrmlive.Task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.orangehrmlive.UI.CredencialesUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class CredencialesTask implements Task {

    private final String username;
    private final String password;

    public CredencialesTask(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(INPUT_USERNAME, isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(username).into(INPUT_USERNAME),
                Enter.theValue(password).into(INPUT_PASSWORD),
                Click.on(BTN_CONTINUAR)
        );
    }

    public static CredencialesTask conDatos(String username, String password) {
        return instrumented(CredencialesTask.class, username, password);
    }
}