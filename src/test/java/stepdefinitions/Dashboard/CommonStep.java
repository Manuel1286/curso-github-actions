package stepdefinitions.Dashboard;

import static common.DashFinancesTask.dashFinancesTask;
import static common.PfmTask.pfmTask;
import static constants.ConstantLogin.LOGIN_DATA_KEY;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.actors.OnStage.withCurrentActor;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import models.UserLoginData;
import questions.ValidateDataProductQuestion;
import questions.ValidateDataProductSwipeQuestion;
import tasks.dashboard.SelectProductTask;
import tasks.login.LogIn;
import utils.DataManager;

public class CommonStep {

  @Cuando("el ingresa a su producto {string}")
  public void elIngresaASuProducto(String productCard) {
    theActorInTheSpotlight().attemptsTo(SelectProductTask.selectProduct(productCard));
  }

  @Entonces("debería ver la información de saldos y atajos para {string}")
  public void deberiaVerLaInformacionDeSaldosYAtajosPara(String product) {
    theActorInTheSpotlight()
        .should(
            seeThat(ValidateDataProductQuestion.validateDataProduct(product)),
            seeThat(ValidateDataProductSwipeQuestion.validateDataProductSwipe(product)));
  }
}
