package ui.pfm;

import net.serenitybdd.screenplay.targets.Target;

public class Balances {
  private Balances() {}

  public static final Target BALANCES_ALL_ACCOUNTS =
      Target.the("Saldo todas tus cuentas")
          .locatedBy("#chart-area > svg > g > text:nth-child(14) > tspan");
  public static final Target BALANCES_ALL_TC =
      Target.the("Saldo todas tus cuentas")
          .locatedBy("#chart-area > svg > g > text:nth-child(14) > tspan");
  public static final Target BALANCES_RANGE_DATE =
      Target.the("Saldo filtro 01/06/2024-10/06/2024")
          .locatedBy("#chart-area > svg > g > text:nth-child(14) > tspan");
}
