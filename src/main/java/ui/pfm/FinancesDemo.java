package ui.pfm;

import net.serenitybdd.screenplay.targets.Target;

public class FinancesDemo {
  private FinancesDemo() {}

  public static final Target BUTTON_FINANCES =
      Target.the("Btn Finanzas").locatedBy("#dash_pfm_button");
  public static final Target LBL_FINANCES =
      Target.the("LBL Finanzas")
          .locatedBy(
              "/html/body/app-root/ion-app/ion-router-outlet/bdb-pfm/ion-content/div/bdb-header/header/div[1]/div");
  public static final String SDR_YOUR_ACCOUNTS =
      "body > app-root > ion-app > ion-router-outlet > bdb-pfm > ion-content > "
          + "div > div > div.page-pfm__content__box-account_and_date_selector.ng-star-inserted > "
          + "bdb-ml-card-list";

  public static final String ALL_YOUR_ACCOUNTS =
      "#card-list-0 > div.bdb-ml-card-list__main-content > "
          + "div > div > div.bdb-ml-card-list__main-content__header__detail__title";
  public static final Target BUTTON_FACT =
      Target.the("Btn Hecho").locatedBy("#coach-mark-action-btn");
  public static final Target BUTTON_CONTINUE_FINANCE =
      Target.the("Btn continuar mensaje Bienvenida").locatedBy("#pfm-terms-and-conditions-button");
  public static final Target TXT_WELCOME_FINANCE =
      Target.the("LBL ingresar primera vez finanzas ")
          .locatedBy("//*[@id='pfm-terms-and-conditions']/div/div[3]/div");
  public static final Target TXT_QUERY_OPTIONS =
      Target.the("LBL opciones de consulta")
          .locatedBy(".bdb-coach-mark-pfm-menu-p1__content__box__body__description");
  public static final Target BUTTON_NEXT =
      Target.the("Btn siguiente en opciones de consulta").locatedBy("#coach-mark-next-btn");
  public static final Target BUTTON_BACK =
      Target.the("Btn atras en opcion macro categorías").locatedBy("#coach-mark-back-btn");
  public static final Target TEXT_DEMO_BILLS =
      Target.the("Lbl macro categorias")
          .locatedBy(".bdb-coach-mark-pfm-menu-p2__content__box__body__description");
  public static final String SDR_DEMO_CATEGORIES =
      "body > app-root > bdb-coach-mark > div > "
          + "bdb-coach-mark-pfm-menu-p2 > div > div > "
          + "div.bdb-coach-mark-pfm-menu-p2__content__chip-selector > bdb-ml-chip-selector";
  public static final String BUTTON_DEMO_BILLS = "#pfm_tabs_coach_mark_chip_selector__0";
  public static final String BUTTON_DEMO_INCOME = "#pfm_tabs_coach_mark_chip_selector__1";
  public static final String BUTTON_DEMO_SAVING_INVESTMENT =
      "#pfm_tabs_coach_mark_chip_selector__2";
  public static final String BUTTON_DEMO_CREDIT_DEBTS = "#pfm_tabs_coach_mark_chip_selector__3 ";
  public static final Target BUTTON_DEMO_CLOSE =
      Target.the("Btn cerrar Demo").locatedBy("#coach_mark\\.btn\\.close_button");
}
