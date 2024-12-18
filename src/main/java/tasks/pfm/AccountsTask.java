package tasks.pfm;

import utils.ShadowRoot;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import questions.CommonQuestions;
import ui.pfm.Accounts;


import static constants.ConstantsPfm.TXT_ALL_ACOUNTS;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static ui.pfm.Accounts.LBL_ALL_ACCOUNTS;
import static ui.pfm.FinancesDemo.SDR_YOUR_ACCOUNTS;

public class AccountsTask implements Task {
    public static  AccountsTask accountsTask() {
        return instrumented(AccountsTask.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        CommonQuestions.compareTextVsText(
            ShadowRoot.getTextOfElementInsideOneShadowRoot(SDR_YOUR_ACCOUNTS, LBL_ALL_ACCOUNTS), TXT_ALL_ACOUNTS
        );
        ShadowRoot.clickOnElementInsideOneShadowRoot(SDR_YOUR_ACCOUNTS, Accounts.BUTTON_ACCOUNTS);









    }
}
