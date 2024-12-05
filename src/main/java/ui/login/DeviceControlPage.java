package ui.login;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DeviceControlPage {

  private DeviceControlPage() {}

  public static final Target TITLE =
      Target.the("titulo del control de dispositivos")
          .located(By.cssSelector(".bdb-header__content .bdb-header__title"));
  public static final Target ICON_CHARGE =
      Target.the("loader de la aplicación").located(By.cssSelector(".bdb-loader"));
  public static final Target BUTTON_CONTINUE =
      Target.the("botón de continuar").located(By.xpath("//*[contains(text(),'Continuar')]"));
  public static final Target WRITE_OTP =
      Target.the("campo  para escribir la OTP")
          .located(By.cssSelector(".bdb-input-password__group--unique [size='6']"));
  public static final Target WRITE_OTP_REGISTER =
      Target.the("campo para escribir la OTP inscripción de cuentas")
          .located(
              By.cssSelector(
                  "#otp-security-code > div > div.bdb-input-password__group.bdb-input-password__group--unique"));
  public static final Target WRITE_OTP_FORGET_PASS =
      Target.the("campo  para escribir la OTP").located(By.cssSelector("[maxlength='6']"));
  public static final Target BUTTON_VALIDATE =
      Target.the("botón para validar la otp")
          .located(By.cssSelector(".bdb-otp-page .bdb-btn[type='button']"));
  public static final Target SKELETON_CHARGE =
      Target.the("skeleton de carga").locatedBy("#payment_sk .loading");
  public static final Target LBL_TITLE_OTP_FORGET =
      Target.the("Label con el título de control de dispositivos en el flujo de olvido de clave")
          .locatedBy("bdb-device-control-warning .bdb-header__title");
  public static final Target BTN_CONTINUE_OTP_FORGET =
      Target.the("botón de continuar de control de dispositivos en el flujo de olvido de clave")
          .located(
              By.xpath(
                  "/html/body/app-root/ion-app/ion-router-outlet/bdb-device-control-warning/ion-content/div/div/div/button[1]"));
  public static final Target BUTTON_VALIDATE_OTP_FORGET =
      Target.the(
              "botón para validar la otp de control de dispositivos en el flujo de olvido de clave")
          .locatedBy("//button[text()='Verificar']");
}
