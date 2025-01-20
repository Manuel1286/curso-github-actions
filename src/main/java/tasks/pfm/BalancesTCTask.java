package tasks.pfm;


import constants.ConstantsPfm;
import utils.ShadowRoot;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import questions.CommonQuestions;
import ui.pfm.Accounts;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static ui.pfm.Balances.BALANCES_ALL_TC;
import static ui.pfm.Balances.BALANCES_RANGE_DATE;
import static ui.pfm.FinancesDemo.SDR_YOUR_ACCOUNTS;

public class BalancesTCTask implements Task {
    public static BalancesTCTask balancesTCTask() {
        return instrumented(BalancesTCTask.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        CommonQuestions.textEquals(BALANCES_RANGE_DATE, ConstantsPfm.TXT_BALANCE_ALL_TC);
        ShadowRoot.clickOnElementInsideOneShadowRoot(SDR_YOUR_ACCOUNTS, Accounts.BUTTON_ACCOUNTS);
        CommonQuestions.compareTextVsText(
            ShadowRoot.getTextOfElementInsideOneShadowRoot(Accounts.SD_DROP_DOWN_ALL_ACCOUNTS, Accounts.LBL_TC),
            ConstantsPfm.TXT_FILTER_TC
        );

    }
}
