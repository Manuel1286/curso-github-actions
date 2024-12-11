package tasks.pfm;


import interactions.ShadowRoot;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import questions.CommonQuestions;
import ui.pfm.Calendar;


import static constants.ConstantsPfm.TXT_CALENDAR;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static ui.pfm.Calendar.LBL_DATES;

public class CalendarTask implements Task {
    public static CalendarTask calendarTask() {
        return instrumented(CalendarTask.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        ShadowRoot.clickOnElementInsideOneShadowRoot(Calendar.SD_OPEN_CALENDAR, Calendar.BUTTON_OPEN_CALENDAR);
        CommonQuestions.compareTextVsText(
            ShadowRoot.getTextOfElementInsideTwoShadowRoot(
                Calendar.SD_OPEN_CALENDAR, Calendar.BUTTON_HOST_CALENDAR, LBL_DATES), TXT_CALENDAR
        );
    }
}
