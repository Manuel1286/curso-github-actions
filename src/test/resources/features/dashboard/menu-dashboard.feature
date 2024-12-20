# language:es
# encoding: UTF-8


@ExternalOptions
Característica: Como cliente del banco de Bogotá quiero acceder a las opciones exteriores de mis productos desde el dashboard


  Esquema del escenario: Validar que un cliente pueda ver las opciones exteriores de su <NameCase> en el dashboard
    Dado que <Actor> ingresa a la aplicacion de banca movil
    Cuando ella ingresa desde el dashboard a las opciones externas de su <Producto>
    Entonces podrá ver el listado de opciones de su <Producto>

    Ejemplos:
      |Actor     | Producto                |NameCase           |
      |Dark      | "Crediservice"          |Crediservice       |
      |Maria     | "Cuenta de Ahorros"     |Cuenta de Ahorros  |
      |Maria     | "Cuenta Corriente"      |Cuenta Corriente   |
      |Richi     | "Tarjeta Crédito"       |Tarjeta Crédito    |
      |Martin    | "Leasing"               |Leasing            |
      |Mary      | "FIC"                   |FIC                |
      |Francisco | "AFC"                   |AFC                |
      |Miriam    | "CDT"                   |CDT                |
      |Jenny     | "Crédito Libranza"      |Crédito Libranza   |
