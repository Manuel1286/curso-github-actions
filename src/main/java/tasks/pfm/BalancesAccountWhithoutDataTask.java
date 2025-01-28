package tasks.pfm;

import utils.ShadowRoot;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import questions.CommonQuestions;

import static constants.ConstantsPfm.TXT_VALUE;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static tasks.pfm.CalendarTask.calendarTask;
import static ui.pfm.Accounts.BUTTON_ACCOUNTS;
import static ui.pfm.Accounts.BUTTON_SEARCH;
import static ui.pfm.Accounts.VALUE;

import static ui.pfm.Calendar.BTN_APPLY;
import static ui.pfm.Calendar.BUTTON_HOST_CALENDAR;
import static ui.pfm.Calendar.ONE_JANUARY_DATE_CALENDAR;
import static ui.pfm.Calendar.SD_OPEN_CALENDAR;
import static ui.pfm.Calendar.TWO_JANUARY_DATE_CALENDAR;
import static ui.pfm.FinancesDemo.SDR_YOUR_ACCOUNTS;

public class BalancesAccountWhithoutDataTask implements Task {

    public static BalancesAccountWhithoutDataTask balancesAccountWhithoutDataTask() {
        return instrumented(BalancesAccountWhithoutDataTask.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        ShadowRoot.clickOnElementInsideOneShadowRoot(SDR_YOUR_ACCOUNTS, BUTTON_ACCOUNTS);
        OnStage.withCurrentActor(calendarTask());
        selectDateRange();
        OnStage.withCurrentActor(Click.on(BUTTON_SEARCH));
        CommonQuestions.textEquals(VALUE, TXT_VALUE);
    }

    private void selectDateRange() {
        ShadowRoot.clickAndScrollOnElementInsideTwoShadowRoots(
                SD_OPEN_CALENDAR, BUTTON_HOST_CALENDAR, ONE_JANUARY_DATE_CALENDAR);
        ShadowRoot.clickAndScrollOnElementInsideTwoShadowRoots(
                SD_OPEN_CALENDAR, BUTTON_HOST_CALENDAR, TWO_JANUARY_DATE_CALENDAR);
        ShadowRoot.clickOnElementInsideTwoShadowRoots(
                SD_OPEN_CALENDAR, BUTTON_HOST_CALENDAR, BTN_APPLY);
    }
}
