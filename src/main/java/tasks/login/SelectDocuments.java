package tasks.login;


import models.DocumentType;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static ui.login.LoginPage.DOCUMENT_LIST;

public class SelectDocuments implements Task {

    private final String documentType;

    public SelectDocuments(String documentType) {
        this.documentType = documentType;
    }



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(DOCUMENT_LIST, WebElementStateMatchers.isCurrentlyVisible())
                        .forNoMoreThan(10).seconds()
        );
      WebElementFacade action = DOCUMENT_LIST.resolveAllFor(actor)
                .stream()
                .filter(webElementFacade -> {
                    String content = webElementFacade.getText();
                    return content.equalsIgnoreCase(documentType);
                }).findFirst()
                .orElseThrow(() -> new RuntimeException("el tipo de documento seleccionado no existe"));
        actor.attemptsTo(
            Scroll.to(action),
            Click.on(action)
        );
    }
    public static SelectDocuments withName(DocumentType documentType) {
        return instrumented(SelectDocuments.class, documentType.getDocumentString());
    }

}
