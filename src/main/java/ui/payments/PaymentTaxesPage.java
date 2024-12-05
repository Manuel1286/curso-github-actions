package ui.payments;

import net.serenitybdd.screenplay.targets.Target;

public class PaymentTaxesPage {
  private PaymentTaxesPage() { }

  public static final Target OPT_TAXES_ACCORDION =
      Target.the("Selecciona opción Impuestos").locatedBy("#bdb-grid-item-5");
}
