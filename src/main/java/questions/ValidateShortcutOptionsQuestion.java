package questions;

import static constants.ConstantsDetailedBalance.LBL_ADVANCE;
import static constants.ConstantsDetailedBalance.LBL_DOCUMENTS;
import static constants.ConstantsDetailedBalance.LBL_MOVEMENTS;
import static constants.ConstantsDetailedBalance.LBL_PAYMENT;
import static constants.ConstantsDetailedBalance.LBL_PRODUCT_TRUST;
import static constants.ConstantsDetailedBalance.LBL_TRANSFER;
import static constants.ConstantsDetailedBalance.LBL_WITDRAWAL;
import static constants.ConstantsMovements.AFC;
import static constants.ConstantsMovements.LBL_FILTER_AMOUNT;
import static constants.ConstantsMovements.LBL_FILTER_DATE;
import static constants.ConstantsMovements.LBL_FILTER_WORD;
import static constants.ConstantsShortcut.LBL_ACCORDION_ABSTRACT;
import static constants.ConstantsShortcut.LBL_ACCORDION_ADVANCE_TC;
import static constants.ConstantsShortcut.LBL_ACCORDION_CERTIFICATE;
import static constants.ConstantsShortcut.LBL_ACCORDION_CREDITS;
import static constants.ConstantsShortcut.LBL_ACCORDION_CREDIT_CARD;
import static constants.ConstantsShortcut.LBL_ACCORDION_DONATION;
import static constants.ConstantsShortcut.LBL_ACCORDION_HISTORY;
import static constants.ConstantsShortcut.LBL_ACCORDION_PAYROLL;
import static constants.ConstantsShortcut.LBL_ACCORDION_RECHARGES;
import static constants.ConstantsShortcut.LBL_ACCORDION_REFERENCE;
import static constants.ConstantsShortcut.LBL_ACCORDION_SERVICES;
import static constants.ConstantsShortcut.LBL_ACCORDION_TAXES;
import static constants.ConstantsShortcut.LBL_ACCORDION_WITHDRAWAL;
import static constants.ConstantsShortcut.LBL_ACCOUNT;
import static constants.ConstantsShortcut.LBL_HEADER_BETWEEN_ACCOUNTS;
import static constants.ConstantsShortcut.LBL_HEADER_DOCUMENTS;
import static constants.ConstantsShortcut.LBL_HEADER_LBL_ADVANCE;
import static constants.ConstantsShortcut.LBL_HEADER_PAYMENTS;
import static constants.ConstantsShortcut.LBL_TAG_AVAL;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.stateOf;
import static ui.dashboard.MovementsPage.LBL_PRODUCT_NAME;
import static ui.dashboard.MovementsPage.LBL_PRODUCT_NUMBER;
import static ui.dashboard.MovementsPage.OPT_FILTER_AMOUNT;
import static ui.dashboard.MovementsPage.OPT_FILTER_DATE;
import static ui.dashboard.MovementsPage.OPT_FILTER_WORD;
import static ui.documents.DocumentPage.HOST_OPT_EXTRACTS;
import static ui.documents.DocumentPage.HOST_OPT_REFERENCES;
import static ui.documents.DocumentPage.HOST_OPT_STATEMENTS;
import static ui.documents.DocumentPage.LBL_HEADER_DOCUMENT_ACCORDION;
import static ui.documents.DocumentPage.SHADOW_OPT_EXTRACTS;
import static ui.documents.DocumentPage.SHADOW_OPT_REFERENCES;
import static ui.documents.DocumentPage.SHADOW_OPT_STATEMENTS;
import static ui.payments.PaymentHistoryPage.OPT_HISTORY_ACCORDION;
import static ui.payments.PaymentPage.LBL_HEADER_ACCORDION;
import static ui.payments.PaymentPage.LBL_HEADER_ACCORDION_ADVANCE;
import static ui.payments.PaymentPage.LBL_HEADER_ACCORDION_PAYMENTS;
import static ui.payments.PaymentPage.OPT_CREDIT_ACCORDION;
import static ui.payments.PaymentPage.OPT_SERVICES_ACCORDION;
import static ui.payments.PaymentPage.OPT_TC_ACCORDION;
import static ui.payments.PaymentPage.TITLE_PRODUCT_DETAIL_ELEMENT_PAYMENT;
import static ui.payments.PaymentPage.TITLE_PRODUCT_DETAIL_HOST_PAYMENT;
import static ui.payments.PaymentPage.TXT_PRODUCT_DETAIL_ELEMENT_PAYMENT;
import static ui.payments.PaymentPayrollPage.OPT_PAYROLL_CARDS;
import static ui.payments.PaymentRechargePage.RECHARGES_ACCORDION;
import static ui.payments.PaymentTaxesPage.OPT_TAXES_ACCORDION;
import static ui.transfer.TransferAdvancePage.TITLE_PRODUCT_DETAIL_ELEMENT_ADVANCE;
import static ui.transfer.TransferAdvancePage.TITLE_PRODUCT_DETAIL_HOST_ADVANCE;
import static ui.transfer.TransferAdvancePage.TXT_PRODUCT_DETAIL_ELEMENT_ADVANCE;
import static ui.transfer.TransferBetweenAccountsPage.OPT_ADVANCE_CREDITCARD_ACCORDION;
import static ui.transfer.TransferCreditUsePage.TITLE_PRODUCT_DETAIL_ELEMENT_TRANSFER;
import static ui.transfer.TransferCreditUsePage.TITLE_PRODUCT_DETAIL_HOST_TRANSFER;
import static ui.transfer.TransferCreditUsePage.TXT_PRODUCT_DETAIL_ELEMENT_TRANSFER;
import static ui.transfer.TransferDonationPage.OPT_DONATION_ACCORDION;
import static ui.transfer.TransferHistoryPage.OPT_TAG_AVAL;
import static ui.transfer.TransferHistoryPage.OPT_TRANSFER_HISTORY_ACCORDION;
import static ui.transfer.TransferTransfiYaPage.OPT_BETWEEN_ACCOUNTS;
import static ui.transfer.TransferTrustPage.TITLE_PRODUCT_DETAIL_ELEMENT_TRUST;
import static ui.transfer.TransferTrustPage.TITLE_PRODUCT_DETAIL_HOST_TRUST;
import static ui.transfer.TransferTrustPage.TXT_PRODUCT_DETAIL_ELEMENT_TRUST;
import static ui.transfer.TransferWithdrawalPage.OPT_WITHDRAWAL_ACCORDION;

