package tasks.login;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static ui.login.LoginPage.CHECK_TC;
import static ui.login.LoginPage.DESVINCULAR;
import static ui.login.LoginPage.DOCUMENT_NUMBER;
import static ui.login.LoginPage.HOST_OTHER_USER;
import static ui.login.LoginPage.H_OTHER_USER;
import static ui.login.LoginPage.KEY;
import static ui.login.LoginPage.LOGIN_BUTTON;
import static ui.login.LoginPage.OTHER_USER;
import static ui.login.LoginPage.TYPE_DOCUMENT;

import interactions.ModalDevice;
import interactions.Pause;
import models.UserLoginData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import utils.ShadowRoot;

public class LogIn implements Task {

  private final UserLoginData loginData;

  public LogIn(UserLoginData loginData) {
    this.loginData = loginData;
  }
  public static LogIn withData(UserLoginData loginData) {
    return instrumented(LogIn.class, loginData);
  }
  @Override
  public <T extends Actor> void performAs(T actor) {
    if (TYPE_DOCUMENT.resolveFor(actor).isPresent()) {
      performLogin(actor);
    } else {
      handleOtherUserLogin(actor);
      performLogin(actor);
    }
  }
  private <T extends Actor> void performLogin(T actor) {
    actor.attemptsTo(
            //ValidateDemo.toTheApplication(),
            Click.on(TYPE_DOCUMENT),
            SelectDocuments.withName(loginData.getDocumentType()),
            Click.on(DOCUMENT_NUMBER),
            Enter.theValue(loginData.getDocumentNumber()).into(DOCUMENT_NUMBER),
            Click.on(KEY),
            Enter.theValue(loginData.getPassword()).into(KEY),
            Click.on(CHECK_TC),
            Click.on(LOGIN_BUTTON),
            ModalDevice.modalDevice());
  }
  private <T extends Actor> void handleOtherUserLogin(T actor) {

    actor.attemptsTo(Click.on(OTHER_USER));
    Pause.withDuration(5000);
    ShadowRoot.clickOnElementInsideOneShadowRoot(HOST_OTHER_USER, H_OTHER_USER);
    actor.attemptsTo(Click.on(DESVINCULAR));
  }

}
