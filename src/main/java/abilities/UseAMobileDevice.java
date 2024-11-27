package abilities;

import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;

public class UseAMobileDevice extends BrowseTheWeb {

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
