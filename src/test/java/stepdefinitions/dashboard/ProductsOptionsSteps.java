package stepdefinitions.dashboard;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import interactions.Charge;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import questions.dashboard.ValidateOptionsListQuestion;
import tasks.dashboard.SelectOptionCardTaskExternal;

public class ProductsOptionsSteps {

  @Cuando("el/El/ella/Ella ingresa desde el dashboard a las opciones externas de su {string}")
  public void selectOptionsDash(String productCard) {
    OnStage.withCurrentActor(SelectOptionCardTaskExternal.selectOption(productCard), Charge.icon());
  }

  @Entonces("podrá ver el listado de opciones de su {string}")
  public void validateOptions(String product) {
    theActorInTheSpotlight()
        .should(seeThat(ValidateOptionsListQuestion.validateOptionsList(product)));
  }
}
