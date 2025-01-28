package tasks.pfm;

import utils.ShadowRoot;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import ui.pfm.Bills;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CategoriesBillsTask implements Task {
    private final String categoryName;

    public CategoriesBillsTask(String categoryName) {
        this.categoryName = categoryName;
    }

    public static CategoriesBillsTask category(String serviceName) {
        return instrumented(CategoriesBillsTask.class, serviceName);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        switch (categoryName) {
            case "Gastos":
                ShadowRoot.clickOnElementInsideOneShadowRoot(Bills.SDR_CATEGORIES, Bills.BILL);
                break;
            case "Movimientos":
                ShadowRoot.clickOnElementInsideOneShadowRoot(Bills.SDR_CATEGORIES, Bills.INCOME);
                break;
            case "Ahorro e inversi�n":
                ShadowRoot.clickOnElementInsideOneShadowRoot(Bills.SDR_CATEGORIES, Bills.SAVINGS_AND_INVESTMENT);
                break;
            case "Cr�dito y deudas":
                ShadowRoot.clickOnElementInsideOneShadowRoot(Bills.SDR_CATEGORIES, Bills.CREDIT_AND_DEBTS);
                break;
            default:
                break;
        }
    }
}


