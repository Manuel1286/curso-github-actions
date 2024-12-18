# language:es
# encoding: UTF-8

@currentProduct
Característica: Como cliente de banco de Bogotá quiero ver las opciones, atajos e información para validar mis saldos detallados del producto Cuenta corriente permitidos desde la app


  Escenario: Validar que el usuario visualice la informacion de saldos y atajos de su cuenta corriente
    Dado que Maria ingresa a la aplicacion de banca movil
    Cuando ingresa a su producto "Cuenta Corriente"
    Entonces debería ver la información de saldos y atajos para "Cuenta Corriente"


  Esquema del escenario: Validar que usuario con cuenta corriente lo redireccione a <NameCase>
    Dado que Maria ingresa a la aplicacion de banca movil
    Cuando ingresa a su producto "Cuenta Corriente"
    Y seleccione el atajo de <Atajo>
    Entonces debería redireccionarse al atajo de <Atajo> de su producto "Cuenta Corriente" número "1234"

    Ejemplos:
      | Atajo         | NameCase    |
      | "Pagar"       | Pagar       |
      | "Transferir"  | Transferir  |
      | "Documentos"  | Documentos  |
      | "Movimientos" | Movimientos |
