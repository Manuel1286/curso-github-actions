package ui.dashboard;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BalanceDetailProductPage {
  private BalanceDetailProductPage() { }

  public static final String FIRST_COMMON_LOCATOR_LABEL =
      "div:nth-child(1) > div.header-detail__info__item__label";
  public static final String SECOND_COMMON_LOCATOR_LABEL = "div.header__available-balance__label";
  public static final String THIRD_COMMON_LOCATOR_LABEL =
      "div.header-detail__available__item__label";
  public static final String FOURTH_COMMON_LABEL_AVAILABLE =
      "div.header-detail__available__label.ng-star-inserted";
  public static final String FIFTH_COMMON_LOCATOR_LABEL =
      "div:nth-child(2) > div.header-detail__info__item__label";
  public static final String SIXTH_COMMON_LOCATOR_LABEL =
      "div:nth-child(3) > div.header-detail__info__item__label";
  public static final String SEVENTH_COMMON_LOCATOR_LABEL =
      ".header-detail__available__item__label:nth-child(1)";
  public static final Target LBL_BALANCE_AVAILABLE_CURRENT =
      Target.the("Label de saldo disponible cuenta corriente")
          .located(By.cssSelector("ion-slide > div > div > div > span.ng-star-inserted"));
  public static final Target LBL_BALANCE_AVAILABLE_AFC =
      Target.the("Label de saldo disponible AFC")
          .located(By.cssSelector(SECOND_COMMON_LOCATOR_LABEL));
  public static final Target LBL_BALANCE_AVAILABLE_SAVINGS =
      Target.the("Label de saldo disponible cuenta ahorros")
          .located(By.cssSelector(SECOND_COMMON_LOCATOR_LABEL));
  public static final Target LBL_AVAILABLE_SAVINGS =
      Target.the("Label de disponible cuenta ahorros")
          .located(By.cssSelector(FIRST_COMMON_LOCATOR_LABEL));
  public static final Target LBL_BALANCE_AVAILABLE_CREDISERVICE =
      Target.the("Label de saldo disponible crediservice")
          .located(By.cssSelector(SECOND_COMMON_LOCATOR_LABEL));
  public static final Target LBL_MINIMUM_PAYMENT_CREDISERVICE =
      Target.the("Label de pago mínimo crediservice")
          .located(By.cssSelector(THIRD_COMMON_LOCATOR_LABEL));
  public static final Target LBL_NEXT_PAYMENT_CREDISERVICE =
      Target.the("Label de Próximo pago crediservice")
          .located(By.cssSelector(FOURTH_COMMON_LABEL_AVAILABLE));
  public static final Target LBL_APPROVED_QUOTA_CREDISERVICE =
      Target.the("Label de cupo aprovado crediservice")
          .located(By.cssSelector(FIRST_COMMON_LOCATOR_LABEL));
  public static final Target LBL_QUOTA_USED_CREDISERVICE =
      Target.the("Label de cupo utilizado crediservice")
          .located(By.cssSelector(FIFTH_COMMON_LOCATOR_LABEL));
  public static final Target LBL_TOTAL_PAYMENT_CREDISERVICE =
      Target.the("Label de pago total").located(By.cssSelector(SIXTH_COMMON_LOCATOR_LABEL));
  public static final Target LBL_QUOTA_SHOPPING =
      Target.the("Label de cupo de compras con TC")
          .located(By.cssSelector(SECOND_COMMON_LOCATOR_LABEL));
  public static final Target LBL_TOTAL_QUOTA_TC =
      Target.the("Label de cupo total TC").located(By.cssSelector(FIRST_COMMON_LOCATOR_LABEL));
  public static final Target LBL_ADVANCE_QUOTA_TC =
      Target.the("Label de cupo de avances con TC")
          .located(By.cssSelector(FIFTH_COMMON_LOCATOR_LABEL));
  public static final Target LBL_TOTAL_PAYMENT_TC =
      Target.the("Label de pago total TC").located(By.cssSelector(SIXTH_COMMON_LOCATOR_LABEL));
  public static final Target LBL_TOTAL_VALUE_CDT =
      Target.the("Label de valor total CDT").located(By.cssSelector(THIRD_COMMON_LOCATOR_LABEL));
  public static final Target LBL_EXPIRATION_DATE_CDT =
      Target.the("Label de fecha de expiración de CDT")
          .located(By.cssSelector(FOURTH_COMMON_LABEL_AVAILABLE));
  public static final Target LBL_OVERDRAFT_DAYS_CURRENT =
      Target.the("Label de Días en sobre giro cuenta corriente")
          .located(By.cssSelector(FIRST_COMMON_LOCATOR_LABEL));
  public static final Target LBL_OVERDRAFT_USED_CURRENT =
      Target.the("Label de sobre giro usado cuenta corriente")
          .located(By.cssSelector(FIFTH_COMMON_LOCATOR_LABEL));
  public static final Target LBL_OVERDRAFT_QUOTA_CURRENT =
      Target.the("Label de cupo de sobre giro cuenta corriente")
          .located(By.cssSelector(SIXTH_COMMON_LOCATOR_LABEL));
  public static final Target LBL_EXCHANGE_BALANCE_CURRENT =
      Target.the("Label de saldo en canje cuenta corriente")
          .located(By.cssSelector(".header-detail__available__label.ng-star-inserted"));
  public static final Target LBL_EXCHANGE_BALANCE_AFC =
      Target.the("Label de saldo en canje AFC")
          .located(By.cssSelector(".header-detail__available__label.ng-star-inserted"));
  public static final Target LBL_EXCHANGE_BALANCE_SAVINGS =
      Target.the("Label de saldo en canje cuenta ahorros")
          .located(By.cssSelector(FIFTH_COMMON_LOCATOR_LABEL));
  public static final Target LBL_TOTAL_BALANCE_CURRENT =
      Target.the("Label de saldo total cuenta corriente")
          .located(By.cssSelector(SEVENTH_COMMON_LOCATOR_LABEL));
  public static final Target LBL_TOTAL_BALANCE_SAVINGS =
      Target.the("Label de saldo total cuenta ahorros")
          .located(By.cssSelector(SEVENTH_COMMON_LOCATOR_LABEL));
  public static final Target LBL_TOTAL_BALANCE_TRUST =
      Target.the("Label de saldo total fiducia")
          .located(By.cssSelector(SECOND_COMMON_LOCATOR_LABEL));
  public static final Target LBL_BALANCE_AVAILABLE_TRUST =
      Target.the("Label de saldo disponible fiducia")
          .located(By.cssSelector(THIRD_COMMON_LOCATOR_LABEL));
  public static final Target LBL_EXCHANGE_BALANCE_TRUST =
      Target.the("Label de saldo en canje fiducia")
          .located(By.cssSelector(FOURTH_COMMON_LABEL_AVAILABLE));
  public static final Target LBL_TOTAL_BALANCE_AFC =
      Target.the("Label de saldo total AFC").located(By.cssSelector(SEVENTH_COMMON_LOCATOR_LABEL));
  public static final Target LBL_TOTAL_PAYMENT_LEASING =
      Target.the("Label de pago total leasing")
          .located(By.cssSelector(SECOND_COMMON_LOCATOR_LABEL));
  public static final Target LBL_MINIMUM_PAYMENT_LEASING =
      Target.the("Label de pago mínimo leasing")
          .located(By.cssSelector(THIRD_COMMON_LOCATOR_LABEL));
  public static final Target LBL_NEXT_PAYMENT_LEASING =
      Target.the("Label de Próximo pago de leasing")
          .located(By.cssSelector(FOURTH_COMMON_LABEL_AVAILABLE));
  public static final Target LBL_AMOUNT_APPROVED_LEASING =
      Target.the("Label de monto aprobado leasing")
          .located(By.cssSelector(FIRST_COMMON_LOCATOR_LABEL));
  public static final Target LBL_TOTAL_PAYMENT_LIBRANZA =
      Target.the("Label de pago total libranza")
          .located(By.cssSelector(SECOND_COMMON_LOCATOR_LABEL));
  public static final Target LBL_MINIMUM_PAYMENT_LIBRANZA =
      Target.the("Label de pago mínimo libranza")
          .located(By.cssSelector(THIRD_COMMON_LOCATOR_LABEL));
  public static final Target LBL_AMOUNT_APPROVED_LIBRANZA =
      Target.the("Label de monto aprobado libranza")
          .located(By.cssSelector(FIRST_COMMON_LOCATOR_LABEL));
  public static final Target LBL_NUMBER_ACCOUNT_PRODUCT =
      Target.the("número de cuenta en saldos detallado")
          .located(By.cssSelector(".header__card .header__card__number"));
  public static final Target LBL_PRODUCT_NAME =
      Target.the("Label nombre del producto en saldos detallado")
          .located(By.cssSelector(".header__available-balance__name-product__label"));
  public static final Target SWIPE_HEADER =
      Target.the("scroll swipe").located(By.cssSelector(".swiper-wrapper .swiper-slide-next"));
  public static final Target OPT_PAYMENT =
      Target.the("opción de redirección a pagos")
          .located(By.cssSelector(".card__options__items #Pagar"));
  public static final Target OPT_TRANSFER =
      Target.the("opción de redirección a transferencias")
          .located(By.cssSelector(".card__options__items #Transferir"));
  public static final Target OPT_WITDRAWAL =
      Target.the("opción de redirección a retirar")
          .located(By.cssSelector(".card__options__items #Retirar"));
  public static final Target OPT_CARDS =
      Target.the("opción de redirección a Tus tarjetas")
          .located(By.cssSelector(".card__options__items #Tus tarjetas"));
  public static final Target OPT_TO_SHARE =
      Target.the("opción de redirección a Compartir")
          .located(By.cssSelector(".card__options__items #Compartir"));
  public static final Target OPT_OTHER_OPTIONS =
      Target.the("opción de redirección a otras opciones")
          .located(By.cssSelector(".card__options__items #product-detail_more-options_button"));
  public static final Target OPT_DOCUMENTS =
      Target.the("opción de redirección a documentos")
          .located(By.cssSelector(".card__options__items #Documentos"));
  public static final Target OPT_MOVEMENTS =
      Target.the("opción de redirección a movimientos")
          .located(By.cssSelector(".card__options__items #Movimientos"));
  public static final Target OPT_ADVANCE =
      Target.the("opción de redirección a avance TC")
          .located(By.cssSelector(".card__options__items #Avance"));
  public static final Target OPT_INVEST =
      Target.the("opción de redirección a invertir")
          .located(By.cssSelector(".card__options__items #Invertir"));
  public static final Target OPT_PAYOFF =
      Target.the("opción de redirección a redimir tu plus")
          .located(By.cssSelector(".content-body__card__item__label"));
  public static final Target OPT_FREEZE =
      Target.the("opción de redirección a Congelar")
          .located(By.cssSelector(".card__options__items #Congelar"));
  public static final Target FIRST_HEADER_SWIPE =
      Target.the("Objeto para hacer swipe")
          .located(By.cssSelector(".header-detail__info.ng-star-inserted"));
  public static final Target SECOND_HEADER_SWIPE =
      Target.the("Objeto para hacer swipe").located(By.cssSelector("div.header-detail__available"));
  public static final Target LBL_POINT_AVAILABLE =
      Target.the("Label de puntos disponibles TuPlus")
          .located(By.cssSelector(".header-card__label"));
}
