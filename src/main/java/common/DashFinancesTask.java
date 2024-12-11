package common;

import static constants.ConstantsPfm.TEXT_FINANCES;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static ui.pfm.FinancesDemo.TXT_WELCOME_FINANCE;
import static ui.pfm.FinancesDemo.TXT_QUERY_OPTIONS;
import static ui.pfm.FinancesDemo.BUTTON_CONTINUE_FINANCE;
import static ui.pfm.FinancesDemo.BUTTON_DEMO_CLOSE;
import static ui.pfm.FinancesDemo.LBL_FINANCES;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import questions.CommonQuestions;


public class DashFinancesTask implements Task {
  public static DashFinancesTask dashFinancesTask() {
    return instrumented(DashFinancesTask.class);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    try {
      Thread.sleep(5000);
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt(); // Reinterrumpir el hilo.
      throw new RuntimeException("El hilo fue interrumpido durante la espera.", e);
    }
    if (isWelcomeFinanceVisible(actor)) {
        handleWelcomeFinance(actor);
      } else if (isQueryOptionsVisible(actor)) {
        closeDemo(actor);
      } else {
        validateFinancesLabel(actor);
      }
    }

    private <T extends Actor> boolean isWelcomeFinanceVisible(T actor) {
      return TXT_WELCOME_FINANCE.resolveFor(actor).isVisible();
    }

    private <T extends Actor> boolean isQueryOptionsVisible(T actor) {
      return TXT_QUERY_OPTIONS.resolveFor(actor).isVisible();
    }

    private <T extends Actor> void handleWelcomeFinance(T actor) {
      actor.attemptsTo(
              Click.on(BUTTON_CONTINUE_FINANCE),
              WaitUntil.the(TXT_QUERY_OPTIONS, isVisible()).forNoMoreThan(25).seconds(),
              Click.on(BUTTON_DEMO_CLOSE)
      );
    }

    private <T extends Actor> void closeDemo(T actor) {
      actor.attemptsTo(Click.on(BUTTON_DEMO_CLOSE));
    }

    private <T extends Actor> void validateFinancesLabel(T actor) {
      CommonQuestions.textEquals(LBL_FINANCES, TEXT_FINANCES);
    }
  }
