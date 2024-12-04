package questions;


import exceptions.NotFoundProductOptions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Scroll;

import static constants.ConstantsDetailedBalance.*;
import static constants.ConstantsDetailedBalanceSwipeHeader.*;
import static questions.CommonQuestions.textEquals;
import static ui.dashboard.BalanceDetailProductPage.*;

public class ValidateDataProductSwipeQuestion implements Question<Boolean> {

    private final String productName;

    public ValidateDataProductSwipeQuestion(String productName) {
        this.productName = productName;
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        switch (productName) {
            case OPT_PRODUCT_CURRENT:
                textEquals(LBL_BALANCE_AVAILABLE_CURRENT, LBL_BALANCE_AVAILABLE);
                textEquals(LBL_TOTAL_BALANCE_CURRENT, LBL_TOTAL_BALANCE);
                textEquals(LBL_EXCHANGE_BALANCE_CURRENT, LBL_EXCHANGE_BALANCE);
                textEquals(LBL_OVERDRAFT_DAYS_CURRENT, LBL_OVERDRAFT_DAYS);
                textEquals(LBL_OVERDRAFT_USED_CURRENT, LBL_OVERDRAFT_USED);
                textEquals(LBL_OVERDRAFT_QUOTA_CURRENT, LBL_OVERDRAFT_QUOTA);
                return true;

            case OPT_PRODUCT_AFC:
                textEquals(LBL_BALANCE_AVAILABLE_AFC, LBL_BALANCE_AVAILABLE);
                actor.attemptsTo(
                        Scroll.to(SECOND_HEADER_SWIPE)
                );
                textEquals(LBL_TOTAL_BALANCE_AFC, LBL_TOTAL_BALANCE);
                textEquals(LBL_EXCHANGE_BALANCE_AFC, LBL_EXCHANGE_BALANCE);
                return true;

            case OPT_PRODUCT_SAVINGS:
                textEquals(LBL_BALANCE_AVAILABLE_SAVINGS, LBL_BALANCE_AVAILABLE);
                textEquals(LBL_TOTAL_BALANCE_SAVINGS, LBL_TOTAL_BALANCE);
                textEquals(LBL_AVAILABLE_SAVINGS, LBL_AVAILABLE);
                textEquals(LBL_EXCHANGE_BALANCE_SAVINGS, LBL_EXCHANGE);
                return true;

            case OPT_PRODUCT_CREDISERVICE:
                textEquals(LBL_BALANCE_AVAILABLE_CREDISERVICE, LBL_BALANCE_AVAILABLE);
                textEquals(LBL_MINIMUM_PAYMENT_CREDISERVICE, LBL_MINIMUM_PAYMENT);
                textEquals(LBL_NEXT_PAYMENT_CREDISERVICE, LBL_NEXT_PAYMENT);
                textEquals(LBL_APPROVED_QUOTA_CREDISERVICE, LBL_APPROVED_QUOTA);
                textEquals(LBL_QUOTA_USED_CREDISERVICE, LBL_QUOTA_USED);
                textEquals(LBL_TOTAL_PAYMENT_CREDISERVICE, LBL_FULL_PAYMENT);
                return true;

            case OPT_PRODUCT_CREDITCARD:
                textEquals(LBL_QUOTA_SHOPPING, LBL_QUOTA_SHOPPING1);
                textEquals(LBL_MINIMUM_PAYMENT_CREDISERVICE, LBL_MINIMUM_PAYMENT);
                textEquals(LBL_TOTAL_QUOTA_TC, LBL_TOTAL_QUOTA);
                textEquals(LBL_ADVANCE_QUOTA_TC, LBL_ADVANCE_QUOTA);
                textEquals(LBL_TOTAL_PAYMENT_TC, LBL_FULL_PAYMENT);
                return true;

            case OPT_PRODUCT_CDT:
                textEquals(LBL_BALANCE_AVAILABLE_CURRENT, LBL_TOTAL_VALUE);
                textEquals(LBL_TOTAL_VALUE_CDT, LBL_PERFORMANCE);
                textEquals(LBL_EXPIRATION_DATE_CDT, LBL_EXPIRATION_DATE);
                return true;

            case OPT_PRODUCT_TRUST:
                textEquals(LBL_TOTAL_BALANCE_TRUST, LBL_TOTAL_BALANCE);
                textEquals(LBL_BALANCE_AVAILABLE_TRUST, LBL_BALANCE_AVAILABLE_TRUST1);
                textEquals(LBL_EXCHANGE_BALANCE_TRUST, LBL_EXCHANGE_BALANCE);
                return true;

            case OPT_PRODUCT_LOAN:
            case OPT_PRODUCT_LEASING:
                textEquals(LBL_TOTAL_PAYMENT_LEASING, LBL_FULL_PAYMENT);
                textEquals(LBL_MINIMUM_PAYMENT_LEASING, LBL_MINIMUM_PAYMENT);
                textEquals(LBL_NEXT_PAYMENT_LEASING, LBL_NEXT_PAYMENT);
                textEquals(LBL_AMOUNT_APPROVED_LEASING, LBL_AMOUNT_APPROVED);
                return true;

            case OPT_PRODUCT_TUPLUS:
                textEquals(LBL_POINT_AVAILABLE, LBL_ACCUMULATE_POINTS);
                return true;

            case OPT_PRODUCT_LIBRANZA:
                textEquals(LBL_TOTAL_PAYMENT_LIBRANZA, LBL_FULL_PAYMENT);
                textEquals(LBL_MINIMUM_PAYMENT_LIBRANZA, LBL_MINIMUM_PAYMENT);
                textEquals(LBL_AMOUNT_APPROVED_LIBRANZA, LBL_AMOUNT_APPROVED);
                return true;

            default:
                throw new NotFoundProductOptions(productName);
        }
    }

    public static ValidateDataProductSwipeQuestion validateDataProductSwipe(String product) {
        return new ValidateDataProductSwipeQuestion(product);
    }
}
