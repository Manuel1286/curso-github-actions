package runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"src/test/resources/features/"},
        tags = "@TEST_EFI-1634",
        glue = {"stepdefinitions"},
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class TestRunner {


}
