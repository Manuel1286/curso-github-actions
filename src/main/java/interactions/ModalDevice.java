package interactions;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static ui.login.DeviceControlPage.BTN_TYC;
import static ui.login.LoginPage.BUTTON_BEGINNIG;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

public class ModalDevice implements Interaction {
  public static ModalDevice modalDevice() {
    return instrumented(ModalDevice.class);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    try {
      Thread.sleep(10000);
      if (BUTTON_BEGINNIG.resolveFor(actor).isPresent()) {
        actor.attemptsTo(Click.on(BUTTON_BEGINNIG),
                ValidateLogin.toTheApplication()
                );
      } else {
        actor.attemptsTo(ValidateLogin.toTheApplication());
      }
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
    }
  }
}
