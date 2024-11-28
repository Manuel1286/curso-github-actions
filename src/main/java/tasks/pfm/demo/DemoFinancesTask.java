package tasks.pfm.demo;



import constants.ConstantsPfm;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.Wait;
import questions.CommonQuestions;
import ui.pfm.FinancesDemo;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.stateOf;

public class DemoFinancesTask implements Task {

    public static DemoFinancesTask demoFinancesTask() {
        return instrumented(DemoFinancesTask.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Wait.until(stateOf(FinancesDemo.TXT_WELCOME_FINANCE), isVisible()).
            forNoMoreThan(25).seconds());
        CommonQuestions.textEquals(FinancesDemo.TXT_WELCOME_FINANCE, ConstantsPfm.LBL_WELCOME_FINANCE);
        actor.attemptsTo(
            Click.on(FinancesDemo.BUTTON_CONTINUE_FINANCE),
            Wait.until(stateOf(FinancesDemo.TXT_QUERY_OPTIONS), isVisible()).forNoMoreThan(25).seconds());
        CommonQuestions.textEquals(FinancesDemo.TXT_QUERY_OPTIONS, ConstantsPfm.LBL_QUERY_OPTIONS);
        actor.attemptsTo(
            Click.on(FinancesDemo.BUTTON_NEXT),
            Wait.until(stateOf(FinancesDemo.TEXT_DEMO_BILLS), isVisible()).forNoMoreThan(25).seconds());
        CommonQuestions.textEquals(FinancesDemo.TEXT_DEMO_BILLS, ConstantsPfm.LBL_MACRO_CATEGORIES);

    }
}
