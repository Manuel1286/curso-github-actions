# language:es
# encoding: UTF-8

@SavingsProduct
Característica: Como cliente de banco de Bogotá quiero ver las opciones, atajos e información para validar mis saldos detallados del producto Cuenta de ahorros permitidos desde la app
  @SavingsProduct1
  Escenario: Validar que el usuario visualice la informacion de saldos y atajos de su cuenta de ahorros
    Dado que Maria ingresa a la aplicacion de banca movil
    Cuando ingresa a su producto "Cuenta de Ahorros"
    Entonces debería ver la información de saldos y atajos para "Cuenta de Ahorros"
  @SavingsProduct2
  Esquema del escenario: Validar que usuario con cuenta de ahorros lo redireccione a <NameCase>
    Dado que Maria ingresa a la aplicacion de banca movil
    Cuando ingresa a su producto "Cuenta de Ahorros"
    Y seleccione el atajo de <Atajo>
    Entonces debería redireccionarse al atajo de <Atajo> de su producto "Cuenta de Ahorros" número "No. 008476889"

    Ejemplos:
      | Atajo        |
      |"Transferir"  |
      | "Retirar"    |
      | "Documentos" |
