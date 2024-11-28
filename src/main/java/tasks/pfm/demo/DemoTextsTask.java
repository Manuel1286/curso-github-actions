package tasks.pfm.demo;


import constants.ConstantsPfm;
import interactions.ShadowRoot;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import questions.CommonQuestions;
import ui.pfm.FinancesDemo;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static ui.pfm.FinancesDemo.SDR_DEMO_CATEGORIES;
import static ui.pfm.FinancesDemo.TEXT_DEMO_BILLS;

public class DemoTextsTask implements Task {

    public static DemoTextsTask demoTextsTask() {
        return instrumented(DemoTextsTask.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {

        ShadowRoot.clickOnElementInsideOneShadowRoot(SDR_DEMO_CATEGORIES, FinancesDemo.BUTTON_DEMO_BILLS);
        CommonQuestions.textEquals(TEXT_DEMO_BILLS, ConstantsPfm.LBL_BILLS);
        ShadowRoot.clickOnElementInsideOneShadowRoot(SDR_DEMO_CATEGORIES, FinancesDemo.BUTTON_DEMO_INCOME);
        CommonQuestions.textEquals(TEXT_DEMO_BILLS, ConstantsPfm.LBL_INCOME);
        ShadowRoot.clickOnElementInsideOneShadowRoot(SDR_DEMO_CATEGORIES, FinancesDemo.BUTTON_DEMO_SAVING_INVESTMENT);
        CommonQuestions.textEquals(TEXT_DEMO_BILLS, ConstantsPfm.LBL_SAVING_INVESTMENT);
        ShadowRoot.clickOnElementInsideOneShadowRoot(SDR_DEMO_CATEGORIES, FinancesDemo.BUTTON_DEMO_CREDIT_DEBTS);
        CommonQuestions.textEquals(TEXT_DEMO_BILLS, ConstantsPfm.LBL_CREDIT_DEBTS);
        actor.attemptsTo(Click.on(FinancesDemo.BUTTON_FACT));
        CommonQuestions.textEquals(FinancesDemo.LBL_FINANCES, ConstantsPfm.TEXT_FINANCES);
    }
}
