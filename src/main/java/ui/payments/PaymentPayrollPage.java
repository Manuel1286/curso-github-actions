package ui.payments;

import net.serenitybdd.screenplay.targets.Target;

public class PaymentPayrollPage {
  private PaymentPayrollPage() { }

  public static final Target OPT_PAYROLL_ACCORDION =
      Target.the("Selecciona opción Planilla Asistida").locatedBy("#accordion_item_6_header");
  public static final Target OPT_PAYROLL_CARDS =
      Target.the("opción de Planilla asistida").locatedBy("#bdb-grid-item-6");
  public static final Target LBL_TITLE_OTP_PAYROLL =
      Target.the("Titulo solicitud de OTP para Planilla asistida")
          .locatedBy("#otp-validation-title");
  public static final Target LBL_TITLE_PAYROLL =
      Target.the("Titulo ingreso datos de Planilla asistida")
          .locatedBy("#inquiry-pila-payment-header-title");
  public static final Target LBL_TEXT_PAYROLL =
      Target.the("Texto Planilla asistida").locatedBy("#inquiry-pila-payment-header-desc");
  public static final Target LST_PAYROLL =
      Target.the("Lista desplegable para seleccionar convenio de Planilla asistida")
          .locatedBy("#select-picker-pila");
  public static final Target TXT_NUMBER_PAYROLL =
      Target.the("Campo para ingresar número de Planilla asistida").locatedBy("#num-pila__input");
  public static final Target BTN_PAYROLL =
      Target.the("botón Planilla asistida").locatedBy("#pila_consult_button");
  public static final Target OPT_COMPENSAR =
      Target.the("opción de Compensar").locatedBy("#Planilla_Asistida_Compensar");
}
