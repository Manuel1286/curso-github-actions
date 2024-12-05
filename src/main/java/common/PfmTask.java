package common;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static ui.pfm.FinancesDemo.BUTTON_FINANCES;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class PfmTask implements Task {
  public static PfmTask pfmTask() {
    return instrumented(PfmTask.class);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(Click.on(BUTTON_FINANCES));
  }
}
