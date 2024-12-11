package ui.pfm;

import net.serenitybdd.screenplay.targets.Target;

public class Accounts {
  private Accounts() { }

  public static final String LBL_ALL_ACCOUNTS =
      "#card-list-0 > div.bdb-ml-card-list__main-content > "
          + "div > div > div.bdb-ml-card-list__main-content__header__detail__title";
  public static final String BUTTON_ACCOUNTS = "#card-list-0";
  public static final String SD_TAB_ACCOUNTS =
      "body > app-root > ion-app > ion-router-outlet > "
          + "bdb-app-pfm-selectors > ion-content > div > bdb-ml-secondtabs";
  public static final String LBL_TAB_ACCOUNTS = "#label1";
  public static final String LBL_TAB_TC = "#label2";
  public static final String LBL_TC = "#Todas\\\\ tus\\\\ tarjetas\\\\ de\\\\ crédito";
  public static final String BUTON_TAB_TC = "#pfm_selector_product\\\\.type\\\\.selector_tab__2";
  public static final String LBL_FILTER_ALL_ACCOUNTS = "#Todas\\\\ tus\\\\ cuentas";
  public static final String SD_DROP_DOWN_ALL_ACCOUNTS =
      "body > app-root > ion-app > ion-router-outlet > "
          + "bdb-app-pfm-selectors > ion-content > div > div > div:nth-child(1) >"
          + " div.page-pfm-selectors__content__box-selector__intern-separator > bdb-at-dropdown";
  public static final String BUTTON_DROP_DOWN_ALL_ACCOUNTS = "#bdb-at-dropdown";
  public static final Target BUTTON_SEARCH =
      Target.the("Btn Buscar").locatedBy("#pfm_selector_search_button");
  public static final Target VALUE =
      Target.the("Saldo").locatedBy("#chart-area > svg > g > text:nth-child(6) > tspan");
  public static final String SD_BUTTON_LIST =
      "body > app-root > ion-app > ion-router-outlet >"
          + " bdb-pfm > ion-content > div > div > "
          + "div.page-pfm__content__box-account_and_date_selector.ng-star-inserted > bdb-ml-card-list";
  public static final String CA =
      "#ion-overlay-4 > div.modal-wrapper.ion-overlay-wrapper.sc-ion-modal-md > "
          + "bdb-action-sheet-wc > bdb-ml-bm-action-sheet";
  public static final String BUTTON_CA = "[value='Cuenta de Ahorros No. 0019888833']";
}
