package tasks.pfm;


import constants.ConstantsPfm;
import utils.ShadowRoot;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import questions.CommonQuestions;
import ui.pfm.Accounts;

import static constants.ConstantsPfm.TXT_BALANCE_ALL_ACCOUNTS;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static ui.pfm.Balances.BALANCES_RANGE_DATE;
import static ui.pfm.FinancesDemo.SDR_YOUR_ACCOUNTS;

public class BalancesAccountsTask implements Task {
    public static BalancesAccountsTask balancesAccountsTask() {
        return instrumented(BalancesAccountsTask.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        CommonQuestions.textEquals(BALANCES_RANGE_DATE, TXT_BALANCE_ALL_ACCOUNTS);
        ShadowRoot.clickOnElementInsideOneShadowRoot(SDR_YOUR_ACCOUNTS, Accounts.BUTTON_ACCOUNTS);
        CommonQuestions.compareTextVsText(
            ShadowRoot.getTextOfElementInsideOneShadowRoot(Accounts.SD_DROP_DOWN_ALL_ACCOUNTS,
                Accounts.LBL_FILTER_ALL_ACCOUNTS), ConstantsPfm.TXT_ALL_ACOUNTS
        );

    }
}
