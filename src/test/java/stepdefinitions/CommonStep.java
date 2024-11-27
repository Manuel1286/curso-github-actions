package stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import models.UserLoginData;
import tasks.login.LogIn;
import utils.DataManager;

import static constants.ConstantLogin.LOGIN_DATA_KEY;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.actors.OnStage.withCurrentActor;

public class CommonStep {

    @Dado("que {word} ingresa a la aplicacion de banca movil")
    public void queFranciscoIngresaALaAplicacionDeBancaMovil(String nameActor) {
        DataManager.initActorWithName(nameActor);
        UserLoginData userLoginData = theActorInTheSpotlight().recall(LOGIN_DATA_KEY);
        withCurrentActor(
                LogIn.withData(userLoginData)
        );
    }

    @Cuando("el ingresa a su producto {string}")
    public void elIngresaASuProducto(String productCard) {
    }

    @Entonces("debería ver la información de saldos y atajos para {string}")
    public void deberíaVerLaInformaciónDeSaldosYAtajosPara(String arg0) {
    }
}
