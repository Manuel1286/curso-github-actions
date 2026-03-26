package stepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;

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
    public void setUp(){
        WebDriverManager.chromedriver().clearDriverCache().setup();
        setTheStage(new OnlineCast());
    }


    @Given("que el usuario se encuentra en la página de login de OrangeHRM Live")
    public void queElUsuarioSeEncuentraEnLaPáginaDeLoginDeOrangeHRMLive() {


    }

    @When("ingresa el username Admin y la password admin123")
    public void ingresaElUsernameAdminYLaPasswordAdmin123() {

    }

    @When("hace clic en el botón de login")
    public void haceClicEnElBotónDeLogin() {

    }

    @Then("el sistema debe mostrar el resultado Login exitoso")
    public void elSistemaDebeMostrarElResultadoLoginExitoso() {

    }

}
