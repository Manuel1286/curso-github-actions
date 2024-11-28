package stepdefinitions.pfm;

import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import static tasks.pfm.demo.DemoBackQueryOptionTask.demoBackQueryOptionTask;
import static tasks.pfm.demo.DemoFinancesTask.demoFinancesTask;
import static tasks.pfm.demo.DemoTextsTask.demoTextsTask;

public class DemoPfm {
    @Entonces("podrá navegar en el tour de Pfm")
    public void pfm() {
        OnStage.withCurrentActor(
            demoFinancesTask(),
            demoTextsTask()
        );
    }
    @Entonces("podrá navegar hasta Macro categorías y retroceder a opciones de consulta")
    public void demoBackQueryOptionPfm() {
        OnStage.withCurrentActor(
            demoFinancesTask(),
            demoBackQueryOptionTask()
        );
    }



}
