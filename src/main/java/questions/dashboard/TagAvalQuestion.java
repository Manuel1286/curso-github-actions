package questions.dashboard;

import static constants.ConstantsDetailedBalance.TAG_AVAL;
import static ui.dashboard.DashBoardPage.HOST_TAG;
import static ui.dashboard.DashBoardPage.HOST_TAG_DETAIL;
import static ui.dashboard.DashBoardPage.VALIDATION_TAG;
import static utils.ShadowRoot.getTextOfElementInsideOneShadowRoot;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class TagAvalQuestion implements Question<Boolean> {

  private final String expectedTag;

  public TagAvalQuestion(String expectedTag) {
    this.expectedTag = expectedTag;
  }

  @Override
  public Boolean answeredBy(Actor actor) {
    String tagAvalText;
    if (expectedTag.trim().equalsIgnoreCase("Dashboard")) {
      tagAvalText = getTextOfElementInsideOneShadowRoot(HOST_TAG, VALIDATION_TAG);
    } else if (expectedTag.trim().equalsIgnoreCase("Detalle")) {
      tagAvalText = getTextOfElementInsideOneShadowRoot(HOST_TAG_DETAIL, VALIDATION_TAG);
    } else {
      throw new IllegalArgumentException("Unsupported section: " + expectedTag);
    }
    return tagAvalText.equals(TAG_AVAL);
  }

  public static TagAvalQuestion match(String tag) {
    return new TagAvalQuestion(tag);
  }
}
