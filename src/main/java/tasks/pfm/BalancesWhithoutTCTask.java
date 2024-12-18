package tasks.pfm;

import utils.ShadowRoot;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import questions.CommonQuestions;
import ui.pfm.Accounts;

import static constants.ConstantsPfm.TXT_TC;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class BalancesWhithoutTCTask implements Task {
    public static BalancesWhithoutTCTask balancesWhithoutTCTask() {
        return instrumented(BalancesWhithoutTCTask.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        CommonQuestions.compareTextVsText(
            ShadowRoot.getTextOfElementInsideOneShadowRoot(Accounts.SD_BUTTON_LIST, Accounts.LBL_ALL_ACCOUNTS), TXT_TC
        );
    }
}
