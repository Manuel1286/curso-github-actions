package interactions;

import static net.serenitybdd.core.Serenity.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class ShadowRoot {

  private ShadowRoot() { }

  private static final String QUERY = "return arguments[0].shadowRoot.querySelector";
  private static final JavascriptExecutor JS_EXECUTOR = (JavascriptExecutor) getDriver();

  public static void clickOnElementInsideOneShadowRoot(
      String firstShadowHost, String firstNestedShadowedInput) {
    firstJsExecutorMethod(firstShadowHost, firstNestedShadowedInput).click();
  }

  public static void clickOnElementInsideTwoShadowRoots(
      String firstShadowHost, String firstNestedShadowedInput, String secondNestedShadowedInput) {
    secondJsExecutorMethod(firstShadowHost, firstNestedShadowedInput, secondNestedShadowedInput)
        .click();
  }

  public static void clickOnElementInsideThreeShadowRoots(
      String firstShadowHost,
      String firstNestedShadowedInput,
      String secondNestedShadowedInput,
      String thirdNestedShadowedInput) {
    thirdJsExecutorMethod(
            firstShadowHost,
            firstNestedShadowedInput,
            secondNestedShadowedInput,
            thirdNestedShadowedInput)
        .click();
  }

  public static void clickOnElementInsideFourShadowRoots(
      String firstShadowHost,
      String firstNestedShadowedInput,
      String secondNestedShadowedInput,
      String thirdNestedShadowedInput,
      String fourthNestedShadowedInput) {
    fourthJsExecutorMethod(
            firstShadowHost,
            firstNestedShadowedInput,
            secondNestedShadowedInput,
            thirdNestedShadowedInput,
            fourthNestedShadowedInput)
        .click();
  }

  public static void clickOnElementInsideFiveShadowRoots(
      String firstShadowHost,
      String secondShadowHost,
      String thirdShadowHost,
      String fourthShadowHost,
      String fifthShadowHost,
      String nestedShadowedInput) {
    fifthJsExecutorMethod(
            firstShadowHost,
            secondShadowHost,
            thirdShadowHost,
            fourthShadowHost,
            fifthShadowHost,
            nestedShadowedInput)
        .click();
  }

  public static String getTextOfElementInsideOneShadowRoot(
      String firstShadowHost, String firstNestedShadowedInput) {
    return firstJsExecutorMethod(firstShadowHost, firstNestedShadowedInput).getText();
  }

  public static String getTextOfElementInsideTwoShadowRoot(
      String firstShadowHost, String firstNestedShadowedInput, String secondNestedShadowedInput) {
    return secondJsExecutorMethod(
            firstShadowHost, firstNestedShadowedInput, secondNestedShadowedInput)
        .getText();
  }

  public static String getTextOnElementInsideThreeShadowRoots(
      String firstShadowHost,
      String firstNestedShadowedInput,
      String secondNestedShadowedInput,
      String thirdNestedShadowedInput) {
    return thirdJsExecutorMethod(
            firstShadowHost,
            firstNestedShadowedInput,
            secondNestedShadowedInput,
            thirdNestedShadowedInput)
        .getText();
  }

  public static void sendKeysToElementInsideOneShadowRoot(
      String firstShadowHost, String firstNestedShadowedInput, String key) {
    firstJsExecutorMethod(firstShadowHost, firstNestedShadowedInput).sendKeys(key);
  }

  public static void sendKeysToElementInsideTwoShadowRoot(
      String firstShadowHost,
      String firstNestedShadowedInput,
      String secondNestedShadowedInput,
      String key) {
    secondJsExecutorMethod(firstShadowHost, firstNestedShadowedInput, secondNestedShadowedInput)
        .sendKeys(key);
  }

  public static void isselectedOnElementInsideOneShadowRoot(
      String firstShadowHost, String firstNestedShadowedInput) {
    firstJsExecutorMethod(firstShadowHost, firstNestedShadowedInput).isSelected();
  }

  public static void clickAndScrollOnElementInsideOneShadowRoot(
      String firstShadowHost, String firstNestedShadowedInput) {
    WebElement elementToClick = firstJsExecutorMethod(firstShadowHost, firstNestedShadowedInput);
    ((JavascriptExecutor) getDriver())
        .executeScript("arguments[0].scrollIntoView();", elementToClick);
    elementToClick.click();
  }

  public static void clickAndScrollOnElementInsideTwoShadowRoots(
      String firstShadowHost, String firstNestedShadowedInput, String secondNestedShadowedInput) {
    WebElement elementToClick =
        secondJsExecutorMethod(
            firstShadowHost, firstNestedShadowedInput, secondNestedShadowedInput);
    ((JavascriptExecutor) getDriver())
        .executeScript("arguments[0].scrollIntoView();", elementToClick);
    try {
      Thread.sleep(5000);
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
    }
    elementToClick.click();
  }

  private static WebElement firstJsExecutorMethod(
      String firstShadowHost, String firstNestedShadowedInput) {
    By elementHost;
    WebElement findShadowHost;
    elementHost = By.cssSelector(firstShadowHost);
    findShadowHost = getDriver().findElement(elementHost);
    return (WebElement)
        JS_EXECUTOR.executeScript(QUERY + "('" + firstNestedShadowedInput + "');", findShadowHost);
  }

  private static WebElement secondJsExecutorMethod(
      String firstShadowHost, String firstNestedShadowedInput, String secondNestedShadowedInput) {
    return (WebElement)
        JS_EXECUTOR.executeScript(
            QUERY + "('" + secondNestedShadowedInput + "');",
            firstJsExecutorMethod(firstShadowHost, firstNestedShadowedInput));
  }

  private static WebElement thirdJsExecutorMethod(
      String firstShadowHost,
      String firstNestedShadowedInput,
      String secondNestedShadowedInput,
      String thirdNestedShadowedInput) {
    WebElement secondNestedElement =
        secondJsExecutorMethod(
            firstShadowHost, firstNestedShadowedInput, secondNestedShadowedInput);
    return (WebElement)
        JS_EXECUTOR.executeScript(
            QUERY + "('" + thirdNestedShadowedInput + "');", secondNestedElement);
  }

  private static WebElement fourthJsExecutorMethod(
      String firstShadowHost,
      String firstNestedShadowedInput,
      String secondNestedShadowedInput,
      String thirdNestedShadowedInput,
      String fourthNestedShadowedInput) {
    WebElement thirdNestedElement =
        thirdJsExecutorMethod(
            firstShadowHost,
            firstNestedShadowedInput,
            secondNestedShadowedInput,
            thirdNestedShadowedInput);
    return (WebElement)
        JS_EXECUTOR.executeScript(
            QUERY + "('" + fourthNestedShadowedInput + "');", thirdNestedElement);
  }

  private static WebElement fifthJsExecutorMethod(
      String firstShadowHost,
      String secondShadowHost,
      String thirdShadowHost,
      String fourthShadowHost,
      String fifthShadowHost,
      String nestedShadowedInput) {
    WebElement fourthNestedElement =
        fourthJsExecutorMethod(
            firstShadowHost,
            secondShadowHost,
            thirdShadowHost,
            fourthShadowHost,
            nestedShadowedInput);
    return (WebElement)
        JS_EXECUTOR.executeScript(QUERY + "('" + fifthShadowHost + "');", fourthNestedElement);
  }
}
