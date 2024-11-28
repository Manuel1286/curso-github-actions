package stepdefinitions.pfm;


import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import models.UserLoginData;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;
import tasks.login.LogIn;
import utils.DataManager;


import static common.PfmTask.pfmTask;
import static constants.ConstantLogin.LOGIN_DATA_KEY;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.actors.OnStage.withCurrentActor;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class LoginPfm {

    @Cuando("el/El/ella/Ella ingresa a PFM")
    public void selectPfm() {
        OnStage.withCurrentActor(
            pfmTask()
        );
    }

}
