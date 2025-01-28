package tasks.pfm;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RedirectionSPTask implements Task {
    public static RedirectionSPTask redirectionSPTask() {
        return instrumented(RedirectionSPTask.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(
                //WaitUntil.the(BTN_REGISTER_NOW, isVisible()).forNoMoreThan(10).seconds()
            );
    }
}
