# language:es
# encoding: UTF-8

@HomeCreditProduct # no se ejecuto
Característica: Como cliente de banco de Bogotá quiero ver las opciones, atajos e información para validar mis saldos detallados del producto Crédito de vivienda permitidos desde la app
  @HomeCreditProduct1
  Escenario: Validar que el usuario visualice la informacion de saldos y atajos de su credito de vivienda
    Dado que Alvaro ingresa a la aplicacion de banca movil
    Cuando ingresa a su producto "Crédito de Vivienda"
    Entonces debería ver la información de saldos y atajos para "Crédito de Vivienda"
  @HomeCreditProduct2
  Esquema del escenario: Validar que usuario con credito de vivienda lo redireccione a <NameCase>
    Dado que Alvaro ingresa a la aplicacion de banca movil
    Cuando ingresa a su producto "Crédito de Vivienda"
    Y seleccione el atajo de <Atajo>
    Entonces debería redireccionarse al atajo de <Atajo> de su producto "Crédito de Vivienda" número "No. 00559571870"

    Ejemplos:
      | Atajo         | NameCase     |
      | "Pagar"       | Pagar        |
      | "Movimientos" | Movimientos  |
      | "Documentos"  | Documentos   |

