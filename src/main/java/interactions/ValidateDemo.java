package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static ui.login.DemoPage.BUTTON_SKIP;

public class ValidateDemo implements Interaction {

    public static ValidateDemo toTheApplication(){
        return instrumented(ValidateDemo.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BUTTON_SKIP)
        );
    }
}
