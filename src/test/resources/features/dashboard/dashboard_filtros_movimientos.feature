# language:es
# encoding: UTF-8

@ACD-349
@RegresionBeta
Característica: Como cliente de banco de Bogotá quiero ver los movimientos a través de los filtros en cada uno de los productos

@FilterMovements
  Esquema del escenario: Validar filtro de movimientos
    Dado que Marina ingresa a la aplicacion de banca movil
    Cuando seleccione el "Cuenta de Ahorros" con la opción "<Filtrar por:>"
    Entonces debería visualizar los siguientes datos "<Movimientos>" "<Fecha>" y "<Valor>"

    Ejemplos:
      |Filtrar por: |Movimientos    |Fecha      |Valor    |
      |Palabra      |Intereses      |31 oct 2024|+$ 17.955|
      |monto        |10000 a $20000 |31 oct 2024|+$ 17.955|




