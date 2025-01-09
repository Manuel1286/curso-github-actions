package stepdefinitions.pfm;

import static common.DashFinancesTask.dashFinancesTask;
import static common.PfmTask.pfmTask;
import static constants.ConstantLogin.LOGIN_DATA_KEY;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.actors.OnStage.withCurrentActor;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import models.UserLoginData;
import net.serenitybdd.screenplay.actors.OnStage;
import tasks.login.LogIn;
import utils.DataManager;

public class LoginPfm {
  @Dado("que {word} ingresa a la aplicacion de banca movil")
  public void queFranciscoIngresaALaAplicacionDeBancaMovil(String nameActor) {
    DataManager.initActorWithName(nameActor);
    UserLoginData userLoginData = theActorInTheSpotlight().recall(LOGIN_DATA_KEY);
    withCurrentActor(LogIn.withData(userLoginData));
  }
  @Dado("que {word} ingresa a PFM")
  public void queIngresaPFM(String nameActor) {
    DataManager.initActorWithName(nameActor);
    UserLoginData userLoginData = theActorInTheSpotlight().recall(LOGIN_DATA_KEY);
    withCurrentActor(LogIn.withData(userLoginData));
    OnStage.withCurrentActor(
            pfmTask(),
            dashFinancesTask());
  }

  @Cuando("el/El/ella/Ella ingresa a PFM")
  public void selectPfm() {
    OnStage.withCurrentActor(pfmTask());
  }
  @Entonces("podrá ver la interfaz Finanzas")
  public void finances() {
    OnStage.withCurrentActor(
            dashFinancesTask()
    );
  }
}
