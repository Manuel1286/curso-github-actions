package stepdefinitions.pfm;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

import static tasks.pfm.RedirectSPTask.redirectSPTask;
import static tasks.pfm.RedirectionSPTask.redirectionSPTask;


public class RedirectionSP {
    @Cuando("de clic sobre inscripción de servicios públicos")
    public void redirectionSP() {
        OnStage.withCurrentActor(
            redirectSPTask()
        );
    }
    @Entonces("redireccionará a servicios públicos")
    public void visibleSP() {
        OnStage.withCurrentActor(
            redirectionSPTask()
        );
    }


}
