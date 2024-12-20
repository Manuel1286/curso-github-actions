# language:es
# encoding: UTF-8

@Tag
Característica: Visualización del tag "Aval" en la cuenta de ahorros o corriente

  Esquema del escenario: Validar funcionalidad copiado tag aval
    Dado que Darwin ingresa a la aplicacion de banca movil
    Cuando selecciona la opción de copiar tag aval en la "<Section>"
    Entonces deberia visualizar el siguiente "<Message>"

    Ejemplos:

      |Section  |Message    |
      |Dashboard|Dashboard  |
      |Detalle  |Detalle    |