import interactions.Security;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.Wait;
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
    String labelProductAccounts = LBL_ACCOUNT;

    try {
      switch (shortcutOption) {
        case LBL_PAYMENT:
          if (product.contains(labelProductAccounts)) {
            CommonQuestions.textEquals(LBL_HEADER_ACCORDION_PAYMENTS, LBL_HEADER_PAYMENTS);
            CommonQuestions.textEquals(OPT_TC_ACCORDION, LBL_ACCORDION_CREDIT_CARD);
            CommonQuestions.textEquals(OPT_CREDIT_ACCORDION, LBL_ACCORDION_CREDITS);
            CommonQuestions.textEquals(RECHARGES_ACCORDION, LBL_ACCORDION_RECHARGES);
            CommonQuestions.textEquals(OPT_SERVICES_ACCORDION, LBL_ACCORDION_SERVICES);
            CommonQuestions.textEquals(OPT_TAXES_ACCORDION, LBL_ACCORDION_TAXES);
            CommonQuestions.textEquals(OPT_PAYROLL_CARDS, LBL_ACCORDION_PAYROLL);
            CommonQuestions.textEquals(OPT_HISTORY_ACCORDION, LBL_ACCORDION_HISTORY);
          } else {
            CommonQuestions.compareTextVsText(
                ShadowRoot.getTextOfElementInsideOneShadowRoot(
                    TITLE_PRODUCT_DETAIL_HOST_PAYMENT, TITLE_PRODUCT_DETAIL_ELEMENT_PAYMENT),
                product);
            CommonQuestions.compareTextVsText(
                ShadowRoot.getTextOfElementInsideOneShadowRoot(
                    TITLE_PRODUCT_DETAIL_HOST_PAYMENT, TXT_PRODUCT_DETAIL_ELEMENT_PAYMENT),
                productNumber);
          }
          break;

        case LBL_TRANSFER:
          if (product.contains(labelProductAccounts)) {
            CommonQuestions.textEquals(OPT_WITHDRAWAL_ACCORDION, LBL_ACCORDION_WITHDRAWAL);
            CommonQuestions.textEquals(OPT_ADVANCE_CREDITCARD_ACCORDION, LBL_ACCORDION_ADVANCE_TC);
            CommonQuestions.textEquals(OPT_BETWEEN_ACCOUNTS, LBL_HEADER_BETWEEN_ACCOUNTS);
            CommonQuestions.textEquals(OPT_DONATION_ACCORDION, LBL_ACCORDION_DONATION);
            CommonQuestions.textEquals(OPT_TAG_AVAL, LBL_TAG_AVAL);
            CommonQuestions.textEquals(OPT_TRANSFER_HISTORY_ACCORDION, LBL_ACCORDION_HISTORY);
          } else {
            CommonQuestions.compareTextVsText(
                ShadowRoot.getTextOfElementInsideOneShadowRoot(
                    TITLE_PRODUCT_DETAIL_HOST_TRANSFER, TITLE_PRODUCT_DETAIL_ELEMENT_TRANSFER),
                product);
            CommonQuestions.compareTextVsText(
                ShadowRoot.getTextOfElementInsideOneShadowRoot(
                    TITLE_PRODUCT_DETAIL_HOST_TRANSFER, TXT_PRODUCT_DETAIL_ELEMENT_TRANSFER),
                productNumber);
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
            actor.attemptsTo(
                Wait.until(stateOf(LBL_PRODUCT_NAME), isVisible()).forNoMoreThan(15).seconds());
            CommonQuestions.textEquals(LBL_PRODUCT_NAME, product);
            CommonQuestions.textEquals(LBL_PRODUCT_NUMBER, productNumber);
          }
          break;
        case LBL_ADVANCE:
          CommonQuestions.textEquals(LBL_HEADER_ACCORDION_ADVANCE, LBL_HEADER_LBL_ADVANCE);
          CommonQuestions.compareTextVsText(
              ShadowRoot.getTextOfElementInsideOneShadowRoot(
                  TITLE_PRODUCT_DETAIL_HOST_ADVANCE, TITLE_PRODUCT_DETAIL_ELEMENT_ADVANCE),
              product);
          CommonQuestions.compareTextVsText(
              ShadowRoot.getTextOfElementInsideOneShadowRoot(
                  TITLE_PRODUCT_DETAIL_HOST_ADVANCE, TXT_PRODUCT_DETAIL_ELEMENT_ADVANCE),
              productNumber);
          break;
        case LBL_WITDRAWAL:
          if (product.contains(LBL_PRODUCT_TRUST)) {
            CommonQuestions.compareTextVsText(
                ShadowRoot.getTextOfElementInsideOneShadowRoot(
                    TITLE_PRODUCT_DETAIL_HOST_TRUST, TITLE_PRODUCT_DETAIL_ELEMENT_TRUST),
                product);
            CommonQuestions.compareTextVsText(
                ShadowRoot.getTextOfElementInsideOneShadowRoot(
                    TITLE_PRODUCT_DETAIL_HOST_TRUST, TXT_PRODUCT_DETAIL_ELEMENT_TRUST),
                productNumber);
          } else {
            actor.attemptsTo(Security.action());

            CommonQuestions.textEquals(LBL_HEADER_ACCORDION, LBL_ACCORDION_WITHDRAWAL);
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
