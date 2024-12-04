package ui.transfer;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TransferDonationPage {
    private TransferDonationPage(){}

    public static final Target OPT_DONATION_ACCORDION = Target.the("opción de seleccionar la opción de Donaciones").locatedBy("#bdb-grid-item-5");
    public static final Target LBL_AGREEMENT_TELETON = Target.the("Label para seleccionar el convenio de Teletónn").locatedBy("#donation_entity_teleton_");
    public static final Target TXT_DONATION_VALUE = Target.the("Caja para ingresar el valor para la donación").locatedBy("#transfers-accounts__form-transfer-value");
    public static final Target BTN_DONATION = Target.the("botón de Realizar donación").locatedBy("#transfer_accounts_btn");
    public static final Target LBL_NAME_TELETON = Target.the("Texto Superior de nombre del convenio").located(By.cssSelector(".transfers-accounts__account-info__name"));

}

