package tasks.pfm;

import utils.ShadowRoot;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import questions.CommonQuestions;

import static constants.ConstantsPfm.TXT_CALENDAR;
import static constants.ConstantsPfm.TXT_FIFTEEN_DAYS;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static ui.pfm.Calendar.SD_OPEN_CALENDAR;
import static ui.pfm.Calendar.BUTTON_OPEN_CALENDAR;
import static ui.pfm.Calendar.BUTTON_HOST_CALENDAR;
import static ui.pfm.Calendar.LBL_DATES;
import static ui.pfm.Calendar.SD_THREE_CALENDAR;
import static ui.pfm.Calendar.LIST_FIFTEEN_DAYS_CALENDAR;
import static ui.pfm.Calendar.BUTTON_FILTER_CALENDAR;

public class OptionFilterCalendarTask implements Task {
    public static OptionFilterCalendarTask optionFilterCalendarTask() {
        return instrumented(OptionFilterCalendarTask.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        ShadowRoot.clickOnElementInsideOneShadowRoot(SD_OPEN_CALENDAR, BUTTON_OPEN_CALENDAR);
        CommonQuestions.compareTextVsText(
                ShadowRoot.getTextOfElementInsideTwoShadowRoot(
                        SD_OPEN_CALENDAR, BUTTON_HOST_CALENDAR, LBL_DATES), TXT_CALENDAR
        );
        ShadowRoot.clickOnElementInsideTwoShadowRoots(SD_OPEN_CALENDAR, BUTTON_HOST_CALENDAR, BUTTON_FILTER_CALENDAR);
        try {
            Thread.sleep(3000);
            CommonQuestions.compareTextVsText(
                    ShadowRoot.getTextOnElementInsideThreeShadowRoots(
                            SD_OPEN_CALENDAR, BUTTON_HOST_CALENDAR,
                            SD_THREE_CALENDAR, LIST_FIFTEEN_DAYS_CALENDAR), TXT_FIFTEEN_DAYS
            );
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

    }
}
