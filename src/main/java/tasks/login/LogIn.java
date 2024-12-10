package tasks.login;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static ui.login.LoginPage.*;

import interactions.ModalDevice;
import interactions.ShadowRoot;
import interactions.ValidateDemo;
import models.UserLoginData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import ui.login.LoginPage;

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
    if (LoginPage.TYPE_DOCUMENT.resolveFor(actor).isPresent()) {
      performLogin(actor);
    } else {
      handleOtherUserLogin(actor);
      performLogin(actor);
    }
  }
  private <T extends Actor> void performLogin(T actor) {
    actor.attemptsTo(
       // ValidateDemo.toTheApplication(),
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
    actor.attemptsTo(Click.on(LoginPage.OTHER_USER));
    ShadowRoot.clickOnElementInsideOneShadowRoot(LoginPage.HOST_OTHER_USER, LoginPage.H_OTHER_USER);
    actor.attemptsTo(Click.on(LoginPage.DESVINCULAR));
  }

}
