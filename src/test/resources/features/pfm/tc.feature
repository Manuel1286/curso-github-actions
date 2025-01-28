# language: es
# encoding: UTF-8
 @EFI-481 @RegresionPFM @Tarjeta_Credito
  Característica: Cliente con TC monoproducto y multiproducto realizará consulta de gastos con Tsx, sin Tsx,

  Antecedentes:
      Dado     que Johox ingresa a la aplicacion de banca movil
      Cuando   ella ingresa a PFM
      Entonces podrá ver la interfaz Finanzas

    @AllAccounts @TEST_EFI-1636
      Escenario: Validar que un usuario multiproducto con Tsx en CA y CC pueda consultar el total de sus gastos

        Dado     que al dar clic sobre todas tus cuentas
        Cuando   filtre por todas tus cuentas CA CC
        Entonces podrá ver el diagrama de torta con los saldos filtrados

    @AllTC @TEST_EFI-1637
      Escenario: Validar que un usuario multiproducto con mas de una TC pueda consultar el total de sus gastos
                  y al regrsar el filtro esté en TC

        Dado     que al dar clic sobre todas tus cuentas
        Cuando   filtre por todas sus TC
        Entonces podrá ver el diagrama de torta con los saldos filtrados y el filtro se mantendrá en TC

    @CalendarFilter @TEST_EFI-1638 @filterTC
    Escenario: Validar que un usuario multiproducto filtre por rango de fecha y compruebe los saldos

      Dado     que al dar clic sobre todas tus cuentas
      Cuando   ingrese al calendario
      Entonces filtrará por rango de fechas

    @CalendarCancel @TEST_EFI-1639 @filterTC
      Escenario: Validar que un usuario multiproducto ingrese al calendario y cancele la busqueda

        Dado     que al dar clic sobre todas tus cuentas
        Cuando   ingrese al calendario
        Entonces dará clic en cancelar y regresará a opciones de consulta

    @Calendar15Days @TEST_EFI-1640 @filterTC1
    Escenario: Validar que un usuario multiproducto ingrese al calendario y filtre por 15 dias

      Dado     que al dar clic sobre todas tus cuentas
      Cuando   ingrese al calendario y visulice las opciones para filtrar
      Entonces hará la consulta por 15 días

    @CalendarLastWeek @TEST_EFI-1641
    Escenario: Validar que un usuario multiproducto ingrese al calendario y filtre por la última semana

      Dado     que al dar clic sobre todas tus cuentas
      Cuando   ingrese al calendario y visulice las opciones para filtrar
      Entonces hará la consulta por la última semana

    @CalendarLastMonth @TEST_EFI-1642
    Escenario: Validar que un usuario multiproducto ingrese al calendario y filtre por el último mes

      Dado     que al dar clic sobre todas tus cuentas
      Cuando   ingrese al calendario y visulice las opciones para filtrar
      Entonces hará la consulta por el último mes

    @CalendarToday @TEST_EFI-1643
    Escenario: Validar que un usuario multiproducto ingrese al calendario y filtre por hoy

      Dado     que al dar clic sobre todas tus cuentas
      Cuando   ingrese al calendario y visulice las opciones para filtrar
      Entonces hará la consulta por el día de hoy











