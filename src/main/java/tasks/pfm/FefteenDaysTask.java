package tasks.pfm;


import constants.ConstantsPfm;
import interactions.ShadowRoot;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import questions.CommonQuestions;
import ui.pfm.Calendar;

import static net.serenitybdd.screenplay.Tasks.instrumented;


public class FefteenDaysTask implements Task {
    public static FefteenDaysTask fefteenDaysTask() {
        return instrumented(FefteenDaysTask.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {

        ShadowRoot.clickOnElementInsideThreeShadowRoots(
            Calendar.SD_OPEN_CALENDAR, Calendar.BUTTON_HOST_CALENDAR,
            Calendar.SD_THREE_CALENDAR, Calendar.LIST_FIFTEEN_DAYS_CALENDAR);
        CommonQuestions.compareTextVsText(
            ShadowRoot.getTextOfElementInsideTwoShadowRoot(
                Calendar.SD_OPEN_CALENDAR, Calendar.BUTTON_HOST_CALENDAR, Calendar.LBL_FILTER_CALENDAR),
            ConstantsPfm.TXT_FIFTEEN_DAYS
        );
    }
}
