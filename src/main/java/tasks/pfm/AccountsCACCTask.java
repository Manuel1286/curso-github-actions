package tasks.pfm;


import utils.ShadowRoot;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import questions.CommonQuestions;


import static constants.ConstantsPfm.TXT_ALL_ACOUNTS;
import static constants.ConstantsPfm.TXT_TAB_ACOUNTS;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static ui.pfm.Accounts.LBL_TAB_ACCOUNTS;
import static ui.pfm.Accounts.SD_TAB_ACCOUNTS;
import static ui.pfm.Accounts.SD_DROP_DOWN_ALL_ACCOUNTS;
import static ui.pfm.Accounts.BUTTON_SEARCH;
import static ui.pfm.Accounts.BUTTON_DROP_DOWN_ALL_ACCOUNTS;

public class AccountsCACCTask implements Task {
    public static AccountsCACCTask accountsCACCTask() {
        return instrumented(AccountsCACCTask.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        CommonQuestions.compareTextVsText(
            ShadowRoot.getTextOfElementInsideOneShadowRoot(SD_TAB_ACCOUNTS, LBL_TAB_ACCOUNTS), TXT_TAB_ACOUNTS
        );
        CommonQuestions.compareTextVsText(
            ShadowRoot.getTextOfElementInsideOneShadowRoot(
                SD_DROP_DOWN_ALL_ACCOUNTS, BUTTON_DROP_DOWN_ALL_ACCOUNTS), TXT_ALL_ACOUNTS
        );
        actor.attemptsTo(Click.on(BUTTON_SEARCH));
    }
}
