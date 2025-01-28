package tasks.pfm;

import utils.ShadowRoot;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import questions.CommonQuestions;
import ui.pfm.Calendar;

import static constants.ConstantsPfm.TXT_TAB_ACOUNTS;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static ui.pfm.Accounts.LBL_TAB_ACCOUNTS;
import static ui.pfm.Accounts.SD_TAB_ACCOUNTS;


public class CancelCalendarTask implements Task {
    public static CancelCalendarTask cancelCalendarTask() {
        return instrumented(CancelCalendarTask.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        ShadowRoot.clickOnElementInsideTwoShadowRoots(
            Calendar.SD_OPEN_CALENDAR, Calendar.BUTTON_HOST_CALENDAR, Calendar.BUTTON_CANCEL_CALENDAR);
        CommonQuestions.compareTextVsText(
            ShadowRoot.getTextOfElementInsideOneShadowRoot(SD_TAB_ACCOUNTS, LBL_TAB_ACCOUNTS), TXT_TAB_ACOUNTS
        );
    }
}
