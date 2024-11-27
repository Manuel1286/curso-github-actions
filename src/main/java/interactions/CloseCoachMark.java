package interactions;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static ui.dashboard.DashBoardPage.*;


public class CloseCoachMark implements Interaction {

    public static CloseCoachMark closeCoachMark(){
        return instrumented(CloseCoachMark.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
       actor.attemptsTo(
        Check.whether(the(BTN_CLOSE_COACHMARK), isVisible()).andIfSo(
            Click.on(BTN_CLOSE_COACHMARK)
        ));
    }
}
