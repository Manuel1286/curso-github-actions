package tasks.pfm.demo;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static ui.pfm.FinancesDemo.SDR_DEMO_CATEGORIES;
import static ui.pfm.FinancesDemo.BUTTON_DEMO_BILLS;
import static ui.pfm.FinancesDemo.BUTTON_DEMO_INCOME;
import static ui.pfm.FinancesDemo.BUTTON_DEMO_SAVING_INVESTMENT;
import static ui.pfm.FinancesDemo.BUTTON_DEMO_CREDIT_DEBTS;
import static ui.pfm.FinancesDemo.TEXT_DEMO_BILLS;
import static ui.pfm.FinancesDemo.LBL_FINANCES;

import constants.ConstantsPfm;
import interactions.ShadowRoot;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import questions.CommonQuestions;
import ui.pfm.FinancesDemo;

public class DemoTextsTask implements Task {

  public static DemoTextsTask demoTextsTask() {
    return instrumented(DemoTextsTask.class);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {

    // Hacer clic en el botón correspondiente dentro del ShadowRoot
    ShadowRoot.clickOnElementInsideOneShadowRoot(SDR_DEMO_CATEGORIES, BUTTON_DEMO_BILLS);
    // Verificar que el texto mostrado coincida con el valor esperado
    CommonQuestions.textEquals(TEXT_DEMO_BILLS, ConstantsPfm.LBL_BILLS);

    // Repetir para otros botones y validaciones de texto
    ShadowRoot.clickOnElementInsideOneShadowRoot(SDR_DEMO_CATEGORIES, BUTTON_DEMO_INCOME);
    CommonQuestions.textEquals(TEXT_DEMO_BILLS, ConstantsPfm.LBL_INCOME);

    ShadowRoot.clickOnElementInsideOneShadowRoot(SDR_DEMO_CATEGORIES, BUTTON_DEMO_SAVING_INVESTMENT);
    CommonQuestions.textEquals(TEXT_DEMO_BILLS, ConstantsPfm.LBL_SAVING_INVESTMENT);

    ShadowRoot.clickOnElementInsideOneShadowRoot(SDR_DEMO_CATEGORIES, BUTTON_DEMO_CREDIT_DEBTS);
    CommonQuestions.textEquals(TEXT_DEMO_BILLS, ConstantsPfm.LBL_CREDIT_DEBTS);

    // Realizar clic en el siguiente botón
    actor.attemptsTo(Click.on(FinancesDemo.BUTTON_FACT));
    // Verificar el texto final
    CommonQuestions.textEquals(FinancesDemo.LBL_FINANCES, ConstantsPfm.TEXT_FINANCES);
  }
}
