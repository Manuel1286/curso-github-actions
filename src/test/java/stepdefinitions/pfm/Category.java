package stepdefinitions.pfm;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;

import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

import static tasks.pfm.CategoriesBillsTask.category;
import static tasks.pfm.PaymentsTask.paymentsTask;


public class Category {
    @Cuando("ingrese a {word}")
    public void movements(String actorName) {
        OnStage.withCurrentActor(
                category(actorName)
        );

    }

    @Entonces("consultará pagos realizados")
    public void payments() {
        OnStage.withCurrentActor(
                paymentsTask()
        );
    }

}
