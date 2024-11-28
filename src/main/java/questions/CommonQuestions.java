package questions;

import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.questions.targets.TheTarget;
import net.serenitybdd.screenplay.targets.Target;
import org.hamcrest.CoreMatchers;

import static net.serenitybdd.screenplay.EventualConsequence.eventually;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;


public class CommonQuestions {
  private CommonQuestions() { }

  public static void textEquals(Target target, String label) {

    OnStage.theActorInTheSpotlight()
        .should(
            eventually(
                    seeThat(
                        TheTarget.textOf(target), CoreMatchers.containsStringIgnoringCase(label)))
                .waitingForNoLongerThan(10)
                .seconds());
  }

}
