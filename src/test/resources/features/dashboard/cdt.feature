# language:es
# encoding: UTF-8

@CDT
Característica: Como cliente de banco de Bogotá quiero ver las opciones, atajos e información para validar mis saldos detallados del producto CDT permitidos desde la app
  @CDT1
  Escenario: Validar que el usuario visualice la informacion de saldos y atajos de su CDT
    Dado que Miriam ingresa a la aplicacion de banca movil
    Cuando ingresa a su producto "CDT"
    Entonces debería ver la información de saldos y atajos para "CDT"
  @CDT2
  Esquema del escenario: Validar que usuario con CDT lo redireccione a <NameCase>
    Dado que Miriam ingresa a la aplicacion de banca movil
    Cuando ingresa a su producto "CDT"
    Y seleccione el atajo de <Atajo>
    Entonces debería redireccionarse al atajo de <Atajo> de su producto "CDT" número "No. 00559513201"

    Ejemplos:
      | Atajo         | NameCase   |
      | "Documentos"  | Documentos |
