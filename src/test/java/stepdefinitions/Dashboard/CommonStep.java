package stepdefinitions.dashboard;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import io.cucumber.java.es.Cuando;

import io.cucumber.java.es.Entonces;

import questions.ValidateDataProductQuestion;
import questions.ValidateDataProductSwipeQuestion;
import tasks.dashboard.SelectProductTask;


public class CommonStep {

  @Cuando("ingresa a su producto {string}")
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
