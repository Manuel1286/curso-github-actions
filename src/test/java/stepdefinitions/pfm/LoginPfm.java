package stepdefinitions.pfm;

import static common.PfmTask.pfmTask;

import io.cucumber.java.es.Cuando;
import net.serenitybdd.screenplay.actors.OnStage;

public class LoginPfm {

  @Cuando("el/El/ella/Ella ingresa a PFM")
  public void selectPfm() {
    OnStage.withCurrentActor(pfmTask());
  }
}
