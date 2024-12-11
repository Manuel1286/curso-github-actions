package tasks.pfm;

import interactions.ShadowRoot;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import questions.CommonQuestions;

import static constants.ConstantsPfm.TXT_LAST_MONTH;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static ui.pfm.Calendar.BUTTON_HOST_CALENDAR;
import static ui.pfm.Calendar.SD_OPEN_CALENDAR;
import static ui.pfm.Calendar.SD_THREE_CALENDAR;
import static ui.pfm.Calendar.LIST_LAST_MONTH_CALENDAR;
import static ui.pfm.Calendar.LBL_FILTER_CALENDAR;

public class LastMonthTask implements Task {
    public static LastMonthTask lastMonthTask() {
        return instrumented(LastMonthTask.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        ShadowRoot.clickOnElementInsideThreeShadowRoots(
            SD_OPEN_CALENDAR, BUTTON_HOST_CALENDAR, SD_THREE_CALENDAR, LIST_LAST_MONTH_CALENDAR);
        CommonQuestions.compareTextVsText(
            ShadowRoot.getTextOfElementInsideTwoShadowRoot(
                SD_OPEN_CALENDAR, BUTTON_HOST_CALENDAR, LBL_FILTER_CALENDAR), TXT_LAST_MONTH
        );

    }
}
