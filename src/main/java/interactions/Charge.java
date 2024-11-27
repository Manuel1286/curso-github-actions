package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;
import static ui.login.DeviceControlPage.ICON_CHARGE;

public class Charge implements Interaction {

    public static Charge icon() {
        return new Charge();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(ICON_CHARGE, isNotVisible()).forNoMoreThan(30).seconds()
        );
    }
}
