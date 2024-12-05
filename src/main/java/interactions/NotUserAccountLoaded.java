package interactions;



import exceptions.NotDataFoundSavingAccount;
import net.serenitybdd.markers.IsHidden;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import static ui.dashboard.DashBoardPage.FAILURE_WINDOW_FOR_DATA_SAVING;
import static ui.dashboard.DashBoardPage.TOAST_MESSAGE_SAVING_ACCOUNT;

public class NotUserAccountLoaded implements Interaction, IsHidden {

  public static Interaction failTest() {
    return new NotUserAccountLoaded();
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    String title = "Discúlpanos, presentamos fallas";
    if (FAILURE_WINDOW_FOR_DATA_SAVING.resolveFor(actor).isVisible()) {
      String titleFailureWindows =
          FAILURE_WINDOW_FOR_DATA_SAVING.resolveFor(actor).getText().trim();

      if (titleFailureWindows.equals(title)) {
        throw new NotDataFoundSavingAccount();

      } else {
        throw new IllegalArgumentException(titleFailureWindows);
      }
    } else {
      String titleFailureWindows = TOAST_MESSAGE_SAVING_ACCOUNT.resolveFor(actor).getText().trim();
      if (titleFailureWindows.equals(title)) {
        throw new NotDataFoundSavingAccount();

      } else {
        throw new IllegalArgumentException(titleFailureWindows);
      }
    }
  }
}
