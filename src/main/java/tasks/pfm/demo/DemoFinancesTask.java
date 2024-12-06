package tasks.pfm.demo;

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

public class DemoFinancesTask implements Task {

  public static DemoFinancesTask demoFinancesTask() {
    return instrumented(DemoFinancesTask.class);
  }

  private void waitForVisibility(Actor actor, net.serenitybdd.screenplay.targets.Target element) {
    actor.attemptsTo(
            Wait.until(stateOf(element), isVisible()).forNoMoreThan(25).seconds()
    );
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    waitForVisibility(actor, FinancesDemo.TXT_WELCOME_FINANCE);
    CommonQuestions.textEquals(FinancesDemo.TXT_WELCOME_FINANCE, ConstantsPfm.LBL_WELCOME_FINANCE);

    actor.attemptsTo(
            Click.on(FinancesDemo.BUTTON_CONTINUE_FINANCE)
    );
    waitForVisibility(actor, FinancesDemo.TXT_QUERY_OPTIONS);
    CommonQuestions.textEquals(FinancesDemo.TXT_QUERY_OPTIONS, ConstantsPfm.LBL_QUERY_OPTIONS);

    actor.attemptsTo(
            Click.on(FinancesDemo.BUTTON_NEXT)
    );
    waitForVisibility(actor, FinancesDemo.TEXT_DEMO_BILLS);
    CommonQuestions.textEquals(FinancesDemo.TEXT_DEMO_BILLS, ConstantsPfm.LBL_MACRO_CATEGORIES);
  }
}
