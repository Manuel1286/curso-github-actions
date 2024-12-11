package tasks.pfm;

import constants.ConstantsPfm;
import interactions.ShadowRoot;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import questions.CommonQuestions;
import ui.pfm.Calendar;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static ui.pfm.Calendar.BUTTON_HOST_CALENDAR;
import static ui.pfm.Calendar.SD_OPEN_CALENDAR;

public class LastWeekTask implements Task {
    public static LastWeekTask lastWeekTask() {
        return instrumented(LastWeekTask.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        ShadowRoot.clickOnElementInsideThreeShadowRoots(
            SD_OPEN_CALENDAR, BUTTON_HOST_CALENDAR, Calendar.SD_THREE_CALENDAR, Calendar.LIST_LAST_WEEK_CALENDAR);
        CommonQuestions.compareTextVsText(
            ShadowRoot.getTextOfElementInsideTwoShadowRoot(
                SD_OPEN_CALENDAR, BUTTON_HOST_CALENDAR, Calendar.LBL_FILTER_CALENDAR), ConstantsPfm.TXT_LAST_WEEK
        );
    }
}
