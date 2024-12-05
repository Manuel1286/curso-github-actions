package questions;

import static constants.ConstantsDetailedBalance.*;
import static constants.ConstantsMovements.*;
import static constants.ConstantsShortcut.*;
import static ui.dashboard.MovementsPage.*;
import static ui.dashboard.MovementsPage.LBL_PRODUCT_NAME;
import static ui.dashboard.MovementsPage.OPT_FILTER_DATE;
import static ui.documents.DocumentPage.*;
import static ui.payments.PaymentHistoryPage.*;
import static ui.payments.PaymentPage.*;
import static ui.payments.PaymentPayrollPage.*;
import static ui.payments.PaymentRechargePage.*;
import static ui.payments.PaymentTaxesPage.*;
import static ui.transfer.TransferBetweenAccountsPage.OPT_ADVANCE_CREDITCARD_ACCORDION;
import static ui.transfer.TransferDonationPage.OPT_DONATION_ACCORDION;
import static ui.transfer.TransferHistoryPage.OPT_TRANSFER_HISTORY_ACCORDION;
import static ui.transfer.TransferTransfiYaPage.OPT_ACCORDION_TY;
import static ui.transfer.TransferWithdrawalPage.OPT_WITHDRAWAL_ACCORDION;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actors.OnStage;
import utils.ShadowRoot;

public class ValidateShortcutOptionsQuestion implements Question<Boolean> {

  private final String shortcutOption;
  private final String product;
  private final String productNumber;

  public ValidateShortcutOptionsQuestion(
      String shortcutOption, String product, String productNumber) {
    this.shortcutOption = shortcutOption;
    this.product = product;
    this.productNumber = productNumber;
  }

  @Override
  public Boolean answeredBy(Actor actor) {
    String productOrigin = OnStage.theActorInTheSpotlight().recall(LBL_PRODUCT_NAME_CONST);
    String labelProductAccounts = LBL_ACCOUNT;

    try {
      switch (shortcutOption) {
        case LBL_PAYMENT:
          if (productOrigin.contains(labelProductAccounts)) {
            CommonQuestions.textEquals(LBL_HEADER_ACCORDION_PAYMENTS, LBL_HEADER_PAYMENTS);
            CommonQuestions.textEquals(OPT_TC_ACCORDION, LBL_ACCORDION_CREDIT_CARD);
            CommonQuestions.textEquals(OPT_CREDIT_ACCORDION, LBL_ACCORDION_CREDITS);
            CommonQuestions.textEquals(RECHARGES_ACCORDION, LBL_ACCORDION_RECHARGES);
            CommonQuestions.textEquals(OPT_SERVICES_ACCORDION, LBL_ACCORDION_SERVICES);
            CommonQuestions.textEquals(OPT_TAXES_ACCORDION, LBL_ACCORDION_TAXES);
            CommonQuestions.textEquals(OPT_PAYROLL_CARDS, LBL_ACCORDION_PAYROLL);
            CommonQuestions.textEquals(OPT_HISTORY_ACCORDION, LBL_ACCORDION_HISTORY);
          }
          break;

        case LBL_TRANSFER:
          if (productOrigin.contains(labelProductAccounts)) {
            CommonQuestions.textEquals(OPT_WITHDRAWAL_ACCORDION, LBL_ACCORDION_WITHDRAWAL);
            CommonQuestions.textEquals(OPT_ADVANCE_CREDITCARD_ACCORDION, LBL_ACCORDION_ADVANCE_TC);
            CommonQuestions.textEquals(OPT_ACCORDION_TY, LBL_ACCORDION_TRANSFIYA_ACCOUNTS);
            CommonQuestions.textEquals(OPT_DONATION_ACCORDION, LBL_ACCORDION_DONATION);
            CommonQuestions.textEquals(OPT_TRANSFER_HISTORY_ACCORDION, LBL_ACCORDION_HISTORY);
          }
          break;

        case LBL_DOCUMENTS:
          CommonQuestions.textEquals(LBL_HEADER_DOCUMENT_ACCORDION, LBL_HEADER_DOCUMENTS);
          CommonQuestions.compareTextVsText(
              ShadowRoot.getTextOfElementInsideOneShadowRoot(
                  HOST_OPT_EXTRACTS, SHADOW_OPT_EXTRACTS),
              LBL_ACCORDION_ABSTRACT);
          CommonQuestions.compareTextVsText(
              ShadowRoot.getTextOfElementInsideOneShadowRoot(
                  HOST_OPT_STATEMENTS, SHADOW_OPT_STATEMENTS),
              LBL_ACCORDION_CERTIFICATE);
          CommonQuestions.compareTextVsText(
              ShadowRoot.getTextOfElementInsideOneShadowRoot(
                  HOST_OPT_REFERENCES, SHADOW_OPT_REFERENCES),
              LBL_ACCORDION_REFERENCE);
          break;
        case LBL_MOVEMENTS:
          if (product.equalsIgnoreCase(AFC)) {
            CommonQuestions.textEquals(OPT_FILTER_WORD, LBL_FILTER_WORD);
            CommonQuestions.textEquals(OPT_FILTER_DATE, LBL_FILTER_DATE);
            CommonQuestions.textEquals(OPT_FILTER_AMOUNT, LBL_FILTER_AMOUNT);
          } else {
            CommonQuestions.textEquals(LBL_HEADER_ACCORDION, LBL_ACCORDION_MOVEMENTS);
            CommonQuestions.textEquals(LBL_PRODUCT_NAME, product);
            CommonQuestions.textEquals(LBL_PRODUCT_NUMBER, productNumber);
          }

          break;
        default:
          break;
      }
      return true;
    } catch (Exception e) {
      return false;
    }
  }

  public static ValidateShortcutOptionsQuestion validateShortcutOptions(
      String shortcut, String product, String productNumber) {
    return new ValidateShortcutOptionsQuestion(shortcut, product, productNumber);
  }
}
