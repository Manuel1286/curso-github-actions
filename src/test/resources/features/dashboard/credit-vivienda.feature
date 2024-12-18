# language:es
# encoding: UTF-8

@HomeCreditProduct
Característica: Como cliente de banco de Bogotá quiero ver las opciones, atajos e información para validar mis saldos detallados del producto Crédito de vivienda permitidos desde la app

  @test:ACD-78  @TEST_ACD-78
  Escenario: Validar que el usuario visualice la informacion de saldos y atajos de su credito de vivienda
    Dado que Alvaro ingresa a la aplicacion de banca movil
    Cuando ingresa a su producto "Crédito de Vivienda"
    Entonces debería ver la información de saldos y atajos para "Crédito de Vivienda"

  @TEST_ACD-77
    @TEST_ACD-309
    @TEST_ACD-310
    @test:ACD-77
    @test:ACD-309
    @test:ACD-310
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

