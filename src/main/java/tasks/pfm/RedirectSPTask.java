package tasks.pfm;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static ui.pfm.Redirection.PUBLIC_SERVICES;

public class RedirectSPTask implements Task {
    public static RedirectSPTask redirectSPTask() {
        return instrumented(RedirectSPTask.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(PUBLIC_SERVICES)
           // WaitUntil.the(BTN_REGISTER_NOW, isVisible()).forNoMoreThan(10).seconds()
        );


    }
}
