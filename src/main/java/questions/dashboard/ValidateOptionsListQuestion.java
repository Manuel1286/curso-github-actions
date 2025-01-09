package questions.dashboard;

import static constants.ConstantLogin.ADVANCE;
import static constants.ConstantLogin.CARDLESS_WITHDRAWALS;
import static constants.ConstantLogin.DOWNLOAD_DOCUMENTS1;
import static constants.ConstantLogin.DOWNLOAD_EXTRACTS;
import static constants.ConstantLogin.INVEST;
import static constants.ConstantLogin.MAKE_PAYMENT;
import static constants.ConstantLogin.MAKE_PAYMENTS;
import static constants.ConstantLogin.MAKE_TRANSFER;
import static constants.ConstantLogin.MAKE_TRANSFERS;
import static constants.ConstantLogin.PAYMENT_OF_SERVICES;
import static constants.ConstantLogin.SEARCH_MOVEMENTS;
import static constants.ConstantLogin.SEE_DETAIL;
import static constants.ConstantLogin.TRANSFER_ACCOUNT;
import static constants.ConstantLogin.WITHDRAW;
import static ui.dashboard.DashExternalOptionsPage.ADVANCE_LABEL;
import static ui.dashboard.DashExternalOptionsPage.CARDLESS_WITHDRAWALS_LABEL;
import static ui.dashboard.DashExternalOptionsPage.DOWNLOAD_DOCUMENTS;
import static ui.dashboard.DashExternalOptionsPage.DOWNLOAD_EXTRACTS_LABEL;
import static ui.dashboard.DashExternalOptionsPage.INVEST_LABEL;
import static ui.dashboard.DashExternalOptionsPage.MAKE_PAYMENTS_LABEL;
import static ui.dashboard.DashExternalOptionsPage.MAKE_PAYMENT_LABEL;
import static ui.dashboard.DashExternalOptionsPage.MAKE_TRANSFERS_LABEL;
import static ui.dashboard.DashExternalOptionsPage.MAKE_TRANSFER_LABEL;
import static ui.dashboard.DashExternalOptionsPage.SEARCH_MOVEMENTS_LABEL;
import static ui.dashboard.DashExternalOptionsPage.SEE_DETAIL_LABEL;
import static ui.dashboard.DashExternalOptionsPage.SERVICES_PAY;
import static ui.dashboard.DashExternalOptionsPage.TRANSFER_TO_ACCOUNT;
import static ui.dashboard.DashExternalOptionsPage.WITHDRAW_LABEL;

import exceptions.NotFoundProductOptions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.targets.Target;
import questions.CommonQuestions;

public class ValidateOptionsListQuestion implements Question<Boolean> {

  private final String product;

  public ValidateOptionsListQuestion(String product) {
    this.product = product;
  }

  @Override
  public Boolean answeredBy(Actor actor) {

    switch (product) {
      case "Cuenta de Ahorros":
        verifyOptions(actor, SEE_DETAIL_LABEL, SEE_DETAIL);
        verifyOptions(actor, TRANSFER_TO_ACCOUNT, TRANSFER_ACCOUNT);
        verifyOptions(actor, SERVICES_PAY, PAYMENT_OF_SERVICES);
        verifyOptions(actor, CARDLESS_WITHDRAWALS_LABEL, CARDLESS_WITHDRAWALS);
        verifyOptions(actor, DOWNLOAD_EXTRACTS_LABEL, DOWNLOAD_EXTRACTS);
        verifyOptions(actor, SEARCH_MOVEMENTS_LABEL, SEARCH_MOVEMENTS);
        return true;
      case "Cuenta Corriente":
        verifyOptions(actor, SEE_DETAIL_LABEL, SEE_DETAIL);
        verifyOptions(actor, MAKE_PAYMENTS_LABEL, MAKE_PAYMENTS);
        verifyOptions(actor, MAKE_TRANSFERS_LABEL, MAKE_TRANSFERS);
        verifyOptions(actor, DOWNLOAD_DOCUMENTS, DOWNLOAD_DOCUMENTS1);
        verifyOptions(actor, SEARCH_MOVEMENTS_LABEL, SEARCH_MOVEMENTS);
        return true;
      case "Tarjeta Crédito":
        verifyOptions(actor, SEE_DETAIL_LABEL, SEE_DETAIL);
        verifyOptions(actor, MAKE_PAYMENT_LABEL, MAKE_PAYMENT);
        verifyOptions(actor, ADVANCE_LABEL, ADVANCE);
        verifyOptions(actor, DOWNLOAD_DOCUMENTS, DOWNLOAD_DOCUMENTS1);
        verifyOptions(actor, SEARCH_MOVEMENTS_LABEL, SEARCH_MOVEMENTS);
        return true;
      case "Leasing":
      case "crédito de Vivienda":
        verifyOptions(actor, SEE_DETAIL_LABEL, SEE_DETAIL);
        verifyOptions(actor, MAKE_PAYMENT_LABEL, MAKE_PAYMENT);
        verifyOptions(actor, DOWNLOAD_DOCUMENTS, DOWNLOAD_DOCUMENTS1);
        verifyOptions(actor, SEARCH_MOVEMENTS_LABEL, SEARCH_MOVEMENTS);
        return true;
      case "Crediservice":
        verifyOptions(actor, SEE_DETAIL_LABEL, SEE_DETAIL);
        verifyOptions(actor, MAKE_PAYMENT_LABEL, MAKE_PAYMENT);
        verifyOptions(actor, MAKE_TRANSFER_LABEL, MAKE_TRANSFER);
        verifyOptions(actor, DOWNLOAD_DOCUMENTS, DOWNLOAD_DOCUMENTS1);
        verifyOptions(actor, SEARCH_MOVEMENTS_LABEL, SEARCH_MOVEMENTS);
        return true;
      case "FIC":
        verifyOptions(actor, SEE_DETAIL_LABEL, SEE_DETAIL);
        verifyOptions(actor, INVEST_LABEL, INVEST);
        verifyOptions(actor, WITHDRAW_LABEL, WITHDRAW);
        verifyOptions(actor, DOWNLOAD_DOCUMENTS, DOWNLOAD_DOCUMENTS1);
        return true;
      case "AFC":
      case "Crédito Libranza":
        verifyOptions(actor, SEE_DETAIL_LABEL, SEE_DETAIL);
        verifyOptions(actor, DOWNLOAD_DOCUMENTS, DOWNLOAD_DOCUMENTS1);
        verifyOptions(actor, SEARCH_MOVEMENTS_LABEL, SEARCH_MOVEMENTS);
        return true;
      case "CDT":
        verifyOptions(actor, SEE_DETAIL_LABEL, SEE_DETAIL);
        verifyOptions(actor, DOWNLOAD_DOCUMENTS, DOWNLOAD_DOCUMENTS1);
        return true;
      default:
        throw new NotFoundProductOptions(product);
    }
  }

  private void verifyOptions(Actor actor, Target option, String text) {
    actor.attemptsTo(Scroll.to(option));
    CommonQuestions.textEquals(option, text);
  }

  public static ValidateOptionsListQuestion validateOptionsList(String product) {
    return new ValidateOptionsListQuestion(product);
  }
}
