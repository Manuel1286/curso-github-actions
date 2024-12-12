package questions;

import interactions.ShadowRoot;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static ui.dashboard.DashboardFilterPage.HOST_MOVEMENT_DATE;
import static ui.dashboard.DashboardFilterPage.HOST_FILTER_DATE;
import static ui.dashboard.DashboardFilterPage.FILTER_DATE;
import static ui.dashboard.DashboardFilterPage.MOVEMENT_DATE;
import static ui.dashboard.DashboardFilterPage.VALUE_DATE;

public class FilterQuestion implements Question<String> {

    private final String expectedMovement;
    private final String expectedDate;
    private final String expectedValue;

    public FilterQuestion(String expectedMovement, String expectedDate, String expectedValue) {
        this.expectedMovement = expectedMovement;
        this.expectedDate = expectedDate;
        this.expectedValue = expectedValue;
    }

    @Override
    public String answeredBy(Actor actor) {
        String displayedMovement = ShadowRoot.getTextOfElementInsideOneShadowRoot(HOST_FILTER_DATE, FILTER_DATE);
        String displayedDate = ShadowRoot.getTextOfElementInsideOneShadowRoot(HOST_MOVEMENT_DATE, MOVEMENT_DATE);
        String displayedValue = ShadowRoot.getTextOfElementInsideOneShadowRoot(HOST_MOVEMENT_DATE, VALUE_DATE);

        String log = "Valores esperados: movimiento=" + expectedMovement + ", fecha=" + expectedDate +
                ", valor=" + expectedValue + "\n";
        log += "Valores mostrados: movimiento=" + displayedMovement +
                ", fecha=" + displayedDate + ", valor=" + displayedValue;

        return log;
    }

    public static FilterQuestion matches(String movement, String date, String value) {
        return new FilterQuestion(movement, date, value);
    }
}