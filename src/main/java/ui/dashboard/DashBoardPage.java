package ui.dashboard;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DashBoardPage {

  private DashBoardPage() { }

  public static final Target DOCUMENTS_OPTION =
      Target.the("módulo de documentos").locatedBy("#dash-documents-button");
  public static final Target PAYMENTS_OPTION =
      Target.the("módulo pagar").locatedBy("#dash-payments-button");
  public static final Target TRANSFERS_OPTION =
      Target.the("módulo Transferencias").locatedBy("#dash-transfers-button");
  public static final Target MORE_OPTION =
      Target.the("Perfil y configuración").locatedBy("#dash-menu-button");
  public static final Target QR_OPTION = Target.the("botón QR").locatedBy("#dash-qr-button");
  public static final Target BTN_PFM =
      Target.the("botón PFM").located(By.cssSelector(".bdb-header-dashboard__nav__pfm"));
  public static final Target FAILURE_WINDOW_FOR_DATA_SAVING =
      Target.the("ventana de error cuando no se cargan cuentas de ahorros")
          .located(By.cssSelector("ion-modal #alert_warning #alert_warning_title"));
  public static final Target TOAST_MESSAGE_SAVING_ACCOUNT =
      Target.the("mensaje toast cuando no carga data de cuenta de ahorros")
          .located(
              By.cssSelector(
                  ".bdb-toast.bdb-toast--warning.fadeIn .bdb-toast__content .bdb-toast__content__title"));
  public static final Target NEW_PRODUCT_ADD =
      Target.the("Adquiere un nuevo producto")
          .located(By.cssSelector("bdb-ml-button-add[urlimage='/assets/imgs/add-product.jpg']"));
  public static final Target OPT_PRODUCT_CAMPAIGN =
      Target.the("Productos y campañas")
          .located(By.cssSelector("[idel='bdb-at-accordion-item-campaign']"));
  public static final Target PRODUCT_CARD_LIST =
      Target.the("Listado de cards productos")
          .located(
              By.cssSelector(
                  "div.content .page-dashboard__content .bdb-product-info-card__info__name"));
  public static final Target PRODUCT_CARD_OPTIONS =
      Target.the("Opción cards").located(By.cssSelector(".product__container__title"));

  public static final Target PRODUCT_CARD_OPTIONS1 =
      Target.the("Card1").located(By.cssSelector(".bdb-promotion__content__title"));
  public static final Target PRODUCT_CARD_TUPLUS =
      Target.the("Card producto TuPlus")
          .located(By.cssSelector(".content .page-dashboard__content .card-tuplus"));
  public static final Target LABEL_TOAST_MENU_NOTIFICACIONES =
      Target.the("Mensaje de inicio de de app por primera vez Menu")
          .locatedBy(".bdb-coach-mark-menu-payments-item");
  public static final Target BTN_CLOSE_COACHMARK =
      Target.the("Boton cerrar coachmark")
          .locatedBy("/html/body/app-root/bdb-coach-mark/div/div/div");
  public static final Target BTN_CLOSE_PAGOS =
      Target.the("Boton cerrar coachmark pagos").locatedBy(".bdb-coach-mark-gesture-header");
  public static final Target COACHMARK_SERVICES =
      Target.the("Boton cerrar coachmark servicios")
          .locatedBy(".bdb-coach-mark-enrol-public-service");
  public static final Target EXTERNAL_OPTIONS_ONE =
      Target.the("Opciones externas de las cuentas de ahorro")
          .located(
              By.cssSelector(
                  "div:nth-child(1) > bdb-product-info-card > div > div:nth-child(1) > div:nth-child(1) > div:nth-child(2)"));
  public static final Target EXTERNAL_OPTIONS_TWO =
      Target.the("Opciones externas de las cuentas corriente")
          .located(By.xpath("(//*[@id=\"bdb-product-info-card-options\"])[2]"));
  public static final Target EXTERNAL_OPTIONS_THREE =
      Target.the("Opciones externas de los crediservice")
          .located(By.xpath("((//div[@id='bdb-product-info-card-options']//div)[3])"));
  public static final Target PRODUCT_DASH =
      Target.the("Opciones externas de los cr?ditos de libranza")
          .locatedBy("//*[contains(text(),'{}')]");
  public static final Target PRODUCT_CARDS_LOGIN =
      Target.the("Opciones de card en la pantalla de login")
          .locatedBy("//bdb-ml-access-card[@title-label='{0}']");
  public static final Target TAG_DASHBOARD =
      Target.the("Opción copiado tag aval - dashboard")
          .locatedBy("#bdb-product-info-card-aval-key > button");
  public static final Target OPTION_DETAIL =
      Target.the("Detalle cuenta de ahorros")
          .locatedBy("(//*[@id=\"bdb-product-info-card-wrapper\"])[1]");
  public static final Target TAG_DETAIL =
      Target.the("Opción copiado tag aval - detalle")
          .locatedBy(
              "/html/body/app-root/ion-app/ion-router-outlet/bdb-product-detail/ion-content/div/ion-slides/div/ion-slide[1]/div/div[1]/div[2]/button[2]/img");
  public static final String HOST_TAG =
      "#dash_product\\.info_card > div.success-copy-aval-key > bdb-at-toast";
  public static final String VALIDATION_TAG = "div.bdb-at-toast__content__message";
  public static final String HOST_TAG_DETAIL =
      "body > app-root > ion-app > ion-router-outlet > bdb-product-detail > ion-content > div > bdb-at-toast:nth-child(3)";
}
