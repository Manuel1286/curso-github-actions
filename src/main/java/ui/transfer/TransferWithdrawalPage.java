package ui.transfer;

import net.serenitybdd.screenplay.targets.Target;

public class TransferWithdrawalPage {
    private TransferWithdrawalPage(){}

    public static final Target OPT_WITHDRAWAL_ACCORDION = Target.the("Opción seleccionar Retiros sin tarjeta").locatedBy("#bdb-grid-item-1");
    public static final String OPT_WITHDRAWAL_ATM_HOST = "#withdrawal-form > div.withdrawal-without-container__selector.ng-star-inserted > div:nth-child(2) > bdb-ml-active-selector";
    public static final String OPT_WITHDRAWAL_ATM_CHILD = ".bdb-ml-active-selector";
    public static final String OPT_WITHDRAWAL_CORRESPONDENT_HOST = "#withdrawal-form > div.withdrawal-without-container__selector.ng-star-inserted > div:nth-child(3) > bdb-ml-active-selector";
    public static final String OPT_WITHDRAWAL_CORRESPONDENT_CHILD = ".bdb-ml-active-selector";
    public static final String BTN_VALUE_OPTION_TWO_HOST = "#withdrawal-form > div.withdrawal-without-card__content > div.withdrawal-without-container__values > div:nth-child(2) > bdb-ml-active-selector";
    public static final String BTN_VALUE_OPTION_TWO = "#btn_box_withdrawal_1";
    public static final Target TXT_WITHDRAWAL_VALUE = Target.the("Caja para ingresar el valor del retiro").locatedBy("#withdrawal_without_card_amount_input");
    public static final Target BTN_CONFIRM_WITHDRAWAL = Target.the("Botón confirmar retiro").locatedBy("#withdrawal_without_card_continue_button");
    public static final String BTN_REQUEST_CODE_HOST = "body > app-root > ion-app > ion-router-outlet > bdb-transaction-confirmation > ion-content > div > div.bdb-trx-confirmation > bdb-ml-confirmation";
    public static final String BTN_REQUEST_CODE_CHILD = "#withdrawal_send\\\\.confirmation_button";
}
