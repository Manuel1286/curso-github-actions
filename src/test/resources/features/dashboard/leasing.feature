# language:es
# encoding: UTF-8

@LeasingProduct
Característica: Como cliente de banco de Bogotá quiero ver las opciones, atajos e información para validar mis saldos detallados del producto Leasing permitidos desde la app

  Escenario: Validar que el usuario visualice la informacion de saldos y atajos de su credito leasing
    Dado que Martin ingresa a la aplicacion de banca movil
    Cuando ingresa a su producto "Leasing"
    Entonces debería ver la información de saldos y atajos para "Leasing"

  Esquema del escenario: Validar que usuario con credito leasing lo redireccione a <NameCase>
    Dado que Martin ingresa a la aplicacion de banca movil
    Cuando ingresa a su producto "Leasing"
    Y seleccione el atajo de <Atajo>
    Entonces debería redireccionarse al atajo de <Atajo> de su producto "Leasing Habitacional" número "No. 00559512444"

    Ejemplos:
      | Atajo         | NameCase    |
      | "Pagar"       | Pagar       |
      | "Documentos"  | Documentos  |
      | "Movimientos" | Movimientos |
