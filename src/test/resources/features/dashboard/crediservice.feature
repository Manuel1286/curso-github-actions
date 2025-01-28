# language:es
# encoding: UTF-8

@Credit
Característica: Como cliente de banco de Bogotá quiero ver las opciones, atajos e información para validar mis saldos detallados del producto Crediservice permitidos desde la app
@Credit_1
  Escenario: Validar que el usuario visualice la informacion de saldos y atajos de su Crediservice
    Dado que Dark ingresa a la aplicacion de banca movil
    Cuando ingresa a su producto "Crediservice"
    Entonces debería ver la información de saldos y atajos para "Crediservice"

  @creditservice
  Esquema del escenario: Validar que usuario con Crediservice lo redireccione a <NameCase>
    Dado que Dark ingresa a la aplicacion de banca movil
    Cuando ingresa a su producto "Crediservice"
    Y seleccione el atajo de <Atajo>
    Entonces debería redireccionarse al atajo de <Atajo> de su producto "Crediservice" número "No. 00559513201"

    Ejemplos:
      | Atajo         |  NameCase    |
      | "Movimientos" |  Movimientos |
      | "Pagar"       |  Pagar       |
      | "Transferir"  |  transferir  |
      | "Documentos"  |  Documentos  |


