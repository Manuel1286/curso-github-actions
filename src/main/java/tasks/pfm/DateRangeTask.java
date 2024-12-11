package tasks.pfm;


import interactions.ShadowRoot;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import ui.pfm.Calendar;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DateRangeTask implements Task {
    public static DateRangeTask dateRangeTask() {
        return instrumented(DateRangeTask.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        ShadowRoot.clickAndScrollOnElementInsideTwoShadowRoots(
            Calendar.SD_OPEN_CALENDAR, Calendar.BUTTON_HOST_CALENDAR, Calendar.ONE_NOV_DATE_CALENDAR);
        ShadowRoot.clickAndScrollOnElementInsideTwoShadowRoots(
            Calendar.SD_OPEN_CALENDAR, Calendar.BUTTON_HOST_CALENDAR, Calendar.TEN_NOV_DATE_CALENDAR);

    }
}
