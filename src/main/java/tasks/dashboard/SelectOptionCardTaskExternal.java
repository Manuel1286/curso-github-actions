package tasks.dashboard;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static ui.dashboard.DashBoardPage.EXTERNAL_OPTIONS_ONE;
import static ui.dashboard.DashBoardPage.EXTERNAL_OPTIONS_THREE;
import static ui.dashboard.DashBoardPage.EXTERNAL_OPTIONS_TWO;
import static ui.dashboard.DashExternalOptionsPage.SCROLL_CARD3;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.targets.Target;

public class SelectOptionCardTaskExternal implements Task {
  private String productCard;

  public SelectOptionCardTaskExternal(String productCard) {
    this.productCard = productCard;
  }

  public static SelectOptionCardTaskExternal selectOption(String productCard) {
    return instrumented(SelectOptionCardTaskExternal.class, productCard);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {

    if ("Crediservice".equals(productCard)) {
      actor.attemptsTo(Scroll.to(externalOptionsDashboard()));
    } else if ("Leasing".equals(productCard)) {
      actor.attemptsTo(Scroll.to(SCROLL_CARD3));
    }
    actor.attemptsTo(Click.on(externalOptionsDashboard()));
  }

  public Target externalOptionsDashboard() {

    Target option;
    switch (productCard) {
      case "Cuenta de Ahorros":
      case "AFC":
      case "FIC":
        option = EXTERNAL_OPTIONS_ONE;
        return option;
      case "Tarjeta Crédito":
      case "Cuenta Corriente":
      case "Crédito Libranza":
      case "CDT":
        option = EXTERNAL_OPTIONS_TWO;
        return option;
      case "Crédito de Vivienda":
      case "Leasing":
      case "Crediservice":
        option = EXTERNAL_OPTIONS_THREE;
        return option;
      default:
    }
    return null;
  }
}
