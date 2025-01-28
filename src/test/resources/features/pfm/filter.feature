# language: es
# encoding: UTF-8

@EFI-481
Característica: Como usuario del Banco de Bogotá validar el Tour por PFM cuando el usuario ingresa por primera vez

  @TC_BALANCE @TEST_EFI-2614 @RegresionPFM
  Escenario: Validar TC cuentas sin saldo
    Dado que CamilaN ingresa a PFM
    Cuando vea la TC monocuenta
    Entonces verá una consulta sin data


