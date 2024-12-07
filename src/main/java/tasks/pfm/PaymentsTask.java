package tasks.pfm;


import interactions.ShadowRoot;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import questions.CommonQuestions;

import static constants.ConstantsPfm.TXT_CONSUMS_PERIOD;
import static constants.ConstantsPfm.TXT_TOTAL_LIMIT;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static ui.pfm.Redirection.*;

public class PaymentsTask implements Task {
    public static PaymentsTask paymentsTask() {
        return instrumented(PaymentsTask.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        CommonQuestions.compareTextVsText(ShadowRoot.getTextOfElementInsideOneShadowRoot(
            SC_CT, LABEL_OTHER_MOVEMENTS), TXT_TOTAL_LIMIT);
        CommonQuestions.compareTextVsText(ShadowRoot.getTextOfElementInsideOneShadowRoot(
            SC_CT, LBL_CONSUMS_PERIODS), TXT_CONSUMS_PERIOD);
    }
}
