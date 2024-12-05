package stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import io.cucumber.java.es.*;
import questions.ValidateShortcutOptionsQuestion;
import tasks.dashboard.SelectShortcutTask;

public class DetailedBalanceStep {

  @Y("seleccione el atajo de {string}")
  public void seleccioneElAtajoDe(String option) {
    SelectShortcutTask.initShortcutOption(option);
  }

  @Entonces("debería redireeccionarse al atajo de {string} de su producto {string} número {string}")
  public void deberíaRedireeccionarseAlAtajoDeDeSuProductoNúmero(
      String shortcut, String product, String productNumber) {
    theActorInTheSpotlight()
        .should(
            seeThat(
                ValidateShortcutOptionsQuestion.validateShortcutOptions(
                    shortcut, product, productNumber)));
  }
}
