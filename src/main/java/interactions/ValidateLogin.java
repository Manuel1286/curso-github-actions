package interactions;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static ui.dashboard.DashBoardPage.FAILURE_WINDOW_FOR_DATA_SAVING;
import static ui.dashboard.DashBoardPage.TOAST_MESSAGE_SAVING_ACCOUNT;
import static ui.login.DeviceControlPage.TITLE;
import static ui.login.FingerLoginPage.MODAL_TOUCH_ID;
import static ui.login.FingerLoginPage.OPT_NOT_TOUCH_ID;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;

public class ValidateLogin implements Interaction {

  public static ValidateLogin toTheApplication() {
    return instrumented(ValidateLogin.class);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        Charge.icon(),
        Check.whether(the(TITLE), isVisible()).andIfSo(DeviceControl.login(), Charge.icon()),
        Check.whether(the(TOAST_MESSAGE_SAVING_ACCOUNT), isVisible())
            .andIfSo(NotUserAccountLoaded.failTest()),
        Check.whether(the(FAILURE_WINDOW_FOR_DATA_SAVING), isVisible())
            .andIfSo(NotUserAccountLoaded.failTest()),
        Check.whether(the(TOAST_MESSAGE_SAVING_ACCOUNT), isVisible())
            .andIfSo(NotUserAccountLoaded.failTest()),
        Check.whether(the(MODAL_TOUCH_ID), isVisible()).andIfSo(Click.on(OPT_NOT_TOUCH_ID)),
        CloseCoachMark.closeCoachMark());
  }
}
