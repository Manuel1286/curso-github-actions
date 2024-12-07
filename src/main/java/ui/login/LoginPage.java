package ui.login;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {

  private LoginPage() { }

  public static final Target TYPE_DOCUMENT =
      Target.the("Opciones tipo de documento")
          .located(By.cssSelector(".bdb-select-picker__select.bdb-select-picker__select--normal"));
  public static final Target DOCUMENT_LIST =
      Target.the("lista de tipos documetos").located(By.cssSelector(".box-options__picker__row"));
  public static final Target DOCUMENT_NUMBER =
      Target.the("Numero de documento").locatedBy("[formcontrolname='identificationNumber']");
  public static final Target KEY =
      Target.the("contraseña").locatedBy("[formcontrolname='password'] .bdb-input-password__input");
  public static final Target KEY_DEBIT_CARD =
      Target.the("Clave tarjeta debito").locatedBy("#id-login-secure-security-key");

  public static final Target LAST_FOUR_DIGITS_OF_CARD =
      Target.the("Ultimos 4 digitos de tarjeta")
          .locatedBy("[formcontrolname='numberCard'] .bdb-input-password__input");
  public static final Target LOGIN_BUTTON =
      Target.the("Boton inicio de sesion").locatedBy(".bdb-login-secure__form__submit-btn");
  public static final Target LOGIN_CARDS =
      Target.the("lista de opciones en login").located(By.cssSelector(".login__cards"));
  public static final Target LOGIN_CARD_ITEM =
      Target.the("opciones en el login").located(By.cssSelector(".login__cards__card"));
  public static final Target LBL_JOIN_DEBIT_CARD =
      Target.the("Opcion ingreso con tarjeta debito")
          .located(By.cssSelector("#login_to_debit_card"));
  public static final Target RECALL_BUTTON =
      Target.the("checkBox recordar").located(By.cssSelector(".bdb-checkbox__checkmark"));
  public static final Target ACCOUNT =
      Target.the("número de cuenta en el dashboard").located(By.cssSelector("#btn-dash-documents"));
  public static final Target BUTTON_FORGET_PASSWORD =
      Target.the("botón olvido de contraseña")
          .located(
              By.cssSelector(
                  ".bdb-login-secure__form__section__header .bdb-btn.bdb-btn--link[type='button']"));
  public static final Target TITLE_DASHBOARD =
      Target.the("titulo en el dashboard").located(By.cssSelector(".card-products__header__title"));
  public static final Target MESSAGE_USER_EMPTY =
      Target.the("mensaje de error en el campo de usuario")
          .located(
              By.cssSelector(
                  "[for='identificationNumber'] .bdb-validation-message--show.bdb-validation-message"));
  public static final Target MESSAGE_KEY_EMPTY =
      Target.the("mensaje de error en el campo de contraseña")
          .located(
              By.cssSelector(
                  "[for='password'] .bdb-validation-message.bdb-validation-message--show"));
  public static final Target LABEL_REMEMBER_USER =
      Target.the("Etiqueta del usuario cuando ingresa con la opcion recuerdame")
          .located(By.cssSelector(".bdb-login-welcome__detail__name"));
  public static final Target CHANGE_USER =
      Target.the("boton cambiar de usuario")
          .located(
              By.cssSelector(
                  ".bdb-login-welcome__detail__change-user .bdb-btn.bdb-btn--link.bdb-change-user-btn"));
  public static final Target TITLE_POP_UP_WINDOW_USER_NOT_FOUND =
      Target.the("título de la ventana emergente cuando el usuario no existe")
          .located(By.cssSelector(".box__title #alert_warning_title.box__title--warning"));
  public static final Target BUTTON_FORGET_PASSWORD_IN_POPUP_WINDOW =
      Target.the("botón olvide mi clave en ventana emergente cuando el usuario no existe")
          .located(By.cssSelector("ng-component [href='/users/password-recovery']"));
  public static final Target BUTTON_REGISTRY_IN_POPUP_WINDOWS =
      Target.the("botón registrame en ventana emergente cuando el usuario no existe")
          .located(By.cssSelector("ng-component [href='/users/sign-up']"));
  public static final Target MESSAGE_IN_POPUP_WINDOWS =
      Target.the("mensaje en ventana emergente cuando el usuario no existe")
          .located(By.cssSelector("#alert_warning_message.box__message .ng-star-inserted"));
  public static final Target BUTTON_UNDERSTAND_IN_POPUP_WINDOW =
      Target.the("boton entendido en ventana emergente cuando el usuario no existe")
          .located(By.cssSelector(".box #alert_warning_btn[tabindex='0']"));
  public static final Target LNK_REQUEST_A_VIRTUAL_SHIFT =
      Target.the("Link de la card Solicitar turno virtual")
          .locatedBy(
              "/html/body/app-root/ion-app/ion-router-outlet/bdb-login/ion-content/div/div[2]/div[2]/section/div[4]/a");
  public static final Target BUTTON_BEGINNIG =
      Target.the("botón Empecemos")
          .located(By.cssSelector("[routerlink='/users/device-control-warning']"));
  public static final Target OTHER_USER = Target.
          the("Ingresar con otro usuario")
          .locatedBy("//button[contains(@class, 'bdb-change-user-btn') and text()='Ingresar con otro usuario']");
  public static final String HOST_OTHER_USER = "#ion-overlay-1 > bdb-action-sheet-wc > bdb-ml-bm-action-sheet";
  public static final String H_OTHER_USER = "#label__1";

  public static final Target DESVINCULAR = Target.
          the("Desvincular").locatedBy(".bdb-replace-user__submit-btn.bdb-btn.bdb-btn--primary");

}
