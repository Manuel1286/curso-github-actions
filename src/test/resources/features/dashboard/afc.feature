# language:es
# encoding: UTF-8

@AFC
Característica: Como cliente de banco de Bogotá quiero ver las opciones, atajos e información para validar mis saldos detallados del producto AFC permitidos desde la app

  @Prueba
  Escenario: Validar que el usuario visualice la informacion de saldos y atajos de su cuenta AFC
    Dado que Francisco ingresa a la aplicacion de banca movil
    Cuando el ingresa a su producto "AFC"
    Entonces debería ver la información de saldos y atajos para "AFC"



  @AFCDocumentos
  Esquema del escenario: Validar que usuario con cuenta AFC lo redireccione a <NameCase>
    Dado que Francisco ingresa a la aplicacion de banca movil
    Cuando el ingresa a su producto "AFC"
    Y seleccione el atajo de <Atajo>
    Entonces debería redireeccionarse al atajo de <Atajo> de su producto "Cuenta AFC" número "No. 019574714"

    Ejemplos:
      | Atajo         | NameCase    |
      | "Documentos"  | Documentos  |
      | "Movimientos" | Movimientos |
