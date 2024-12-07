package tasks.pfm;

import constants.ConstantsPfm;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import questions.CommonQuestions;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static ui.pfm.FinancesDemo.LBL_FINANCES;


public class BalanceBillsTask implements Task {
    public static BalanceBillsTask balanceBillsTask() {
        return instrumented(BalanceBillsTask.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
       CommonQuestions.textEquals(LBL_FINANCES, ConstantsPfm.TEXT_FINANCES);
    }
}
