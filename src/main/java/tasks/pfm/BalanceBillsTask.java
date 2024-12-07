package tasks.pfm;

import co.com.bdb.certification.pfm.constants.ConstantsPfm;
import co.com.bdb.certification.pfm.questions.CommonQuestions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static co.com.bdb.certification.pfm.ui.pfm.FinancesDemo.LBL_FINANCES;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class BalanceBillsTask implements Task {
    public static BalanceBillsTask balanceBillsTask() {
        return instrumented(BalanceBillsTask.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
       CommonQuestions.textEquals(LBL_FINANCES, ConstantsPfm.TEXT_FINANCES);
    }
}
