package ui.transfer;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TransferHistoryPage {
  private TransferHistoryPage() { }

  public static final Target OPT_TRANSFER_HISTORY_ACCORDION =
      Target.the("opción de seleccionar Historial en Transferencias")
          .locatedBy("#bdb-grid-item-wrapper-6");
  public static final Target OPT_TAG_AVAL =
      Target.the("opción de seleccionar Tag aval").locatedBy("#bdb-grid-item-wrapper-12");
  public static final Target OPT_TRANSFER_DATE_FILTER =
      Target.the("opción de Filtrar por fecha").locatedBy("#range_date_filter");
  public static final Target LBL_ALERT_TRANSFER_HISTORY =
      Target.the("Label de texto con alerta sin movimientos")
          .located(By.cssSelector(".bdb-transaction-hist__alert__title__label"));
  public static final Target OPT_DATE_FROM =
      Target.the("opción de seleccionar Fecha-Desde").locatedBy("#range_date_start");
  public static final Target OPT_SELECT_DONE =
      Target.the("opción de seleccionar fecha inicial")
          .locatedBy("/html/body/app-root/ion-app/ion-picker/div/div[1]/div[2]/button");
  public static final Target OPT_DATE_UNTIL =
      Target.the("opción de seleccionar Fecha-Hasta").locatedBy("#range_date_end");
  public static final Target OPT_FILTER_DATE =
      Target.the("opción de Filtrar")
          .located(By.cssSelector(".bdb-range-date__content__calendar__btn"));
  public static final Target OPT_SELECT_MOVEMENT =
      Target.the("opción de seleccionar movimiento").locatedBy("#item_date_0__0");
  public static final Target LBL_MOVEMENT_DETAIL =
      Target.the("Label con texto en el detalle del movimiento")
          .located(By.cssSelector(".voucher__content__detail__from"));
  public static final Target LBL_ALERT_WITHOUT_MOVEMENTS =
      Target.the(
              "Label informativo que indica que no hay movimientos en la fecha del filtro realizada")
          .located(By.cssSelector(".bdb-transaction-hist__alert__title__label"));
}
