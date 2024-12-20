# language:es
# encoding: UTF-8


@OrderProduct
Característica: Como cliente de banco de Bogotá quiero ver las opciones, atajos e información para validar mis saldos detallados del producto crédito de libranza permitidos desde la app

  Escenario: Validar que el usuario visualice la informacion de saldos y atajos de su credito de libranza
    Dado que Jenny ingresa a la aplicacion de banca movil
    Cuando ingresa a su producto "Crédito Libranza"
    Entonces debería ver la información de saldos y atajos para "Crédito Libranza"

  Esquema del escenario: Validar que usuario con credito de libranza lo redireccione a <NameCase>
    Dado que Jenny ingresa a la aplicacion de banca movil
    Cuando ingresa a su producto "Crédito Libranza"
    Y seleccione el atajo de <Atajo>
    Entonces debería redireccionarse al atajo de <Atajo> de su producto "Crédito Libranza" número "No. 00559639772"

    Ejemplos:
      | Atajo         | NameCase     |
      | "Pagar"       | Pagar        |
      | "Documentos"  | Documentos   |
      | "Movimientos" | Movimientos  |
