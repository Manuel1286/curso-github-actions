package stepdefinitions.pfm;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

import static tasks.pfm.BalancesAccountWhithoutDataTask.balancesAccountWhithoutDataTask;
import static tasks.pfm.BalancesWhithoutTCTask.balancesWhithoutTCTask;


public class BalancesTC {
    @Cuando("vea la TC monocuenta")
    public void balanceAccounts() {
        OnStage.withCurrentActor(
            balancesWhithoutTCTask()
        );
    }
    @Entonces("verá una consulta sin data")
    public  void  balance() {
        OnStage.withCurrentActor(
            balancesAccountWhithoutDataTask()
        );
    }
}
