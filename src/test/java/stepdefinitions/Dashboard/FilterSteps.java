package stepdefinitions.dashboard;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import questions.FilterQuestion;
import tasks.dashboard.FilterMovementBy;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FilterSteps {

    @Cuando("seleccione el {string} con la opción {string}")
    public void seleccioneOpcion(String product, String filter) {
        theActorInTheSpotlight().attemptsTo(
                FilterMovementBy.withData(product, filter)
        );
    }

    @Entonces("debería visualizar los siguientes datos {string} {string} y {string}")
    public void visualizarDatos(String movements, String date, String value) {
        theActorInTheSpotlight().should(seeThat(FilterQuestion.matches(movements, date, value)));
    }

}

