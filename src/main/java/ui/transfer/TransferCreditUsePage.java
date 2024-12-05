package ui.transfer;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TransferCreditUsePage {
  private TransferCreditUsePage() { }

  public static final String TITLE_PRODUCT_DETAIL_HOST_TRANSFER =
      "body > app-root > ion-app > ion-router-outlet > bdb-transfers-detail > ion-content > div > div.transfers-accounts > div > bdb-ml-bm-content-title";
  public static final String TITLE_PRODUCT_DETAIL_ELEMENT_TRANSFER = "#content > label";
  public static final String TXT_PRODUCT_DETAIL_ELEMENT_TRANSFER =
      "#content > div.bdb-ml-bm-content-title__content__letter > label";
  public static final Target LBL_HEADER_DETAIL =
      Target.the("Label header en detalle de transferencias")
          .locatedBy("bdb-transfers-detail .bdb-header .bdb-header__title");
  public static final Target LBL_HEADER_PRODUCT_NAME_DETAIL =
      Target.the("Label del nombre del producto en detalle de transferencias")
          .located(By.cssSelector(".transfers-accounts__account-info__name"));
  public static final Target LBL_HEADER_PRODUCT_NUMBER_DETAIL =
      Target.the("Label del número producto en detalle de transferencias")
          .located(
              By.cssSelector(
                  "bdb-transfers-detail .transfers-accounts__account-info-secondary__value"));
  public static final Target CREDIT_USE_ACCORDION =
      Target.the("Selecciona Uso cupo de crédito").locatedBy("#bdb-grid-item-3");
  public static final Target CREDIT_USE_VALUE =
      Target.the("Ingreso del valor de uso de cupo de crédito")
          .locatedBy("#transfers-accounts__form-transfer-value");
  public static final Target CREDIT_USE_BUTTON =
      Target.the("Botón para realizar transacción de uso de crédito")
          .locatedBy("#transfer_accounts_btn");
  public static final Target LBL_CREDIT =
      Target.the("Label del nombre del producto")
          .locatedBy(".transfers-accounts__account-info__name");
  public static final Target LST_CREDIT_PRODUCT =
      Target.the("Listado de créditos disponibles para uso de cupo")
          .located(
              By.cssSelector(
                  ".revolving-credit-list__credit__item")); // revolving-credit-list__credit
  // bdb-item-account
}
