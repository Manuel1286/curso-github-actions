package tasks.dashboard;

import exceptions.NotAccordionOptionException;
import interactions.Charge;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.targets.Target;

import java.util.Arrays;

import static constants.ConstantsDetailedBalance.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static ui.dashboard.BalanceDetailProductPage.*;
import static ui.login.DeviceControlPage.ICON_CHARGE;


public class SelectShortcutTask {

    enum OptionShortcut {

        PAYMENT(LBL_PAYMENT) {
            public Target shortcutOptions() {
                return OPT_PAYMENT;
            }
        },
        TRANSFER(LBL_TRANSFER) {
            public Target shortcutOptions() {
                return OPT_TRANSFER;
            }
        },
        WITDRAWAL(LBL_WITDRAWAL) {
            public Target shortcutOptions() {
                return OPT_WITDRAWAL;
            }
        },
        DOCUMENTS(LBL_DOCUMENTS) {
            public Target shortcutOptions() {
                return OPT_DOCUMENTS;
            }
        },
        MOVEMENTS(LBL_MOVEMENTS) {
            public Target shortcutOptions() {
                return OPT_MOVEMENTS;
            }
        },
        ADVANCE(LBL_ADVANCE) {
            public Target shortcutOptions() {
                return OPT_ADVANCE;
            }
        },
        INVEST(LBL_INVEST) {
            public Target shortcutOptions() {
                return OPT_INVEST;
            }
        },
        FREEZE(LBL_FREEZE) {
            public Target shortcutOptions() {
                return OPT_FREEZE;
            }
        },
        CARDS(LBL_CARDS) {
            public Target shortcutOptions() {
                return OPT_CARDS;
            }
        },
        TOSHARE(LBL_TO_SHARE) {
            public Target shortcutOptions() {
                return OPT_TO_SHARE;
            }
        },
        MOREOPTIONS(LBL_MORE_OPTIONS) {
            public Target shortcutOptions() {
                return OPT_OTHER_OPTIONS;
            }
        },
        PAYOFF(LBL_PAYOFF) {
            public Target shortcutOptions() {
                return OPT_PAYOFF;
            }
        };

        public final String shortcutOption;

        private OptionShortcut(String optionShortcut) {
            this.shortcutOption = optionShortcut;
        }

        public String getShortcutOption() {
            return shortcutOption;
        }

        public abstract Target shortcutOptions();


        public static OptionShortcut fromShortcutName(String shortcutName) {
            return Arrays.stream(values())
                .filter(menuDashboard -> menuDashboard.shortcutOption.equals(shortcutName))
                .findFirst()
                .orElseThrow(() -> new NotAccordionOptionException(shortcutName));
        }
    }


    public static void initShortcutOption(String shortcutName) {
        OptionShortcut optionShortcut = OptionShortcut.fromShortcutName(shortcutName);
        OnStage
            .theActorInTheSpotlight()
            .attemptsTo(
               Click.on(optionShortcut.shortcutOptions()),
                Check.whether(the(ICON_CHARGE), isVisible()).andIfSo(
                    Charge.icon()
                )
            );
    }



}
