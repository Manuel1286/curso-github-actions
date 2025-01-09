package ui.transfer;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TransferTrustPage {
  private TransferTrustPage() { }

  public static final String TITLE_PRODUCT_DETAIL_HOST_TRUST =
      "div.transfer-trust-detail1 > bdb-ml-bm-content-title";
  public static final String TITLE_PRODUCT_DETAIL_ELEMENT_TRUST = "#content > label";
  public static final String TXT_PRODUCT_DETAIL_ELEMENT_TRUST =
      "#content > div.bdb-ml-bm-content-title__content__letter > label";
  public static final Target LBL_HEADER_DETAIL_TRUSTS =
      Target.the("Label transferencias en fiducias")
          .located(By.cssSelector("bdb-transfer-fiduciary-trust .bdb-header .bdb-header__title"));
  public static final Target LBL_PRODUCT_NAME_TRUSTS =
      Target.the("Label nombre producto fiducias")
          .located(By.cssSelector(".transfer-trust-detail__account-info__name"));
  public static final Target LBL_PRODUCT_NUMBER_TRUSTS =
      Target.the("Label número producto fiducias")
          .located(By.cssSelector(".transfer-trust-detail__account-info-secondary__value"));
  public static final Target TRUSTS_ACCORDION =
      Target.the("Selecciona opción Fiducias").locatedBy("#bdb-grid-item-4");
  public static final Target TRUST_ONE =
      Target.the("Selecciona primer Encargo Fiduciario").locatedBy("#fiduciary_trust_0_");
  public static final String LIST_TRUSTS = "#fiduciary_trust__";
  public static final String BOX_TRUSTS = ".bdb-ml-card-list.bdb-ml-card-list--no-hover";
  public static final String TXT_VALUE_TRUSTS =
      ".bdb-ml-card-list__main-content__footer__detail__content__line__amount";
  public static final Target INVESTMENT_BUTTON =
      Target.the("Selecciona botón Inversion").locatedBy("#transfer_trust_invest");
  public static final Target DIVESTMENT_BUTTON =
      Target.the("Selecciona botón Desinversión").locatedBy("#transfer_trust_withdraw");
  public static final Target TRUSTS_VALUE =
      Target.the("Ingresa valor de transacción para la fiducia")
          .locatedBy("#transfer-trust-detail-amount");
  public static final Target TRUSTS_EMAIL =
      Target.the("Campo de correo para recibir notificación de la transacción")
          .locatedBy("#email_transfer_trust_0");
  public static final Target TRUSTS_BUTTON =
      Target.the("Selecciona botón realizar transacción de Fiducia")
          .locatedBy("#transfer_trust_detail_btn");
}
