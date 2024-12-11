package tasks.pfm;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import questions.CommonQuestions;

import static constants.ConstantsPfm.TXT_BALANCE_RANGE_DATE;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static ui.pfm.Accounts.BUTTON_SEARCH;
import static ui.pfm.Balances.BALANCES_RANGE_DATE;

public class BalancesRangeDateTask implements Task {
    public static BalancesRangeDateTask balancesRangeDateTask() {
        return instrumented(BalancesRangeDateTask.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BUTTON_SEARCH));
        CommonQuestions.textEquals(BALANCES_RANGE_DATE, TXT_BALANCE_RANGE_DATE);



    }
}
