package questions;

import static constants.ConstantsDetailedBalance.LBL_ADVANCE;
import static constants.ConstantsDetailedBalance.LBL_DOCUMENTS;
import static constants.ConstantsDetailedBalance.LBL_FREEZE;
import static constants.ConstantsDetailedBalance.LBL_INVEST;
import static constants.ConstantsDetailedBalance.LBL_MOVEMENTS;
import static constants.ConstantsDetailedBalance.LBL_PAYMENT;
import static constants.ConstantsDetailedBalance.LBL_PAYOFF;
import static constants.ConstantsDetailedBalance.LBL_TRANSFER;
import static constants.ConstantsDetailedBalance.LBL_WITDRAWAL;
import static constants.ConstantsDetailedBalance.OPT_PRODUCT_AFC;
import static constants.ConstantsDetailedBalance.OPT_PRODUCT_CDT;
import static constants.ConstantsDetailedBalance.OPT_PRODUCT_CREDISERVICE;
import static constants.ConstantsDetailedBalance.OPT_PRODUCT_CREDITCARD;
import static constants.ConstantsDetailedBalance.OPT_PRODUCT_CURRENT;
import static constants.ConstantsDetailedBalance.OPT_PRODUCT_LEASING;
import static constants.ConstantsDetailedBalance.OPT_PRODUCT_LIBRANZA;
import static constants.ConstantsDetailedBalance.OPT_PRODUCT_LOAN;
import static constants.ConstantsDetailedBalance.OPT_PRODUCT_SAVINGS;
import static constants.ConstantsDetailedBalance.OPT_PRODUCT_TRUST;
import static constants.ConstantsDetailedBalance.OPT_PRODUCT_TUPLUS;
import static questions.CommonQuestions.textEquals;
import static ui.dashboard.BalanceDetailProductPage.OPT_ADVANCE;
import static ui.dashboard.BalanceDetailProductPage.OPT_DOCUMENTS;
import static ui.dashboard.BalanceDetailProductPage.OPT_FREEZE;
import static ui.dashboard.BalanceDetailProductPage.OPT_INVEST;
import static ui.dashboard.BalanceDetailProductPage.OPT_MOVEMENTS;
import static ui.dashboard.BalanceDetailProductPage.OPT_PAYMENT;
import static ui.dashboard.BalanceDetailProductPage.OPT_PAYOFF;
import static ui.dashboard.BalanceDetailProductPage.OPT_TRANSFER;
import static ui.dashboard.BalanceDetailProductPage.OPT_WITDRAWAL;

import exceptions.NotFoundProductOptions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidateDataProductQuestion implements Question<Boolean> {

  private final String productName;

  public ValidateDataProductQuestion(String productName) {
    this.productName = productName;
  }

  @Override
  public Boolean answeredBy(Actor actor) {

    switch (productName) {
      case OPT_PRODUCT_SAVINGS:
        textEquals(OPT_TRANSFER, LBL_TRANSFER);
        textEquals(OPT_WITDRAWAL, LBL_WITDRAWAL);
        return true;
      case OPT_PRODUCT_CURRENT:
        textEquals(OPT_TRANSFER, LBL_TRANSFER);
        textEquals(OPT_MOVEMENTS, LBL_MOVEMENTS);
        textEquals(OPT_PAYMENT, LBL_PAYMENT);
        textEquals(OPT_DOCUMENTS, LBL_DOCUMENTS);
        return true;
      case OPT_PRODUCT_CREDISERVICE:
        textEquals(OPT_PAYMENT, LBL_PAYMENT);
        textEquals(OPT_TRANSFER, LBL_TRANSFER);
        textEquals(OPT_MOVEMENTS, LBL_MOVEMENTS);
        textEquals(OPT_DOCUMENTS, LBL_DOCUMENTS);
        return true;
      case OPT_PRODUCT_AFC:
      case OPT_PRODUCT_LEASING:
        textEquals(OPT_MOVEMENTS, LBL_MOVEMENTS);
        textEquals(OPT_DOCUMENTS, LBL_DOCUMENTS);
        return true;
      case OPT_PRODUCT_CREDITCARD:
        textEquals(OPT_PAYMENT, LBL_PAYMENT);
        textEquals(OPT_ADVANCE, LBL_ADVANCE);
        textEquals(OPT_DOCUMENTS, LBL_DOCUMENTS);
        textEquals(OPT_FREEZE, LBL_FREEZE);
        return true;
      case OPT_PRODUCT_CDT:
        return true;
      case OPT_PRODUCT_TRUST:
        textEquals(OPT_INVEST, LBL_INVEST);
        textEquals(OPT_WITDRAWAL, LBL_WITDRAWAL);
        textEquals(OPT_DOCUMENTS, LBL_DOCUMENTS);
        return true;
      case OPT_PRODUCT_LIBRANZA:
      case OPT_PRODUCT_LOAN:
        textEquals(OPT_DOCUMENTS, LBL_DOCUMENTS);
        textEquals(OPT_MOVEMENTS, LBL_MOVEMENTS);
        return true;
      case OPT_PRODUCT_TUPLUS:
        textEquals(OPT_PAYOFF, LBL_PAYOFF);
        return true;
      default:
        throw new NotFoundProductOptions(productName);
    }
  }

  public static ValidateDataProductQuestion validateDataProduct(String product) {
    return new ValidateDataProductQuestion(product);
  }
}
