package tasks.dashboard;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static ui.dashboard.DashBoardPage.OPTION_DETAIL;
import static ui.dashboard.DashBoardPage.TAG_DASHBOARD;
import static ui.dashboard.DashBoardPage.TAG_DETAIL;

public class SelectOptionTag implements Task {

    private final String section;

    public SelectOptionTag(String section) {
        this.section = section;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        if ("Dashboard".equalsIgnoreCase(section)) {
            actor.attemptsTo(Click.on(TAG_DASHBOARD));
        } else if ("Detalle".equalsIgnoreCase(section)) {
            actor.attemptsTo(
                Click.on(OPTION_DETAIL),
                //Pause.withDuration(1000),
                Click.on(TAG_DETAIL)
            );
        }
    }

    public static SelectOptionTag tag(String section) {
        return instrumented(SelectOptionTag.class, section);
    }
}
