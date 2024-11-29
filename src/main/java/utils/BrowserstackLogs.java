package utils;

import net.serenitybdd.core.Serenity;

import org.json.simple.JSONObject;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

public class BrowserstackLogs {

    private static final Logger LOGGER = LoggerFactory.getLogger(BrowserstackLogs.class);
    private static final Map<String, String> LOGS_BROWSERSTACK = new HashMap<>();

    private BrowserstackLogs() { }

    public static void informationBrowserstackLogs(WebDriver driver) throws ParseException {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        Object response = jse.executeScript("browserstack_executor: {\"action\": \"getSessionDetails\"}");
        JSONObject json = (JSONObject) new JSONParser().parse((String) response);

        LOGGER.info("|-------- Logs con la Información de la ejecución del Test en BrowserStack --------|");

        String projectName = (String) json.get("project_name");
        LOGGER.info("-----projectName: {}", projectName);

        String buildName = (String) json.get("build_name");
        LOGGER.info("-----buildName: {}", buildName);

        String nameTest = (String) json.get("name");
        LOGGER.info("-----nameTest: {}", nameTest);

        String buildHashedId = (String) json.get("build_hashed_id");
        LOGGER.info("-----buildHashedId: {}", buildHashedId);

        String hashedId = (String) json.get("hashed_id");
        LOGGER.info("-----hashedId: {}", hashedId);

        String browserUrl = (String) json.get("browser_url");
        LOGGER.info("-----browserUrl: {}", browserUrl);

        String publicUrl = (String) json.get("public_url");
        LOGGER.info("-----publicUrl: {}", publicUrl);

        LOGS_BROWSERSTACK.put("Project Name", projectName);
        LOGS_BROWSERSTACK.put("Build Name", buildName);
        LOGS_BROWSERSTACK.put("Build Name Test", nameTest);
        LOGS_BROWSERSTACK.put("Build Hashed Id", buildHashedId);
        LOGS_BROWSERSTACK.put("Hashed Id", hashedId);
        LOGS_BROWSERSTACK.put("Browser Url", browserUrl);
        LOGS_BROWSERSTACK.put("Public Url", publicUrl);
        Serenity.recordReportData().
            withTitle("Logs de la ejecución de BrowserStack").andContents(LOGS_BROWSERSTACK.toString());
    }
}
