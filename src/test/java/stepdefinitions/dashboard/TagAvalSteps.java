package stepdefinitions.dashboard;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import questions.dashboard.TagAvalQuestion;
import tasks.dashboard.SelectOptionTag;

public class TagAvalSteps {

  @Cuando("selecciona la opción de copiar tag aval en la {string}")
  public void selecciona_la_opción_de_copiar_tag_aval_en_la_dashboard(String section) {
    theActorInTheSpotlight().attemptsTo(SelectOptionTag.tag(section));
  }

  @Entonces("deberia visualizar el siguiente {string}")
  public void deberia_visualizar_el_siguiente(String tag) {
    theActorInTheSpotlight().should(seeThat(TagAvalQuestion.match(tag)));
  }
}
