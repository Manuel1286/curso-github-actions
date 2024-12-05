package ui.payments;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaymentHistoryPage {
  private PaymentHistoryPage() {}

  public static final Target OPT_HISTORY_ACCORDION =
      Target.the("opción de seleccionar Historial en Pagos").locatedBy("#bdb-grid-item-4");
  public static final Target BTN_HISTORY_SERVICE =
      Target.the("botón Servicios en el historial de Pagos").locatedBy("#btn_group_first_history");
  public static final Target BTN_HISTORY_OBLIGATIONS =
      Target.the("botón Obligaciones en el historial de Pagos")
          .locatedBy("#btn_group_second_history");
  public static final Target OPT_PAYMENT_DATE_FILTER =
      Target.the("opción filtro por fecha").locatedBy("#range_date_filter");
  public static final Target OPT_DATE_FROM =
      Target.the("opción para seleccionar Fecha-Desde").locatedBy("#range_date_start");
  public static final Target OPT_SELECT_DONE =
      Target.the("opción de hecho en componente seleccionar fecha inicial")
          .locatedBy("/html/body/app-root/ion-app/ion-picker/div/div[1]/div[2]/button");
  public static final Target OPT_DATE_UNTIL =
      Target.the("opción para seleccionar Fecha-Hasta").locatedBy("#range_date_end");
  public static final Target OPT_FILTER_DATE =
      Target.the("opción Filtar")
          .located(By.cssSelector(".bdb-range-date__content__calendar__btn"));
  public static final Target LBL_ALERT_TITLE =
      Target.the("Label del titulo en el mensaje sin movimientos")
          .located(By.cssSelector(".bdb-transaction-hist__alert__title__label"));
  public static final Target OPT_SELECT_MOVEMENT_PAYMENT =
      Target.the("opción para seleccionar primer movimiento").locatedBy("#item_date_0__0");
  public static final Target LBL_MOVEMENT_DETAIL_PAYMENT =
      Target.the("Label texto en detalle de movimiento de historial")
          .located(By.cssSelector(".voucher__content__detail__from"));
}
