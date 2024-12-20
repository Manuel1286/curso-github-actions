package tasks.dashboard;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static ui.dashboard.DashBoardPage.OPTION_CARD4;

import exceptions.NotFoundProductException;
import java.util.List;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import ui.dashboard.DashBoardPage;

public class SelectProductTask implements Task {

  private final String productCard;

  public SelectProductTask(String productCard) {
    this.productCard = productCard;
  }

  @Override
  public <T extends Actor> void performAs(T actor) {

    if (productCard.equalsIgnoreCase("Crédito de Vivienda")) {
      actor.attemptsTo(
              Scroll.to(OPTION_CARD4).andAlignToTop()
      );
    }
    List<WebElementFacade> productElements = DashBoardPage.PRODUCT_CARD_LIST.resolveAllFor(actor);
    WebElementFacade action =
        productElements.stream()
            .filter(
                webElementFacade -> {
                  String content = webElementFacade.getText();
                  return content.contains(productCard);
                })
            .findFirst()
            .orElseThrow(() -> new NotFoundProductException(productCard));
    actor.attemptsTo(
            Scroll.to(action),
            Click.on(action));
  }

  public static SelectProductTask selectProduct(String productCard) {
    return instrumented(SelectProductTask.class, productCard);
  }
}
