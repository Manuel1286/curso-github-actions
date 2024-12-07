package stepdefinitions.pfm;


import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

import static tasks.pfm.AccountsTask.accountsTask;


public class FiltersAccounts {

    @Dado("que al dar clic sobre todas tus cuentas")
    public void allAccounts() {
        OnStage.withCurrentActor(
            accountsTask()
        );
    }





}
