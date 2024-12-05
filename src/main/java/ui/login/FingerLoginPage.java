package ui.login;

import net.serenitybdd.screenplay.targets.Target;

public class FingerLoginPage {
  private FingerLoginPage() {}

  public static final Target MODAL_TOUCH_ID =
      Target.the("Modal de quieres ingresar con tu huella").locatedBy("#bdb-confirmation-TOUCH_ID");
  public static final Target OPT_NOT_TOUCH_ID =
      Target.the("Opcion de NO ingresar con huella").locatedBy("#bdb-confirmation-cancel-TOUCH_ID");
}
