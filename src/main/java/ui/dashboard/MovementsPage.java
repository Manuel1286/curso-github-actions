package ui.dashboard;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MovementsPage {
  private MovementsPage() { }

  public static final Target LBL_PRODUCT_NAME =
      Target.the("label nombre del producto")
          .located(By.cssSelector("div.page-movements__content__page__header__type-product"));
  public static final Target LBL_PRODUCT_NUMBER =
      Target.the("label número del producto")
          .located(By.cssSelector("div.page-movements__content__page__header__number-product"));
  public static final Target OPT_FILTER_WORD =
      Target.the("Filtro por palabra")
          .located(By.cssSelector("#page-movements_search-word-btn_button"));
  public static final Target OPT_FILTER_DATE =
      Target.the("Filtro por fecha")
          .located(By.cssSelector("#page-movements_search-date-btn_button"));
  public static final Target OPT_FILTER_AMOUNT =
      Target.the("Filtro por monto")
          .located(By.cssSelector("#page-movements_search-ammount-btn_button"));
}
