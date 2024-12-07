# language:es
# encoding :iso-8859-1
@ATC @EFI-481 # se pone el test execution
Característica: Como usuario del Banco de Bogotá quiero revisar el control de mis finanzas

  @login @TEST_EFI-2617 @RegresionPFM  @filterTC1 #se pone el caso de prueba
  Escenario:  Ingreso a PFM
    Dado     que Daniela ingresa a la aplicacion de banca movil
    Cuando   ella ingresa a PFM
    Entonces podrá ver la interfaz Finanzas







