package common;

import static constants.ConstantsPfm.TEXT_FINANCES;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.stateOf;
import static ui.pfm.FinancesDemo.TXT_WELCOME_FINANCE;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.Wait;
import questions.CommonQuestions;
import ui.pfm.FinancesDemo;

public class DashFinancesTask implements Task {
  public static DashFinancesTask dashFinancesTask() {
    return instrumented(DashFinancesTask.class);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    try {
      Thread.sleep(5000);
      if (TXT_WELCOME_FINANCE.resolveFor(actor).isVisible()) {
        actor.attemptsTo(
            Click.on(FinancesDemo.BUTTON_CONTINUE_FINANCE),
            Wait.until(stateOf(FinancesDemo.TXT_QUERY_OPTIONS), isVisible())
                .forNoMoreThan(25)
                .seconds(),
            Click.on(FinancesDemo.BUTTON_DEMO_CLOSE));
      } else if (FinancesDemo.TXT_QUERY_OPTIONS.resolveFor(actor).isVisible()) {
        actor.attemptsTo(Click.on(FinancesDemo.BUTTON_DEMO_CLOSE));
      } else {
        CommonQuestions.textEquals(FinancesDemo.LBL_FINANCES, TEXT_FINANCES);
      }
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
    }
  }
}
