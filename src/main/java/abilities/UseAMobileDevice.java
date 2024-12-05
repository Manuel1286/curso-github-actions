package abilities;

import exceptions.NotFoundUserAbility;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;

public class UseAMobileDevice extends BrowseTheWeb {

  public static UseAMobileDevice likeActor(Actor actor) {
    UseAMobileDevice ability = actor.abilityTo(UseAMobileDevice.class);
    if (ability != null) {
      return ability.asActor(actor);
    } else {
      throw new NotFoundUserAbility();
    }
  }

  protected UseAMobileDevice(WebDriver browser) {
    super(browser);
  }

  public static UseAMobileDevice with(WebDriver browser) {
    return new UseAMobileDevice(browser);
  }

  @Override
  public String toString() {
    return "Usar un dispositivo móvil";
  }
}
