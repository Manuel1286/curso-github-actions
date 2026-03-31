package stepDefinitions;

import com.orangehrmlive.Task.CredencialesTask;
import com.orangehrmlive.Task.UrlTask;
import com.orangehrmlive.UI.CredencialesUI;
import com.orangehrmlive.UI.DashboardUI;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.questions.Visibility;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static net.bytebuddy.matcher.ElementMatchers.is;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;

public class LoginStepDef {

    WebDriver driver;

    @BeforeAll
    static void setupClass() {
        WebDriverManager.chromedriver().clearDriverCache().setup();
    }

    @BeforeEach
    void setupTest() {
        driver = new ChromeDriver();
    }

    @AfterEach
    void teardown() {
        driver.quit();
    }

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().clearDriverCache().setup();
        setTheStage(new OnlineCast());
    }

    @Given("que el usuario se encuentra en la página de login de OrangeHRM Live")
    public void queElUsuarioSeEncuentraEnLaPáginaDeLoginDeOrangeHRMLive() {
        theActorCalled("Ingresar a la URL de orangehrmlive").wasAbleTo(
                UrlTask.urlTask()
        );
    }

    @When("ingresa el username {string} y la password {string} luego dar clic en el botón de Continuar")
    public void ingresaElUsernameYLaPasswordLuegoDarClicEnElBotónDeContinuar(String username, String password) {
        System.out.println("USERNAME: " + username);
        System.out.println("PASSWORD: " + password);

        theActorInTheSpotlight().attemptsTo(
                CredencialesTask.conDatos(username, password)
        );
    }

    @Then("el sistema debe mostrar el resultado {string}")
    public void elSistemaDebeMostrarElResultado(String resultado) {

        System.out.println("RESULTADO: " + resultado);

        if ("Dashboard".equals(resultado)) {
            theActorInTheSpotlight().should(
                    seeThat(Text.of(DashboardUI.DASHBOARD), equalTo(resultado))
            );
        } else {
            theActorInTheSpotlight().should(
                    seeThat(Text.of(CredencialesUI.ERROR), equalTo(resultado))

            );
        }
    }
}