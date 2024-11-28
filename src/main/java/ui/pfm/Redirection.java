package ui.pfm;

import net.serenitybdd.screenplay.targets.Target;

public class Redirection {
    private Redirection() { }

    public static final String SD_PAYMENTS = "body > app-root > ion-app > ion-router-outlet > "
        + "bdb-pfm > ion-content > div > div > div.page-pfm__content__tab.ng-star-inserted > div > "
        + "bdb-summary-credit-card-pfm > ul:nth-child(2) > bdb-ml-multi-action";
    public static final String PAYMENTS = "#card__0";
    public static final String SC_TCC = "body > app-root > ion-app > ion-router-outlet > bdb-payment-detail > "
        + "ion-content > div > div > div > div.payment-detail__body__content-title > bdb-ml-content-title";
    public static final String SC_CT = "body > app-root > ion-app > ion-router-outlet > bdb-pfm > ion-content > div >"
        + " div > div.page-pfm__content__tab.ng-star-inserted > div >"
        + " bdb-summary-credit-card-pfm > ul:nth-child(1) > bdb-ml-multi-action";
    public static final String LBL_CONSUMS_PERIODS = "#card__1 > div > div.box__content > div > div >"
        + " div.box__content__info__title__label";
    public static final String LABEL_OTHER_MOVEMENTS = ".box__content__info__title__label";
    public static final Target PUBLIC_SERVICES = Target.
        the("Boton servicios publicos")
            .locatedBy("#pfm_categorization\\.public\\.service_button\\.register > a");
    public static final Target BTN_REGISTER_NOW = Target.
        the("Boton servicios publicos")
        .locatedBy("#cross_sell_PUBLIC_SERVICES_button");


}
