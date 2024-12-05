package tasks.login;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static ui.login.LoginPage.*;

import interactions.ModalDevice;
import interactions.ValidateDemo;
import models.UserLoginData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class LogIn implements Task {

  private final UserLoginData loginData;

  public LogIn(UserLoginData loginData) {
    this.loginData = loginData;
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        ValidateDemo.toTheApplication(),
        Click.on(TYPE_DOCUMENT),
        SelectDocuments.withName(loginData.getDocumentType()),
        Click.on(DOCUMENT_NUMBER),
        Enter.theValue(loginData.getDocumentNumber()).into(DOCUMENT_NUMBER),
        Click.on(KEY),
        Enter.theValue(loginData.getPassword()).into(KEY),
        Click.on(LOGIN_BUTTON),
        ModalDevice.modalDevice());
  }

  public static LogIn withData(UserLoginData loginData) {
    return instrumented(LogIn.class, loginData);
  }
}
