package ui.dashboard;

import net.serenitybdd.screenplay.targets.Target;

public class DashboardFilterPage {
    private DashboardFilterPage() {
    }

    public static final Target SAVINGS_ACCOUNT = Target.the("cuenta de ahorros").locatedBy("//*[contains(text(), 'No. 000440685')]");
    public static final Target SEE_ALL = Target.the("cuenta de ahorros-ver todos").locatedBy("//*[@id=\"product-detail_btn-last-movements_button\"]/label");
    public static final Target CREDIT_CARD = Target.the("tarjeta de credito").locatedBy("//*[contains(text(), 'No. · · · · 5440')]");
    public static final Target MOVEMENTS = Target.the("movimientos TC").locatedBy("//*[@id=\"Movimientos\"]/div/div[1]");
    public static final Target FILTER_WORD = Target.the("Filtro por palabra").locatedBy("//*[@id=\"page-movements_search-word-btn_button\"]");
    public static final Target FILTER_DATE_MOVEMENTS = Target.the("Filtro por Fecha").locatedBy("#page-movements_search-date-btn_button");
    public static final Target FILTER_AMOUNT = Target.the("Filtro por monto").locatedBy("#page-movements_search-ammount-btn_button");
    public static final Target MINIMUM_RANGE = Target.the("Input filtro por monto minimo").locatedBy("#range_amount_min");
    public static final Target MAXIMUM_RANGE = Target.the("Input filtro por monto maximo").locatedBy("#range_amount_max");
    public static final Target BUTTON_SEARCH = Target.the("Botón buscar filtro").locatedBy("#page-movements_search-word_button");
    public static final Target BUTTON_SEARCH_AMOUNT = Target.the("Botón buscar monto").locatedBy("#range_amount_btn");
    public static final String WORD = "#bdb-at-input";
    public static final String HOST_WORD = "#page-movements_search-word_input";
    public static final String HOST_MOVEMENT_DATE = "#dash_movements_item\\.list";
    public static final String MOVEMENT_DATE = "#product-detail_movements_item_1_card > div > div.box__content.box__content--line > div > div > div.box__content__info__title__slot > div:nth-child(1)";
    public static final String HOST_FILTER_DATE = "body > app-root > ion-app > ion-router-outlet > bdb-movements > ion-content > div > div > div > div:nth-child(3) > div.page-movements__content__page__header__body__bdb-at-interactive-tag";
    public static final String FILTER_DATE = "#bdb-at-interactive-tag > span > div > label.bdb-at-tag__label";
    public static final String VALUE_DATE = "#product-detail_movements_item_1_card > div > div.box__content.box__content--line > div > div > div.box__content__info__title__slot > div:nth-child(2) > div:nth-child(1)";
    public static final String HOST_FILTER_MOVEMENTS = "[idel='page-movements_search-date_input']";
    public static final String FILTER_DESDE_SR = ".bdb-ml-date-picker-container__date__input']";
    public static final String FILTER_CALENDAR_DATE = "#bdb-ml-date-picker > bdb-ml-calendar";
    public static final String NOVEMBER_ONE_2024 = "#day-1-11-2024";
    public static final String NOVEMBER_TWENTY_2024 = "#day-20-11-2024";
}
