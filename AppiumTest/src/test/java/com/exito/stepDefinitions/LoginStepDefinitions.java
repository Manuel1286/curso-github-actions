package com.exito.stepDefinitions;


import com.exito.driver.AppiumAdroidDriver;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.abilities.BrowsingTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.junit.Before;

import javax.sql.rowset.BaseRowSet;
import java.io.IOException;

public class LoginStepDefinitions {

    @Before
    public void setStage() throws IOException {
        OnStage.setTheStage(new OnlineCast());


    }

    @Dado("^que abro la aplicación Éxito en mi dispositivo$")
    public void queAbroLaAplicaciónÉxitoEnMiDispositivo() {
        OnStage.theActorCalled("").can(
                BrowsingTheWeb.with(AppiumAdroidDriver.openApplication().onDriver())
        );
    }

    @Cuando("^ingreso a la sección de inicio de sesión$")
    public void ingresoALaSecciónDeInicioDeSesión() {

    }

    @Cuando("^proporciono mis credenciales válidas$")
    public void proporcionoMisCredencialesVálidas() {

    }

    @Entonces("^debería acceder correctamente a mi cuentaion$")
    public void deberíaAccederCorrectamenteAMiCuentaion() {

    }



}
