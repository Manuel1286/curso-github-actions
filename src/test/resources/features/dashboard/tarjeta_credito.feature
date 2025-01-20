# language:es
# encoding: UTF-8

@creditCardProduct
Característica: Como cliente de banco de Bogotá quiero ver las opciones, atajos e información para validar mis saldos detallados del producto tarjeta de crédito permitidos desde la app
  @creditCardProduct1
  Escenario: Validar que el usuario visualice la informacion de saldos y atajos de su tarjeta de credito
    Dado que Richi ingresa a la aplicacion de banca movil
    Cuando ingresa a su producto "Tarjeta Crédito Gold"
    Entonces debería ver la información de saldos y atajos para "Tarjeta de Crédito"
  @creditCardProduct2
  Esquema del escenario: Validar que usuario con tarjeta de credito lo redireccione a <NameCase>
    Dado que Richi ingresa a la aplicacion de banca movil
    Cuando ingresa a su producto "Tarjeta Crédito Gold"
    Y seleccione el atajo de <Atajo>
    Entonces debería redireccionarse al atajo de <Atajo> de su producto "Tarjeta de Crédito Gold" número "No. · · · · 4504"

    Ejemplos:
      | Atajo         | NameCase     |
      | "Pagar"       | Pagar        |
      | "Documentos"  | Documentos   |

  @avances
  Escenario: Validar que usuario con tarjeta de credito lo redireccione a Avance de TC
    Dado que Richi ingresa a la aplicacion de banca movil
    Cuando ingresa a su producto "Tarjeta Crédito"
    Y seleccione el atajo de "Avance"
    Entonces debería redireccionarse al atajo de "Avance" de su producto "Tarjeta Crédito Gold" número "No. · · · · 4504"
