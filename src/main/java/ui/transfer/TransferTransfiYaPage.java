package ui.transfer;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TransferTransfiYaPage
{
    private TransferTransfiYaPage(){}

    public static final Target OPT_ACCORDION_TY = Target.the("Opcion acordeon transfiYa").locatedBy("#bdb-grid-item-7");
    public static final Target OPT_SEND_TY = Target.the("Opcion enviar dinero TransfiYa").located(By.cssSelector("phone-item ng-star-inserted"));
    public static final Target OPT_RECEIVE_TY = Target.the("Opcion Recibir dinero transfiYa").located(By.cssSelector("#bdb-grid-item-7"));
    public static final Target LST_OPTIONS_TY = Target.the("Opcion Recibir dinero transfiYa").located(By.cssSelector("div.phone-entity-list__item div.phone_entity-item.ng-star-inserted"));
    public static final Target BUTTON_RECEIVE_MONEY= Target.the("Siguiente pagina del denmo").located(By.cssSelector("#transfer_accounts_btn_accept"));
    public static final Target LST_CREDITS_TY = Target.the("Dinero a recibir por TY").located(By.cssSelector("div.transfers-list__list-info__name"));
    public static final Target HEADER_NAME_SEND = Target.the("Nombre del header").located(By.cssSelector("img#header-tooltip.bdb-header__btn-tooltip.ng-star-inserted"));
    public static final Target LBL_SECTION_CONTACT = Target.the("Ingresa o selecciona el número de contacto").located(By.cssSelector("header.bdb-header div.bdb-header__content div.bdb-header__title"));
    public static final Target TXT_TRANSFER_VALUE = Target.the("Ingresar el valor a transferir").locatedBy("#transfers-accounts__form-transfer-value");
    public static final Target TXT_TRANSFER_NUMBER = Target.the("Ingresar o selecciona el número celular").locatedBy("#bdb-contacts_phone-number_input");
    public static final Target LBL_VALUE = Target.the("Ingresa el valor a enviar").locatedBy(".transfers-accounts__form__transfer-value__label");
    public static final Target TXT_VALUE = Target.the("Campo para ingresar el valor").locatedBy(".transfers-accounts__form__transfer-value");
    public static final Target TXT_NOTE_FIELD = Target.the("Campo para agregar la nota").locatedBy("#transfer-account_form_account-notes-input");
    public static final Target BTN_TRANSFER = Target.the(" botón de transferir").locatedBy("#transfer_accounts_btn");
    public static final Target TXT_DEMO_PAGE = Target.the("Envia dinero con transfiya").located(By.cssSelector("div.swiper-wrapper ion-slide.ng-star-inserted.md.swiper-slide.swiper-zoom-container.hydrated.swiper-slide-active div.bdb-instructions-flow bdb-instruction-item-transfer.ng-star-inserted div.bbd-instruction-item-transfer #bbd-instruction-item-transfer-title"));
    public static final Target BUTTON_CONTINUE = Target.the("Siguiente pagina del denmo").located(By.cssSelector("#bdb-instructions-flow__first\\.button__btn"));
    public static final Target BUTTON_START = Target.the("Comenzar a transferir").locatedBy("#bdb-instructions-flow__button-end__div");
}