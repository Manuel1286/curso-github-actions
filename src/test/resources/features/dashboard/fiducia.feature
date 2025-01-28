# language:es
# encoding: UTF-8

@TrustProduct
Característica: Como cliente de banco de Bogotá quiero ver las opciones, atajos e información para validar mis saldos detallados del producto Fiducia permitidos desde la app
  @TrustProduct1
  Escenario: Validar que el usuario visualice la informacion de saldos y atajos de su fiducia
    Dado que Omar ingresa a la aplicacion de banca movil
    Cuando ingresa a su producto "FIC"
    Entonces debería ver la información de saldos y atajos para "Fiducia"
  @TrustProduct2
  Esquema del escenario: Validar que usuario con fiducia lo redireccione a <NameCase>
    Dado que Omar ingresa a la aplicacion de banca movil
    Cuando ingresa a su producto "FIC"
    Y seleccione el atajo de <Atajo>
    Entonces debería redireccionarse al atajo de <Atajo> de su producto "FIC Sumar" número "No. 001001573077"

    Ejemplos:
      | Atajo        | NameCase   |
      | "Invertir"   | Inversion  |
      | "Retirar"    | Retiro     |
      | "Documentos" | Documentos |

