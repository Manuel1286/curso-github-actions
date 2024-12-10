package runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
    plugin = {"pretty", "rerun:target/rerun.txt", "json:target/destination/cucumber.json"},
    features = {"src/test/resources/features/"},
    tags = "@TEST_EFI-1635",
    glue = {"stepdefinitions"},
    snippets = CucumberOptions.SnippetType.CAMELCASE)
public class TestRunner { }
