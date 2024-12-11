package tasks.pfm;


import interactions.ShadowRoot;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import questions.CommonQuestions;
import ui.pfm.Accounts;

import static constants.ConstantsPfm.TXT_TAB_TC;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static ui.pfm.Accounts.LBL_TAB_TC;
import static ui.pfm.Accounts.SD_TAB_ACCOUNTS;
import static ui.pfm.Accounts.BUTTON_SEARCH;

public class AccountsTCTask implements Task {

    public static AccountsTCTask accountsTCTask() {
        return instrumented(AccountsTCTask.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        CommonQuestions.compareTextVsText(
            ShadowRoot.getTextOfElementInsideOneShadowRoot(SD_TAB_ACCOUNTS, LBL_TAB_TC), TXT_TAB_TC
        );
        ShadowRoot.clickOnElementInsideOneShadowRoot(SD_TAB_ACCOUNTS, Accounts.BUTON_TAB_TC);
        actor.attemptsTo(Click.on(BUTTON_SEARCH));

    }
}
