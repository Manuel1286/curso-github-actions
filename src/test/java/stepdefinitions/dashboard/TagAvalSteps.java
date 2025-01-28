package stepdefinitions.dashboard;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import questions.dashboard.TagAvalQuestion;
import tasks.dashboard.SelectOptionTag;

public class TagAvalSteps {

  @Cuando("selecciona la opción de copiar tag aval en la {string}")
  public void seleccionaLaOpcionDeCopiarTagAvalEnLaDashboard(String section) {
    theActorInTheSpotlight().attemptsTo(SelectOptionTag.tag(section));
  }

  @Entonces("deberia visualizar el siguiente {string}")
  public void deberiaVisualizarElSiguiente(String tag) {
    theActorInTheSpotlight().should(seeThat(TagAvalQuestion.match(tag)));
  }
}
