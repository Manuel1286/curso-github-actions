package stepdefinitions.pfm;

import interactions.ShadowRoot;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import questions.CommonQuestions;

import static constants.ConstantsPfm.TXT_TODAY;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static ui.pfm.Calendar.BUTTON_HOST_CALENDAR;
import static ui.pfm.Calendar.SD_OPEN_CALENDAR;
import static ui.pfm.Calendar.SD_THREE_CALENDAR;
import static ui.pfm.Calendar.LIST_TODAY_CALENDAR;
import static ui.pfm.Calendar.LBL_FILTER_CALENDAR;

public class TodayTask implements Task {
    public static TodayTask todayTask() {
        return instrumented(TodayTask.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        ShadowRoot.clickOnElementInsideThreeShadowRoots(
            SD_OPEN_CALENDAR, BUTTON_HOST_CALENDAR, SD_THREE_CALENDAR, LIST_TODAY_CALENDAR);
        CommonQuestions.compareTextVsText(
            ShadowRoot.getTextOfElementInsideTwoShadowRoot(
                SD_OPEN_CALENDAR, BUTTON_HOST_CALENDAR, LBL_FILTER_CALENDAR), TXT_TODAY
        );
    }
}
