package tasks.dashboard;

import interactions.Charge;
import utils.ShadowRoot;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;


import static constants.ConstantsForgetPasword.CREDIT_CARD;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static ui.dashboard.DashboardFilterPage.SAVINGS_ACCOUNT;
import static ui.dashboard.DashboardFilterPage.MOVEMENTS;
import static ui.dashboard.DashboardFilterPage.SEE_ALL;
import static ui.dashboard.DashboardFilterPage.FILTER_WORD;
import static ui.dashboard.DashboardFilterPage.HOST_WORD;
import static ui.dashboard.DashboardFilterPage.WORD;
import static ui.dashboard.DashboardFilterPage.BUTTON_SEARCH;
import static ui.dashboard.DashboardFilterPage.FILTER_AMOUNT;
import static ui.dashboard.DashboardFilterPage.MINIMUM_RANGE;
import static ui.dashboard.DashboardFilterPage.MAXIMUM_RANGE;
import static ui.dashboard.DashboardFilterPage.BUTTON_SEARCH_AMOUNT;



@AllArgsConstructor
public class FilterMovementBy implements Task {

    private final String product;
    private final String filter;

    @Override
    public <T extends Actor> void performAs(T actor) {
        switch (product.toLowerCase()) {
            case "cuenta de ahorros":
                actor.attemptsTo(
                    Click.on(SAVINGS_ACCOUNT),
                    Charge.icon(),
                    Click.on(SEE_ALL)
                );
                break;
            case "tarjeta de credito":
                actor.attemptsTo(
                    Click.on(CREDIT_CARD),
                    Click.on(MOVEMENTS)
                );
                break;
            default:
                throw new IllegalArgumentException("Producto no soportado: " + product);
        }
        applyFilterBasedOnType(actor);
    }

    private <T extends Actor> void applyFilterBasedOnType(T actor) {
        switch (filter.toLowerCase()) {
            case "palabra":
                actor.attemptsTo(
                    WaitUntil.the(FILTER_WORD, isVisible()).forNoMoreThan(10).seconds(),
                    Click.on(FILTER_WORD)
                );
                ShadowRoot.sendKeysToElementInsideOneShadowRoot(HOST_WORD, WORD, "Intereses");
                actor.attemptsTo(
                    Click.on(BUTTON_SEARCH)
                );
                break;
            case "monto":
                actor.attemptsTo(
                    Click.on(FILTER_AMOUNT),
                    Click.on(MINIMUM_RANGE).then(Enter.theValue("10000").into(MINIMUM_RANGE)),
                    Click.on(MAXIMUM_RANGE).then(Enter.theValue("20000").into(MAXIMUM_RANGE)),
                        Click.on(BUTTON_SEARCH_AMOUNT)
                );
                break;
            default:
                throw new IllegalArgumentException("Tipo de filtro no soportado: " + filter);
        }
    }


    public static FilterMovementBy withData(String product, String filter) {
        return instrumented(FilterMovementBy.class, product, filter);
    }
}

