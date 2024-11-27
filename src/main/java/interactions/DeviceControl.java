package interactions;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.conditions.Check;
import ui.dashboard.DashBoardPage;

import static constants.ConstantLogin.OTP;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static ui.dashboard.DashBoardPage.*;
import static ui.login.DeviceControlPage.*;

public class DeviceControl implements Interaction {


    public static Interaction login() {
        return instrumented(DeviceControl.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Click.on(BUTTON_CONTINUE),
            Charge.icon(),
            Click.on(WRITE_OTP),
            Enter.theValue(OTP).into(WRITE_OTP),
            Click.on(BUTTON_VALIDATE),
            Check.whether(the(FAILURE_WINDOW_FOR_DATA_SAVING), isVisible()).andIfSo(
                NotUserAccountLoaded.failTest()
            ),
            Check.whether(the(DashBoardPage.TOAST_MESSAGE_SAVING_ACCOUNT), isVisible()).andIfSo(
                NotUserAccountLoaded.failTest()
            ));


    }
}
