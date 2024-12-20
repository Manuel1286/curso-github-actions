package ui.dashboard;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DashExternalOptionsPage {


    private DashExternalOptionsPage(){}
    public static final Target SEE_DETAIL_LABEL = Target.the("Opción de ver detalle").located(By.xpath("//span[contains(text(),'Ver detalle')]"));
    public static final Target SHARE_DATA_LABEL = Target.the("Opción de compartir datos").located(By.xpath("//span[contains(text(),'Compartir datos')]"));
    public static final Target SERVICES_PAY = Target.the("Opción pago de servicios y obligaciones").located(By.xpath("//*[contains(text(),'Pago de servicios y obligaciones')]"));
    public static final Target TRANSFER_TO_ACCOUNT = Target.the("Opción transferencia a cuentas ").located(By.xpath("//*[contains(text(),'Transferencias a cuentas')]"));
    public static final Target MAKE_PAYMENTS_LABEL = Target.the("Opción de relizar pagos").located(By.xpath("//*[contains(text(),'Realizar pagos')]"));
    public static final Target MAKE_PAYMENT_LABEL = Target.the("Opción de relizar pago").located(By.xpath("//*[contains(text(),'Realizar pago')]"));
    public static final Target MAKE_TRANSFERS_LABEL = Target.the("Opción de relizar transferencias").located(By.xpath("//span[contains(text(),'Realizar transferencias')]"));
    public static final Target MAKE_TRANSFER_LABEL = Target.the("Opción de relizar transferencia").located(By.xpath("//span[contains(text(),'Realizar transferencia')]"));
    public static final Target CARDLESS_WITHDRAWALS_LABEL = Target.the("Opción de relizar retiros sin tarjeta").located(By.xpath("//span[contains(text(),'Retiros sin tarjeta')]"));
    public static final Target YOUR_CARDS_LABEL = Target.the("Opción de tus tarjetas").located(By.xpath("//span[contains(text(),'Tus tarjetas')]"));
    public static final Target  DOWNLOAD_EXTRACTS_LABEL = Target.the("Opción de descargar extractos y documentos").located(By.xpath("//span[contains(text(),'Descargar extractos y documentos')]"));
    public static final Target  DOWNLOAD_DOCUMENTS = Target.the("Opción de descargar extractos y documentos").located(By.xpath("//span[contains(text(),'Descargar documentos')]"));
    public static final Target SEARCH_MOVEMENTS_LABEL = Target.the("Opción de buscar todos los movimientos").located(By.xpath("//span[contains(text(),'Buscar todos los movimientos')]"));
    public static final Target ADVANCE_LABEL = Target.the("Opción de avance").located(By.xpath("//span[contains(text(),'Realizar un avance')]"));
    public static final Target INVEST_LABEL = Target.the("Opción de invertir").located(By.xpath("//span[contains(text(),'Invertir')]"));
    public static final Target WITHDRAW_LABEL = Target.the("Opción de retirar").located(By.xpath("//span[contains(text(),'Retirar')]"));
    public static final Target SCROLL_CARD3 = Target.the("Scroll creditservice").located(By.xpath("(//*[@id=\"bdb-product-info-card\"])[2]"));
}
