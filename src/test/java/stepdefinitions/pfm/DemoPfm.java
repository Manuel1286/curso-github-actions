package stepdefinitions.pfm;

import static tasks.pfm.DemoBackQueryOptionTask.demoBackQueryOptionTask;
import static tasks.pfm.DemoFinancesTask.demoFinancesTask;
import static tasks.pfm.DemoTextsTask.demoTextsTask;


import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

public class DemoPfm {
  @Entonces("podrá navegar en el tour de Pfm")
  public void pfm() {
    OnStage.withCurrentActor(
            demoFinancesTask(),
            demoTextsTask());
  }

  @Entonces("podrá navegar hasta Macro categorías y retroceder a opciones de consulta")
  public void demoBackQueryOptionPfm() {
    OnStage.withCurrentActor(
            demoFinancesTask(),
            demoBackQueryOptionTask());
  }
}
