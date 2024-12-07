package stepdefinitions.pfm;


import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;



public class FiltersAccounts {

    @Dado("que al dar clic sobre todas tus cuentas")
    public void allAccounts() {
        OnStage.withCurrentActor(
            accountsTask()
        );
    }
    @Cuando("filtre por todas tus cuentas CA CC")
    public void filterAccounts() {
        OnStage.withCurrentActor(
            accountsCACCTask()
        );
    }
    @Entonces("podrá ver el diagrama de torta con los saldos filtrados")
    public void balancesAllAccounts() {

        OnStage.withCurrentActor(
            balancesAccountsTask()
        );
    }
    @Cuando("filtre por {string}")
    public void payPMA(String account) {
        ShadowRoot.clickOnElementInsideOneShadowRoot(SD_DROP_DOWN_ALL_ACCOUNTS, BUTTON_DROP_DOWN_ALL_ACCOUNTS);
        OnStage.withCurrentActor(
            SelectAccountsOption.productSelector(account)
        );
    }
    @Cuando("filtre por todas sus TC")
    public void filterTC() {
        OnStage.withCurrentActor(
            accountsTCTask()
        );
    }
    @Entonces("podrá ver el diagrama de torta con los saldos filtrados y el filtro se mantendrá en TC")
    public void checkBalancesTC() {
        OnStage.withCurrentActor(
            balancesTCTask()
        );
    }
    @Cuando("ingrese al calendario y visulice las opciones para filtrar")
    public void optionfiltercalendar() {
        OnStage.withCurrentActor(
            optionFilterCalendarTask()
        );
    }
    @Cuando("ingrese al calendario")
    public void calendar() {
        OnStage.withCurrentActor(
            calendarTask()
        );
    }
    @Entonces("dará clic en cancelar y regresará a opciones de consulta")
    public void cancelCalendar() {
        OnStage.withCurrentActor(
        cancelCalendarTask()
        );
    }
    @Entonces("filtrará por rango de fechas")
    public void filterDates() {
        OnStage.withCurrentActor(
            dateRangeTask(),
            applyTask(),
            balancesRangeDateTask()
        );
    }
    @Entonces("hará la consulta por 15 días")
    public void fifteenDays() {
        OnStage.withCurrentActor(
            fefteenDaysTask(),
            applyTask()
        );
    }
    @Entonces("hará la consulta por la última semana")
    public void lastWeek() {
        OnStage.withCurrentActor(
            lastWeekTask(),
            applyTask()
        );
    }
    @Entonces("hará la consulta por el último mes")
    public void lastMonth() {
        OnStage.withCurrentActor(
            lastMonthTask(),
            applyTask()
        );
    }
    @Entonces("hará la consulta por el día de hoy")
    public void today() {
        OnStage.withCurrentActor(
            todayTask(),
            applyTask()
        );
    }




}
