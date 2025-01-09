package tasks.pfm;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import questions.CommonQuestions;

import static constants.ConstantsPfm.TXT_VALUE;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static ui.pfm.Accounts.VALUE;

public class BalancesTask implements Task {
    public static BalancesTask balances() {
        return instrumented(BalancesTask.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        CommonQuestions.textEquals(VALUE, TXT_VALUE);

    }
}
