package tasks.pfm;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.stateOf;

import constants.ConstantsPfm;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.Wait;
import questions.CommonQuestions;
import ui.pfm.FinancesDemo;

public class DemoBackQueryOptionTask implements Task {
  public static DemoBackQueryOptionTask demoBackQueryOptionTask() {
    return instrumented(DemoBackQueryOptionTask.class);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        Click.on(FinancesDemo.BUTTON_BACK),
        Wait.until(stateOf(FinancesDemo.TXT_QUERY_OPTIONS), isVisible())
            .forNoMoreThan(25)
            .seconds());
    CommonQuestions.textEquals(FinancesDemo.TXT_QUERY_OPTIONS, ConstantsPfm.LBL_QUERY_OPTIONS);
  }
}
