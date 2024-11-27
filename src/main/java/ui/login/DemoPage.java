package ui.login;


import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DemoPage {

    public static final Target TITLE_DEMO = Target.the("titulo en pagina demo").located(AppiumBy.xpath("//android.view.View[@text=\"Novedades en tu App Banca Móvil\"]"));
    public static final Target BUTTON_SKIP = Target.the("boton omitir del demo")
            .located(AppiumBy.xpath("//android.view.View[@text=\"Omitir\"]"));
}
