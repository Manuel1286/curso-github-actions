package tasks.dashboard;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectProductTask implements Task {

    private final String productCard;

    public SelectProductTask(String productCard) {
        this.productCard = productCard;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

    }

    public static SelectProductTask selectProduct(String productCard) {
        return instrumented(SelectProductTask.class, productCard);
    }
}
