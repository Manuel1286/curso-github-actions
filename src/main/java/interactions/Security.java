package interactions;

import static constants.ConstantLogin.OTP;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static ui.login.DeviceControlPage.BTN_VERIFY;
import static ui.login.DeviceControlPage.WRITE_OTP;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Security implements Interaction {
  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        Click.on(WRITE_OTP), Enter.theValue(OTP).into(WRITE_OTP), Click.on(BTN_VERIFY));
  }

  public static Interaction action() {
    return instrumented(Security.class);
  }
}
