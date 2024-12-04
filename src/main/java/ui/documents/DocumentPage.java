package ui.documents;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.webdriver.shadow.ByShadow;
import org.openqa.selenium.By;


public class DocumentPage {

    private DocumentPage(){}

    public static final Target LBL_CROSS = Target.the("Tipos de certificados transversales").located(By.xpath("//*[contains(text(),'Transversal')]"));
    public static final Target LBL_ACCOUNTS = Target.the("Tipos de certificados de cuentas").located(By.xpath("//*[contains(text(),'Cuentas')]"));
    public static final Target LBL_CDT = Target.the("Tipos de certificados de cdt").located(By.xpath("//*[contains(text(),'CDT Desmaterializado')]"));
    public static final Target LBL_CREDITS = Target.the("Tipos de certificados de creditos").located(By.xpath("//*[contains(text(),'créditos')]"));
    public static final Target LBL_TRUSTS = Target.the("Tipos de certificados de fiducias").located(By.xpath("//*[contains(text(),'Fiducias')]"));
    public static final String HOST_OPT_EXTRACTS = "#bdb-card-button-wrapper-0 > bdb-ml-access-card";
    public static final String HOST_OPT_REFERENCES = "#bdb-card-button-wrapper-1 > bdb-ml-access-card";
    public static final String HOST_OPT_STATEMENTS = "#bdb-card-button-wrapper-2 > bdb-ml-access-card";
    public static final String SHADOW_OPT_EXTRACTS = "#bdb-grid-item-0";
    public static final String SHADOW_OPT_REFERENCES = "#bdb-grid-item-1";
    public static final String SHADOW_OPT_STATEMENTS = "#bdb-grid-item-2";
    public static final String HOST_LST_DOCUMENTS_REFERENCES = "#item__check";
    public static final String HOST_LST_DOCUMENTS_STATEMENTS = "#item_";
    public static final String OPT_LST_DOCUMENTS_STATEMENTS = "#card-list-";
    public static final String OPT_LST_DOCUMENTS = "#card__";
    public static final String HOST_CROSS_CERTIFICATES = "div:nth-child(1) > bdb-ml-multi-action";
    public static final String HOST_ACCOUNT_CERTIFICATES = "div:nth-child(2) > bdb-ml-multi-action";
    public static final String HOST_CDT_CERTIFICATES = "div:nth-child(3) > bdb-ml-multi-action";
    public static final String HOST_CREDIT_CERTIFICATES = "div:nth-child(4) > bdb-ml-multi-action";
    public static final String HOST_TRUST_CERTIFICATES = "div:nth-child(6) > bdb-ml-multi-action";
    public static final String HOST_ACTION_SHEET = "#ion-overlay-2 > div.modal-wrapper.ion-overlay-wrapper.sc-ion-modal-md > bdb-action-sheet-wc > bdb-ml-bm-action-sheet";
    public static final String SHADOW_ACTION_SHEET = "#items > div > div";
    public static final Target LBL_HEADER_DOCUMENT_ACCORDION = Target.the("Label header Documents ").located(By.cssSelector("bdb-documents .bdb-header .bdb-header__title"));
    public static final Target BTN_GENERATE = Target.the("botón generar").locatedBy("#documents_bank\\.refers\\.generate_button");
    public static final Target TXT_ADDRESSEE_NAME = Target.the("Nombre destinatario").located(By.xpath("//*[contains(text(),'¿A quién va dirigida la referencia?')]"));
    public static final Target BTN_ARROW_BUTTON = Target.the("botón flecha").located(By.cssSelector("#document_product\\.list_continue\\.button"));
    public static final Target LST_SELECT_MONTH = Target.the("Ver lista de periodos").locatedBy("#documents_card_select_month");
    public static final Target BTN_GENERATE_EXT = Target.the("Botón de generar").locatedBy("#documents_card_generate");
    public static final Target OPT_OPEN_DOCUMENT =  Target.the("Opción Abrir archivo").locatedBy("#item__0 .box-options__picker__row__item__text");
    public static final Target BTN_SHARE_DOCUMENT =  Target.the("Botón para compartir componente").located(By.cssSelector("#item__1 .box-options__picker__row__item__text"));
    public static final Target LBL_MODAL_MESSAGE =  Target.the("Label de advertencia").locatedBy("#alert_warning_title");
    public static final Target LBL_ERROR_MESSAGE =  Target.the("Label de error").locatedBy("#alert_error_title");
    public static final Target BTN_ALERT_MESSAGE = Target.the("Botón modal Entiendo").locatedBy("#alert_warning_btn");
    public static final Target BTN_ERROR_MESSAGE = Target.the("Botón modal Entiendo").locatedBy("#alert_error_btn");
}


