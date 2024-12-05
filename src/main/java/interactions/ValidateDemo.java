package interactions;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static ui.login.DemoPage.BUTTON_SKIP;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ValidateDemo implements Interaction {

  private static final Logger LOGGER = LoggerFactory.getLogger(ValidateDemo.class);

  public static ValidateDemo toTheApplication() {
    return instrumented(ValidateDemo.class);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    if (BUTTON_SKIP.resolveFor(actor).isPresent()) {
      actor.attemptsTo(Click.on(BUTTON_SKIP));
    } else {
      LOGGER.warn("No se encontró el botón Demo");
    }
  }
}
