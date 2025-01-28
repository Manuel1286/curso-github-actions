package ui.payments;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaymentRechargePage {
  private PaymentRechargePage() { }

  public static final Target RECHARGES_ACCORDION =
      Target.the("Selecciona opción Recargas").locatedBy("#bdb-grid-item-2");
  public static final Target RECHARGES_CARDS =
      Target.the("Selecciona card de Recargas").locatedBy("#bdb-grid-item-wrapper-2");
  public static final Target OPERATOR_ONE =
      Target.the("Selecciona operador Claro").locatedBy("#radio_item_box_0_radio");
  public static final Target OPERATOR_TWO =
      Target.the("Selecciona operador Movistar").locatedBy("#radio_item_box_1_radio");
  public static final Target OPERATOR_THREE =
      Target.the("Selecciona operador Tigo").locatedBy("#radio_item_box_2_radio");
  public static final Target OPT_OPERATOR_ONE =
      Target.the("Selecciona operador Claro").locatedBy("#bdb-grid-item-0");
  public static final Target OPT_OPERATOR_TWO =
      Target.the("Selecciona operador Movistar").locatedBy("#bdb-grid-item-1");
  public static final Target OPT_OPERATOR_THREE =
      Target.the("Selecciona operador Tigo").locatedBy("#bdb-grid-item-2");
  public static final Target MESSAGE_VALUES_RELOAD =
      Target.the("Texto valores de recarga")
          .located(
              By.cssSelector(
                  ".bdb-balance-recharge__select-operator__operator-instructions ng-star-inserted"));
  public static final Target CELL_PHONE_NUMBER =
      Target.the("Ingresa numero de celular").locatedBy("#bdb-contacts_phone-number_input");
  public static final Target VALUE_RECHARGE =
      Target.the("Ingresa valor a recargar").locatedBy("#bdb-balance-recharge__recharge-value");
  public static final Target SELECT_ACCOUNT_RECHARGE =
      Target.the("Selector de cuentas").locatedBy("#select_account_recharge");
  public static final Target RECHARGE_BUTTON =
      Target.the("botón Recargar").locatedBy("#balance_recharge_btn");
}
