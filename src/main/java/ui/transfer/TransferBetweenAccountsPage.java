package ui.transfer;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TransferBetweenAccountsPage {
  private TransferBetweenAccountsPage() { }

  public static final Target OPT_BETWEEN_ACCOUNTS_ACCORDION =
      Target.the("Selecciona opción Entre cuentas").locatedBy("#bdb-grid-item-0");
  public static final Target TRANSFER_TITTLE =
      Target.the("¿Cuánto quieres transferir? ")
          .located(
              By.cssSelector(
                  ".transfers-accounts__form__transfer-value .transfers-accounts__form__transfer-value__label"));
  public static final Target TXT_TRANSFER_VALUE =
      Target.the("Ingresa valor a transferir")
          .locatedBy("#transfers-accounts__form-transfer-value");
  public static final Target BTN_TRANSFER =
      Target.the("Selecciona botón realizar transferencia").locatedBy("#transfer_accounts_btn");
  public static final Target LBL_PRODUCT_NAME_ADVANCE =
      Target.the("Label avances")
          .located(By.cssSelector(".transfers-accounts__account-info__name"));
  public static final Target LBL_PRODUCT_NUMBER_ADVANCE =
      Target.the("Label número producto avances")
          .located(By.cssSelector(".transfers-accounts__account-info-secondary__value"));
  public static final String HOST_ADVANCE_TC = "#account_advance_cc__";
  public static final String CHILD_OPT_PRODUCTS = "#card-list-0 > div";
  public static final String HOST_ACCOUNT = "#account__";
  public static final Target TITTLE_ACCOUNTS_OWN =
      Target.the("Titulo Selecciona una cuenta propia para transferir")
          .located(By.cssSelector("#subtitle_accounts_to_transfer"));
  public static final Target BTN_MODAL_TRANSFER =
      Target.the("Botón Modal Trx Duplicada")
          .locatedBy("#bdb-confirmation-ok-DUPLICATE_TRANSFER_ERROR");
  public static final Target BTN_CERRAR =
      Target.the("Selecciona cerrar modal").locatedBy("#alert_warning_btn");
  public static final String ITEM_LIST_PRODUCT =
      "#card-list-0 > div > div.bdb-ml-card-list__main-content__header > div > div.bdb-ml-card-list__main-content__header__detail__title";
  public static final Target TXT_REFERENCE_FIELD =
      Target.the("Input para ingresar información en el campo referencia")
          .locatedBy("#transfer-account__form__reference-account-reference");
  public static final String INPUT_REFERENCE_FIELD = "//*[@id='tranfers_detail.reference_input']";
  public static final Target TXT_NOTE_FIELD =
      Target.the("Input para ingresar información en el campo nota")
          .locatedBy("#transfer-account__form__account-notes-input");
  public static final String INPUT_NOTE_FIELD = "//*[@id='tranfers_detail.note_input']";
  public static final Target OPT_ADVANCE_CREDITCARD_ACCORDION =
      Target.the("Opción avance Tarjeta Crédito").locatedBy("#bdb-grid-item-2");
  public static final Target LST_TRANSFER_PRODUCT =
      Target.the("Lista de productos disponibles para transferencias")
          .located(
              By.cssSelector(".transfers-accounts-list__registered-accounts bdb-item-account"));
  public static final Target LBL_TRANSFER_REGISTERED =
      Target.the("Label de cuentas inscritas").locatedBy("#subtitle_accounts_registered");
  public static final Target LBL_TRANSACTION_COST =
      Target.the("Label que contiene el costo de la transacción")
          .locatedBy("#transfers-accounts-cost");
  public static final Target LBL_TITLE_ADVANCE_CROSS =
      Target.the("Label del titulo al ingresar a venta cruzada de tarjeta de crédito")
          .locatedBy("#accordion_item_2_header");
  public static final Target TXT_TWO_ADVANCE_CROSS =
      Target.the("Texto inferior venta cruzada de tarjeta de crédito")
          .locatedBy("#cross_sell_CREDIT_CARD2_title");
  public static final Target BTN_ADVANCE_CROSS =
      Target.the("Botón venta cruzada de tarjeta de crédito")
          .locatedBy("#cross_sell_CREDIT_CARD2_button");
  public static final Target LST_ACCOUNT_PRODUCTS =
      Target.the("Lista de cuentas inscritas")
          .located(By.cssSelector("div.bdb-item-account__account-info__bank .ng-star-inserted"));
  public static final Target LST_CREDITCARD_PRODUCTS =
      Target.the("Lista de tarjetas de crédito inscritas")
          .located(By.xpath("//div[@class='bdb-item-payment__values__number ng-star-inserted']"));
  public static final Target LBL_BANK_NAME_TRANSFERS =
      Target.the("Label transferencias")
          .located(By.cssSelector("div.transfers-accounts__account-info__bank"));
  public static final Target LST_PUBLICSERVICES_PRODUCTS =
      Target.the("Lista de servicios públicos inscritos")
          .located(By.xpath("//div[@class='bdb-item-payment__values__number ng-star-inserted']"));
  public static final Target LBL_BANK_NAME_CARDS =
      Target.the("Label tarjetas")
          .located(By.xpath("//div[@class='payment-detail__payment-header__product']"));
  public static final Target LBL_BANK_NAME_SP =
      Target.the("Label servicios públicos")
          .located(By.xpath("//div[@class='payment-detail__payment-header__product']"));
  public static final Target LBL_BANK_CREDIT_NAME =
      Target.the("Label crédito").located(By.cssSelector("#payment_detail_bank_name2"));
  public static final String LST_ACCOUNT_REGISTER_HOTS =
      "body > app-root > ion-app > ion-router-outlet > bdb-transfers-list > ion-content > div > div > div > bdb-transfers-accounts-list > div.transfers-accounts-list > div > div.ng-star-inserted > bdb-ml-card-list";
  public static final String LST_ACCOUNT_REGISTER_CHILD =
      ".bdb-ml-card-list__main-content__header__detail__title";
  public static final String LST_NAME_BANK_CHILD =
      ".bdb-ml-card-list__main-content__header__detail__description";
}
